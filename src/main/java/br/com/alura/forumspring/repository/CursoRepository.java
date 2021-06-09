package br.com.alura.forumspring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.alura.forumspring.modelo.Curso;

public interface CursoRepository extends JpaRepository<Curso,Long> {

	Curso findByNome(String nomeCurso);

}
