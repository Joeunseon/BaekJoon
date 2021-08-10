/*
  BAEKJOON - 1단계 
  (나머지)

  문제 9. 
  (A+B)%C는 ((A%C) + (B%C))%C 와 같을까?
  (A×B)%C는 ((A%C) × (B%C))%C 와 같을까?
  세 수 A, B, C가 주어졌을 때, 위의 네 가지 값을 구하는 프로그램을 작성하시오.
  첫째 줄에 A, B, C가 순서대로 주어진다. (2 ≤ A, B, C ≤ 10000)
  
  입력 예시
  5 8 4
  
  출력 예시
  1
  1
  0
  0
*/

package Question;

import java.util.Scanner;

public class QA10
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int A, B, C;
		
		do
		{
			A = sc.nextInt();
			B = sc.nextInt();
			C = sc.nextInt();
		} while (2>A || A>10000 || 2>B || B>10000 || 2>C || C>10000);
		
		System.out.println((A+B)%C);
		System.out.println(((A%C)+(B%C))%C);
		System.out.println((A*B)%C);
		System.out.println(((A%C)*(B%C))%C);
		
		sc.close();
	}
}
