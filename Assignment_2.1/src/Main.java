public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        //Adding Book
        Book book1 = new Book(1,"Marvels","Kavin",true);
        Book book2 = new Book(2,"Marvels-2","Kavin",true);
        Book book3 = new Book(3,"Marvels-3","Kavin",true);
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        //Remove Book By ID
        library.removeBookById(1);
        //Search Book By ID
        library.searchBookById(2);
        //Replace Book Name and Author By ID
        library.replaceBook(2, "Kavinraj","Avengers");
        //Display All Book
        library.displayAllBooks();
    }
}