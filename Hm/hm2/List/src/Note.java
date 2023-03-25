public class Note {
    String name;
    int prior;

    public int getPrior() {
        return prior;
    }

    public void setPrior(int prior) {
        this.prior = prior;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Note(String name, Integer prior, Book book) {
        this.name = name;
        this.prior = prior;
        book.BookAdd(this);
    }
}
