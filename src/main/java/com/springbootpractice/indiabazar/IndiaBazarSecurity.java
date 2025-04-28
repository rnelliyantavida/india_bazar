package com.springbootpractice.indiabazar;


import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
@EnableWebSecurity
public class IndiaBazarSecurity extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication()
                .withUser("Ruksana")
                .password("Ash")
                .roles("CUSTOMER")
                .and()
                .withUser("Miracle")
                .password("Inc")
                .roles("MANUFACTURER")
                .and()
                .withUser("Item")
                .password("cool")
                .roles("ITEM");
    }
    @Bean
    public PasswordEncoder getPasswordEncoder(){
        return NoOpPasswordEncoder.getInstance();
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/customer/*").hasRole("CUSTOMER")
                .antMatchers("/manufacturer?id=*").hasRole("MANUFACTURER")
                .antMatchers("/item/*").hasAnyRole("ITEM","CUSTOMER")
                .and().formLogin();
    }
}
