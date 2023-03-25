import java.util.Comparator;

public class TaskAgeComparator implements Comparator<Note> {
    @Override
    public int compare(Note task1, Note task2) {
        return Integer.compare(task1.getPrior(), task2.getPrior());
    }
}
