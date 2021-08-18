/*
  BAEKJOON - 5단계 
  (평균)
  
  문제 5. 
  세준이는 기말고사를 망쳤다. 세준이는 점수를 조작해서 집에 가져가기로 했다. 
  일단 세준이는 자기 점수 중에 최댓값을 골랐다. 이 값을 M이라고 한다. 
  그리고 나서 모든 점수를 점수/M*100으로 고쳤다.

  예를 들어, 세준이의 최고점이 70이고, 수학점수가 50이었으면 수학점수는 50/70*100이 되어 71.43점이 된다.

  세준이의 성적을 위의 방법대로 새로 계산했을 때, 새로운 평균을 구하는 프로그램을 작성하시오.
  
  입력 예시 1
  3
  40 80 60
  
  출력 예시 1
  75.0
  
  입력 예시 2
  3
  10 20 30
  
  출력 예시 2
  66.666667
  
  입력 예시 3
  4
  1 100 100 100
  
  출력 예시 3
  75.25
  
  입력 예시 4
  5
  1 2 4 8 16
  
  출력 예시 4
  38.75
  
  입력 예시 5
  2
  3 10
  
  출력 예시 5
  65.0
*/

package Question;

import java.util.Arrays;
import java.util.Scanner;

public class QA05
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		double[] list = new double[n];
		
		for (int i = 0; i < list.length; i++)
			list[i] = sc.nextDouble();
		
		Arrays.sort(list);
		
		for (int i = 0; i < n; i++)
			list[i] = 1.0*list[i]/list[n-1]*100;
		
		double tot = 0;
		
		for (int i = 0; i < list.length; i++)
			tot += list[i];
		
		System.out.println(1.0*tot/n);
		
		sc.close();
		
	}

}
