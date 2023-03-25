import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Book book = new Book();
        Task3 homework = new Task3("Сдать дз", book);
        Task1 programming = new Task1("Попрограммировать", book);
        Task2 cleaning = new Task2("Убраться в комнате", book);

        book.BookPrint();
    }
}