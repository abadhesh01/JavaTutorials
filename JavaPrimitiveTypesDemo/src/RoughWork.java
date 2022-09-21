
public class RoughWork {
  public static void main(String[] args) 
  {
	int sampleIntValue = 100;
	long sampleLongValue = 120;
	long sampleLongValue2 = 650L;
	
	byte sampleByteValue = 97;
	byte sampleByetValue2 = sampleByteValue;
	byte samapleByteValue3 = (byte)(sampleByteValue / 2); // Expression conatining whole number only will return 'int'. 
	
	int sampleIntValue2 = (byte) 88; // Size of 'byte' is smaller than size of 'int'.
	int sampleIntValue3 = (short) 88; // Size of 'short' is smaller than size of 'int'.
	//int smapleIntValue4 = (long) 88; // Error: size of 'long' is larger than size of 'int'.
	
	
	System.out.println("Execution successful.");
  }
}
