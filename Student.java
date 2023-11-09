import java.util.Scanner;

public class Student extends human{
    String currentClass;
    
    public Student() {
    }

    public Student(String ID, String faculty, String firstName, String lastName, String currentClass, String gender,
            String dateOfBirth) {
        super(ID, faculty, firstName, lastName, gender, dateOfBirth);
        this.currentClass = currentClass;
    }

    public Student(Student other) {
        super((Student)other);
        this.currentClass = other.currentClass;
    }

    public void input() {
        super.input();
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nInput class: ");
        this.currentClass = scanner.nextLine();
    }

    public void output() {
        super.output();
        System.out.print("Class: ");
        System.out.println(this.currentClass);
    }

    public String getCurrentClass() {
        return currentClass;
    }
    
    public void setClass(String StudentClass) {
        currentClass = StudentClass;
    }
}
