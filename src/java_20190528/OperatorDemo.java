package java_20190528;

public class OperatorDemo {
	public static void main(String[] args){
	
		/* 달력만들기
		 * 1. 1년1월1일은 월요일
		 * 2. 윤년은 4년마다 발생하고, 그중 100년의 배수는 제외, 400년의 배수는 제외하지 않는다.
		 * 
		 * 2019년 5월28일의 요일을 구하려면?
		 * 2018년까지 총일수를 구하고, 2018년1월부터 4월까지 일수를 구하고, 28일을 더하면 총일수가 나옴
		 * 총일수를 7로 나눈 나머지가 1이면 월요일, 2이면 화요일..6이면 토요일, 0이면 일요일
		 * 	  
		 */
		
		int year = 2019;
		int month = 5;
		int date = 28;
		
		int preYear = year -1;
		int preMonth = month -1;
		int totalCnt = 0;
		
		
		//2018년도 총일수 구하기
		totalCnt = preYear *365 + (preYear/4 - preYear/100 + preYear/400); 
		
		//2019년도 1월1일~4월 30일까지 일수 구하기 
		totalCnt += (31+28+31+30);
		
		//만약 2020년같이 윤달있는해의  date별 요일을 알고 싶으면
		//totalCnt++; 를 추가하기 -> 토탈카운트에1을 더한다는 뜻임
		

		totalCnt += date;
		
		int rest = totalCnt % 7;
		
		System.out.println(rest);
		
		
		int a=10;
		++a;
		a++;
		
		System.out.println(a++);
		System.out.println(++a);
		
		
		int temp = 123;
		int share = temp%10==0 ? temp/10 : temp/10+1;
		
		if(temp%10==0){
			share = temp/10;
		}else{
			share = temp/10+1;
		}
		
	}
}
