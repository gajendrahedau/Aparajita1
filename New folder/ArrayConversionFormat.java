/*
//[1,2,3,4,5,6,7,8,9] 
//[ 9,1,8,2,7,3,6,4,5]

class ArrayConversionFormat{
	public static void main(String args[]){
		System.out.println("Given array format: [1,2,3,4,5,6,7,8,9]");
		int numbers[]={1,2,3,4,5,6,7,8,9,10};
		int newArray[]=new int[10];
		int j=0,i;
		for(i=numbers.length-1;i>=numbers.length/2;i--){
			newArray[j]=numbers[i];
			j=j+2;
		
		}
		j=1;
		for(i=0;i<numbers.length/2;i++){
			newArray[j]=numbers[i];
			j=j+2;
		}
		System.out.print("Array format after conversion: [");
		for(i=0;i<numbers.length;i++)
			System.out.print(newArray[i]+",");
		System.out.print("]");
	}
}

class BonusSalary{
	public static void main(String args[]){
		String designation="Senior COnsultant";
		int experience=7,basicSalary=20000,bonusSalary=0;
		if(experience>=5 && designation=="COnsultant")
			bonusSalary=(basicSalary*10)/100;
		else  if(experience>=5 && designation=="Senior COnsultant")
			bonusSalary=(basicSalary*20)/100;
		else  if(experience>=5 && designation=="Senior Analyst")
			bonusSalary=(basicSalary*20)/100;
		else  if(experience>=10 && designation=="Analyst")
			bonusSalary=(basicSalary*20)/100;
		else
			bonusSalary=(basicSalary*5)/100;
		System.out.println("Bonus Salary "+bonusSalary);
	}
}

class FindRoot{
	public  static void main(String args[]){
		int a=10,b=12,c=4;
		if(a==0)
			System.out.println("Root is : "+((-c)/a));
		else{
			int d=(b*b)-(4*a*c);
			if(d<0)
				System.out.println("Roots are imaginary");
			else{
				double root1=(-b+(Math.sqrt(d)))/(2*a);
				double root2=(-b-(Math.sqrt(d)))/(2*a);
				System.out.println("Root1 : "+root1 +" Root2 : "+root2);
			}
		}
		
	}
}


class CountOddEvenArmstrongPalindrome{
	public static void main(String args[]){
		int a=100,b=200,even=0,odd=0,armstrong=0,sum=0,palindrome=0;
		for(int i=a;i<=b;i++){	//for odd and even
			if(i%2==0)
				even++;
			else 
				odd++;
		}
		for(int i=a;i<=b;i++){	//for palindrome
			int number=i;
			sum=0;
			while(number>0){
				int mod=number%10;
				sum=sum*10+mod;
				number/=10;
			}
			if(sum==i)
				palindrome++;
		}
		for(int i=a;i<=b;i++){	//for armstrong
			int number=i;
			sum=0;
			while(number>0){
				int mod=number%10;
				sum=sum+mod*mod*mod;
				number/=10;
				}
				if(sum==i)
					armstrong++;
		}
		System.out.println("Count of Odd Number : "+odd);
		System.out.println("Count of Even Number : "+even);
		System.out.println("Count of Armstrong Number : "+armstrong);
		System.out.println("Count of Palindrome Number : "+palindrome);
		
	}
}




//[1,2,3,4,5,6,7,8,9] 
//[10,1,9,2,8,3,7,4,6,5]

class ArrayConversionFormat2{
	public static void main(String args[]){
		System.out.println("Given array format: [1,2,3,4,5,6,7,8,9]");
		int numbers[]={1,2,3,4,5,6,7,8,9,10};
		int newArray[]=new int[10];
		int j=0,i;
		for(i=numbers.length-1;i>=numbers.length/2;i--){
			newArray[j]=numbers[i];
			j=j+2;
		
		}
		j=1;
		for(i=0;i<numbers.length/2;i++){
			newArray[j]=numbers[i];
			j=j+2;
		}
		System.out.print("Array format after conversion: [");
		for(i=0;i<numbers.length;i++)
			System.out.print(newArray[i]+",");
		System.out.print("]");
	}
}


class SelectionSort{
	public static void main(String args[]){
		int numbers[]={12,21,23,41,7,2,10,34};
		
		int n = numbers.length;  
        for (int i = 0; i < n-1; i++) 
        {  
            int min_idx = i; 
            for (int j = i+1; j < n; j++) 
                if (numbers[j] < numbers[min_idx]) 
                    min_idx = j; 
			int temp = numbers[min_idx]; 
            numbers[min_idx] = numbers[i]; 
            numbers[i] = temp; 
        } 
		for (int i = 0; i < n; i++)
			System.out.print(numbers[i]+",");
	}
	
}


*/













































































