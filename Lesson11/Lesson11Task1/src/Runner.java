import by.itClass.Book;
import by.itClass.Journal;
import by.itClass.interfaces.Printable;

public class Runner {
    static void perform(Printable obj){

        obj.print();

    }

    public static void main(String[] args) {

        Book book = new Book("Alis","none");
        Journal journal = new Journal("Voge","12/21");

        perform(book);
        perform(journal);

    }
}
