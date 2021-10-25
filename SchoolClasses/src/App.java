public class App {
    public static void main(String[] args) throws Exception {
        School tait = new School("Tait Elementary","10071 Finlayson Dr, Richmond, BC","Richmond, 38");
        for (int i = 0; i < 10; i++) {
            tait.addStudent();
        }
        for (int i = 0; i < 3; i++) {
            tait.addTeacher();
        }
        tait.showTeachers();
        tait.showStudents();
        tait.removeStudent(0);
        tait.removeStudent(0);
        tait.removeTeacher(0);
        tait.showStudents();
        tait.showTeachers();
    }
}
