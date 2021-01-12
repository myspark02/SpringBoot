package codingwithscpark.security.jpa.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import codingwithscpark.security.jpa.dao.UserRepository;
import codingwithscpark.security.jpa.model.MyUserDetails;
import codingwithscpark.security.jpa.model.User;

@Service
public class MySerDetailsService implements UserDetailsService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<User> user = userRepository.findByUsername(username);
        
        user.orElseThrow(() -> new UsernameNotFoundException("Not found: " + username));
        return new MyUserDetails(user.get());
        // return user.map(MyUserDetails::new).get();
        // return new MyUserDetails(username);
    }
    
}
