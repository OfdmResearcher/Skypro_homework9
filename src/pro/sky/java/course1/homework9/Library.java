package pro.sky.java.course1.homework9;

public class Library {
    private Book[] setOfBooks;

    public Library(int lengthOfArray) {
        setOfBooks = new Book[lengthOfArray];
    }

    public void addBook(String name, Author author, int year){
        for (int i = 0; i < setOfBooks.length; i++) {
            if (setOfBooks[i] == null) {
                setOfBooks[i] = new Book(name,author,year);
                System.out.println(setOfBooks[i]);
                break;
            }
        }
    }

    public void printAllTheBooks() {
        for (Book setOfBook : setOfBooks) {
            System.out.println(setOfBook.getAuthor().getName() + " " + setOfBook.getAuthor().getSurname() + ": " + setOfBook.getName() + ": " + setOfBook.getYear());
        }
    }

    public void printBook (String name) {
        for (Book setOfBook : setOfBooks) {
            if (setOfBook.getName().equals(name)) {
                System.out.println(setOfBook.getName() + " by " + setOfBook.getAuthor().getName() + " " + setOfBook.getAuthor().getSurname() + " was published in " +
                        setOfBook.getYear());
                break;
            }
        }
    }

    public void changeYear (String name, int newYear) {
        for (Book setOfBook : setOfBooks) {
            if (setOfBook.getName().equals(name)) {
                setOfBook.setYear(newYear);
            }
        }
    }
}
