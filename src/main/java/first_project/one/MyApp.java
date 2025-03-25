package first_project.one;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component

public class MyApp implements CommandLineRunner{
    @Autowired
    
    private calculator calculator;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("o resultado é " + calculator.sum(5, 5));
    }
    
}
