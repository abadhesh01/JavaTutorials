
public class StringType {
 public static void main(String[] args) 
 {
     char []charArray = {'S','a','m','p','l','e',' ','s','t','r','i','n','g'};
     
     String sampleString = new String(charArray);
     
     String sampleString2 = "Sample string";
     
     String sampleString3 = "Sample string";
    
     String sampleString4 = new String("Sample string");
      
     String sampleString5 = new String("Sample string");
     
     
     System.out.println("sampleString : \"" + sampleString + "\"");
     System.out.println("sampleString2 : \"" + sampleString2 + "\"" );
     System.out.println("sampleString3 : \"" + sampleString3 + "\"" );
     System.out.println("sampleString4 : \"" + sampleString4 + "\"" );
     System.out.println("sampleString5 : \"" + sampleString5 + "\"\n\n");
     
     // Refrence comparision.
     System.out.println("[sampleString == sampleString2] : " + (sampleString == sampleString2));
     System.out.println("[sampleString2 == sampleString3] : " + (sampleString2 == sampleString3));
     System.out.println("[sampleString3 == sampleString4] : " + (sampleString3 == sampleString4));
     System.out.println("[sampleString4 == sampleString5] : " + (sampleString4 == sampleString5) + "\n\n");
     
     // Value/Content comparision.
     System.out.println("[sampleString.equals(sampleString2)] : " + (sampleString.equals(sampleString2)));
     System.out.println("[sampleString2.equals(sampleString3)] : " + (sampleString2.equals(sampleString3)));
     System.out.println("[sampleString3.equals(sampleString4)] : " + (sampleString3.equals(sampleString4)));
     System.out.println("[sampleString4.equals(sampleString5)] : " + (sampleString4.equals(sampleString5)));
 }
}
