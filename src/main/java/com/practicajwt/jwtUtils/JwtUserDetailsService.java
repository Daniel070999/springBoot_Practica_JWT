package com.practicajwt.jwtUtils;

import java.util.ArrayList; 
import org.springframework.security.core.userdetails.User; 
import org.springframework.security.core.userdetails.UserDetails; 
import org.springframework.security.core.userdetails.UserDetailsService; 
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service; 
@Service
public class JwtUserDetailsService implements UserDetailsService { 
   @Override 
   public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
	   
	   //Código que encripta la clave
	   BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
       String encodedPassword = passwordEncoder.encode("clabececreta");
        
	   
      if ("usuarioBOT".equals(username)) { 
         return new User("usuarioBOT", 
        		 encodedPassword, 
            new ArrayList<>()); 
      } else { 
         throw new UsernameNotFoundException("User not found with username: " + username); 
      } 
   } 
}