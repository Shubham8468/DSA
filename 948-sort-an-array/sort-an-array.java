class Solution {
    public void meresort(int[] arr){
        int n=arr.length;
        if(n==1){
            return ;
        }
        int idx=0;
        int[] a=new int[n/2];
        int[] b=new int[n-n/2];
        //add item in this arrays
        for(int i=0;i<a.length;i++){
            a[i]=arr[idx];
            idx++;
        }
        for(int i=0;i<b.length;i++){
            b[i]=arr[idx];
            idx++;
        }
        // doing magig
        meresort(a);
        meresort(b);
        //magre a and b
        mergearr(a,b,arr);

    }
    public void mergearr(int[] a,int[] b,int[] arr){
        int i=0,j=0,k=0;
        while(i<a.length&& j<b.length){
            if(a[i]<b[j]){
                arr[k]=a[i];
                i++;
            }
            else{
                arr[k]=b[j];
                j++;
            }
            k++;
        }
        while(i<a.length){
            arr[k]=a[i];
            i++;
            k++;
        }
        while(j<b.length){
            arr[k]=b[j];
            j++;
            k++;
        }

    }
    public int[] sortArray(int[] arr) {
        //apply merege sort 
        if(arr.length==1){
            return arr;
        }
        meresort(arr);
        return arr;
       
    }
}