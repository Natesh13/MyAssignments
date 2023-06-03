package week3.day2Assignment;

//Method Overloading Assignment-04

public class Students {

	public void GetstudentInfo(int id)
	{
		System.out.println("Student id :"+ id);
	}
	
	public void GetstudentInfo(int id, String name)
	{
		System.out.println("Student id :"+id);
		System.out.println("Student name:"+name);
	}
	
	public void GetstudentInfo(String email, int phonenumber)
	{
		System.out.println("Student email :"+email);
		System.out.println("Student phonenumber :"+phonenumber);
	}
	
	public static void main(String[] args) {
		
		Students s=new Students();
		s.GetstudentInfo(200);
		s.GetstudentInfo(200,"Natesh");
		s.GetstudentInfo("natesh@gmail.com", 959700035);
		
		}
	}
