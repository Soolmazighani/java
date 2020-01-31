package arrays;

public class arraysdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//int a=1,2,3,3,4,4,5,5,6,6,7,7;
		
		//array: array is collection of elements of the same data type
	    //2 types of arrays
		//1} Single dimensional
		//2} two/multi dimensional
		
		//Single Dimensional Arrays
    //1) Declare an array
   //2) Insert values into arrays
   //3) Find size of an arrays
   //4) Read values from an array
	
		
int	a[]=new int[5]; // declare arrays with size 5, starting index is 0, last is 9

//Insert values into arrays
a[0]=100;
a[1]=200;
a[2]=300;
a[3]=400;
a[4]=500;

//find size of an array
System.out.println("Length of an array: "+a.length);//print length/size of an array
	
//4) Read values from an array
System.out.println(a[2]);	

for(int i=0;i<=a.length-1;i++)
{
	System.out.println(a[i]);
}

	}
	

}
