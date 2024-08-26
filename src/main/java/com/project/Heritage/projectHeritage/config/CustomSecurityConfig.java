package com.project.Heritage.projectHeritage.config;

import jakarta.servlet.DispatcherType;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.csrf.CookieCsrfTokenRepository;

@Configuration
@EnableWebSecurity
public class CustomSecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
                .authorizeHttpRequests(request -> request
                        .dispatcherTypeMatchers(DispatcherType.FORWARD).permitAll()
                        .requestMatchers("/","/main", "/login", "/assets/**").permitAll() // /main 및 /login 페이지는 인증 없이 접근 가능
                        .anyRequest().authenticated() // 나머지 모든 요청은 인증 필요
                )
                .formLogin(login -> login
                        .loginPage("/login/loginPage") // 로그인 페이지 설정
                        .permitAll() // 로그인 페이지 접근 허용
                        .defaultSuccessUrl("/myPage", true) // 로그인 성공 시 리다이렉트 URL
                )
                .logout(logout -> logout
                        .logoutUrl("/logoutProcess") // 로그아웃 URL 설정
                        .logoutSuccessUrl("/main") // 로그아웃 성공 시 리다이렉트 URL
                        .permitAll() // 로그아웃 요청 허용
                )
                .csrf(csrf -> csrf
                        .csrfTokenRepository(CookieCsrfTokenRepository.withHttpOnlyFalse()) // CSRF 보호 활성화
                );

        return http.build();
    }
}