import java.util.List;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {

       kreirajjXml creator = new kreirajjXml();
        creator.createXml("students.xml", getStudentList());
    }
    private static List<Student> getStudentList() {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Valentin", "Stojanovski", 100));
        studentList.add(new Student("Andrej", "Tosheski", 101));
        // add more students if needed
        return studentList;
    }
}