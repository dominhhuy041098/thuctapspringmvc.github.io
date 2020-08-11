package springmvc.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import springmvc.entitíe.Book;
import springmvc.entitíe.BookMapper;



@Repository
@Transactional
public class BookDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public void save(Book book) {
		String sql = "INSERT INTO book(bookname, author, category) VALUES (?, ?, ?)";
		jdbcTemplate.update(sql, book.getBookName(), book.getAuthor(), book.getCategory());
	}

	public void delete(int id) {
		String sql = "DELETE FROM book WHERE bookid = ?";
		jdbcTemplate.update(sql, id);
	}
	
	public void update(Book book) {
		String sql = "UPDATE book SET bookname = ?, author = ?, category = ? WHERE bookid = ? ";
		jdbcTemplate.update(sql, book.getBookName(), book.getAuthor(), book.getCategory() , book.getBookId());
	}

	public Book findById(int id) {
		String sql = "SELECT * FROM book WHERE bookid = ?";
		return jdbcTemplate.queryForObject(sql, new BookMapper(), id);
	}

	public List<Book> findAll() {
		String sql = "SELECT * FROM book";
		return jdbcTemplate.query(sql, new BookMapper());
	}

}
