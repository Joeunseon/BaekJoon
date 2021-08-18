/*
  BAEKJOON - 5단계 
  (최소, 최대)
  
  문제 1. 
  N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.
  
  입력 예시 1
  5
  20 10 35 30 7
  
  출력 예시 1
  7 35
*/

package Question;

import java.util.Arrays;
import java.util.Scanner;

public class QA01
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		for (int i = 0; i < n; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		
		System.out.println(arr[0] + " " + arr[n-1]);
		
		sc.close();
	}

}
