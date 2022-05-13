import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Main m1 = new Main();
	    int [] arr = m1.Method1(5);               //Declare array to catch the return method
	    int i =0;
	    while(i<5){
	        System.out.print(arr[i]+" ");
	        i++;
	    }
	}
	
	public int[] Method1(int n){                //declare method return type of array of integer
	    int [] arr = new int[n];                //declare the array to be returned
	    for(int i = 0;i<n;i++){
	        arr[i] = i;
	    }
	    return arr;                             //return the array
	}
}
