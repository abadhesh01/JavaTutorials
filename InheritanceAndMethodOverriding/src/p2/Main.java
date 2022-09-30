package p2;

class Parent
{
   public Parent()
   {
	   System.out.println("Parent Class Default Constructor");
   }
	
   void display()
   {
      System.out.println("Display Parent");	   
   }
   
}

class Child extends Parent
{
	 public Child()
	 {
	   System.out.println("Child Class Default Constructor");
	 }
	
	@Override
	void display()
	{
		System.out.println("Display Child");
	}
}

public class Main {

	public static void main(String[] args) 
	{
		Parent parent = new Parent();
		parent.display();
		
		System.out.println("\n---------------------------------\n");
		
        Child child = new Child();
        child.display();
	}
}
