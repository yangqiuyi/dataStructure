package paixu;

/**��������:  ���÷��ε�˼�룬�Ӵ������������ѡһ������Ϊ������һ���ǵ�һ������,
 *          �������̣���������������ȫ�ŵ������ұߣ�С�ڻ����������ȫ�ŵ�������ߡ�
 *          �ٶ����������ظ��ڶ�����ֱ��������ֻ��һ������
 * - ���������㷨��ʱ�临�Ӷȣ���ʱ����O(n * lgn), ��ʱ�����O(n2),
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
	        //Swap(s[l], s[(l + r) / 2]); //���м��������͵�һ�������� �μ�ע1  
	        int l = left;
	        int r = right;
	        int temp = s[left];  
	        
	        while (l < r)  
	        {  
	            while(l < r && s[r] >= temp) // ���������ҵ�һ��С��x����  
	                r--;    
	            
	            if(l < r)   //����ҵ��˱�xС���������������Ž��ӣ���i++
	                s[l++] = s[r];  
	              
	            while(l < r && s[l] < temp) // ���������ҵ�һ�����ڵ���x����  
	                l++;   
	            
	            if(l < r)   
	                s[r--] = s[l];  
	        }  
	        //�˳�ʱ��i����j����x�������С�
	        s[l] = temp;  
	        
	        
	        quick_sort(s, left, l - 1); // �ݹ����   
	        quick_sort(s, l + 1, right);  
	    }  
	
	
}

}