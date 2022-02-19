package alexey.interfaces.printable;

import java.util.ArrayList;
import java.util.List;

public class PrintableMain {

   static List<Printable> booksAndMags = new ArrayList<>();

    public static void main(String[] args) {
        booksAndMags.add(new Book("Автор1", "Книга1"));
        booksAndMags.add(new Magazine("Журнал1"));
        booksAndMags.add(new Book("Автор2", "Книга2"));
        booksAndMags.add(new Magazine("Журнал2"));
        booksAndMags.add(new Magazine("Журнал3"));

        for(Printable pt : booksAndMags) {
            pt.print();
        }

    }
}
