import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Main m1 = new Main();
	    ArrayList<Integer> list = m1.Method1(5);
	        System.out.print(list); 
	}
	
	public ArrayList<Integer> Method1(int n){
	    ArrayList<Integer> arr = new ArrayList<>();
	    for(int i = 0;i<n;i++){
	        arr.add(i);
	        }
	    return arr;
	}
}
