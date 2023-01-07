package readappcontext;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import readappcontext.beans.ClassRoom;
import readappcontext.beans.Entitlement;
import readappcontext.config.AppConfig;

public class ReadAppContext {

    /**
     *
     * AnnotationConfigApplicationContext is one of several impls of ApplicationContext
     */
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Entitlement ent = (Entitlement) context.getBean("entitlement");

        System.out.println(ent.getName());
        System.out.println(ent.getTime());

        ClassRoom classRoom = context.getBean(ClassRoom.class);

        System.out.println(classRoom.getTeachers());

        context.close();

        // the following will throw exception because context is already closed

//        Entitlement ent2 = (Entitlement) context.getBean("entitlement");
    }
}
