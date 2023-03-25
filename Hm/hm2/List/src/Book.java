import java.util.ArrayList;
import java.util.Collections;

public class Book {
    ArrayList<Note> book = new ArrayList<>();

    public ArrayList<Note> getBook() {
        return book;
    }

    public void BookPrint() {
        Collections.sort(book, Collections.reverseOrder(new TaskAgeComparator()));
        for (int i = 0; i < book.size(); i++) {
            Note note = book.get(i);
            String name = note.getName();
            System.out.print((i+1) + ". Приоритет: " + note.getPrior());
            System.out.println(", Задача: " + name);
        }
    }

    public void BookAdd(Note note) {
        book.add(note);
    }
}
