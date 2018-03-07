import java.util.Scanner;

public class PrintOutAsItIs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String str;
		int length;
		int status = 1;

		while (input.hasNextLine()) {
			str = input.nextLine();
			length = str.length();
			
			if (length > 100) {
				System.out.println("Input is too big!!!");
				break;
			} else {
				for (int i = 0; i < length; i++) {
					if (str.charAt(i) == ' ') {
						if (i == 0 || i == (length - 1)) {
							System.out.println("Space is exist on first and last poistion at your sentence!!!");
							status=0;
							break;
						}
					} else if (!((str.charAt(i) >= 48 && str.charAt(i) <= 57)
							|| (str.charAt(i) >= 65 && str.charAt(i) <= 90)
							|| (str.charAt(i) >= 97 && str.charAt(i) <= 122))) {
						System.out.println("Wrong words");
						status=0;
						break;
					} else {status=1;}
				}
				if(status==1){
					System.out.println(str);
				}
			}
		}
	}
}
