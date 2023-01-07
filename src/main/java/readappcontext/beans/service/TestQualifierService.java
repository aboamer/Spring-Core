package readappcontext.beans.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import readappcontext.beans.qualifier.Message;

@Service
public class TestQualifierService {

    @Autowired
    @Qualifier("info")
    private Message infoMessage;

    @Autowired
    @Qualifier("warning")
    private Message warningMessage;

    public void produce() {

        System.out.println(infoMessage.getMessage());
        System.out.println(warningMessage.getMessage());
    }
}
