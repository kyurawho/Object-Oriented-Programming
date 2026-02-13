import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Integer x = 12;
		Integer y = Integer.valueOf("12");
		Integer z = new Integer(10);
		
		System.out.println(z * 10 + 2);
		
		String s = "Hello";
		String s2 = new String("Hello2");
		String s3 = String.valueOf("Hello3");
		
		Scanner sc = new Scanner(System.in);
		
		String name = new String();
		do {
			try {
				System.out.println("Name :");
				name = sc.nextLine();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println("Invalid format");
				e.printStackTrace();
			}
		} while (name.length() < 5 || name.length() > 20);
	}
}
