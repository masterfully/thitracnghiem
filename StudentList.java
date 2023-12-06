
import java.util.Scanner;

public class StudentList {
    Student[] StudentArray;
    int n;

    public StudentList() {
        this.StudentArray = new Student[100];
        this.n = 0;
    }

    public void addStudent() {
        Student st = new Student();
        st.input();
        StudentArray[n] = st;
        n++;
    }

    public void addStudent(int number) {
        for (int i = 0; i < number; i++) {
            Student st = new Student();
            st.input();
            StudentArray[n] = st;
            n++;
        }
    }

    public void addStudent(Student other) {
        Student st = new Student(other);
        StudentArray[n] = st;
        n++;
    }

    public void addStudent(String id, String faculty, String firstName, String lastName, String currentClass,
            String gender,
            String dateOfBirth) {
        Student st = new Student(id, faculty, firstName, lastName, currentClass, gender, dateOfBirth);
        StudentArray[n] = st;
        n++;
    }

    public void printList() {
        System.out.println("Student list: ");
        for (int i = 0; i < this.n; i++) {
            System.out.println("Student " + (i + 1) + ":");
            Student st = this.StudentArray[i];
            System.out.println("\tid: " + st.getId());
            System.out.println("\tFaculty: " + st.getFaculty());
            System.out.println("\tFirst name: " + st.getFirstName());
            System.out.println("\tLast name: " + st.getLastName());
            System.out.println("\tClass: " + st.getCurrentClass());
            System.out.println("\tGender: " + st.getGender());
            System.out.println("\tdate of birth: " + st.getDateOfBirth());
        }
    }

    public void insertList(StudentList otherList) {
        for (int i = 0; i < otherList.n; i++) {
            this.addStudent(otherList.StudentArray[i]);
        }
    }

    public void deleteById() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input Student id which you want to delete: ");
        String id = scanner.nextLine();
        int position = -1;
        for (int i = 0; i < n; i++) {
            if (StudentArray[i].getId().indexOf(id) == 0) {
                position = i;
                break;
            }
        }
        if (position != -1) {
            for (int j = position; j < n + 1; j++) {
                StudentArray[j] = StudentArray[j + 1];
            }
            StudentArray[n - 1] = null;
            n--;
            System.out.println("Student: " + id + "was deleted");
        } else {
            System.out.println("Didn't find " + id);
        }
    }

    public void deleteById(String id) {
        int position = -1;
        for (int i = 0; i < n; i++) {
            if (StudentArray[i].getId().indexOf(id) == 0) {
                position = i;
                break;
            }
        }
        if (position != -1) {
            for (int j = position; j < n + 1; j++) {
                StudentArray[j] = StudentArray[j + 1];
            }
            StudentArray[n - 1] = null;
            n--;
            System.out.println("Student: " + id + "was deleted");
        } else {
            System.out.println("Didn't find " + id);
        }
    }

    public void deleteByPosition(int position) {
        for (int j = position; j < n + 1; j++) {
            StudentArray[j] = StudentArray[j + 1];
        }
        StudentArray[n - 1] = null;
        n--;
        System.out.println("Student: " + position + "was deleted");
    }

    public void deleteByPosition() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input position where you want to delete: ");
        int position = scanner.nextInt();
        for (int j = position; j < n + 1; j++) {
            StudentArray[j] = StudentArray[j + 1];
        }
        StudentArray[n - 1] = null;
        n--;
        System.out.println("Student: " + position + "was deleted");
    }

    public void updateInfo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input Student id which you want to update: ");
        String id = scanner.nextLine();

        int position = -1;
        for (int i = 0; i < n; i++) {
            if (StudentArray[i].getId().equals(id)) {
                position = i;
                break;
            }
        }
        if (position != -1) {
            System.out.println("What information do you want to update?");
            System.out.println("1. id");
            System.out.println("2. First name");
            System.out.println("3. Last name");
            System.out.println("4. Class");
            System.out.println("5. Gender");
            System.out.println("6. date of birth");
            System.out.println("7. faculty");

            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Input new id: ");
                    String newId = scanner.nextLine();
                    StudentArray[position].setId(newId);
                    break;
                case 2:
                    System.out.print("Input new first name: ");
                    String newFirstName = scanner.nextLine();
                    StudentArray[position].setFirstName(newFirstName);
                    break;
                case 3:
                    System.out.print("Input new last name: ");
                    String newLastName = scanner.nextLine();
                    StudentArray[position].setLastName(newLastName);
                    break;
                case 4:
                    System.out.print("Input new class: ");
                    String newClass = scanner.nextLine();
                    StudentArray[position].setClass(newClass);
                    break;
                case 5:
                    System.out.print("Input new gender: ");
                    String newGender = scanner.nextLine();
                    StudentArray[position].setGender(newGender);
                    break;
                case 6:
                    System.out.print("Input new date of birth: ");
                    String newDateOfBirth = scanner.nextLine();
                    StudentArray[position].setDateOfBirth(newDateOfBirth);
                    break;
                case 7:
                    System.out.print("Input new faculty: ");
                    String newFaculty = scanner.nextLine();
                    StudentArray[position].setFaculty(newFaculty);
                    break;
            }

            System.out.println("Student information has been updated successfully.");
        } else {
            System.out.println("Didn't find " + id);
        }
    }

    public void searchStudents() {
        StudentList results = new StudentList();
        System.out.println("Select search criteria:");
        System.out.println("1. id");
        System.out.println("2. First name");
        System.out.println("3. Last name");
        System.out.println("4. Class");
        System.out.println("5. Gender");
        System.out.println("6. date of birth");
        System.out.print("Select search option: ");
        Scanner scanner = new Scanner(System.in);
        int option = Integer.parseInt(scanner.nextLine());

        switch (option) {
            case 1:
                System.out.print("Input Student id: ");
                String id = scanner.nextLine();
                results = searchStudentsById(id);
                break;
            case 2:
                System.out.print("Input first name: ");
                String firstName = scanner.nextLine();
                results = searchStudentsByFirstName(firstName);
                break;
            case 3:
                System.out.print("Input last name: ");
                String lastName = scanner.nextLine();
                results = searchStudentsByLastName(lastName);
                break;
            case 4:
                System.out.print("Input class: ");
                String classId = scanner.nextLine();
                results = searchStudentsByClass(classId);
                break;
            case 5:
                System.out.print("Input gender: ");
                String gender = scanner.nextLine();
                results = searchStudentsByGender(gender);
                break;
            case 6:
                System.out.print("Input date of birth: ");
                String dateOfBirth = scanner.nextLine();
                results = searchStudentsByDateOfBirth(dateOfBirth);
                break;
            default:
                System.out.println("Invalid option.");
                break;
        }
        results.printList();
    }

    public StudentList searchStudentsById(String id) {
        StudentList results = new StudentList();
        for (int i = 0; i < n; i++) {
            if (StudentArray[i].getId().equals(id)) {
                results.addStudent(StudentArray[i]);
            }
        }

        return results;
    }

    public StudentList searchStudentsByFirstName(String firstName) {
        StudentList results = new StudentList();
        for (int i = 0; i < n; i++) {
            if (StudentArray[i].getFirstName().contains(firstName)) {
                results.addStudent(StudentArray[i]);
            }
        }

        return results;
    }

    public StudentList searchStudentsByLastName(String lastName) {
        StudentList results = new StudentList();
        for (int i = 0; i < n; i++) {
            if (StudentArray[i].getLastName().contains(lastName)) {
                results.addStudent(StudentArray[i]);
            }
        }

        return results;
    }

    public StudentList searchStudentsByClass(String classId) {
        StudentList results = new StudentList();
        for (int i = 0; i < n; i++) {
            if (StudentArray[i].getCurrentClass().equals(classId)) {
                results.addStudent(StudentArray[i]);
            }
        }

        return results;
    }

    public StudentList searchStudentsByGender(String gender) {
        StudentList results = new StudentList();
        for (int i = 0; i < n; i++) {
            if (StudentArray[i].getGender().equals(gender)) {
                results.addStudent(StudentArray[i]);
            }
        }

        return results;
    }

    public StudentList searchStudentsByDateOfBirth(String dateOfBirth) {
        StudentList results = new StudentList();
        for (int i = 0; i < n; i++) {
            if (StudentArray[i].getDateOfBirth().equals(dateOfBirth)) {
                results.addStudent(StudentArray[i]);
            }
        }

        return results;
    }

    public StudentList searchStudentsByFaculty(String faculty) {
        StudentList results = new StudentList();
        for (int i = 0; i < n; i++) {
            if (StudentArray[i].getFaculty().equals(faculty)) {
                results.addStudent(StudentArray[i]);
            }
        }

        return results;
    }

    public StudentList statistics() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select statistics criteria:");
        System.out.println("1. Class");
        System.out.println("2. Faculty");
        System.out.println("3. Gender");
        System.out.print("Select statistics option:");
        int option = Integer.parseInt(scanner.nextLine());
        StudentList result = new StudentList();
        switch (option) {
            case 1:
                statisticsByClass();
                break;
            case 2:
                statisticsByFaculty();
                break;
            case 3:
                statisticsByGender();
                break;
            default:
                System.out.println("Invalid option.");
                break;
        }
        return result;
    }

    public void statisticsByClass() {
        String[] classArray = new String[StudentArray.length];

        // Duyệt qua studentList hiện tại
        int m = 0;
        for (int i = 0; i < n; i++) {
            // Thêm mã lớp vào mảng classArray nếu chưa có
            boolean found = false;
            for (int j = 0; j < m; j++) {
                if (StudentArray[i].getCurrentClass().equals(classArray[j])) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                classArray[m] = StudentArray[i].getCurrentClass();
                m++;
            }
        }

        // Trả về studentList kết quả.
        System.out.println("----------------------\nStatistic by class:");
        for (int i = 0; i < m; i++) {
            StudentList result = new StudentList(); // Move the result initialization inside the loop
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (StudentArray[j].getCurrentClass().equals(classArray[i])) {
                    result.addStudent(StudentArray[j]); // Fix the index to 'j' instead of 'i'
                    count++;
                }
            }

            System.out.println("Class " + classArray[i] + " has " + count + " students: ");
            for (int k = 0; k < count; k++) {
                result.StudentArray[k].output(); // Access the result array
                System.out.println("-----------------------------------------------------");
            }
        }
    }

    public void statisticsByFaculty() {
        String[] facultyArray = new String[StudentArray.length];

        // Duyệt qua studentList hiện tại
        int m = 0;
        for (int i = 0; i < n; i++) {
            // Thêm mã lớp vào mảng classArray nếu chưa có
            boolean found = false;
            for (int j = 0; j < m; j++) {
                if (StudentArray[i].getFaculty().equals(facultyArray[j])) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                facultyArray[m] = StudentArray[i].getFaculty();
                m++;
            }
        }

        // Trả về studentList kết quả.
        System.out.println("----------------------\nStatistic by class:");
        for (int i = 0; i < m; i++) {
            StudentList result = new StudentList(); // Move the result initialization inside the loop
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (StudentArray[j].getFaculty().equals(facultyArray[i])) {
                    result.addStudent(StudentArray[j]); // Fix the index to 'j' instead of 'i'
                    count++;
                }
            }

            System.out.println("Faculty " + facultyArray[i] + " has " + count + " students: ");
            for (int k = 0; k < count; k++) {
                result.StudentArray[k].output(); // Access the result array
                System.out.println("-----------------------------------------------------");
            }
        }
    }

    public void statisticsByGender() {
        String[] genderArray = new String[StudentArray.length];

        // Duyệt qua studentList hiện tại
        int m = 0;
        for (int i = 0; i < n; i++) {
            // Thêm mã lớp vào mảng classArray nếu chưa có
            boolean found = false;
            for (int j = 0; j < m; j++) {
                if (StudentArray[i].getGender().equals(genderArray[j])) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                genderArray[m] = StudentArray[i].getGender();
                m++;
            }
        }

        // Trả về studentList kết quả.
        System.out.println("----------------------\nStatistic by class:");
        for (int i = 0; i < m; i++) {
            StudentList result = new StudentList(); // Move the result initialization inside the loop
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (StudentArray[j].getGender().equals(genderArray[i])) {
                    result.addStudent(StudentArray[j]); // Fix the index to 'j' instead of 'i'
                    count++;
                }
            }

            System.out.println("Gender " + genderArray[i] + " has " + count + " students: ");
            for (int k = 0; k < count; k++) {
                result.StudentArray[k].output(); // Access the result array
                System.out.println("-----------------------------------------------------");
            }
        }
    }

}