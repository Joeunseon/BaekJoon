/*
  BAEKJOON - 7단계 
  (그룹 단어 체커)
  
  문제 10. 
  그룹 단어란 단어에 존재하는 모든 문자에 대해서, 각 문자가 연속해서 나타나는 경우만을 말한다. 
  예를 들면, ccazzzzbb는 c, a, z, b가 모두 연속해서 나타나고, 
  kin도 k, i, n이 연속해서 나타나기 때문에 그룹 단어이지만, aabbbccb는 b가 떨어져서 나타나기 때문에 
  그룹 단어가 아니다.

  단어 N개를 입력으로 받아 그룹 단어의 개수를 출력하는 프로그램을 작성하시오.

  입력 예시 1
  3
  happy
  new
  year
  
  출력 예시 1
  3

  입력 예시 2
  4
  aba
  abab
  abcabc
  a
  
  출력 예시 2
  1
*/

package Question;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class QA10
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int su = 0;
		for (int i = 0; i < n; i++)
		{
			if(check(br.readLine()))
				su++;
		}
		
		System.out.println(su);
	}
	
	public static boolean check(String str)
	{
		boolean flag = true;
		
		char[] arr = str.toCharArray();
		
		for (int i = 0; i < arr.length; i++)
		{
			flag = true;
			int count = 0;
			
			for (int j = i+1; j < arr.length; j++)	
			{
				if(arr[i] == arr[j])
				{
					if(count > 0)
					{
						flag = false;
						break;
					}
				}
				else
					count++;
			}
			
			if(!flag)
				break;
		}
		
		
		return flag;
	}
}
