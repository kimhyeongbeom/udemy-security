package com.eazybytes.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.oauth2.client.CommonOAuth2Provider;
import org.springframework.security.oauth2.client.registration.ClientRegistration;
import org.springframework.security.oauth2.client.registration.ClientRegistrationRepository;
import org.springframework.security.oauth2.client.registration.InMemoryClientRegistrationRepository;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class ProjectSecurityConfig {
    @Bean
    SecurityFilterChain defaultSecurityFilterChain(HttpSecurity httpSecurity) throws Exception {
        httpSecurity.authorizeHttpRequests((requests) -> requests.requestMatchers("/secure").authenticated()
                .anyRequest().permitAll())
                .formLogin(Customizer.withDefaults())
                .oauth2Login(Customizer.withDefaults());
        return httpSecurity.build();
    }
//
//    @Bean
//    ClientRegistrationRepository clientRegistrationRepository() {
//        ClientRegistration github = githubClientRegistration();
//        ClientRegistration facebook = facebookClientRegistration();
//
//        return new InMemoryClientRegistrationRepository(github, facebook);
//    }
//
//    private ClientRegistration githubClientRegistration() {
//        return  CommonOAuth2Provider.GITHUB.getBuilder("github").clientId("Ov23liUMTiBrr6Fx8cwH")
//                .clientSecret("d112f34bc4e6bb76a7686e886f0dc9bb9b82d136").build();
//    }
//
//    private ClientRegistration facebookClientRegistration() {
//        return  CommonOAuth2Provider.FACEBOOK.getBuilder("facebook").clientId("496157903413080")
//                .clientSecret("6703024174f215c8c56e93d851aa44e4").build();
//    }
}
