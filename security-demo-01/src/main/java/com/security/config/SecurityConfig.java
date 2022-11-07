package com.security.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * @author SHUJINGPING
 */

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication()
                .passwordEncoder(new BCryptPasswordEncoder())
                .withUser("admin").password(new BCryptPasswordEncoder().encode("admin")).roles("ADMIN")
                .and().withUser("shujingping").password(new BCryptPasswordEncoder().encode("sk48838")).roles("NORMAL");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                // 配置请求地址的权限
                .authorizeRequests()
                .antMatchers("/test/echo").permitAll()
                .antMatchers("/test/admin").hasRole("ADMIN")
                .antMatchers("/test/normal").access("hasRole('ROLE_NORMAL')")
                // 任何请求，访问的用户都需要经过认证
                .anyRequest().authenticated()
                .and()
                // 设置 Form 表单登陆
                .formLogin()
//                    .loginPage("/login")
                .permitAll() // 所有用户可访问
                .and()
                // 配置退出相关
                .logout()
//                    .logoutUrl("/logout")
                .permitAll(); // 所有用户可访问
    }
}
