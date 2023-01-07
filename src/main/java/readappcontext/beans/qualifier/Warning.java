package readappcontext.beans.qualifier;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("warning")
public class Warning implements Message {

    @Override
    public String getMessage() {

        return "This is a warning message";
    }
}
