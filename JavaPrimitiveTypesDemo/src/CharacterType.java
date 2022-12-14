
public class CharacterType {
  public static void main(String[] args) {
	     char sampleUnicodeValue = '\u30D8';
		 char sampleCharacterValue = 'A';
		 char sampleASCIIValue = 65;
         System.out.println("[char sampleUnicodeValue = '\\u0041'] : " + sampleUnicodeValue);
		 System.out.println("[char sampleUnCharacterValue = 'A'] : " + sampleCharacterValue);
		 System.out.println("[char sampleASCIIValue = 65] : " + sampleASCIIValue);
		 
		 // A B C D E F
		 // 0 1 2 3 4 5
		 char charValue = 'A' + 5; 
		 System.out.println(charValue);
		 charValue = 65 + 1;
		 System.out.println(charValue);
		 
		 // 'int' value assigned to 'char' variable will be converted implicitly.
		 for(char cnt = 65; cnt <= 90; cnt ++)
		 {
			 System.out.print(cnt + " ");
		 }
		 
		 System.out.println();
		 
		 for(int cnt = 97; cnt <= 122; cnt ++)
		 {
			// 'int' variable assigned to 'char' variable will be converted explicitly.
			 char ch = (char) cnt;
			 System.out.print(ch + " ");
		 }
	 }
 }

