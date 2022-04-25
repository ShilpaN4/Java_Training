package day2;

 class Batch12 {
	int empid; String name; static String skillset = "java"; int Salary; int exp;
	
	public Batch12(int empid, String name, int Salary, int exp)
	{
		super();
		this.empid = empid;
		this.name = name;
		this.Salary = Salary;
		this.exp = exp;
	}
	void display()
	{
		System.out.println("Name : "+name+"Empid : "+empid+"Skillset : "+skillset+"Salary : "+Salary+"Experience : "+exp);
	}
}
public class CohortDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Batch12 b1 = new Batch12(101, "Sana", 20000, 5);
		Batch12 b2 = new Batch12(102, "kia", 23000, 4);
		Batch12 b3 = new Batch12(103, "Priya", 30000, 3);
		Batch12 b4 = new Batch12(104, "Akash", 32000, 3);
		Batch12 b5 = new Batch12(105, "Hemanth", 40000, 6);
		Batch12 b6 = new Batch12(106, "Priya", 30000, 3);
		Batch12 b7 = new Batch12(107, "Ajay", 35000, 3);
		Batch12 b8 = new Batch12(108, "Kevin", 50000, 3);
		Batch12 b9 = new Batch12(109, "Avin", 34000, 7);
		Batch12 b10 = new Batch12(110, "Vayan", 50000, 8);
		b1.display();b2.display();b3.display();b4.display();b5.display();b6.display();b7.display();b8.display();b9.display();b10.display();

	}

}
