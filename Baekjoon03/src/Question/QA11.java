/*
  BAEKJOON - 3단계 
  (X보다 작은 수)
  
  문제 11. 
  정수 N개로 이루어진 수열 A와 정수 X가 주어진다. 
  이때, A에서 X보다 작은 수를 모두 출력하는 프로그램을 작성하시오.
  
  X보다 작은 수를 입력받은 순서대로 공백으로 구분해 출력한다. X보다 작은 수는 적어도 하나 존재한다.
  
  입력 예시 1
  10 5
  1 10 4 9 2 3 8 5 7 6
  
  출력 예시 1
  1 4 2 3
*/

package Question;

import java.util.Scanner;

public class QA11
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int su = sc.nextInt();
		
		int x = sc.nextInt();
		
		int[] n = new int[su];
		
		String str = "";
		
		for (int i = 0; i < n.length; i++)
		{
			n[i] = sc.nextInt();
			
			if ( n[i] < x )
				str += n[i] + " ";
		}
		
		System.out.println(str);
		
		sc.close();
	}

}
