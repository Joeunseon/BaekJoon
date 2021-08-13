/*
  BAEKJOON - 3단계 
  (별찍기 - 1)
  
  문제 9. 
  첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
  
  입력 예시 1
  5
  
  출력 예시 1
  *
  **
  ***
  ****
  *****
*/

package Question;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class QA09
{

	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		String s = "";
		
		for (int i = 0; i < n; i++)
		{
			s += "*";
			
			System.out.println(s);
		}
	}

}
