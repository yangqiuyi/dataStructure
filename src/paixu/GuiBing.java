package paixu;
/**
 * 归并排序：就是把待排序列分成几个子序列。对每个子序列进行排序后，再把有序的子序列合并成整体有序序列。
 * 
 * **/

public class GuiBing {

public static void main (String agrs[]){
		
		int a[] = {72,6,57,88,60,42,83,73,48,85};
		guibing_sort(a,0,a.length-1);
		for(int i=0;i<a.length;i++)  
	        System.out.print(a[i]+","); 
	}


public static void guibing_sort(int s[],int low,int high){
	int mid = (low + high)/2;
	if(low < high){
		guibing_sort(s,low,mid);//递归
		guibing_sort(s,mid + 1,high);
		merge(s,low,mid,high);
	}

}

public static void merge(int s[],int low,int mid,int high){//最小的执行单元是2
	//                               0        0        1
	int temp[] = new int[high - low  + 1];//定义一个临时数组用来存放排好的数据
	int i = low;
	int j = mid +1;
	int k = 0;

	// 把较小的数先移到新数组中
	while(i <= mid && j <= high){
		if(s[i]< s[j]){
			temp[k++] = s[i++];
		}else{
			temp[k++] = s[j++];}
	}
	
	// 把左边剩余的数移入数组
	while(i <= mid){
		temp[k++] = s[i++];
	}
	// 把右边边剩余的数移入数组  
	while(j <=  high){
		temp[k++] = s[j++];
	}
	
	// 把新数组中的数覆盖s数组  
    for (int k2 = 0; k2 < temp.length; k2++) {  
       s[k2 + low] = temp[k2];  
    } 
}

	
}
