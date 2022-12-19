package com.playerService.config;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebSecurity
@EnableWebMvc
public class SecurityConfig{

    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {

          http.csrf().disable()
                  .authorizeHttpRequests()


    }


    public void configure(WebSecurity web) throws Exception{
        web.ignoring()

    }
}
