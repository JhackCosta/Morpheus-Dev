package br.com.teste.morpheus.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.teste.morpheus.entities.Usuario;
import br.com.teste.morpheus.repositories.UsuarioRepository;

@Service
public class UsuarioService {
	
	@Autowired
	private UsuarioRepository repository;
	
	
	public void saveUser(Usuario user) {
		repository.save(user);
	}

	public List<Usuario> findListAllUser() {
		return repository.findAll();
	}
	
	public List<Usuario> findListUser(String name) {
		return repository.findByNome(name);
	}
	
	public List<Usuario> findListUserLike(String name) {
		
		System.out.println("para buscar" + name);
		return repository.findLike(name);
	}
	
	
	
	
}
