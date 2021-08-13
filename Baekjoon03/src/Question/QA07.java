/*
  BAEKJOON - 3단계 
  (A+B - 7)
  
  문제 7. 
  두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
  
  첫째 줄에 테스트 케이스의 개수 T가 주어진다.
  각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
  
  입력 예시 1
  5
  1 1
  2 3
  3 4
  9 8
  5 2
  
  출력 예시 1
  Case #1: 2
  Case #2: 5
  Case #3: 7
  Case #4: 17
  Case #5: 7
*/

package Question;

import java.util.Scanner;

public class QA07
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++)
		{
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			System.out.println("Case #" + (i+1) + ": " + (a+b));
		}
		
		sc.close();
	}

}
