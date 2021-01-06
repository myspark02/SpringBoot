package yju.scpark.jwt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.*;

import yju.scpark.jwt.models.AuthenticationRequest;
import yju.scpark.jwt.models.AuthenticationResponse;
import yju.scpark.jwt.util.JwtUtil;

@RestController
public class MyController {
    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private UserDetailsService UserDetailsService;
    
    @Autowired
    private JwtUtil jwtTokenUtil;

    @RequestMapping({"/hello"})
    public String hello() {
        return "Hello World";
    }

    @RequestMapping(value = "/authenticate", method=RequestMethod.POST)
    public ResponseEntity<AuthenticationResponse> createAuthenticationToken(@RequestBody AuthenticationRequest authenticationRequst) 
                                                                                        throws Exception  {
        try {                                                                            
            authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(authenticationRequst.getUsername(), 
                    authenticationRequst.getPassword()));
        } catch(BadCredentialsException e) {
            throw new Exception("Incorrect username or password", e);
        }                    
        UserDetails userDetails = UserDetailsService.loadUserByUsername(authenticationRequst.getUsername());
        String jwt = jwtTokenUtil.generateToken(userDetails);
        return ResponseEntity.ok(new AuthenticationResponse(jwt));
        
        
    }
}
