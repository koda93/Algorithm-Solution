//Baekjoon Online Judge : https://www.acmicpc.net
//Question 2741 : N 찍기 
//자연수 N이 주어졌을 때, 1부터 N까지 한 줄에 하나씩 출력하는 프로그램을 작성하시오.

package level.level3;
import java.util.Scanner;

public class level3_1_2741 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n;

		n = sc.nextInt();
		if (n > 0 && n <= 100000) {
			for (int i = 1; i <= n; i++) {
				System.out.println(i);
			}
		}
	}
}
