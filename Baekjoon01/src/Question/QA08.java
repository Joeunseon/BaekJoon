/*
  BAEKJOON - 1단계 
  (A/B)

  문제 8. 
  두 정수 A와 B를 입력받은 다음, A/B를 출력하는 프로그램을 작성하시오.
  첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)

  입력 예시1
  1 3
  
  출력 예시1
  0.33333333333333333333333333333333
  // 10-9 이하의 오차를 허용한다는 말은 꼭 소수 9번째 자리까지만 출력하라는 뜻이 아니다.
  
  입력 예시2
  4 5
  
  출력 예시2
  0.8
*/

package Question;

import java.util.Scanner;

public class QA08
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int A, B;
		
		do
		{
			A = sc.nextInt();
		} while (0>A);
		
		do
		{
			B = sc.nextInt();
		} while (B>10);
		
		System.out.println(1.0*A/B);
		
		sc.close();
	}
}
