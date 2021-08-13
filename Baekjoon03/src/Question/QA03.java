/*
  BAEKJOON - 3단계 
  (합)
  
  문제 3. 
  n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램을 작성하시오.
  
  입력 예시 1
  3
  
  출력 예시 1
  6
*/

package Question;

import java.util.Scanner;

public class QA03
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int sum = 0;
		
		for (int i = 0; i < n; i++)
		{
			sum += i+1;
		}
		
		System.out.println(sum);
		
		sc.close();
	}

}
