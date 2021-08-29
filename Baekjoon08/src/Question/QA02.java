/*
  BAEKJOON - 8단계 
  (분수찾기)
  
  문제 2. 
  위의 그림과 같이 육각형으로 이루어진 벌집이 있다. 
  그림에서 보는 바와 같이 중앙의 방 1부터 시작해서 이웃하는 방에 돌아가면서 1씩 증가하는 
  번호를 주소로 매길 수 있다. 숫자 N이 주어졌을 때, 
  벌집의 중앙 1에서 N번 방까지 최소 개수의 방을 지나서 갈 때 몇 개의 방을 
  지나가는지(시작과 끝을 포함하여)를 계산하는 프로그램을 작성하시오. 
  예를 들면, 13까지는 3개, 58까지는 5개를 지난다.

  입력 예시 1
  13
  
  출력 예시 1
  3
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
		
		int a = Integer.parseInt(br.readLine());
		
		int x = 1;
		int count = 1;
		
		while ( x < a)
		{
			x += (count*6);
			
			count++;
		}
		
		System.out.println(count);
	}
}
