package testing.app.mappers;

import org.springframework.stereotype.Component;

import testing.app.models.Book;

@Component
public class BookMapper {
    public BookResource resource(Book book) {
        return new BookResource(
            book.getId(), 
            book.getTitle(), 
            book.getDescription(), 
            book.getStatus(),
            book.getCreatedAt());
    }

    public Book request(BookRequest request, Book book){
        book.setTitle(request.name());
        book.setAuthor(request.author());
        book.setDescription(request.description());
        book.setPublication_year(request.publication_year());
        book.setCategory(request.category());
        book.setStatus(request.status());
    }
    
}
