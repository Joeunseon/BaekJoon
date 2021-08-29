/*
  BAEKJOON - 8단계 
  (벌집)

  문제 4. 
  땅 위에 달팽이가 있다. 이 달팽이는 높이가 V미터인 나무 막대를 올라갈 것이다.

  달팽이는 낮에 A미터 올라갈 수 있다. 하지만, 밤에 잠을 자는 동안 B미터 미끄러진다. 
  또, 정상에 올라간 후에는 미끄러지지 않는다.

  달팽이가 나무 막대를 모두 올라가려면, 며칠이 걸리는지 구하는 프로그램을 작성하시오.
  
  입력 예시 1
  2 1 5
  
  출력 예시 1
  4
  
  입력 예시 2
  5 1 6
  
  출력 예시 2
  2
  
  입력 예시 3
  100 99 1000000000
  
  출력 예시 3
  999999901
*/

package Question;

import java.util.Scanner;

public class QA04
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int x = upDown(sc.nextInt(), sc.nextInt(), sc.nextInt());
		
		System.out.println(x);
	}
	
	public static int upDown(int u, int d, int e)
	{
		int x = 1;
		
		
		
		return x;
	}
}
