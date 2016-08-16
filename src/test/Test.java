package test;
import java.lang.Integer ;

public class Test {
	
	
	public static void main(String[] args)
    {
       int a [] = {6,2,1,3,8,9,0};
       //charu(a);
       // maopao(a);
       xuanzhe(a);
       for(int m = 0;m < a.length;m++){
    	   System.out.print(a[m]);
       }
    }
	
	public static void charu(int s[]){
		int i;
		int j;
		int temp;
		for(i = 1;i<s.length;i++){
			j = i;
			temp = s[i];
			while(j > 0 && s[j-1] > temp){
				s[j] = s[j-1];
				j--;
			}
			s[j] = temp;
		}
		
		
	}

	public static void maopao(int s[]) {
		for(int i = 0;i < s.length - 1;i++){
			   for(int j = 0;j < s.length - 1 - i;j++ ){
				   if(s[j] > s[j+1]){
				   int temp = s[j];
				       s[j] = s[j+1];
				       s[j+1] = temp;
			   }
		}
		
	}
}
	public static void xuanzhe(int s[]) {
       int i;
       int j;
       int index;//用来存放最小值的下标
       int temp;//中间变量
       
       for(i = 0;i < s.length - 1; i++){
    	   index = i;
    	   for(j = i + 1;j < s.length; j++){
    		    if(s[index] > s[j]){
    		    	index = j;
    		    }
    		  }
    	   temp = s[i];
    	   s[i] = s[index];
    	   s[index] = temp; 
    	   
    	   }
    	   
       }
    

	}	
	
	

