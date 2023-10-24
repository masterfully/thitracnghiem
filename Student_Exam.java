import java.util.Scanner;

public class Student_Exam {
    private String examID;
    private String studentID;

    public Student_Exam() {
    }

    public Student_Exam(String examID, String studentID) {
        this.examID = examID;
        this.studentID = studentID;
    }

    public Student_Exam(Student_Exam other) {
        examID = other.examID;
        studentID = other.studentID;
    }

    public String getExamID() {
        return examID;
    }

    public void setExamID(String examID) {
        this.examID = examID;
    }

    public void setStudentID(Student other){
        this.studentID = other.id;
    }
    
    public void input() {
        System.out.print("Input Exam ID: ");
        Scanner scanner = new Scanner(System.in);
        examID = scanner.nextLine();
    }

    public void output() {
        System.out.println("\nExam ID: " + examID);
    }

}
