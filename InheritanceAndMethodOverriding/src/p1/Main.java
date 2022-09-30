package p1;

class Parent
{
   void display()
   {
      System.out.println("Display Parent");	   
   }
}

class Child extends Parent
{
	@Override
	void display()
	{
		System.out.println("Display Child");
	}
}

public class Main {
     
    public static void main(String[] args) {
    	Parent parent = new Parent();
    	Child  child = new Child();
    	
    	parent.display();
    	child.display();
    }
}
