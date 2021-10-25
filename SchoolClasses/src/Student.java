public class Student {
    private String firstName;
    private String lastName;
    private int grade;
    static int studentsNumbers = 0;
    private int studentID;
    Student() { //zero-parameter constructor: set all values to default or empty.
        firstName = "";
        lastName = "";
        grade = 0;
        studentID = studentsNumbers;
        studentsNumbers++;
    }
    Student(String first, String last, int grade) { //constructor: takes in values inputed by user and implements them into the class.
        this.firstName = first;
        this.lastName = last;
        this.grade = grade;
        studentID = studentsNumbers;
        studentsNumbers++;
    }
    public String toString() { //Changes what is outputed when object is printed.
        return "Name: " + firstName + " " + lastName + "Grade: " + grade;
    }

    //#region getters and setters
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String name) {
        this.firstName = name;
    }

    public String getLastName() {
        return lastName;
    }
    public void setLastName(String name) {
        this.lastName = name;
    }

    public int getGrade() {
        return grade;
    }
    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getStudentID() {
        return studentID;
    }
    //#endregion

    public String getFullName() { //Returns full name of student(first name + last name).
        return firstName + " " + lastName;
    }
}
