/*
  BAEKJOON - 8단계 
  (벌집)

  문제 3. 
  무한히 큰 배열에 다음과 같이 분수들이 적혀있다.

  1/1	1/2	1/3	1/4	1/5	…
  2/1	2/2	2/3	2/4	…	…
  3/1	3/2	3/3	…	…	…
  4/1	4/2	…	…	…	…
  5/1	…	…	…	…	…
  …	…	…	…	…	…
  이와 같이 나열된 분수들을 1/1 → 1/2 → 2/1 → 3/1 → 2/2 → … 과 같은 지그재그 순서로 
  차례대로 1번, 2번, 3번, 4번, 5번, … 분수라고 하자.
  
  X가 주어졌을 때, X번째 분수를 구하는 프로그램을 작성하시오.
  
  입력 예시 1
  1
  
  출력 예시 1
  1/1
  
  입력 예시 2
  2
  
  출력 예시 2
  1/2
  
  입력 예시 3
  3
  
  출력 예시 3
  2/1
  
  입력 예시 4
  4
  
  출력 예시 4
  3/1
  
  입력 예시 5
  5
  
  출력 예시 5
  2/2
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
		
		String str = bunsu(Integer.parseInt(br.readLine()));
		
		System.out.println(str);
	}
	
	public static String bunsu(int x)
	{
		String str = "";
		
		int a = 0;
		int b = 0;
		
		do
		{
			b++;
		  
			a += b;
			
		} while (x > a);
		
		a = (x+b)-a;
		
		int c = (b+1)-a;
		
		if(b%2 == 0)
			str = a + "/" + c;
		else
			str = c + "/" + a;
		
		
		return str;
	}
}
