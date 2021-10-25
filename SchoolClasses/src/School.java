import java.util.ArrayList;

public class School {
    private String schoolName; //Field #1 with getters and setters
    public String getSchoolName() {
        return schoolName;
    }
    public void setSchoolName(String name) {
        this.schoolName = name;
    }
    
    private String address; //Field #2 with getters and setters
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    
    private String district; //Field #3 with getters and setters
    public String getDistrict() {
        return district;
    }
    public void setDistrict(String district) {
        this.district = district;
    }
    
    private ArrayList<Teacher> teachers = new ArrayList<>();
    private ArrayList<Student> students = new ArrayList<>();
    private ArrayList<String> courses = new ArrayList<>();
    School() { //Zero-parameter constructor
        schoolName = "";
        address = "";
        district = "";
    }
    School(String name, String address, String district) { //Constructor
        this.schoolName = name;
        this.address = address;
        this.district = district;
    }

    public void addTeacher() { //Adds a teacher without any parameters.
        teachers.add(new Teacher());
    }
    public void addTeacher(String firstName, String lastName, String subject) { //Adds teacher with parameters.
        teachers.add(new Teacher(firstName, lastName, subject));
    }
    public void removeTeacher(int index) { //Removes teacher from index.
        teachers.remove(index);
    }
    public void showTeachers() { //Uses for each loop to print all teacher objects.
        for (Teacher teacher: teachers) {
            System.out.println(teacher);
        }
    }

    public void addStudent() { //Adds a student without any parameters.
        students.add(new Student());
    }
    public void addStudent(String firstName, String lastName, int grade) { //Adds a student with parameters.
        students.add(new Student(firstName, lastName, grade));
    }
    public void removeStudent(int index) { //Removes student from index.
        students.remove(index);
    }
    public void showStudents() { //Uses for each loop to print all teacher objects.
        for (Student student: students) {
            System.out.println(student);
        }
    }
}
