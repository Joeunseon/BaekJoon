/*
  BAEKJOON - 4단계 
  (A+B - 5)
  
  문제 1. 
  두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
  
  입력 예시 1
  1 1
  2 3
  3 4
  9 8
  5 2
  0 0
  
  출력 예시 1
  2
  5
  7
  17
  7
*/

package Question;

import java.util.Scanner;

public class QA01
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		boolean flag = true;
		
		while (flag)
		{
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			if (a == 0 && b == 0)
				flag = false;
			else
				System.out.println(a+b);
		}
		
		sc.close();
	}
}
