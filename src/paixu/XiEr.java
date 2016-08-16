package paixu;
/*
 * 希尔排序是增强版的插入排序
 *      ：对无序的数组按增量分割为若干个子序列，然后对子序列进行插入排序，直到增量为1，直接进行插入排序；
 *      
 *      增量 的选择：一般为数组长度的二分之一，再变为原来增量的二分之一....直到增量为1
 * 
 * 
 * */
public class XiEr {
	
	public static void main(String args[]) {
		int a [] = {49,38,65,97,76,13,27,49,55,4};
		shellSort(a);
		System.out.print("结果为"+ a[0]+","+a[1]+","+a[2]+","+a[3]+","+a[4]+","+a[5]+","+a[6]+","+a[7]+","+a[8]+","+a[9]);
	
	}
	
	public static void shellSort(int[] list) {
	    int gap = list.length / 2;
	 
	    while (1 <= gap) {
	        // 把距离为 gap 的元素编为一个组，扫描所有组
	        for (int i = gap; i < list.length; i++) {
	            int j = 0;
	            int temp = list[i];
	 
	            // 对距离为 gap 的元素组进行排序
	            for (j = i - gap; j >= 0 && temp < list[j]; j = j - gap) {
	                list[j + gap] = list[j];
	            }
	            list[j + gap] = temp;
	        }
	 
	        System.out.format("gap = %d:\t", gap);
	      
	        gap = gap / 2; // 减小增量
	    }
	}

}
