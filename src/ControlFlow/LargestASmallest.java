package ControlFlowTask;

 class LargestASmallest {
     public static void main(String agrs[]){
         int[] arr={42,445547,784857,145142,78448};
         int n=arr.length;
         for(int i=0;i<n;i++){
             for(int j=i+1;j<n;j++){
                 if(arr[i]<arr[j]){
                     int t=arr[i];
                     arr[i]=arr[j];
                     arr[j]=t;
                 }
             }
            // System.out.println(arr[i]);
         }
         System.out.println("Largest Number is:"+arr[0]);
         System.out.println("Smallest Number is:"+arr[n-1]);
     }
}
