import schoolmanagementsystem.School;
import schoolmanagementsystem.Student;
import schoolmanagementsystem.Teachers;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Teachers lizzy = new Teachers(1,"Lizzy",500);
        Teachers melissa = new Teachers(2,"Mellisa",700);
        Teachers vanderhorn = new Teachers(3,"Vanderhorn",600);

        List<Teachers> teacherList = new ArrayList<>();
        teacherList.add(lizzy);
        teacherList.add(melissa);
        teacherList.add(vanderhorn);

        Student tamasha = new Student(1,"tamasha",4);
        Student rakshith = new Student(1,"rakshith",4);
        Student rabbi = new Student(3,"rabbi",5);

        List<Student> studentList = new ArrayList<>();
        studentList.add(tamasha);
        studentList.add(rakshith);
        studentList.add(rabbi);

        School ghs = new School(teacherList,studentList);
        System.out.println("ghs has earned: " + ghs.getTotalMoneyEarned());

        tamasha.payFees(5000);
        System.out.println("ghs has earned $ "+ghs.getTotalMoneyEarned());
        rakshith.payFees(6000);
        System.out.println("ghs has earned $ "+ghs.getTotalMoneyEarned());

        System.out.println("---making school ghs pay salary---");
        lizzy.receiveSalary(lizzy.getSalary());
        System.out.println("ghs has spent for salary to "+ lizzy.getName()+" and now has "+ghs.getTotalMoneyEarned());

        System.out.println(rakshith);
    }
}