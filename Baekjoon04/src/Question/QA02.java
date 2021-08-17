/*
  BAEKJOON - 4단계 
  (A+B - 4)
  
  문제 2. 
  두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
  
  입력 예시 1
  1 1
  2 3
  3 4
  9 8
  5 2
  
  출력 예시 1
  2
  5
  7
  17
  7
*/

package Question;

import java.util.Scanner;

public class QA02
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNextInt())
		{
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			System.out.println(a+b);
		}
		
		sc.close();
	}
}
