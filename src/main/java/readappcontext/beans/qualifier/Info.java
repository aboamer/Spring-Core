package readappcontext.beans.qualifier;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("info")
public class Info implements Message {

    @Override
    public String getMessage() {

        return "This is an information message";
    }
}
