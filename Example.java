package day5;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class Student {

    private String name;
    private String address;
    private String mbl;

    Student(String _name, String _address, String _mbl) {
        this.name = _name;
        this.address = _address;
        this.mbl = _mbl;
    }

    String getName() {
        return name;
    }

    String getadd() {
        return address;
    }
    
    String getmbl() {
        return mbl;
    }


    static void printStudents(List < Student > studentList) {
        studentList.forEach(e-> System.out.println("Student name : " + e.getName() + " address : " + e.getadd() + " Mobile :" + e.getmbl()));
    }
}
public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student[] studentArray = {
	            new Student("Jacob", "1235","3333"),
	            new Student("Amanda", "7023", "1234"),
	            new Student("Jayesh", "1235", "4567"),
	            new Student("Alexis", "9056", "2345")
	        };
	        List < Student > studentList = Arrays.asList(studentArray);

	        Predicate < Student > studentFilterPredicate = new Predicate < Student > () {
	            @Override
	            public boolean test(Student student) {
	                return student.getName().equals("Jayesh") && student.getadd().equals("1235");
	            }
	        };

	        List < Student > studentAList = studentList.stream()
	            .filter(studentFilterPredicate)
	            .collect(Collectors.toList());

	        Student.printStudents(studentAList);
	    }
	}
