package readappcontext.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import readappcontext.beans.Entitlement;

@Configuration
@ComponentScan(basePackages = "readappcontext.beans")
public class AppConfig {

    /**
     *
     * a use case for bean over component is to make an existing 3rd party class available to ur spring context
     */
    @Bean(name="entitlement")
    public Entitlement getEntitlement() {

        Entitlement entitlement = new Entitlement();
        entitlement.setName("amer");
        entitlement.setTime(20);

        return entitlement;
    }
}
