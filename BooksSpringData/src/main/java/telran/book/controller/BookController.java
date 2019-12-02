package telran.book.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import telran.book.dto.BookDto;
import telran.book.service.BookService;

@RestController
public class BookController {

	@Autowired
	BookService bookService;

	@PostMapping("/book")
	public boolean addBook(@RequestBody BookDto bookDto) {
		return bookService.addBook(bookDto);
	}
	
	@PostMapping("/findBook")
	public BookDto findBookByIsbn(@RequestParam Long isbn) {
		return bookService.findBookByIsbn(isbn);
	}
	
	@PostMapping("/removeBook/{isbn}")
	public BookDto removeBook(@PathVariable Long isbn) {
		return bookService.removeBook(isbn);
	}
}