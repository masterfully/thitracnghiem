import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Scanner;

public class main {
    public static void printToFile(StudentList studentList) {
        try {
            File file_out = new File("data-out.txt");
            FileWriter fileWriter = new FileWriter(file_out);
            BufferedWriter writer = new BufferedWriter(fileWriter);
            for (int i = 0; i < studentList.n; i++) {
                writer.write(studentList.StudentArray[i].getId() + "," + studentList.StudentArray[i].getFaculty() + ","
                        + studentList.StudentArray[i].getFirstName() + "," + studentList.StudentArray[i].getLastName()
                        + "," + studentList.StudentArray[i].getCurrentClass() + ","
                        + studentList.StudentArray[i].getGender() + "," + studentList.StudentArray[i].getDateOfBirth());
                writer.newLine();
            }
            writer.close();
            fileWriter.close();
        } catch (Exception e) {
            e.printStackTrace();

        }
    }

    public static void readFile(StudentList studentList) throws FileNotFoundException {
        File file = new File("D:\\Second year\\OOP\\thitracnghiem\\data.txt");
        Scanner scanner = new Scanner(file);
        try {
            while (scanner.hasNextLine()) {
                String[] studentData = scanner.nextLine().split(",");
                studentList.addStudent(studentData[0], studentData[1], studentData[2], studentData[3], studentData[4],
                        studentData[5], studentData[6]);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        StudentList studentList = new StudentList();
        readFile(studentList);
        studentList.printList();
    }
}
