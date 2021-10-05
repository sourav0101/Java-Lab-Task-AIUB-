import java.lang.*; 
public class Student 
{
	private String Name; 
	private int Id; 
	private double Cgpa;
	
    public void setName(String 	sName)
	{
		Name = sName; 
	}
	public void setId(int sId) 
	{
		Id = sId; 
	}
	public void setCgpa(double sCgpa) 
	{
		Cgpa = sCgpa; 
	}
	
	
	public String getName()
	{
		return Name; 
	}
	public int getId()
	{
		return Id; 
	}
	public double getCgpa()
	{
		return Cgpa; 
	}
	


public static void main(String args[])
{
	Student t = new Student(); 
	t.setName("Jack"); 
	t.setId(17); 
	t.setCgpa(3.0); 
	
	System.out.println("Name:"+t.getName());
	System.out.println("Id:"+t.getId()); 
	System.out.println("Cgpa:"+t.getCgpa()); 
}

}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	