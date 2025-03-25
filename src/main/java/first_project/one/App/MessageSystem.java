package first_project.one.App;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MessageSystem {
    @Autowired
    private Sender noreply;
    @Autowired
    private Sender techTeam;
    
    public void sendRegisterConfirmation(){
        System.out.println(noreply);
        System.out.println("your register is confirmed");
    }
    public void sendWelcomeMessage(){
        techTeam.setEmail("tech@one.com.br");
        System.out.println(techTeam);
        System.out.println("welcome to tech elite!");
    }
}
