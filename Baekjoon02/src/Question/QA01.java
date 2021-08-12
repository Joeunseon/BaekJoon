/*
  BAEKJOON - 2단계 
  (두 수 비교하기)
  
  문제 1. 
  두 정수 A와 B가 주어졌을 때, A와 B를 비교하는 프로그램을 작성하시오.
  첫째 줄에 A와 B가 주어진다. A와 B는 공백 한 칸으로 구분되어져 있다.
  
  첫째 줄에 다음 세 가지 중 하나를 출력한다.
	A가 B보다 큰 경우에는 '>'를 출력한다.
	A가 B보다 작은 경우에는 '<'를 출력한다.
	A와 B가 같은 경우에는 '=='를 출력한다.
  
  입력 예시 1
  1 2
  
  출력 예시 1
  <
  
  입력 예시 2
  10 2
  
  출력 예시 2
  >
  
  입력 예시 3
  5 5
  
  출력 예시 3
  ==
*/

package Question;

import java.util.Scanner;

public class QA01
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int A, B;
		
		A = sc.nextInt();
		B = sc.nextInt();
		
		if (A > B)
			System.out.println(">");
		else if (A < B)
			System.out.println("<");
		else
			System.out.println("==");
		
		sc.close();
	}
}
