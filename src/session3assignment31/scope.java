/**
 * scope.java   
 * version  1.1
 * compiled on 31st July 2017
 */
package session3assignment31;

/**
 * 
 * This class will illustrate the scope of static/class variables and instance variables.
 * @author chhaya yadav
 *
 */
public class scope {
	
      
	public static String  college_name = "OIST BHOPAL" ;       //declaration of class variable 
	             
	public        int     rollno ;                             // instance variable declaration with public access specifier
	
	protected     String  student_name ;                      // instance variable declaration with protected access specifier
	
	protected     char    gender ;                            // instance variable declaration with protected access specifier
	
	private       String  blood_grp ;                         // instance variable declaration with private access specifier

	
	
// Default Constructor is declared below. 	
	
	    public scope() {
		
		rollno        =   0 ;
		
		student_name  =   "Nil";
		
		blood_grp     =   "Nil";
		
		
	    }
	
// Parameterized Constructor is declared below.
	
	    public scope(int rollno, String student_name, String blood_grp , char gend){
		
		      this.rollno       = rollno ;
		
		      this.student_name = student_name ;
		
		      this.blood_grp    = blood_grp ;
		
		      gender       = gend ;
		
			
	   }
	    
	    
// Method to display the details of the object 
	    
	   public void display(){ 
		
		System.out.println("----------------------------------");
		
		System.out.println("College Name  : "+  college_name);
		
		System.out.println("Roll no       : "+  rollno);
		
		System.out.println("Student_name  : " + student_name);
		
		System.out.println("Blood Group   : "+ blood_grp );
		
		System.out.println("Gender        : "+ gender  );
			
		System.out.println("----------------------------------");
	
	   }
     	
	   public static void main(String[] args) {
		
		scope s1 = new scope();     // calling the default constructor
		
		s1.display();
		
		scope s2 = new scope(199,"Akshay","A+",'M');      // calling the parameterized constructor
		
		s2.display();
		
		scope s3 = new scope(200,"CHHAYA","AB",'F');      // calling the parameterized constructor
	
		
		System.out.println("College Name  : "+     college_name);     // displaying the scope of static or class variable
		
		System.out.println("Roll no       : "+  s3.rollno);           // displaying the scope of instance variable
		
		System.out.println("Student_name  : " +  s3.student_name);
		
		System.out.println("Blood Group   : "+  s3.blood_grp );
		
		System.out.println("Gender        : "+  s3.gender );
		
	}
}
