/*
  BAEKJOON - 7단계 
  (문자열 반복)
  
  문제 4. 
  문자열 S를 입력받은 후에, 각 문자를 R번 반복해 새 문자열 P를 만든 후 출력하는 프로그램을 작성하시오. 
  즉, 첫 번째 문자를 R번 반복하고, 
  두 번째 문자를 R번 반복하는 식으로 P를 만들면 된다. S에는 QR Code "alphanumeric" 문자만 들어있다.

  QR Code "alphanumeric" 문자는 0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ\$%*+-./: 이다.

  입력 예시 1
  2
  3 ABC
  5 /HTP
  
  출력 예시 1
  AAABBBCCC
  /////HHHHHTTTTTPPPPP
*/

package Question;

import java.util.Scanner;

public class QA04
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int a = 0;
		String str;
		String s = "";
		
		for (int i = 0; i < n; i++)
		{
			s = "";
			a = sc.nextInt();
			str = sc.next();
			
			for (int j = 0; j < str.length(); j++)
			{
				for (int j2 = 0; j2 < a; j2++)
				{
					s += str.charAt(j);
				}
			}
			
			System.out.println(s);
		}
		
		sc.close();
	}
}
