package first_project.one.App;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration

public class Beans{
    @Bean 
    public Sender sender(){
        System.out.println("creating a object...");
        Sender sender = new Sender();
        sender.setEmail("noreply@One.com.br");
        sender.setName("one tech");
        return sender;
    }
}