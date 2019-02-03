import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args)throws IOException
    {
        ArrayList<Employee>employees = new ArrayList<>();
        Employee employee = new Employee("James", 12387, 2000);
        Employee employee1 = new Employee("Don", 54646, 43000);
        employees.add(employee);
        employees.add(employee1);

        FileWriter fileWriter = new FileWriter("info.txt");
        for (Employee e : employees)
        {
            fileWriter.write(e.toString());
            fileWriter.write("\n");
        }
        fileWriter.close();

        FileReader fileReader = new FileReader("info.txt");
        int i;
        while ((i=fileReader.read())!=-1)
        {
            System.out.print((char) i);
        }
    }
}
