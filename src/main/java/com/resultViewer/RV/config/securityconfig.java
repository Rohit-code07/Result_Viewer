package com.resultViewer.RV.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.SecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.DefaultSecurityFilterChain;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class securityconfig{

    @Bean
    public SecurityFilterChain configure(HttpSecurity http) throws Exception {
http.authorizeHttpRequests(auth->{
    auth.anyRequest().permitAll();
});
 DefaultSecurityFilterChain defaultSecurityFilterChain = http.build();
return  defaultSecurityFilterChain;
    }
}
