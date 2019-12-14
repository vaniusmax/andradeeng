package br.com.andradeeng.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.andradeeng.domain.Categoria;
import br.com.andradeeng.repositories.CategoriaRepository;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository repo;
	
	public Categoria findById(Integer id) {
		
		Optional<Categoria> r = repo.findById(id);
		return r.orElse(null);
	}

}
