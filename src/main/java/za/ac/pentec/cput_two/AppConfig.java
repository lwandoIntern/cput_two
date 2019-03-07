package za.ac.pentec.cput_two;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class AppConfig {

    @Bean(name="calc")
    public Cat getService(){
        return new Cheetah();
    }
}
