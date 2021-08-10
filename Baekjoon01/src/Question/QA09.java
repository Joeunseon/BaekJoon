/*
  BAEKJOON - 1단계 
  (사칙연산)

  문제 9. 
  두 자연수 A와 B가 주어진다. 이때, A+B, A-B, A*B, A/B(몫), A%B(나머지)를 출력하는 프로그램을 작성하시오. 
  두 자연수 A와 B가 주어진다. (1 ≤ A, B ≤ 10,000)
  
  입력 예시
  7 3
  
  출력 예시
  10
  4
  21
  2
  1
*/

package Question;

import java.util.Scanner;

public class QA09
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int A, B;
		
		do
		{
			A = sc.nextInt();
		} while (1 > A);
		
		do
		{
			B = sc.nextInt();
		} while (B > 10000);
		
		System.out.println(A+B);
		System.out.println(A-B);
		System.out.println(A*B);
		System.out.println(A/B);
		System.out.println(A%B);
		
		sc.close();
	}
}
