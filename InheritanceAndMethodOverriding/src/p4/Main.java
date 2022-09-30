package p4;

// [1] It is mandatory to call parent class constructor within child class constructor.
// [2] Constructor calling occurs from parent to child order.

// [3] The child class default constructor can call the parent class default constructor either implicitly or explicitly.
// [4] The child class default constructor can call the parent class parameterized constructor only explicitly.

class Parent
{
   public Parent(int n)
   {
	   System.out.println("Parent Class Parameterized Constructor");
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
	   super(7); //Parent(int n)
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
