import java.util.Scanner;
import com.Student;
import com.Livro;

public class Main {
    public static void main(String[] args) {
//        Student student = new Student();
//        student.pushNote(10);
//        student.pushNote(9);
//        student.pushNote(8);
//        student.pushNote(7);
//
//        System.out.println("Media: " + student.calculateMedia());

        Livro livro = new Livro();
        livro.setTitle("Thus Spoke Zarathustra");
        livro.setAuthor("Nietzsche");
        System.out.println(livro.getDetails());
    }
}