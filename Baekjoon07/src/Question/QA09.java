/*
  BAEKJOON - 7단계 
  (크로아티아 알파벳)
  
  문제 9. 
  예전에는 운영체제에서 크로아티아 알파벳을 입력할 수가 없었다. 
  따라서, 다음과 같이 크로아티아 알파벳을 변경해서 입력했다.
  
  예를 들어, ljes=njak은 크로아티아 알파벳 6개(lj, e, š, nj, a, k)로 이루어져 있다. 
  단어가 주어졌을 때, 몇 개의 크로아티아 알파벳으로 이루어져 있는지 출력한다.

  dž는 무조건 하나의 알파벳으로 쓰이고, d와 ž가 분리된 것으로 보지 않는다. 
  lj와 nj도 마찬가지이다. 위 목록에 없는 알파벳은 한 글자씩 센다.

  입력 예시 1
  ljes=njak
  
  출력 예시 1
  6

  입력 예시 2
  ddz=z=
  
  출력 예시 2
  3
  
  입력 예시 3
  nljj
  
  출력 예시 3
  3
  
  입력 예시 4
  c=c=
  
  출력 예시 4
  2
  
  입력 예시 5
  dz=ak
  
  출력 예시 5
  3
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
		
		String str = br.readLine();
		
		int su = 0;
		
		boolean flag = true;
		
		for (int i = 0; i < str.length(); i++)
		{
			if(flag)
			{
				if(i < str.length()-1)
				{
					if (str.substring(i, i+1).equals("c"))	// c=, c-
					{
						if (str.substring(i+1, i+2).equals("="))
						{
							su++;
							flag = false;
						}
						else if (str.substring(i+1, i+2).equals("-"))
						{
							su++;
							flag = false;
						}
						else
							su++;
					}
					else if(str.substring(i, i+1).equals("d"))	// dz=, d- 
					{
						if (str.substring(i+1, i+2).equals("z"))
						{
							if(i < str.length()-2)
							{
								if (str.substring(i+2, i+3).equals("="))
									flag = false;
								else 
									su++;
							}
							else
								su++;
						}
						else if (str.substring(i+1, i+2).equals("-"))
						{
							su++;
							flag = false;
						}
						else
							su++;
					}
					else if(str.substring(i, i+1).equals("l") || str.substring(i, i+1).equals("n"))	// lj, nj
					{
						if (str.substring(i+1, i+2).equals("j"))
						{
							su++;
							flag = false;
						}
						else
							su++;
					}
					else if(str.substring(i, i+1).equals("s") || str.substring(i, i+1).equals("z"))	// s=, z=
					{
						if (str.substring(i+1, i+2).equals("="))
						{
							su++;
							flag = false;
						}
						else
							su++;
					}
					else 
						su++;
				}
				else
					su++;
			}
			else
				flag = true;
			
		}
		
		System.out.println(su);
	}
}
