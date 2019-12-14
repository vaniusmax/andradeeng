package br.com.andradeeng;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.andradeeng.domain.Categoria;
import br.com.andradeeng.repositories.CategoriaRepository;
import br.com.andradeeng.services.CategoriaService;

@SpringBootApplication
public class AndradeengApplication implements CommandLineRunner {
	
	@Autowired
	private CategoriaRepository repo;

	public static void main(String[] args) {
		SpringApplication.run(AndradeengApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
      Categoria cat1 = new Categoria(null, "Informatica");
      Categoria cat2 = new Categoria(null, "Escritório");
      
      repo.saveAll(Arrays.asList(cat1,cat2));
		
	}

}
