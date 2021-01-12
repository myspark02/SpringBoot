package codingwithscpark.security.jpa.model;

import java.util.*;
import java.util.stream.Collectors;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.*;
import org.springframework.security.core.userdetails.UserDetails;

public class MyUserDetails implements UserDetails {
    
    private String userName ;
    private String password;
    private boolean active;
    private List<GrantedAuthority> authorities;

    public MyUserDetails(User user) {
        this.userName = user.getUsername();
        this.password = user.getPassword();
        this.active = user.isActive();
        this.authorities = Arrays.stream(user.getRoles().split(","))
                            .map(role -> new GrantedAuthority() {

								@Override
								public String getAuthority() {
									return role;
								}

                            }).collect(Collectors.toList());
    }
    public MyUserDetails(String userName) {
        this.userName = userName;
    }

    public MyUserDetails() {

    }

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
        // return Arrays.asList(new SimpleGrantedAuthority("ROLE_USER"));
        // return Arrays.asList(() -> "ROLE_USER");
        return authorities;
	}

	@Override
	public String getPassword() {
		return password;
	}

	@Override
	public String getUsername() {
		return userName;
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return active;
	}
    
}
