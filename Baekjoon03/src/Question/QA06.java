/*
  BAEKJOON - 3단계 
  (기찍 N)
  
  문제 6. 
  자연수 N이 주어졌을 때, N부터 1까지 한 줄에 하나씩 출력하는 프로그램을 작성하시오.
  
  입력 예시 1
  5
  
  출력 예시 1
  5
  4
  3
  2
  1
*/

package Question;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class QA06
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		for (int i = n; i > 0; i--)
		{
			System.out.println(i);
		}
	}
}
