package br.com.andradeeng.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.andradeeng.domain.Categoria;
import br.com.andradeeng.services.CategoriaService;

@RestController
@RequestMapping(value="categorias")
public class CategoriaResource {
	
	@Autowired
	private CategoriaService service;
	
	@RequestMapping(value="{id}",method=RequestMethod.GET)
	public ResponseEntity<?> findById(@PathVariable Integer id) {
	    
		Categoria obj = service.findById(id);
		
		return ResponseEntity.ok().body(obj);
	}

}
