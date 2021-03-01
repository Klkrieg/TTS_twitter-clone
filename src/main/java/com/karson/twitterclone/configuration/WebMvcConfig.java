package com.karson.twitterclone.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
public class WebMvcConfig {
  @Bean
  public BCryptPasswordEncoder passwordEncoder(){
    BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
    return bCryptPasswordEncoder;
  }
}

//@Configuration
//public class WebMvcConfiguration implements WebMvcConfigurer {
//  @Bean
//  public BCryptPasswordEncoder passwordEncoder() {
//    BCryptPasswordEncoder bCryptPasswordEncoder =
//            new BCryptPasswordEncoder();
//    return bCryptPasswordEncoder;
//  }
//}