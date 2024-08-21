package java_lab4_oops_1;

public class Student_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student_info_oops st1=new Student_info_oops();
		st1.name="Rakshit";
		st1.age=19;
		st1.talk();
		
		Student_info_oops st2=new Student_info_oops();
		st2.name="Rakshit";
		st2.age=19;
		st2.talk();
		
		System.out.println("Object ref: "+st1);
		System.out.println("Object ref: "+st2);

	}

}
