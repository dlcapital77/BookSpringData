package telran.book.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import telran.book.model.Book;

public interface BookRepository extends JpaRepository<Book, Long> {
	Optional<Book> findByIsbn(long isbn);
}
