package testing.app.htpp.request;


public record BookRequest(
    String title, 
    String author, 
    String description, 
    Integer publication_year, 
    String category, 
    String status) {

    
}
