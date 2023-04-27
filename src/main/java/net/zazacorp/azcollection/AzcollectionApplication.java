package net.zazacorp.azcollection;

import net.zazacorp.azcollection.post.Post;
import net.zazacorp.azcollection.post.PostRepository;
import net.zazacorp.azcollection.user.Role;
import net.zazacorp.azcollection.user.User;
import net.zazacorp.azcollection.user.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AzcollectionApplication {

	public static void main(String[] args) {
		SpringApplication.run(AzcollectionApplication.class, args);
	}

	@GetMapping("/")
	public String home(){
		return "Hello World";
	}

	//Utiliser pour insert des données dans la BD

	@Bean
	CommandLineRunner runner(UserRepository repository){
		return args -> {
			User testAdmin = new User(
					"kappa",
					"email@gmail.com",
					"az", Role.SuperAdmin
			);

			Post testPost = new Post("test","Descr","1234567890", "0987654321");

			//repository.insert(testAdmin);
		};
	}



}
