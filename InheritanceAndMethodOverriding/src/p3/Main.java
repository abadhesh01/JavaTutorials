package p3;

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
	   super(); // Parent()
	   System.out.println("Child Class Default Constructor");
	 }
	
	@Override
	void display()
	{
		System.out.println("Display Child");
	}
}

public class Main extends Child {
	
	public static void main(String[] args) 
	{
        Child child = new Child();
        child.display();
	}
}
