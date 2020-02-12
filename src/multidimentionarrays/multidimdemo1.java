package multidimentionarrays;

public class multidimdemo1 {

	public static void main(String[] args) {
		

	
	int a[][]= {{100,200},{300,400},{500,600}};
	
	
	
	
	
	 System.out.println("Number of rows" +a.length);
	    System.out.println("Number of columns" +a[0].length);
	    		
	//enhanced for loop
	    for(int r[]:a)
	    
	    {          // another option to run array
	   
	    	
	    for(int i:r)	
	    	
	    {	
	    	
	    	System.out.println(i);
	    	
	    	
	    	for (int i=0; i<a.length;i++) //i representing rows 0123456
	    
	    {
	     for(int j=0;j<a[i].length;j++) // j shows column
	    	
	     {
	    	 System.out.println(a[i][j]);
	    
	    }
	 

	
	    }  
		
	    }

}

	
	

