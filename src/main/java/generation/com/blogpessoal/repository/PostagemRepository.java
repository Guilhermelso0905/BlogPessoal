package generation.com.blogpessoal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import generation.com.blogpessoal.model.Postagem;

public interface PostagemRepository extends JpaRepository<Postagem, Long>{

}
