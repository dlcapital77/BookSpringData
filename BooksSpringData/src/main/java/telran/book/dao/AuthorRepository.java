package telran.book.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import telran.book.model.Author;

public interface AuthorRepository extends JpaRepository<Author, String> {

}
