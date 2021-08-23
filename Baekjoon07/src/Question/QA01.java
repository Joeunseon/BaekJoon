/*
  BAEKJOON - 7단계 
  (아스키 코드)
  
  문제 1. 
  알파벳 소문자, 대문자, 숫자 0-9중 하나가 주어졌을 때, 
  주어진 글자의 아스키 코드값을 출력하는 프로그램을 작성하시오.

  입력 예시 1
  A
  
  출력 예시 1
  65
  
  입력 예시 2
  C
  
  출력 예시 2
  67
  
  입력 예시 3
  0
  
  출력 예시 3
  48
  
  입력 예시 4
  a
  
  출력 예시 4
  97
  
  입력 예시 5
  z
  
  출력 예시 5
  122
*/

package Question;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class QA01
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		
		char ch = str.charAt(0);
		
		int a = ch;
		
		System.out.println(a);
		
	}
}
