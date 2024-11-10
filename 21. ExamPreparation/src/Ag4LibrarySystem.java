abstract class Item {
    String title;

    Item(String title) {
        this.title = title;
    }
    abstract String getItemDetails();
}

// Book class inheriting from Item
class Book extends Item {
    String author;
    String ISBN;

    Book(String title, String author, String ISBN) {
        super(title);
        this.author = author;
        this.ISBN = ISBN;
    }

    @Override
    String getItemDetails() {
        return "Book Title: " + title + ", Author: " + author + ", ISBN: " + ISBN;
    }
}

class DVD extends Item {
    String director;
    int duration;

    DVD(String title, String director, int duration) {
        super(title);
        this.director = director;
        this.duration = duration;
    }

    @Override
    String getItemDetails() {
        return "DVD Title: " + title + ", Director: " + director + ", Duration: " + duration + " mins";
    }
}

class Magazine extends Item {
    int issueNumber;
    String publicationDate;

    Magazine(String title, int issueNumber, String publicationDate) {
        super(title);
        this.issueNumber = issueNumber;
        this.publicationDate = publicationDate;
    }

    @Override
    String getItemDetails() {
        return "Magazine Title: " + title + ", Issue Number: " + issueNumber + ", Publication Date: " + publicationDate;
    }
}

public class Ag4LibrarySystem {
    public static void main(String[] args) {
        Item book = new Book("Effective Java", "Joshua Bloch", "123456789");
        Item dvd = new DVD("Inception", "Christopher Nolan", 148);
        Item magazine = new Magazine("National Geographic", 202, "June 2023");

        System.out.println(book.getItemDetails());
        System.out.println(dvd.getItemDetails());
        System.out.println(magazine.getItemDetails());
    }
}