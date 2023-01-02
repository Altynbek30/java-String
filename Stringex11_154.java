import java.util.Scanner;

public class Stringex11_154{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
int arr[] = {21332,53334,23443,4656,6,1760,5534};
int x = 0;
int z = 0;
int max	=0;
int min=1000000;


for (int i=0;i<arr.length;i++){

	if(max<arr[i]){
		max = arr[i];
		x=i;
	}
	if(min>arr[i]){
		min=arr[i];
		z=i;
	}
	arr[l]=0;
	arr[z]=0;
}
for(int i=0;i<arr.length;i++){
	System.out.println(arr[i]);
}
}