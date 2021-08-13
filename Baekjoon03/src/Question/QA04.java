/*
  BAEKJOON - 3단계 
  (빠른 A+B)
  
  문제 4. 
  첫 줄에 테스트케이스의 개수 T가 주어진다. T는 최대 1,000,000이다. 
  다음 T줄에는 각각 두 정수 A와 B가 주어진다. A와 B는 1 이상, 1,000 이하이다.
  
  각 테스트케이스마다 A+B를 한 줄에 하나씩 순서대로 출력한다.
  
  입력 예시 1
  5
  1 1
  12 34
  5 500
  40 60
  1000 1000
  
  출력 예시 1
  2
  46
  505
  100
  2000
*/

package Question;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

import java.io.IOException;

public class QA04
{

	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int t = Integer.parseInt(br.readLine());
		int[] sum = new int[t];
		
		for (int i = 0; i < t; i++)
		{
			String tot = br.readLine();
			
			String[] a = tot.split(" ");
			
			sum[i] = Integer.parseInt(a[0]) + Integer.parseInt(a[1]); 
		}
		
		for (int i : sum)
		{
			bw.write(i + "\n");
		}
		
		bw.flush();
		bw.close();
	}

}
