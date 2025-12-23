package com.example.demoJPA.configur;

import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfiguration {
    @EnableWebSecurity
    public SecurityFilterChain securityFilterChain(HttpSecurity http){
        http.csrf(CsrfConfigure<HttpSecurity> customize ->customizer.disable());
        http.authorizeHttpRequests(AuthorizationManagerRequest request-> request.anyRequest().authenticate)
        return http.build();
    }
//same site strict
    //session stateless


}
