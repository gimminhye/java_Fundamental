package java_20190528;

/*public class forDemo {
	public static void main(String[] args){
		int sum = 0;
		for(int i=0; i<=10; i++){
			sum = sum + i;
		}
		System.out.println("1부터 100까지의 합은 : "+ sum);
	}*/
	
//100까지 수의 합
/*		public class forDemo {
			public static void main(String[] args){
				int sum = 0;
				int i=1;
				for(;i<=100; i++){
					sum = sum + i;
				}
				System.out.println("1부터 "+(i-1)+" 까지의 합은 : "+ sum);
			}*/

//100까지 수중 홀수만 더하기 (짝수 i%2==0)
			public class forDemo {
				public static void main(String[] args){
					int sum = 0;
					int i=1;
					for(;i<=100; i++){
						if(i%2==1){
						    sum = sum + i;
					}
					System.out.println("1부터 "+(i-1)+" 까지의 합은 : "+ sum);
					
//99단만들기					
					for(int j=2; j<=9; j++){
						for(int k=1; k<=9; k++){
							System.out.println(j+"*"+k+"="+(j*k));
						}
					
//1부터 100까지 소수 갯수 구하기
					int primeCount = 0;
					for(int a=2; a<=100; a++){
						int count =0;
					    for(int k=2; k<a; k++){
					    if(a%k==0){
					    	count +=1;
					    	break;
					    }
					    }
					    if(count==0){
					    	System.out.println(a+" 는 소수 입니다");
					    	primeCount += 1;
					    }
					}
					System.out.println("소수의 갯수는:" +primeCount);
					}
					//99단(continue  와  break)					
					for(int j=2; j<=9; j++){
						if(j==5) continue; //이후문장수행안하고 바로  j++로감.3단빼고 결과출력					}
						if(j==7) break;
						for(int k=1; k<=9; k++){
						if(k==4) break;
							System.out.println(j+"*"+k+"="+(j*k));
						}
					}
				}
			}
			}
			
		
