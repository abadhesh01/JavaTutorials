
public class DataRepresentation {
  public static void main(String[] args) {
	  
	  /*
	   * The data type of any whole number value is always 'int' by default.
	   * The data type of any decimal number value is always 'double' by default.
	   */
	 
	  byte sampleByteValue = 100;
	  short sampleShortValue = 100;
	  int sampleIntegerValue = 100;
	  long sampleLongValue = 100;
		 
	  System.out.println("[byte sampleByteValue = 100] : " + sampleByteValue);
	  System.out.println("[short sampleShortValue = 100] : " + sampleShortValue);
	  System.out.println("[int sampleIntegerValue = 100] : " + sampleIntegerValue);
	  System.out.println("[long sampleLongValue = 100] : " + sampleLongValue);
		 
	  System.out.println("\n");
	  
	  long sampleLongValue2 = 745L;
	  System.out.println("[long sampleLongValue2 = 100L] : " + sampleLongValue2);
	  
	  System.out.println("\n");
	  
	  double sampleDoubleValue = 123.75;
	  double sampleDoubleValue2 = 123.75d;
	  float sampleFloatValue = 123.75f;
	  System.out.println("[float sampleFloatValue = 123.75] : " + sampleFloatValue);
	  System.out.println("[double sampleDoubleValue = 123.75] : " + sampleDoubleValue);
	  System.out.println("[double sampleDoubleValue2 = 123.75d] : " + sampleDoubleValue2);
  }
}
