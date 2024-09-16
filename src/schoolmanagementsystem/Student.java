package schoolmanagementsystem;

//this class is responsible for keeping the track of student fees,name,grade and fees pais

public class Student {
    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;

    /**
     * to create a new student by intializing
     * Fees for every student is $30,000.
     * Fees paid initially is 0.
     * @param id id for the student; unique/
     * @param name name of the student
     * @param grade grade of the student
     */

    public Student(int id,String name,int grade){
        this.feesPaid=0;
        this.feesTotal=30000;
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    //Not going to student's name,student's id

    /**
     * used to update the student's grade
     * @param grade new grade of the student
     */
    public void setGrade(int grade){
        this.grade=grade;
    }

    /**
     * keep adding the fees to feedPaid field
     * add the fees to the fees paid.
     * the school is going to receive the funds.
     * @param fees
     */
    public void payFees(int fees){
        feesPaid = feesPaid+fees;
        School.updateTotalMoneyEarned(feesPaid);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public int getFeesPaid() {
        return feesPaid;
    }

    public int getFeesTotal() {
        return feesTotal;
    }

    public int getRemainingFees(){
        return feesTotal-feesPaid;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                "totalfees='" + getFeesTotal() + '\'' +
                '}';
    }
}
