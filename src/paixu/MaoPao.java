package paixu;

/**
 * - ��⣬д����
 * - �Ż�
 * - ʱ�临�Ӷȣ����:n  / ���n*n��
 *    ð�����򣺽����ڵ������������Ƚϣ�����С������ߴӴ�С��˳���ź�
 * */
public class MaoPao {
	
	public static void main (String agrs[]){
        int sorce [] = {67,69,70,75,87,89,90,100};
        int temp = 0 ;
        boolean isSwap = false;//�Ż�
        
        for (int i = 0;i < sorce.length - 1;i++){//��   sorce.length-1
        	
            for (int j = 0;j < sorce.length - i - 1;j++){//ÿһ�˵ıȽ�    sorce.length - i - 1
                if (sorce[j] > sorce[j+1]){//��С����
                	isSwap = true;
                    temp = sorce[j];
                    sorce[j] = sorce[j+1];
                    sorce[j+1] = temp;
                }
              
            }
            
            //�������
            for (int a = 0;a <sorce.length;a++){
                System.out.print(sorce[a]+",");
            }
            System.out.println("");  
            
            if(isSwap){
            	isSwap = false;//��λ
            }else{
            	break;
            }
            
      
        }

       
    }

}
