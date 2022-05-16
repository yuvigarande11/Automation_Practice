package inter;

public class SumOfPrimeNo {
	//static int addition=sum;
//static	int divisible=0;
	public static void SumOfPrime(int number) {
		int sum=0;
		int divisible=0;
		for(int i= 1;i<=number;i++) {
			divisible=0;
			if(i==1) {
				 sum=0;
			}else {
			//	 divisible=0;
				for(int j=1;i<=j;j++) {
					if((i%j)==0) {
						divisible++;
					} }}
					if(divisible<=2) {
						 sum=sum+i;
					
					}
					System.out.println("The sum of 1000 prime numbers  "+i);				}
		
				
			System.out.println("The sum of 1000 prime numbers  "+sum);
		}

	public static void main(String[] args) {
		
SumOfPrimeNo.SumOfPrime(10);
	}

}
