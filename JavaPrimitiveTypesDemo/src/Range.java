
public class Range {
  public static void main(String[] args) {
		
	  byte byteMinValue = Byte.MIN_VALUE;
	  byte byteMaxValue = Byte.MAX_VALUE;
	  System.out.println("Byte Minimum Value :" + byteMinValue);
	  System.out.println("Byte Maximum Value :" + byteMaxValue);
	  
	  System.out.println("\n");
	  
	  short shortMinValue = Short.MIN_VALUE;
	  short shortMaxValue = Short.MAX_VALUE;
	  System.out.println("Short Minimum Value :" + shortMinValue);
	  System.out.println("Short Maximum Value :" + shortMaxValue);
	  
	  System.out.println("\n");
	  
	  int intMinValue = Integer.MIN_VALUE;
	  int intMaxValue = Integer.MAX_VALUE;
	  System.out.println("Integer Minimum Value :" + intMinValue);
	  System.out.println("Integer Maximum Value :" + intMaxValue);
	  
	  System.out.println("\n");
	  
	  long longMinValue = Long.MIN_VALUE;
	  long longMaxValue = Long.MAX_VALUE;
	  System.out.println("Long Minimum Value :" + longMinValue);
	  System.out.println("Long Maximum Value :" + longMaxValue);
	  
	  System.out.println("\n");
	  
	  float floatMinValue = Float.MIN_VALUE;
	  float floatMaxValue = Float.MAX_VALUE;
	  System.out.println("Float Minimum Value :" + floatMinValue);
	  System.out.println("Float Maximum Value :" + floatMaxValue);
	  
	  System.out.println("\n");
	  
	  double doubleMinValue = Double.MIN_VALUE;
	  double doubleMaxValue = Double.MAX_VALUE;
	  System.out.println("Double Minimum Value :" + doubleMinValue);
	  System.out.println("Double Maximum Value :" + doubleMaxValue);
	  
	  System.out.println("\n");
	  
	  int intOverflowValue = intMaxValue + 1; // Overflow condition
	  int intUnderflowValue = intMinValue - 1; // underflow condition
	  System.out.println("Integer Overflow Value = " + intOverflowValue);
	  System.out.println("Integer Underflow Value = " + intUnderflowValue);
	   
  }
}
