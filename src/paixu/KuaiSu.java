package paixu;

/**
 * - ���������㷨��ʱ�临�Ӷȣ���ʱ����O(n * lgn), ��ʱ�����O(n2),
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
	        //Swap(s[l], s[(l + r) / 2]); //���м��������͵�һ�������� �μ�ע1  
	        int i = l, j = r, x = s[l];  
	        while (i < j)  
	        {  
	            while(i < j && s[j] >= x) // ���������ҵ�һ��С��x����  
	                j--;    
	            
	            if(i < j)   //����ҵ��˱�xС���������������Ž��ӣ���i++
	                s[i++] = s[j];  
	              
	            while(i < j && s[i] < x) // ���������ҵ�һ�����ڵ���x����  
	                i++;   
	            
	            if(i < j)   
	                s[j--] = s[i];  
	        }  
	        
	        s[i] = x;  
	        
	        
	        quick_sort(s, l, i - 1); // �ݹ����   
	        quick_sort(s, i + 1, r);  
	    }  
	 
	 /* i = left;
	 j = right;
	 x = s[i];
	 if(i<j){
		 while(i<j)while(i<j && s[j] >= x ){//��������Ѱ�ұ�xС�ĵ�һ����
			 j--;
		 }
		 if(i<j){
			 s[i] = s[j];
			 i++;
		 }
		 
		 while(i<j && s[i] <= x){//��������Ѱ�ұ�x��ĵ�һ����
			 i++;
		 }
		 if(i<j){
			 s[j] = s[i];
			 j++;
			 
		 }
		 
	 }
	 
	 s[i]= x;
	
	 quick_sort(s, left, i - 1); // �ݹ����   
     quick_sort(s, i + 1, right);  
	 
	}  */
	
	
}
}