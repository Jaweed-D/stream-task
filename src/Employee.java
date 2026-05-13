public class Employee {
    private String firstName;
    private String department;
    private int id;
    private int salary;
    private int age;

    public Employee(int id, String firstName,String department,int salary, int age) {
        this.age = age;
        this.firstName = firstName;
        this.department = department;
        this.id = id;
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", department='" + department + '\'' +
                ", id=" + id +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }

}
