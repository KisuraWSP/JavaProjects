//Takes a 10 character string input and reverses it
//the string input is stored in a 
import java.util.Scanner; 

public class ReverseString {

	public static void main(String[] args) {
    //try catch block to display the error
		try {
			String [] normal = new String[10];
			String [] reversed = new String[10];
			Scanner s = new Scanner(System.in);
			int arrLen = normal.length;
			
			System.out.print("Enter a String value:");
			String input = s.nextLine();
			System.out.println("Input:"+input);
			for(int i=0;i<arrLen;i++) {
				normal[i]=String.valueOf(input.charAt(i));
			}
			System.out.print("Normal text:");
			for(int j=0;j<arrLen;j++) {
				System.out.print(normal[j]);
			}
			System.out.println();
			System.out.print("Reversed text:");
			for(int l=arrLen-1;l>=0;l--) {
				switch(l) {
				case 9:
					reversed[0]=normal[9];
					break;
				case 8:
					reversed[1]=normal[8];
					break;
				case 7:
					reversed[2]=normal[7];
					break;
				case 6:
					reversed[3]=normal[6];
					break;
				case 5:
					reversed[4]=normal[5];
					break;
				case 4:
					reversed[5]=normal[4];
					break;
				case 3:
					reversed[6]=normal[3];
					break;
				case 2:
					reversed[7]=normal[2];
					break;
				case 1:
					reversed[8]=normal[1];
					break;
				case 0:
					reversed[9]=normal[0];
					break;
					
				}
			}
			for(int x=0;x<arrLen;x++) {
				System.out.print(reversed[x]);
			}
		}catch(Exception e){
			System.out.println(e.getMessage()+"\nString must be 10 characters long");
		}
	}

}
