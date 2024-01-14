package static1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Online Student: "+Student.howStudent());
		Student s1= new Student("Ali", 220, 60);
		Student s2= new Student("Aysche", 221, 67);
		Student s3= new Student("Hans", 222, 65);
		System.out.println("Online Student: "+Student.howStudent());
		s1.exit();
		System.out.println("Online Student: "+Student.howStudent());
		int[] notlar= new int [3];
		notlar[0]=s1.point;
		notlar[1]=s2.point;
		notlar[2]=s3.point;
		
		
		System.out.println(Student.callOverall(notlar));
	}
	
	}

