/*
BAEKJOON - 3단계 
(N 찍기)

문제 5. 
자연수 N이 주어졌을 때, 1부터 N까지 한 줄에 하나씩 출력하는 프로그램을 작성하시오.

입력 예시 1
5

출력 예시 1
1
2
3
4
5
*/

package Question;

import java.util.Scanner;

public class QA05
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++)
		{
			System.out.println(i+1);
		}
		
		sc.close();
	}
}

