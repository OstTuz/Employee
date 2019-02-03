public class Employee {
    private String name;
    private int id;
    private double salary;

    public Employee(){}

    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", salary=" + salary +
                '}';
    }

    public void Display()
    {
        System.out.println(this.name +" "+this.id+" "+this.salary+"$");
    }


}
