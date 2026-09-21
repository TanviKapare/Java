package basicJavaPrograms;

public class StudentConstructor {

	int roll_no;//instance variable or global variable
	String name;
	double phone_number;
	String address;
	static String school="Tekarch";//Static class variable
	
	StudentConstructor(int roll_no, String name, double phone_number, String address)//local variable
	{
		this.roll_no = roll_no;
		this.name = name;
		this.phone_number = phone_number;
		this.address = address;
	}
	
	void display()
	{
		System.out.println(roll_no+"  Name-"+name+"  School-"+school+ "  Phone number-" +phone_number+ "  Address-"+address);
	}
	
	public static void main(String[] args) {
	
		StudentConstructor sc1 = new StudentConstructor(1, "Tanvi",6574839, "abc lane, xyz city");
		StudentConstructor sc2 = new StudentConstructor(2, "John",657399,"xyz lane, abc city");
		StudentConstructor sc3 = new StudentConstructor(3, "Vihaan", 2131415, "pqr lane, mno city");
		StudentConstructor sc4 = new StudentConstructor(4, "Sam", 7812347, "klm lane, efg city");
		sc1.display();
		sc2.display();
		sc3.display();
		sc4.display();
   }
}
