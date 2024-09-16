package schoolmanagementsystem;

/**
 * this class is responsible for keeping track of teacher's name,id,salary
 */
public class Teachers {
    private int id;
    private String name;
    private int salary;
    private int salaryEarned;

    /**
     * create a new teacher obj
     * @param id id for the teacher
     * @param name name of the teacher
     * @param salary salary of the teacher
     */

    public Teachers(int id,String name,int salary){
        this.id = id;
        this.name=name;
        this.salary=salary;
        this.salaryEarned=0;
    }

    /**
     *
     * @return the id
     */

    public int getId() {
        return id;
    }

    /**
     *
     * @return name of the teacher
     */

    public String getName(){
        return name;
    }

    /**
     *
     * @return salary of the teacher
     */

    public int getSalary() {
        return salary;
    }

    /**
     * set the salary
     * @param salary
     */
    public void setSalary(int salary) {
        this.salary = salary;
    }

    /**
     * adds to salary
     * removes from the total money earned by the school.
     * @param salary
     */
    public void receiveSalary(int salary){
        salaryEarned+=salary;
        School.updateMoneySpent(salary);
    }


}
