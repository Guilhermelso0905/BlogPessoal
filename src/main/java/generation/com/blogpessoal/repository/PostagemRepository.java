package generation.com.blogpessoal.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import generation.com.blogpessoal.model.Postagem;

public interface PostagemRepository extends JpaRepository<Postagem, Long>{

	
	public List<Postagem> findAllByTituloContainingIgnoreCase(@Param("titulo")String titulo);
	
}
