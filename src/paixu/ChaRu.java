package paixu;
/***
 * ��������
 * ʱ�临�Ӷ�O(n2) 
		��������������Ҫ�ƶ�n*(n-1)/2��Ԫ�� 
		�����������򣬲���Ҫ�ƶ�Ԫ��
		
	����������������ǡ���������ʱ����������Ч�ʵ�����������ʱ��ΪO(n)��
 * 
 * **/

public class ChaRu {
	
	public static void main(String args[]) {
		
		int a [] = {4,3,5,7,6,2,1,9,88,0};
		sort(a);
		 System.out.print("���Ϊ"+ a[0]+","+a[1]+","+a[2]+","+a[3]+","+a[4]+","+a[5]+","+a[6]+","+a[7]+","+a[8]+","+a[9]);
	}
	
	public static void sort(int s []){
		int start = 1;//index = 0 ��Ĭ���ź��˵ġ�
		
		//i������ʼ��λ�� - ����
		for(int i = start; i<s.length; i++){//�趨����ĵ�һ��Ԫ��������õ�
			int j = i;
			int temp = s[i];//��s[i]�����м�������൱�ڰ�s[i]�ڿգ����ҵ����ʵ�Ԫ���ٰ�Ԫ�ز������λ��
			
			while(j > 0 && s[j-1] > temp){// r���Ԫ�ر��м�ֵ�����ƶ�λ��
				      s[j] = s[j-1];
				      j--;//���Ϻ��ź����Ԫ�رȽ�, ��ʱ�Ŀ�index
			}
			
			s[j] = temp;//���ѿ����
		}
	
     //System.out.print("���Ϊ"+ s);
}
	}