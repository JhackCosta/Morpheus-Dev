package br.com.teste.morpheus.DTO;

import lombok.Data;

@Data
public class UsuarioResponseDTO {
	
	private String nome;
	
	private Integer idade;
	
	private String dataNascimento;
	
	private String email;

}
