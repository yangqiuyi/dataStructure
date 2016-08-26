package paixu;

public class Heap {
	
	 public void heap_sort(int[] arrays,int e){
	        if(e>0){
	            init_sort(arrays,e);//��ʼ���ѣ��ҳ����ķ��ڶѶ�
	        //    snp(arrays);
	            arrays[0]=arrays[e]+arrays[0];//�Ѷ��Ķӳ������ֵ������һ��Ԫ�ؽ���
	            arrays[e]=arrays[0]-arrays[e];
	            arrays[0]=arrays[0]-arrays[e];
	        //    snp(arrays);
	            heap_sort(arrays, e-1);
	        }else{
	            snp(arrays);
	        }
	    }

	    public void snp(int[] arrays){
	        for(int i=0;i<arrays.length;i++){
	            System.out.print(arrays[i]+" ");
	        }
	        System.out.println();
	    }

	    public void init_sort(int[] arrays,int e){  //��ʼ���ѣ��ҳ�����ֵ���ڶѶ�      
	        int m=(e+1)/2;    
	        for(int i=0;i<m;i++){
	            boolean flag=build_heap(arrays,e,i);
	            //�������֮���н�������Ҫ���¿�ʼ
	            if(flag){
	                i=-1;
	            }
	            
	        }
	        
	            
	    }
	    //����һ����ǣ�����и��뺢�ӽ�����Ҫ���´Ӷ�����ʼ���Ҳ������������ṹ
	    public boolean build_heap(int arrays[],int e,int i){
	        int l_child=2*i+1;//����
	        int r_child=2*i+2;//�Һ���
	        if(r_child>e){           //�ж��Ƿ����Һ��ӣ�û�еĻ�ֱ�ӱȽϣ�С�ڽ���
	            if(arrays[i]<arrays[l_child]){
	                arrays[i]=arrays[i]+arrays[l_child];
	                arrays[l_child]=arrays[i]-arrays[l_child];
	                arrays[i]=arrays[i]-arrays[l_child];
	                return true;
	            }else{
	                    return false;
	                }
	        }
	        //�ڸ�����������֮���ҳ������Ǹ�ֵ���н���
	        if(arrays[i]<arrays[l_child]){
	            if(arrays[l_child]>arrays[r_child]){
	                //�����������ӵ�ֵ
	                arrays[i]=arrays[i]+arrays[l_child];
	                arrays[l_child]=arrays[i]-arrays[l_child];
	                arrays[i]=arrays[i]-arrays[l_child];
	                return true;
	            }else{
	                //���������Һ��ӵ�ֵ
	                arrays[i]=arrays[i]+arrays[r_child];
	                arrays[r_child]=arrays[i]-arrays[r_child];
	                arrays[i]=arrays[i]-arrays[r_child];
	                return true;
	            }
	        }else if(arrays[i]<arrays[r_child]){
	                //���������Һ��ӵ�ֵ
	                arrays[i]=arrays[i]+arrays[r_child];
	                arrays[r_child]=arrays[i]-arrays[r_child];
	                arrays[i]=arrays[i]-arrays[r_child];
	                return true;
	        }
	        return false;
	            
	    }
	    public static void main(String[] args) 
	    {
	        Heap h=new Heap();
	        int [] a={17,8,45,84,2,94};
	        h.heap_sort(a,a.length-1);
	    }

}
