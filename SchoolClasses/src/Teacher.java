public class Teacher {
    private String firstName;
    private String lastName;
    private String subject;
    Teacher() { //Zero-parameter constructor
        firstName = "";
        lastName = "";
        subject = "";
    }
    Teacher(String first, String last, String subject) { //Constructor
        this.firstName = first;
        this.lastName = last;
        this.subject = subject;
    }
    public String toString() { //Method to specify string to output when printed
        return "Name: " + firstName + " " + lastName + "Subject: " + subject;
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

    public String getSubject() {
        return subject;
    }
    public void setSubject(String subject) {
        this.subject = subject;
    }
    //#endregion

    public String getFullName() { //Returns full name of teacher(first name + last name)
        return firstName + " " + lastName;
    }
}
