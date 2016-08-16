package paixu;

/**
 * - 理解，写程序
 * - 优化
 * - 时间复杂度（最好:n  / 最坏：n*n）
 *    冒泡排序：将相邻的两个数两两比较，按从小到大或者从大到小的顺序排好
 * */
public class MaoPao {
	
	public static void main (String agrs[]){
        int sorce [] = {67,69,70,75,87,89,90,100};
        int temp = 0 ;
        boolean isSwap = false;//优化
        
        for (int i = 0;i < sorce.length - 1;i++){//趟   sorce.length-1
        	
            for (int j = 0;j < sorce.length - i - 1;j++){//每一趟的比较    sorce.length - i - 1
                if (sorce[j] > sorce[j+1]){//从小到大
                	isSwap = true;
                    temp = sorce[j];
                    sorce[j] = sorce[j+1];
                    sorce[j+1] = temp;
                }
              
            }
            
            //测试输出
            for (int a = 0;a <sorce.length;a++){
                System.out.print(sorce[a]+",");
            }
            System.out.println("");  
            
            if(isSwap){
            	isSwap = false;//复位
            }else{
            	break;
            }
            
      
        }

       
    }

}
