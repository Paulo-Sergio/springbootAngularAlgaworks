package br.com.algamoney.api.config;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;

//@Configuration
//@EnableWebSecurity
/*
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication()
			.withUser("admin").password("123456").roles("ROLES");
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		**
		 * API não vai manter estado de nada ou seja,
		 * não vai criar nenhuma sessão (STATELESS)
		 *
		http.authorizeRequests()
			.antMatchers("/categorias").permitAll()
			.anyRequest().authenticated().and()
			.httpBasic().and()
			.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS).and()
			.csrf().disable();
	}
}
*/
