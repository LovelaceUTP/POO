package dev.Lovelace.EventPro.Security;

/*



import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable() // Desactiva CSRF para simplificación en entornos de prueba
            .authorizeRequests()
                .antMatchers("/api/**").permitAll() // Permite el acceso a las APIs
                .anyRequest().authenticated();
    }
}

*/