package ControlFlowTask;
class MaxOfNos{
    public static void main(String args[]){
        int[] arr1={1452,4574,12547,45458,1245115,457451,32545,32541,25415};
        int t=0;
        int n=arr1.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr1[i]<arr1[j]){
                    t=arr1[i];
                    arr1[i]=arr1[j];
                    arr1[j]=t;
                }
            }

        }
        System.out.println("First Three Largest Numbers are:"+arr1[0]+" "+arr1[1]+" "+arr1[2]);
    }
}


