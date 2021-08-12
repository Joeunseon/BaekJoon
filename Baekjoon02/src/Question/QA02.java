/*
  BAEKJOON - 2단계 
  (시험 성적)
  
  문제 2. 
  시험 점수를 입력받아 90 ~ 100점은 A, 80 ~ 89점은 B, 70 ~ 79점은 C, 60 ~ 69점은 D, 
  나머지 점수는 F를 출력하는 프로그램을 작성하시오.
  
  첫째 줄에 시험 점수가 주어진다. 시험 점수는 0보다 크거나 같고, 100보다 작거나 같은 정수이다.
  
  입력 예시 1
  100
  
  출력 예시 1
  A
*/

package Question;

import java.util.Scanner;

public class QA02
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int i;
		
		i = sc.nextInt();
		
		if ( i/10 >= 9 )
			System.out.println("A");
		else if ( i/10 == 8 )
			System.out.println("B");
		else if ( i/10 == 7 )
			System.out.println("C");
		else if ( i/10 == 6 )
			System.out.println("D");
		else 
			System.out.println("F");
		
		sc.close();
	}
}
