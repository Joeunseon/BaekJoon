/*
  BAEKJOON - 5단계 
  (최댓값)
  
  문제 2. 
  9개의 서로 다른 자연수가 주어질 때, 이들 중 최댓값을 찾고 그 최댓값이 몇 번째 수인지를 구하는 
  프로그램을 작성하시오.

  예를 들어, 서로 다른 9개의 자연수

  3, 29, 38, 12, 57, 74, 40, 85, 61

  이 주어지면, 이들 중 최댓값은 85이고, 이 값은 8번째 수이다.

  예를 들어, 서로 다른 9개의 자연수

  3, 29, 38, 12, 57, 74, 40, 85, 61

  이 주어지면, 이들 중 최댓값은 85이고, 이 값은 8번째 수이다.
  
  입력 예시 1
  3
  29
  38
  12
  57
  74
  40
  85
  61
  
  출력 예시 1
  85
  8
*/

package Question;

import java.util.Arrays;
import java.util.Scanner;

public class QA02
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int[] list = new int[9];
		
		for (int i = 0; i < list.length; i++)
		{
			list[i] = sc.nextInt();
		}
		
		int[] copy = list.clone();
		
		Arrays.sort(copy);
		int n = 0;
		
		for (int i = 0; i < list.length; i++)
		{
			if( list[i] == copy[copy.length - 1])
			{	
				n = i;
				break;
			}
		}
		
		System.out.println(copy[copy.length-1]);
		System.out.println(n+1);
		
		sc.close();
	}

}
