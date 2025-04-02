 package testing.app.repositories;

import org.springframework.data.repository.ListCrudRepository;

import testing.app.models.Book;

public interface BookRepository extends ListCrudRepository<Book, BigInteger>{

}


