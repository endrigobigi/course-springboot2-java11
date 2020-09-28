package de.endrigobigi.course.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import de.endrigobigi.course.entities.User;
import de.endrigobigi.course.repositories.UserRepository;

@Configuration //anotação para especificar uma classe de configuracao
@Profile("test") //nome vem do mesmo configurado no application.properties
public class TestConfig implements CommandLineRunner{
	
	@Autowired //injeção de dependência feita automaticamente pelo framework
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		
		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
		User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");
		
		userRepository.saveAll(Arrays.asList(u1, u2));	
	}
	
	

}