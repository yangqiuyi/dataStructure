package paixu;
/*
 * ϣ����������ǿ��Ĳ�������
 *      ������������鰴�����ָ�Ϊ���ɸ������У�Ȼ��������н��в�������ֱ������Ϊ1��ֱ�ӽ��в�������
 *      
 *      ���� ��ѡ��һ��Ϊ���鳤�ȵĶ���֮һ���ٱ�Ϊԭ�������Ķ���֮һ....ֱ������Ϊ1
 * 
 * 
 * */
public class XiEr {
	
	public static void main(String args[]) {
		int a [] = {49,38,65,97,76,13,27,49,55,4};
		shellSort(a);
		System.out.print("���Ϊ"+ a[0]+","+a[1]+","+a[2]+","+a[3]+","+a[4]+","+a[5]+","+a[6]+","+a[7]+","+a[8]+","+a[9]);
	
	}
	
	public static void shellSort(int[] list) {
	    int gap = list.length / 2;
	 
	    while (1 <= gap) {
	        // �Ѿ���Ϊ gap ��Ԫ�ر�Ϊһ���飬ɨ��������
	        for (int i = gap; i < list.length; i++) {
	            int j = 0;
	            int temp = list[i];
	 
	            // �Ծ���Ϊ gap ��Ԫ�����������
	            for (j = i - gap; j >= 0 && temp < list[j]; j = j - gap) {
	                list[j + gap] = list[j];
	            }
	            list[j + gap] = temp;
	        }
	 
	        System.out.format("gap = %d:\t", gap);
	      
	        gap = gap / 2; // ��С����
	    }
	}

}
