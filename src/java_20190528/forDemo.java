package java_20190528;

/*public class forDemo {
	public static void main(String[] args){
		int sum = 0;
		for(int i=0; i<=10; i++){
			sum = sum + i;
		}
		System.out.println("1���� 100������ ���� : "+ sum);
	}*/
	
//100���� ���� ��
/*		public class forDemo {
			public static void main(String[] args){
				int sum = 0;
				int i=1;
				for(;i<=100; i++){
					sum = sum + i;
				}
				System.out.println("1���� "+(i-1)+" ������ ���� : "+ sum);
			}*/

//100���� ���� Ȧ���� ���ϱ� (¦�� i%2==0)
			public class forDemo {
				public static void main(String[] args){
					int sum = 0;
					int i=1;
					for(;i<=100; i++){
						if(i%2==1){
						    sum = sum + i;
					}
					System.out.println("1���� "+(i-1)+" ������ ���� : "+ sum);
					
//99�ܸ����					
					for(int j=2; j<=9; j++){
						for(int k=1; k<=9; k++){
							System.out.println(j+"*"+k+"="+(j*k));
						}
					
//1���� 100���� �Ҽ� ���� ���ϱ�
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
					    	System.out.println(a+" �� �Ҽ� �Դϴ�");
					    	primeCount += 1;
					    }
					}
					System.out.println("�Ҽ��� ������:" +primeCount);
					}
					//99��(continue  ��  break)					
					for(int j=2; j<=9; j++){
						if(j==5) continue; //���Ĺ��������ϰ� �ٷ�  j++�ΰ�.3�ܻ��� ������					}
						if(j==7) break;
						for(int k=1; k<=9; k++){
						if(k==4) break;
							System.out.println(j+"*"+k+"="+(j*k));
						}
					}
				}
			}
			}
			
		
