package paixu;
/**
 * �鲢���򣺾��ǰѴ������зֳɼ��������С���ÿ�������н���������ٰ�����������кϲ��������������С�
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
		guibing_sort(s,low,mid);//�ݹ�
		guibing_sort(s,mid + 1,high);
		merge(s,low,mid,high);
	}

}

public static void merge(int s[],int low,int mid,int high){//��С��ִ�е�Ԫ��2
	//                               0        0        1
	int temp[] = new int[high - low  + 1];//����һ����ʱ������������źõ�����
	int i = low;
	int j = mid +1;
	int k = 0;

	// �ѽ�С�������Ƶ���������
	while(i <= mid && j <= high){
		if(s[i]< s[j]){
			temp[k++] = s[i++];
		}else{
			temp[k++] = s[j++];}
	}
	
	// �����ʣ�������������
	while(i <= mid){
		temp[k++] = s[i++];
	}
	// ���ұ߱�ʣ�������������  
	while(j <=  high){
		temp[k++] = s[j++];
	}
	
	// ���������е�������s����  
    for (int k2 = 0; k2 < temp.length; k2++) {  
       s[k2 + low] = temp[k2];  
    } 
}

	
}
