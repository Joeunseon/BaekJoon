/*
  BAEKJOON - 7단계 
  (단어 공부)
  
  문제 5. 
  알파벳 대소문자로 된 단어가 주어지면, 
  이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오. 
  단, 대문자와 소문자를 구분하지 않는다.

  입력 예시 1
  Mississipi
  
  출력 예시 1
  ?

  입력 예시 2
  zZa
  
  출력 예시 2
  Z
  
  입력 예시 3
  z
  
  출력 예시 3
  Z
  
  입력 예시 4
  baaa
  
  출력 예시 4
  A
*/

package Question;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class QA05
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		
		int[] a = new int[26];
		
		for (int i = 0; i < a.length; i++)
			a[i] = 0;
		
		for (int i = 0; i < str.length(); i++)
		{
			int c = (int)str.charAt(i);
			
			if (c >= 97)
				c += -97;
			else 
				c += -65;
			
			a[c]++;
		}
		
		int x = 0;
		int y = 0;
		int z = 0;
		
		for (int i = 0; i < a.length; i++)
		{
			if (a[i] != 0)
			{
				if(a[i] > x)
				{
					x = a[i];
					z = i;
				}
				else if(a[i] == x)
					y = a[i];
			}
		}
		
		char s;
		
		if(x == y)
			s = '?';
		else
			s = (char)(z+65);
		
		System.out.println(s);
		
	}
}
