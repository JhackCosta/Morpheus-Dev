package br.com.teste.morpheus.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.teste.morpheus.entities.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	
	List<Usuario> findByNome(String name);
	
	@Query(value = "SELECT * FROM USUARIO WHERE NOME LIKE %:name% ", nativeQuery=true)
	List<Usuario> findLike(@Param("name") String name);

}
