package springmvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import springmvc.dao.BookDAO;
import springmvc.entitíe.Book;


@Service
@Transactional
public class BookService {

	@Autowired
	private BookDAO bookDAO;
	
	public List<Book> findAll() {
		return bookDAO.findAll();
	}

	public Book findById(int id) {
		return bookDAO.findById(id);
	}
	
	public void save(Book book){
		// validate business
		bookDAO.save(book);
	}

	public void update(Book book){
		// validate business
		bookDAO.update(book);
	}
	
	public void delete(int id){
		// validate business
		bookDAO.delete(id);
	}
}
