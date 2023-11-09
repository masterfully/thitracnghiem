import java.util.Scanner;

public abstract class human {
    private String ID;
    String faculty;
    private String firstName;
    private String lastName;
    String gender;
    private String dateOfBirth;

    public human() {
    }

    public human(String ID, String faculty, String firstName, String lastName, String gender,
            String dateOfBirth) {
        this.ID = ID;
        this.faculty = faculty;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
    }

    public human(human other) {
        this.ID = other.ID;
        this.faculty = other.faculty;
        this.firstName = other.firstName;
        this.lastName = other.lastName;
        this.gender = other.gender;
        this.dateOfBirth = other.dateOfBirth;
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input ID: ");
        this.ID = scanner.nextLine();
        System.out.print("Input Faculty: ");
        this.faculty = scanner.nextLine();
        System.out.print("\nInput Student's firstname: ");
        this.firstName = scanner.nextLine();
        System.out.print("\nInput Student's lastname: ");
        this.lastName = scanner.nextLine();
        System.out.print("\nInput gender: ");
        this.gender = scanner.nextLine();
        System.out.print("\nInput date of birth: ");
        this.dateOfBirth = scanner.nextLine();
    }

    public void output() {
        System.out.print("ID: ");
        System.out.println(this.ID);
        System.out.print("Student's faculty: ");
        System.out.println(this.faculty);
        System.out.print("Student's firstname: ");
        System.out.println(this.firstName);
        System.out.print("Student's lastname: ");
        System.out.println(this.lastName);
        System.out.print("Gender: ");
        System.out.println(this.gender);
        System.out.print("date of birth: ");
        System.out.println(this.dateOfBirth);
    }

    public String getId() {
        return ID;
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

    public String getGender() {
        return gender;
    }

    public String getdateOfBirth() {
        return dateOfBirth;
    }

    public void setId(String Studentid) {
        ID = Studentid;
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

    public void setGender(String StudentGender) {
        gender = StudentGender;
    }

    public void setdateOfBirth(String StudentDateOfBirth) {
        dateOfBirth = StudentDateOfBirth;
    }
}
