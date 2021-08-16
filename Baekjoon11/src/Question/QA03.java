/*
  BAEKJOON - 11단계 
  (덩치)
  
  문제 3. 
  우리는 사람의 덩치를 키와 몸무게, 이 두 개의 값으로 표현하여 그 등수를 매겨보려고 한다. 
  어떤 사람의 몸무게가 x kg이고 키가 y cm라면 이 사람의 덩치는 (x, y)로 표시된다. 
  두 사람 A 와 B의 덩치가 각각 (x, y), (p, q)라고 할 때 x > p 그리고 y > q 이라면 
  우리는 A의 덩치가 B의 덩치보다 "더 크다"고 말한다. 
  예를 들어 어떤 A, B 두 사람의 덩치가 각각 (56, 177), (45, 165) 라고 한다면 
  A의 덩치가 B보다 큰 셈이 된다. 그런데 서로 다른 덩치끼리 크기를 정할 수 없는 경우도 있다. 
  예를 들어 두 사람 C와 D의 덩치가 각각 (45, 181), (55, 173)이라면 몸무게는 D가 C보다 더 무겁고, 
  키는 C가 더 크므로, "덩치"로만 볼 때 C와 D는 누구도 상대방보다 더 크다고 말할 수 없다.

  N명의 집단에서 각 사람의 덩치 등수는 자신보다 더 "큰 덩치"의 사람의 수로 정해진다. 
  만일 자신보다 더 큰 덩치의 사람이 k명이라면 그 사람의 덩치 등수는 k+1이 된다. 
  이렇게 등수를 결정하면 같은 덩치 등수를 가진 사람은 여러 명도 가능하다. 
  아래는 5명으로 이루어진 집단에서 각 사람의 덩치와 그 등수가 표시된 표이다.

  자연수 N이 주어졌을 때, N의 가장 작은 생성자를 구해내는 프로그램을 작성하시오.
  
  입력 예시 1
  5
  55 185
  58 183
  88 186
  60 175
  46 155
  
  출력 예시 1
  2 2 1 2 5
*/

package Question;

import java.util.Scanner;

public class QA03
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[][] xy = new int[n][3];
		
		for (int i = 0; i < xy.length; i++)
		{
			xy[i][0] = sc.nextInt();
			xy[i][1] = sc.nextInt();
			xy[i][2] = 1;
		}
		
		for (int i = 0; i < xy.length; i++)
		{
			for (int j = 0; j < xy.length; j++)
			{
				if( xy[i][0] < xy[j][0] && xy[i][1] < xy[j][1])
					xy[i][2]++;
			}
		}
		
		for (int i = 0; i < xy.length; i++)
		{
			System.out.print(xy[i][2] + " ");
		}
		
	}
}
