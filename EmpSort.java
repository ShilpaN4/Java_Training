package day7;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;


class Employee implements Comparable<Employee> {
    String name;
    Integer salary;
    Date JoiningDate;
 
    public Employee() {
    }
 
    public Employee(String n, Integer f, Date d) {
           name = n;
           salary = f;
           JoiningDate = d;
    }
 
    public String toString() {
           return "\n name=" + name + ",salary=" + salary + ",JoiningDate="
                        + JoiningDate;
    }
 
    public int compareTo(Employee o) {
           return this.JoiningDate.compareTo(o.JoiningDate);
    }
}


public class EmpSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Employee emp1 = new Employee("vilok", 2000, new Date(2016 - 1900, 11, 14));
         Employee emp2 = new Employee("Arya", 5000, new Date(2016 - 1900, 11, 23));
         Employee emp3 = new Employee("Sanvi", 1000, new Date(2016 - 1900, 11, 22));
         Employee emp4 = new Employee("sam", 9000, new Date(2016 - 1900, 11, 29));
         Employee emp5 = new Employee("ank", 1000, new Date(2016 - 1900, 11, 19));

         List<Employee> l = new ArrayList<Employee>();
         l.add(emp1);
         l.add(emp2);
         l.add(emp3);
         l.add(emp4);
         l.add(emp5);

         Collections.sort(l); // SORT

         System.out.println(l); // Display list

  }

}
