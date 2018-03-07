import java.util.Scanner;

public class p1008 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double A, B;
		double diff, result;
		A = input.nextInt();
		B = input.nextInt();
		if (B == 0) {
			System.out.println("Can not divide by zero");
			return;
		} else if (A <= 0 || A >= 10 || B <= 0 || B >= 10) {
			System.out.println("Input Error!!");
		} else {
			result = A / B;
			diff = A / B - result;
			if (Math.abs(diff) > 0.000000001) {
				System.out.println("오차 허용범위 초과");
			} else {
				System.out.println(result);
			}
		}
	}
}
