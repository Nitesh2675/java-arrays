import java.util.Scanner;

class Reverse{

public static void main(String args[]){
    Scanner sc= new Scanner(System.in);
	int number =sc.nextInt();
	int array[]=new int[10];
	int index=0;
	
	while(number!=0){
		array[index++]=number%10;
		number=number/10;
		
	}
	System.out.print("Reversed array");
	for(int i=0;i<index;i++){
System.out.print(array[i]+" ");		
	}

}
}
