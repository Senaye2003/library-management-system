public class Student extends User {
    private String enrollmentId;

    public Student(int userId, String name, String enrollmentId) {
        super(userId, name);
        this.enrollmentId = enrollmentId;
    }

    public String getEnrollmentId() {
        return enrollmentId;
    }
}
