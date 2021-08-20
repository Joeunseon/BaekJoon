/*
  BAEKJOON - 5단계 
  (평균은 넘겠지)
  
  문제 7. 
  대학생 새내기들의 90%는 자신이 반에서 평균은 넘는다고 생각한다. 당신은 그들에게 슬픈 진실을 알려줘야 한다.
  
  입력 예시 1
  5
  5 50 50 70 80 100
  7 100 95 90 80 70 60 50
  3 70 90 80
  3 70 90 81
  9 100 99 98 97 96 95 94 93 91
  
  출력 예시 1
  40.000%
  57.143%
  33.333%
  66.667%
  55.556%
*/

package Question;

import java.util.Scanner;

public class QA07
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++)
		{
			int m = sc.nextInt();
			int[] list = new int[m];
			
			int tot = 0;
			
			for (int j = 0; j < m; j++)
			{
				list[j] = sc.nextInt();
				tot += list[j];
			}
			
			double avg = 1.0*tot/m;
			tot = 0;
			
			for (int j = 0; j < m; j++)
			{
				if(list[j] > avg)
					tot++;
			}
			
			System.out.printf("%.3f%% \n", (1.0*tot/m*100));
		}
	}

}
