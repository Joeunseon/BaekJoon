/*
  BAEKJOON - 7단계 
  (숫자의 합)
  
  문제 2. 
  N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램을 작성하시오.

  입력 예시 1
  1
  1
  
  출력 예시 1
  1
  
  입력 예시 2
  5
  54321
  
  출력 예시 2
  15
  
  입력 예시 3
  25
  7000000000000000000000000
  
  출력 예시 3
  7
  
  입력 예시 4
  11
  10987654321
  
  출력 예시 4
  46
*/

package Question;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class QA02
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		String str = br.readLine();
		
		int sum = 0;
		
		for (int i = 0; i < n; i++)
			sum += (int)str.charAt(i) - 48;
		
		System.out.println(sum);
		
	}
}
