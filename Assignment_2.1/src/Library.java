import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;

    public Library() {
        this.books = new ArrayList<>(5);
    }
    public void addBook(Book book){
        books.add(book);
        System.out.println("As you wish book has been added to the library");
    }
    public void removeBookById(int bookId){
        this.books = books.stream().filter(id-> id.getBookId()!=bookId && id.isAvailable()).toList();
        System.out.println("As you wish book has been removed from library");
    }
    public void searchBookById(int bookId){
        Book book = books.stream().filter(id->id.getBookId()==bookId && id.isAvailable()).findFirst().orElse(null);
        System.out.println("This is the book you are looking for : "+book);
    }
    public void displayAllBooks(){
        System.out.println("All books");
        books.forEach(System.out::println);
    }
    public void replaceBook(int bookId, String authorName, String bookName){
        books.stream()
                .filter(book -> book.isAvailable() && book.getBookId() == bookId)
                .findFirst()
                .ifPresent(book -> {
                    book.setTitle(bookName);
                    book.setAuthor(authorName);
                });
    }
}
