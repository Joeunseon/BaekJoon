/*
  BAEKJOON - 7단계 
  (단어의 개수)
  
  문제 6. 
  영어 대소문자와 띄어쓰기만으로 이루어진 문자열이 주어진다. 
  이 문자열에는 몇 개의 단어가 있을까? 이를 구하는 프로그램을 작성하시오. 
  단, 한 단어가 여러 번 등장하면 등장한 횟수만큼 모두 세어야 한다.

  입력 예시 1
  The Curious Case of Benjamin Button
  
  출력 예시 1
  6

  입력 예시 2
   Mazatneunde Wae Teullyeoyo
  
  출력 예시 2
  3
  
  입력 예시 3
  Teullinika Teullyeotzi 
  
  출력 예시 3
  2
*/

package Question;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class QA06
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		
		StringTokenizer st = new StringTokenizer(str, " ");
		
		System.out.println(st.countTokens());
	}
}
