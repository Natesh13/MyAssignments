package week3.day3.Assignments;

public class Automation extends MulitpleLanguage {
	
	

@Override
public void Selenium(){
	
	System.out.println("Selenium from interface class");
	
	}

@Override
public void java() {
	
	System.out.println("Java from interface class");
	
}

@Override
public void ruby() {
	
	System.out.println("Ruby from Abstract class");
	
}

public static void main(String[] args) {
	
	Automation a=new Automation();
	a.Selenium();
	a.java();
	a.ruby();
	a.python();
	
	
	
}


}

