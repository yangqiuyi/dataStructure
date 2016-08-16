package paixu;

import java.util.Arrays;

public class jishu {
	
public static void main(String args[]) {
		
		int a [] = {400,31,53,72,6,29,10,9,88,80,23,67,88};
		radixSort(a,10,3);
		 for(int m = 0;m < a.length;m++){
	    	   System.out.print(a[m]+",");
	       }
	}
	
	
	
	
	/**
	 * @param array ����������
	 * @param radix ������10�����Ӹ�����
	 * @paramdistanced �������У�����λ��
	 * */
    private static void radixSort(int[] array,int radix, int distance) {  
        int length = array.length;  
        int[] temp = new int[length];//�����ݴ�Ԫ��  
        int[] count = new int[radix];//���ڼ�������  ����  ÿһλ�ĸ�
        int divide = 1;  
          
        for (int i = 0; i < distance; i++) {  
              
            System.arraycopy(array, 0,temp, 0, length);  
            Arrays.fill(count, 0);//�������  
              
            for (int j = 0; j < length; j++) {//���ѭ��������ÿ�����ĸ�ʮ��ǧλ�ֿ�������ʹ���Ӧ������Ͱ�ĸ�������1
            	//divide : 1 10 100
            	//radix : ���� 10
                int tempKey = (temp[j]/divide) % radix;  //temp[j]/divide  ÿһλ�ĸ�
                count[tempKey]++;  //ÿһλ�ĸ�
            }  
            
            //radix : ���� 10  
            for (int j = 1; j < radix; j++) {  
                count [j] = count[j] + count[j-1];  
            }  
              
            //���˾������� ������ʵ�ּ���������ص��������������              
            for (int j = length - 1; j >= 0; j--) {  
                int tempKey = (temp[j]/divide)%radix;  
                count[tempKey]--;  
                array[count[tempKey]] = temp[j];  
            }  
              
            divide = divide * radix; // 1 10 100                  
              
        }  
                  
    }  
	
	
	
	 
}
