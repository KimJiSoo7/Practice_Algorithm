import java.util.Scanner;

public class p2839 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int plasticbag_5 = 0, plasticbag_3 = 0;
		int result;
		int N, i;
		int status = 1;

		N = input.nextInt();
		if (N < 3 || N > 5000) {
			System.out.println("Iuput size error!!!");
		} else {
			if (N % 5 == 0) {
				plasticbag_5 = N / 5;
				plasticbag_3 = 0;
				status = 1;
			}
			// 5로 나누어 떨어지지 않을 때
			else {
				// N을 5의배수로 최대한 뺀다
				for (i = 0; N > 0; i++) {
					if (((N % 3) == 0) || ((N % 6) == 0) || ((N % 9) == 0) || ((N % 12) == 0)) {
						if (N <= 12) {
							status = 1;
							break;
						}
					}
					if (N - 5 > 0)
						N = N - 5;
					else
						break;
				}
				if ((N % 12) == 0) {
					plasticbag_3 = 4;
					plasticbag_5 = i;
				} else if ((N % 9) == 0) {
					plasticbag_3 = 3;
					plasticbag_5 = i;
				} else if ((N % 6) == 0) {
					plasticbag_3 = 2;
					plasticbag_5 = i;
				} else if ((N % 3) == 0) {
					plasticbag_3 = 1;
					plasticbag_5 = i;
				} else {
					status = 0;
					System.out.println("-1");
				}
			}
			if (status != 0) {
				result = plasticbag_3 + plasticbag_5;
				System.out.println(result);
			}
		}
		input.close();
	}
}
