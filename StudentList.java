import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentList {
    private Student[] StudentArray;
    private int n;

    public StudentList() {
        this.StudentArray = new Student[10];
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
            System.out.println("\tdate of birth: " + st.getdateOfBirth());
        }
    }

    public void insertList(StudentList otherList) {
        for (int i = 0; i < otherList.n; i++) {
            this.addStudent(otherList.StudentArray[i]);
        }
    }

    public void deleteByid() {
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

    public void deleteByid(String id) {
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
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Input new id: ");
                    String newid = scanner.nextLine();
                    StudentArray[position].setId(newid);
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
                    StudentArray[position].setdateOfBirth(newDateOfBirth);
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
                results = searchStudentsByid(id);
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
                String classid = scanner.nextLine();
                results = searchStudentsByClass(classid);
                break;
            case 5:
                System.out.print("Input gender: ");
                String gender = scanner.nextLine();
                results = searchStudentsByGender(gender);
                break;
            case 6:
                System.out.print("Input date of birth: ");
                String dateOfBirth = scanner.nextLine();
                results = searchStudentsBydateOfBirth(dateOfBirth);
                break;
            default:
                System.out.println("Invalid option.");
                break;
        }
        results.printList();
    }

    private StudentList searchStudentsByid(String id) {
        StudentList results = new StudentList();
        for (int i = 0; i < n; i++) {
            if (StudentArray[i].getId().equals(id)) {
                results.addStudent(StudentArray[i]);
            }
        }

        return results;
    }

    private StudentList searchStudentsByFirstName(String firstName) {
        StudentList results = new StudentList();
        for (int i = 0; i < n; i++) {
            if (StudentArray[i].getFirstName().contains(firstName)) {
                results.addStudent(StudentArray[i]);
            }
        }

        return results;
    }

    private StudentList searchStudentsByLastName(String lastName) {
        StudentList results = new StudentList();
        for (int i = 0; i < n; i++) {
            if (StudentArray[i].getLastName().contains(lastName)) {
                results.addStudent(StudentArray[i]);
            }
        }

        return results;
    }

    private StudentList searchStudentsByClass(String classid) {
        StudentList results = new StudentList();
        for (int i = 0; i < n; i++) {
            if (StudentArray[i].getCurrentClass().equals(classid)) {
                results.addStudent(StudentArray[i]);
            }
        }

        return results;
    }

    private StudentList searchStudentsByGender(String gender) {
        StudentList results = new StudentList();
        for (int i = 0; i < n; i++) {
            if (StudentArray[i].getGender().equals(gender)) {
                results.addStudent(StudentArray[i]);
            }
        }

        return results;
    }

    private StudentList searchStudentsBydateOfBirth(String dateOfBirth) {
        StudentList results = new StudentList();
        for (int i = 0; i < n; i++) {
            if (StudentArray[i].getdateOfBirth().equals(dateOfBirth)) {
                results.addStudent(StudentArray[i]);
            }
        }

        return results;
    }

    public StudentList statistics() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select statistics criteria:");
        System.out.println("1. Class");
        System.out.println("2. Gender");
        System.out.println("3. year of birth");
        System.out.print("Select statistics option:");
        int option = Integer.parseInt(scanner.nextLine());
        StudentList result = new StudentList();
        switch (option) {
            case 1:
                result = statisticsByClass();
                break;
            case 2:
                result = statisticsByGender();
                break;
            case 3:
                result = statisticsByYearOfBirth();
                break;
            default:
                System.out.println("Invalid option.");
                break;
        }
        return result;
    }

    public StudentList statisticsByClass() {

        StudentList result = new StudentList();
        String[] typesOfClass = new String[StudentArray.length];
        typesOfClass[0] = StudentArray[0].getCurrentClass();

        for (int i = 1; i < n; i++) {
            boolean isClassExist = false;
            for (int j = 0; j < i; j++) {
                if (StudentArray[i].getCurrentClass().equals(typesOfClass[j])) {
                    isClassExist = true;
                    break;
                }
            }

            if (!isClassExist) {
                typesOfClass[i] = StudentArray[i].getCurrentClass();
            }
        }

        for (String typeOfClass : typesOfClass) {
            Student student = new Student(null, null, null, typeOfClass, null, null, null);
            result.addStudent(student);
        }

        return result;
    }

    public StudentList statisticsByGender() {
        StudentList result = new StudentList();

        Map<String, Integer> genderCounts = new HashMap<>();
        for (Student student : StudentArray) {
            String gender = student.getGender();

            if (!genderCounts.containsKey(gender)) {
                genderCounts.put(gender, 0);
            }

            genderCounts.put(gender, genderCounts.get(gender) + 1);
        }

        for (String gender : genderCounts.keySet()) {
            Student student = new Student(null, null, null, null, null, gender, null);
            result.addStudent(student);
        }

        return result;
    }

    public StudentList statisticsByYearOfBirth() {
        StudentList result = new StudentList();

        Map<Integer, Integer> yearOfBirthCounts = new HashMap<>();
        for (Student student : StudentArray) {
            int yearOfBirth = Integer.parseInt(student.getdateOfBirth());

            if (!yearOfBirthCounts.containsKey(yearOfBirth)) {
                yearOfBirthCounts.put(yearOfBirth, 0);
            }

            yearOfBirthCounts.put(yearOfBirth, yearOfBirthCounts.get(yearOfBirth) + 1);
        }

        for (Integer yearOfBirth : yearOfBirthCounts.keySet()) {
            Student student = new Student(null, null, null, null, null, null, String.valueOf(yearOfBirth));
            result.addStudent(student);
        }

        return result;
    }

}