/*
  BAEKJOON - 7단계 
  (알파벳 찾기)
  
  문제 3. 
  알파벳 소문자로만 이루어진 단어 S가 주어진다. 
  각각의 알파벳에 대해서, 단어에 포함되어 있는 경우에는 처음 등장하는 위치를, 
  포함되어 있지 않은 경우에는 -1을 출력하는 프로그램을 작성하시오.

  입력 예시 1
  baekjoon
  
  출력 예시 1
  1 0 -1 -1 2 -1 -1 -1 -1 4 3 -1 -1 7 5 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1
*/

package Question;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class QA03
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		
		int[] s = new int[str.length()];
		
		for (int i = 0; i < str.length(); i++)
			s[i] = (int)str.charAt(i);
		
		String a = "";
		String b;
		
		for (int i = 97; i < 123; i++)
		{
			b = "";
			
			for (int j = 0; j < s.length; j++)
			{
				if(i == s[j])
				{
					b = j + " ";
					break;
				}
			}
			
			if(b.equals(""))
				b = -1 + " ";
			
			a += b;
		}
		
		System.out.println(a);
	}
}
