import model.Student;
import service.StudentService;

public class Main {
    public static void main(String[] args) {


        StudentService service = new StudentService();
        Student student1 = service.createStudent();
        Student student2 = service.createStudent();
        Student student3 = service.createStudent();
        Student student4 = service.createStudent();
        Student student5 = service.createStudent();
        Student student6 = service.createStudent();
        Student student7 = service.createStudent();

        Student [] studentArray = {student1, student2, student3,student4,student5,student6,student7};
        service.sortByMark(studentArray);
        for (Student x: studentArray) {
            x.printAll();
            System.out.println();
        }
    }
}