package paixu;

/**
 * - 快速排序算法的时间复杂度，有时候是O(n * lgn), 有时候就是O(n2),
 * */
public class KuaiSu {

	public static void main (String agrs[]){
		
		int a[] = {72,6,57,88,60,42,83,73,48,85};
		quick_sort(a,0,a.length-1);
		System.out.print(a[0]+","+a[1]+","+a[2]+","+a[3]+","+a[4]+","+a[5]+","+a[6]+","+a[7]+","+a[8]+","+a[9]+",");
	}
	

 static	void quick_sort(int s[], int l, int r)  
	{  
	    if (l < r)  
	    {  
	        //Swap(s[l], s[(l + r) / 2]); //将中间的这个数和第一个数交换 参见注1  
	        int i = l, j = r, x = s[l];  
	        while (i < j)  
	        {  
	            while(i < j && s[j] >= x) // 从右向左找第一个小于x的数  
	                j--;    
	            
	            if(i < j)   //如果找到了比x小的数，则把这个数放进坑，并i++
	                s[i++] = s[j];  
	              
	            while(i < j && s[i] < x) // 从左向右找第一个大于等于x的数  
	                i++;   
	            
	            if(i < j)   
	                s[j--] = s[i];  
	        }  
	        
	        s[i] = x;  
	        
	        
	        quick_sort(s, l, i - 1); // 递归调用   
	        quick_sort(s, i + 1, r);  
	    }  
	 
	 /* i = left;
	 j = right;
	 x = s[i];
	 if(i<j){
		 while(i<j)while(i<j && s[j] >= x ){//从左向右寻找比x小的第一个数
			 j--;
		 }
		 if(i<j){
			 s[i] = s[j];
			 i++;
		 }
		 
		 while(i<j && s[i] <= x){//从右向左寻找比x大的第一个数
			 i++;
		 }
		 if(i<j){
			 s[j] = s[i];
			 j++;
			 
		 }
		 
	 }
	 
	 s[i]= x;
	
	 quick_sort(s, left, i - 1); // 递归调用   
     quick_sort(s, i + 1, right);  
	 
	}  */
	
	
}
}