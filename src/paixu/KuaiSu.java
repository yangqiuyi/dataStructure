package paixu;

/**快速排序:  采用分治的思想，从待排序的数据中选一个数作为基数（一般是第一个数）,
 *          分区过程，将比这个数大的数全放到它的右边，小于或等于它的数全放到它的左边。
 *          再对左右区间重复第二步，直到各区间只有一个数。
 * - 快速排序算法的时间复杂度，有时候是O(n * lgn), 有时候就是O(n2),
 * */
public class KuaiSu {
	

	public static void main (String agrs[]){
		
		int a[] = {72,6,57,88,60,42,83,73,48,85};
		quick_sort(a,0,a.length-1);
		System.out.print(a[0]+","+a[1]+","+a[2]+","+a[3]+","+a[4]+","+a[5]+","+a[6]+","+a[7]+","+a[8]+","+a[9]+",");
	}
	

 static	void quick_sort(int s[], int left, int right)  
	{  
	    if (left < right)  
	    {  
	        //Swap(s[l], s[(l + r) / 2]); //将中间的这个数和第一个数交换 参见注1  
	        int l = left;
	        int r = right;
	        int temp = s[left];  
	        
	        while (l < r)  
	        {  
	            while(l < r && s[r] >= temp) // 从右向左找第一个小于x的数  
	                r--;    
	            
	            if(l < r)   //如果找到了比x小的数，则把这个数放进坑，并i++
	                s[l++] = s[r];  
	              
	            while(l < r && s[l] < temp) // 从左向右找第一个大于等于x的数  
	                l++;   
	            
	            if(l < r)   
	                s[r--] = s[l];  
	        }  
	        //退出时，i等于j。将x填到这个坑中。
	        s[l] = temp;  
	        
	        
	        quick_sort(s, left, l - 1); // 递归调用   
	        quick_sort(s, l + 1, right);  
	    }  
	
	
}

}