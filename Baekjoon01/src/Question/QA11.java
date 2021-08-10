/*
  BAEKJOON - 1단계 
  (곱셈)

  문제 11. 
  (세 자리 수) × (세 자리 수)는 다음과 같은 과정을 통하여 이루어진다.
        4 7 2  ----- (1)
  x     3 8 5  ----- (2)
  ------------
      2 3 6 0  ----- (3)
    3 7 7 6    ----- (4)
  1 4 1 6      ----- (5) 
  ------------
  1 8 1 7 2 0  ----- (6)
  (1)과 (2)위치에 들어갈 세 자리 자연수가 주어질 때 
  (3), (4), (5), (6)위치에 들어갈 값을 구하는 프로그램을 작성하시오.
  
  입력 예시
  472
  385
  
  출력 예시
  2360
  3776
  1416
  181720
*/

package Question;

import java.util.Scanner;

public class QA11
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int A, B;
		
		A = sc.nextInt();
		B = sc.nextInt();
		
		int op;
		op = B%10;
		System.out.println(A*op);
		
		op = B/10%10;
		System.out.println(A*op);
		
		op = B/100;
		System.out.println(A*op);
		
		System.out.println(A*B);
		
		sc.close();
	}
}
