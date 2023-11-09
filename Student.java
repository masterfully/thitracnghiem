import java.io.Serializable;
import java.util.Scanner;

public class Student  implements Serializable {
    private String id;
    String faculty;
    private String firstName;
    private String lastName;
    String currentClass;
    String gender;
    private String dateOfBirth;
    
    public Student() {
    }

    public Student(String id, String faculty, String firstName, String lastName, String currentClass, String gender,
            String dateOfBirth) {
        this.id = id;
        this.faculty = faculty;
        this.firstName = firstName;
        this.lastName = lastName;
        this.currentClass = currentClass;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
    }

    public Student(Student other) {
        this.id = other.id;
        this.faculty = other.faculty;
        this.firstName = other.firstName;
        this.lastName = other.lastName;
        this.currentClass = other.currentClass;
        this.gender = other.gender;
        this.dateOfBirth = other.dateOfBirth;
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input Student id: ");
        this.id = scanner.nextLine();
        System.out.print("Input Faculty: ");
        this.faculty = scanner.nextLine();
        System.out.print("\nInput Student's firstname: ");
        this.firstName = scanner.nextLine();
        System.out.print("\nInput Student's lastname: ");
        this.lastName = scanner.nextLine();
        System.out.print("\nInput class: ");
        this.currentClass = scanner.nextLine();
        System.out.print("\nInput gender: ");
        this.gender = scanner.nextLine();
        System.out.print("\nInput date of birth: ");
        this.dateOfBirth = scanner.nextLine();
    }

    public void output() {
        System.out.print("Student id: ");
        System.out.println(this.id);
        System.out.print("Student's faculty: ");
        System.out.println(this.faculty);
        System.out.print("Student's firstname: ");
        System.out.println(this.firstName);
        System.out.print("Student's lastname: ");
        System.out.println(this.lastName);
        System.out.print("Class: ");
        System.out.println(this.currentClass);
        System.out.print("Gender: ");
        System.out.println(this.gender);
        System.out.print("date of birth: ");
        System.out.println(this.dateOfBirth);
    }

    public String getId() {
        return id;
    }

    public String getFaculty() {
        return faculty;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCurrentClass() {
        return currentClass;
    }

    public String getGender() {
        return gender;
    }

    public String getdateOfBirth() {
        return dateOfBirth;
    }

    public void setId(String Studentid) {
        id = Studentid;
    }

    public void setFaculty(String StudentFaculty) {
        faculty = StudentFaculty;
    }

    public void setFirstName(String StudentFirstName) {
        firstName = StudentFirstName;
    }

    public void setLastName(String StudentLastName) {
        lastName = StudentLastName;
    }

    public void setClass(String StudentClass) {
        currentClass = StudentClass;
    }

    public void setGender(String StudentGender) {
        gender = StudentGender;
    }

    public void setdateOfBirth(String StudentDateOfBirth) {
        dateOfBirth = StudentDateOfBirth;
    }
}
