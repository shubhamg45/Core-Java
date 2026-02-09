// import java.util.*;
// class OddEvenWithOrder {
//     public static void main(String[] args) {

//         int[] arr = {1,2,3,4,5,6,7,8,9};
//         int cnt=arr.length;

//         for (int i=0;i<cnt ;i++ ) {
//             if (arr[i]%2==0) {
//                 cnt--;
//                 int j=i+1;

//                 while(j<arr.length && arr[j]%2==0){
//                        j++;
//                 }
//                 if (j==arr.length) {
//                     break;
//                 }
//                 int temp=arr[j];
//                 for (int k=j;k>i ;k-- ) {
//                     arr[k]=arr[k-1];
//                 }
//                 arr[i]=temp;
//             }
//     }
//     System.out.println(Arrays.toString(arr));
//   }
// }

// remaining 

import java.util.*;
class OddEvenWithOrder {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,8,9};
        int cnt=arr.length;

        for (int i=0;i<cnt ;i++ ) {
            if (arr[i]%2==0) {
                cnt--;
                int j=i+1;

                while(j<arr.length-1){
                    if(arr[j]%2!=0) break;
                    j++;
                }
                int temp=arr[j];
                for (int k=j;k>i ;k-- ) {
                    arr[k]=arr[k-1];
                }
                arr[i]=temp;
            }
    }
    System.out.println(Arrays.toString(arr));
  }
}