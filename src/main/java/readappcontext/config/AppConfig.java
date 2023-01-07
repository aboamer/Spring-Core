package readappcontext.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import readappcontext.beans.Entitlement;

@Configuration
@ComponentScan(basePackages = "readappcontext.beans")
public class AppConfig {

    @Bean(name="entitlement")
    public Entitlement getEntitlement() {

        Entitlement entitlement = new Entitlement();
        entitlement.setName("amer");
        entitlement.setTime(20);

        return entitlement;
    }
}
