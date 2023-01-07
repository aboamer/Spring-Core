package readappcontext.beans;

import lombok.Data;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Component
@Data
public class ClassRoom {

    private String title;

    private List<String> teachers;

    /**
     * PostConstruct and PreDestroy annotations are part of Java EE.
     * Since Java EE was deprecated in Java 9, and removed in Java 11, we have to add an additional dependency to use these annotations
     *
     * will be executed after constructor and dependencies injection
     *
     * good for cost operation like handling db and file resources
     */
    @PostConstruct
    public void loadData() {

        teachers = new ArrayList<>();
        teachers.add("amer");
        teachers.add("samer");
        teachers.add("tamer");
    }
}
