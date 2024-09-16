package schoolmanagementsystem;

import java.util.List;

/**
 * many teachers,many students
 * implements teachers and students using arraylist.
 */

public class School {
    private List<Teachers> teachers;
    private List<Student> student;
    private static int  totalMoneyEarned;
    private static int totalMoneySpent;

    /**
     * new school obj is created
     * @param teachers list of teachers in the school
     * @param student list of students in the school
     */

    public School(List<Teachers> teachers, List<Student> student) {
        this.teachers = teachers;
        this.student = student;
        totalMoneyEarned=0;
        totalMoneySpent=0;
    }

    public List<Teachers> getTeachers() {
        return teachers;
    }

    /**
     * adds a teacher to the school
     * @param teacher to teacher to be added
     */
    public void addTeacher(Teachers teacher) {
        teachers.add(teacher);
    }

    public List<Student> getStudent() {
        return student;
    }

    public void addStudent(Student students) {
        student.add(students);
    }

    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    public static void updateTotalMoneyEarned(int moneyEarned) {
        totalMoneyEarned += moneyEarned;
    }

    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }

    public static void updateMoneySpent(int moneySpent) {
       totalMoneyEarned -= moneySpent;
    }
}
