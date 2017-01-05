import java.util.Scanner;

public class StringContain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1,str2;
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter string 1: ");
		str1 = obj.next();
		System.out.println("Enter string 2: ");
		str2 = obj.next();
		if(str1.indexOf(str2) != -1)    //if index is -1 then it doesn't contain
		{
			System.out.println(str2+" found in "+str1);
		}
		else
			System.out.println(str2+" not found in "+str1);
	}

}
