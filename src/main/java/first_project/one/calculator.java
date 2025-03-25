package first_project.one;

import org.springframework.stereotype.Component;

@Component

public class calculator{
    public int sum(int number1, int number2){
        return number1+number2;
    }
}