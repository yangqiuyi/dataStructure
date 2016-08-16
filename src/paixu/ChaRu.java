package paixu;
/***
 * 插入排序  ：每一步将未排序的数据放到已经排好序的数据中的正确位置
 * 时间复杂度O(n2) 
		最差情况：反序，需要移动n*(n-1)/2个元素 
		最好情况：正序，不需要移动元素
		
	数组在已排序或者是“近似排序”时，插入排序效率的最好情况运行时间为O(n)；
 * 
 * **/

public class ChaRu {
	
	public static void main(String args[]) {
		
		int a [] = {4,3,5,7,6,2,1,9,88,0};
		sort(a);
		 System.out.print("结果为"+ a[0]+","+a[1]+","+a[2]+","+a[3]+","+a[4]+","+a[5]+","+a[6]+","+a[7]+","+a[8]+","+a[9]);
	}
	
	public static void sort(int s []){
		int start = 1;//index = 0 的默认排好了的。
		
		//i代表初始吭位置 - 趟数
		for(int i = start; i<s.length; i++){//设定数组的第一个元素是排序好的
			int j = i;
			int temp = s[i];//把s[i]赋给中间变量，相当于把s[i]挖空，等找到合适的元素再把元素插入这个位置
			
			while(j > 0 && s[j-1] > temp){// r如果元素比中间值大，则移动位置
				      s[j] = s[j-1];
				      j--;//不断和排好序的元素比较, 此时的坑index
			}
			
			s[j] = temp;//每次循环后把坑填好
		}
	
     //System.out.print("结果为"+ s);
}
	}
