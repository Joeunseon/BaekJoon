/*
  BAEKJOON - 5단계 
  (OX퀴즈)
  
  문제 6. 
  "OOXXOXXOOO"와 같은 OX퀴즈의 결과가 있다. O는 문제를 맞은 것이고, X는 문제를 틀린 것이다. 
  문제를 맞은 경우 그 문제의 점수는 그 문제까지 연속된 O의 개수가 된다. 
  예를 들어, 10번 문제의 점수는 3이 된다.

  "OOXXOXXOOO"의 점수는 1+2+0+0+1+0+0+1+2+3 = 10점이다.

  OX퀴즈의 결과가 주어졌을 때, 점수를 구하는 프로그램을 작성하시오.
  
  입력 예시 1
  5
  OOXXOXXOOO
  OOXXOOXXOO
  OXOXOXOXOXOXOX
  OOOOOOOOOO
  OOOOXOOOOXOOOOX
  
  출력 예시 1
  10
  9
  7
  55
  30
*/

package Question;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class QA06
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		String[] ox = new String[n];
		
		for (int i = 0; i < n; i++)
			ox[i] = br.readLine();
		
		int count, tot;
		
		for (int i = 0; i < ox.length; i++)
		{
			tot = count = 0;
			
			for (int j = 0; j < ox[i].length(); j++)
			{
				if(ox[i].substring(j, j+1).equals("O"))
					count++;
				else
					count = 0;
				
				tot += count;
			}
			
			System.out.println(tot);
		}
	}

}
