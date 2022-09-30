package p5;

// The child class parameterized constructor calls the parent class default constructor implicitly by default.

// this -> Current Class.
// super -> Parent Class.

class Parent
{
	String textString = "Parent";
	
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
	String textString = "Child";
	
	 public Child()
	 {
	   System.out.println("Child Class Default Constructor");
	 }
	 
	 public Child(int n)
	 {
	   System.out.println("Child Class Parameterized Constructor");
	 }
	
	@Override
	void display()
	{
		System.out.println("Display Child");
		super.display();
		System.out.println("[textString] : " + textString);
		System.out.println("[this.textString] : " + this.textString);
		System.out.println("[super.textString] : " + super.textString);
		System.out.println("[this] : " + this); // Refers to Child(current) class whose object is present.
		//System.out.println("[super] : " + super); // Error: Refers to Parent class whose object is not present.
	}
}

public class Main extends Child {
	
	public static void main(String[] args) 
	{
        Child child = new Child(5);
        child.display();
	}
}
