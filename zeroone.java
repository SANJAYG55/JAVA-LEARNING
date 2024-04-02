public class zeroone {



    public static void main(String args[]){

        int arr[]={0,1,1,0,1,2,1,2,0,0,1};
       int   arrs =arr.length;

       int l=0;
       int mid =0;
       int hi= arrs-1;
       int t=0;
       while(mid<=hi){
        switch(arr[mid]){
            case 0:
            t=arr[l];
            arr[l]=arr[mid];
            arr[mid]=t;
            l++;
            mid++;
            break;

            case 1:
            mid++;
            break;

            case 2:
            t=arr[mid];
            arr[mid]=arr[hi];
            arr[hi]=t;
            hi--;
            break;
        }
       }
       int i;
    for(i=0;i<arrs;i++){
        System.out.println(arr[i]);

    }
    

    }

    
}
