package br.com.teste.morpheus.controllers;


import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.teste.morpheus.DTO.UsuarioDTO;
import br.com.teste.morpheus.DTO.UsuarioResponseDTO;
import br.com.teste.morpheus.entities.Usuario;
import br.com.teste.morpheus.services.UsuarioService;

@RestController
@RequestMapping(value = "/usuario")
public class UsuarioController {
	
	@Autowired
	private UsuarioService service;
	
	@Autowired
	private ModelMapper modelMapper;
	
	@CrossOrigin(origins = "*")
	@PostMapping(value = "/save")
	public ResponseEntity<Object> save(@RequestBody UsuarioDTO userDTO) {
		service.saveUser(convertForEntity(userDTO));
		return new ResponseEntity<>("Salvo", HttpStatus.CREATED);
	}
	
	@CrossOrigin(origins = "*")
	@GetMapping(value = "/selectall")
	public ResponseEntity<List<UsuarioResponseDTO>> selectAll() {
		
		List<UsuarioResponseDTO> response = convertForEntityResponse(service.findListAllUser());
		
		System.out.println(service.findListAllUser());
		
		return new ResponseEntity<List<UsuarioResponseDTO>>(response, HttpStatus.OK);
	}
	
	@CrossOrigin(origins = "*")
	@GetMapping(value = "/select={nome}")
	public ResponseEntity<List<UsuarioResponseDTO>> select(@PathVariable String nome) {
		
		List<UsuarioResponseDTO> response = convertForEntityResponse(service.findListUser(nome));

		return new ResponseEntity<List<UsuarioResponseDTO>>(response, HttpStatus.OK);
	}
	
	
	@CrossOrigin(origins = "*")
	@GetMapping(value = "/selectlike/{nome}")
	public ResponseEntity<List<UsuarioResponseDTO>> selectLike(@PathVariable String nome) {
		
		System.out.println(nome);
		List<UsuarioResponseDTO> response = convertForEntityResponse(service.findListUserLike(nome));

		return new ResponseEntity<List<UsuarioResponseDTO>>(response, HttpStatus.OK);
	}

	private Usuario convertForEntity(UsuarioDTO userDTO) {
		Usuario usuario = modelMapper.map(userDTO, Usuario.class);
		return usuario;
	}
	
	private List<UsuarioResponseDTO> convertForEntityResponse(List<Usuario> user) {
		
		List<UsuarioResponseDTO> response = new ArrayList<UsuarioResponseDTO>();

		for(int i = 0; i < user.size(); i++) {
			UsuarioResponseDTO usuarioDTOResponse = modelMapper.map(user.get(i), UsuarioResponseDTO.class);
			
			response.add(usuarioDTOResponse);
		}
		return response;	
	}
	
	
	
	
	

}
