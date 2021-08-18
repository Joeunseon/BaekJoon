/*
  BAEKJOON - 5단계 
  (나머지)
  
  문제 4. 
  두 자연수 A와 B가 있을 때, A%B는 A를 B로 나눈 나머지 이다. 
  예를 들어, 7, 14, 27, 38을 3으로 나눈 나머지는 1, 2, 0, 2이다. 

  수 10개를 입력받은 뒤, 이를 42로 나눈 나머지를 구한다. 
  그 다음 서로 다른 값이 몇 개 있는지 출력하는 프로그램을 작성하시오.
  
  입력 예시 1
  1
  2
  3
  4
  5
  6
  7
  8
  9
  10
  
  출력 예시 1
  10
  
  입력 예시 2
  42
  84
  252
  420
  840
  126
  42
  84
  420
  126
  
  출력 예시 2
  1
  
  입력 예시 3
  39
  40
  41
  42
  43
  44
  82
  83
  84
  85
  
  출력 예시 3
  6
*/

package Question;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class QA04
{

	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] list = new int[10];
		
		int n = 0;
		
		for (int i = 0; i < list.length; i++)
		{
			boolean flag = true;
			
			int a = Integer.parseInt(br.readLine());
			
			list[i] = a%42;
			
			for (int j = 0; j <= i; j++)
			{
				if (list[i] == list[j] && i != j)
				{
					flag = false;
					break;
				}
			}
			
			if (flag)
				n++;
		}
		
		System.out.println(n);
		
	}

}
