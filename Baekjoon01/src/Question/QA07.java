/*
  BAEKJOON - 1단계 
  (AxB)

  문제 7. 
  두 정수 A와 B를 입력받은 다음, A×B를 출력하는 프로그램을 작성하시오.
  첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)

  입력 예시1
  1 2
  
  출력 예시1
  2
  
  입력 예시2
  3 4
  
  출력 예시2
  12
*/

package Question;

import java.util.Scanner;

public class QA07
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int A=0;
		int B=0;
		
		try
		{
			do
			{
				A = sc.nextInt();
			} while (0>A);
			
			do
			{
				B = sc.nextInt();
			} while (B>10);
		} catch (Exception e)
		{
			System.out.println(e.toString());
		}
		
		System.out.println(A*B);
		
		sc.close();
	}
}
