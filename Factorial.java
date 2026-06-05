//Find the factorial by hardcoding the number 
class Factorial{
	public static void main(String args[]){
		int fact =1;
		
		for(int i=2;i<=10;i++){
			fact=fact*i;
		}
		System.out.println("The Factorial is :"+fact);
	}
}