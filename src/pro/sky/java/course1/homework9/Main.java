package pro.sky.java.course1.homework9;

public class Main {

    public static void main(String[] args) {

        // the minimum level
        Author author1 = new Author("Jack","London");
        Author author2 = new Author("Edgar","Po");

        Book book1 = new Book("The white hang",author1,1890);
        Book book2 =  new Book("The murder in local hotel", author2,1911);

        book2.setYear(1913);

        // the middle level
        Book[] setOfBooks = new Book[3];
        setOfBooks[0] = book1;
        setOfBooks[1] = book2;

        //the maximum level
        Library library = new Library(2);
        library.addBook("Peace and war 1",new Author("Lev","Tolstoy"),1880);
        library.addBook("The new story of batman",new Author("Mark","Layton"),1976);

        library.printAllTheBooks();

        library.printBook("Peace and war 1");
    }



}
