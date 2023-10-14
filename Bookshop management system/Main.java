import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Book book1 = new Book("To Kill a Mockingbird", "Harper Lee", 4.27, 15.99);
        Book book2 = new Book("Your only hope", "George Orwell", 4.17, 12.99);
        Book book3 = new Book("My loving mother", "George Orwell", 4.17, 12.99);
        Book book4 = new Book("My loving father", "George Orwell", 4.17, 12.99);
        Book book5 = new Book("The ugly ones are not yet born", "George Orwell", 4.17, 12.99);
        Book book6 = new Book("You're a king", "George Orwell", 4.17, 12.99);
        Book book7 = new Book("No love", "George Orwell", 4.17, 12.99);
        Book book8 = new Book("Late nights", "George Orwell", 4.17, 12.99);
        Book book9 = new Book("Friday nights", "Max Wordall", 4.17, 12.99);
        Book book10 = new Book("The great geek", "Moses Bassey", 4.17, 12.99);
    
        Store store = new Store();
        store.addBook(book1); 
        store.addBook(book2);
        store.addBook(book3);
        store.addBook(book4);
        store.addBook(book5);
        store.addBook(book6);
        store.addBook(book7);
        store.addBook(book8);
        store.addBook(book9);
        store.addBook(book10);
    
        

        System.out.print("\nHello friend, welcome to the Java Bookstores, Please tell us your name: ");
        String name = scan.nextLine();
        System.out.println("\nGreat! Here's our collection of books.");
        System.out.println(store);

        boolean bool = true;
        while(bool){
            System.out.print("\nPlease tell us the title of the book you'd like to purchase: ");
            String bookPurchase = scan.nextLine();

            for (int i = 0; i < store.storeSize(); i++) {
                if(bookPurchase.toLowerCase().equals(store.getBook(i).getTitle().toLowerCase())){
                    System.out.println();
                    store.sellBook(bookPurchase, name);
                    System.out.println(store);
                    break;
                } else if(i == (store.storeSize() - 1)) {
                    System.out.println("Sorry, the book: " + bookPurchase + " you requested is not in our store.");
                    System.out.println(store);
                }
            }

            System.out.print("\nWould you like to search our store for authors? (Yes or No): ");
            String reply = scan.nextLine();
            if(reply.toLowerCase().equals("yes")){
                System.out.print("And which author would that be: ");
                String authorName = scan.nextLine();
                System.out.println();
                store.searchAuthor(authorName);
            }

            System.out.print("\nInput anything if you'd like to buy another book, if not? , input 'yes' to stop the application: ");
            String input = scan.nextLine();
            if(input.toLowerCase().equals("yes")){
                bool = false;
            } 
        
        }
        scan.close();
    }
}