import java.util.ArrayList;

public class Store {
    private ArrayList<Book> books;

    public Store(){
        this.books = new ArrayList<>();
    }

    public Book getBook(int index){
        return new Book(books.get(index));
    }

    public void setBook(int index, Book newBook){
        books.set(index, new Book(newBook));
    }

    public void addBook(Book newBook){
        books.add(new Book(newBook));
    }

    public boolean contains(Book book) {
        return this.books.contains(book); 
    }

    public void sellBook(String title, String name){
        String lowerTitle = title.toLowerCase();
        for (int i = 0; i < books.size(); i++) {

            String myTitle = books.get(i).getTitle();
            String lowerMyTitle = myTitle.toLowerCase();

            if(lowerMyTitle.equals(lowerTitle)){
                System.out.println("Congrats " + name + ". Your book: " + title + " has been sold. Enjoy!");
                books.remove(i);
            }
        }
    }

    public void searchAuthor(String author){
        String searchAuthor = author.toLowerCase();

        for (int i = 0; i < books.size(); i++) {
            String myAuthor = books.get(i).getAuthor();
            String lowerMyAuthor = myAuthor.toLowerCase();

            if(lowerMyAuthor.equals(searchAuthor)){
                Book authorBook = new Book(books.get(i));
                System.out.println(authorBook);
            }
        }
    }

    public int storeSize(){
        return books.size();
    }


    @Override
    public String toString() {
        String temp = "";
        System.out.println("\n********Below is a list of books in our store, enjoy!********\n");
        for (int i = 0; i < books.size(); i++) {
            temp += books.get(i).toString() + "\n";
        }
        return temp;
    }
    
}




