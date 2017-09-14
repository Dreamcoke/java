package qhw;

public class Student {

	
  private static String sno;
  private static String name;
  
 

  public Student(String sno,String name) {
	  this.sno=sno;
	  this.name=name;
	
}
 public static String  getsno() {
	 
	 return sno;
	
}

public static String getname() {
	return name;
}
} 