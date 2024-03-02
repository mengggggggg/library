package repository;

import model.borrowModel;

public class borrowRepository {

	package repository;

	import model.bookModel;
	import org.springframework.data.jpa.repository.JpaRepository;

	public interface bookRepository extends JpaRepository<Book, Long> {
	    
	    
	    bookModel findByIsbn(String isbn);

	    
	    List<bookModel> findByAuthor(String author);

	    
	    List<bookModel> findByNameContaining(String name);
	}


}
