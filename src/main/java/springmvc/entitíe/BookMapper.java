package springmvc.entitíe;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class BookMapper implements RowMapper<Book> {
	public Book mapRow(ResultSet rs, int rowNum) throws SQLException {
		Book book = new Book();
		book.setBookId(rs.getInt("bookid"));
		book.setBookName(rs.getString("bookname"));
		book.setAuthor(rs.getString("author"));
		book.setCategory(rs.getString("category"));
		return book;
	}
}
