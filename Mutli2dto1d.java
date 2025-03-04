import java.util.Scanner;

class Mutli2dto1d{

public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("enter number of rows...");
int rows=sc.nextInt();
System.out.println("enter number of column...");
int column=sc.nextInt();


int matrix[][]=new int[rows][column];
int array[]=new int[rows*column];


for(int i=0;i<rows;i++){
	for(int j=0;j<column;j++){
		matrix[i][j]=sc.nextInt();
	}
}

int index=0;

for(int i=0;i<rows;i++){
	for(int j=0;j<column;j++){
		array[index++]=matrix[i][j];
	}
}
for(int i=0;i<array.length;i++){
	System.out.println("1D array elemets at index"+ i+" "+array[i]);
}

      }

}