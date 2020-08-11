package springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import springmvc.entitíe.Book;
import springmvc.service.BookService;




@Controller
public class BookController {

	@Autowired
	private BookService bookService;

	@RequestMapping(value={"/booklist", "/book-list"})
	public String listBook(Model model) {
		model.addAttribute("listBook", bookService.findAll());
		return "book-list";
	}

	@RequestMapping("/book-save")
	public String insertBook(Model model) {
		model.addAttribute("book", new Book());
		return "book-save";
	}

	@RequestMapping("/book-view/{bookId}")
	public String viewBook(@PathVariable int bookId, Model model) {
		Book book = bookService.findById(bookId);
		model.addAttribute("book", book);
		return "book-view";
	}
	

	
	@RequestMapping("/book-update/{bookId}")
	public String updateBook(@PathVariable int bookId, Model model) {
		Book book = bookService.findById(bookId);
		model.addAttribute("book", book);
		return "book-update";
	}

	@RequestMapping("/saveBook")
	public String doSaveBook(@ModelAttribute("Book") Book book, Model model) {
		bookService.save(book);
		model.addAttribute("listBook", bookService.findAll());
		return "book-list";
	}

	@RequestMapping("/updateBook")
	public String doUpdateBook(@ModelAttribute("Booke") Book book, Model model) {
		bookService.update(book);
		model.addAttribute("listBook", bookService.findAll());
		return "book-list";
	}
	
	@RequestMapping("/book-delete/{bookId}")
	public String doDeleteBook(@PathVariable int bookId, Model model) {
		bookService.delete(bookId);
		model.addAttribute("listBook", bookService.findAll());
		return "book-list";
	}
}