package src.User;

public class Student extends User {
    @Override
    void Regin() {
    }

    String matricNo;
    String adminssionNo;

    String registCourses(String courseCode) {
        return courseCode;
    }

    String checkResult() {
        User user = new Student();
        user.Regin();
    }

    String Regin() {
        if (matricNo.isEmpty() || adminssionNo.isEmpty()) {
            return "Can't be empty";
        } else {
            return "Success";
}
