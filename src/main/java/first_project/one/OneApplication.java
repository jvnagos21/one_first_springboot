package first_project.one;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import first_project.one.App.MessageSystem;

@SpringBootApplication
public class OneApplication {

	public static void main(String[] args) {
		SpringApplication.run(OneApplication.class, args);
	}
	@Bean
	public CommandLineRunner run(MessageSystem system) throws Exception{
		return args -> {
			system.sendRegisterConfirmation();
			system.sendWelcomeMessage();
			system.sendRegisterConfirmation();
		};
	}
}