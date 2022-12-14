
public class PrimitiveTypesExample {
		 public static void main(String[] args) 
		 {
			/*
			 * Literals : Synthetic representation of data.
			 * 
			 * -----------------------------
			 * Primitive data types in java:
			 * -----------------------------
			 * Sl.No.     Data type                      Size                        Default value
			 * ------     ---------                      ----                        -------------
			 *   1        boolean [Boolean]              1 bit                       false
			 *   2        char    [Character]            16 bits (2 bytes)           '\u0000'
			 *   3        byte    [Numeric (Integer)]    8 bits                      0 
			 *   4        short   [Numeric (Integer)]    16 bits (2 bytes)           0
			 *   5        int     [Numeric (Integer)]    32 bits (4 bytes)           0
			 *   6        long    [Numeric (Integer)]    64 bits (8 bytes)           0L 
			 *   7        float   [Numeric (Decimal)]    32 bits (4 bytes)           0.0f
			 *   8        double  [Numeric (Decimal)]    64 bits (8 bytes)           0.0d
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
			 
			 float sampleFloatValue = 100;
			 double sampleDoubleValue = 100;
			 System.out.println("[float sampleFloatValue = 100] : " + sampleFloatValue);
			 System.out.println("[double sampleDoubleValue] = 100] : " + sampleDoubleValue);
			 
			 System.out.println("\n");
			 
			 boolean sampleBooleanTrueValue = true;
			 boolean sampleBooleanFalseValue = false;
			 System.out.println("[boolean sampleBooleanTrueValue = true] : " + sampleBooleanTrueValue);
			 System.out.println("[boolean sampleBooleanFalseValue = false] : " + sampleBooleanFalseValue);
			 
			 System.out.println("\n");
			 
			 char sampleUnicodeValue = '\u0041';
			 char sampleCharacterValue = 'A';
			 char sampleASCIIValue = 65;
             System.out.println("[char sampleUnicodeValue = '\\u0041'] : " + sampleUnicodeValue);
			 System.out.println("[char sampleUnCharacterValue = 'A'] : " + sampleCharacterValue);
			 System.out.println("[char sampleASCIIValue = 65] : " + sampleASCIIValue);
		 }
		
}
