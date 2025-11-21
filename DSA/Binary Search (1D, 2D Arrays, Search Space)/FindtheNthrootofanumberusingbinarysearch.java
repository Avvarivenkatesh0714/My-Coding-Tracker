//Optimal
public class FindtheNthrootofanumberusingbinarysearch {
    public static void main(String[] args) {
        int n = 3;
        int m = 61;
        
        int res = binaryNthRootFind(n,m);

       System.out.println(res);
    }
    
    static int binaryNthRootFind(int n, int m){
      int low = 1;
      int high = m;
      
      while(low<=high){
        int mid = (low+high)/2;
        
        if(f(mid,n)==m) return mid;
        else if(f(mid,n)>m) high = mid-1;
        else low = mid+1;
      }
      return -1;
    }

    static int f(int i, int n){
        int pro = 1;
        for(int j = 1; j <= n; j++){
            pro *= i;
        }
        return pro;
    }
}


// Brute Force
// public class Main {
//     public static void main(String[] args) {
//         int n = 3;
//         int m = 27;
//         boolean found = false;

//         for(int i = 1; i <= m; i++){
//             int val = f(i, n);
//             if(val == m){
//                 System.out.println(i);
//                 found = true;
//                 break;
//             }
//             if(val > m) break;
//         }

//         if(!found) System.out.println(-1);
//     }

//     static int f(int i, int n){
//         int pro = 1;
//         for(int j = 1; j <= n; j++){
//             pro *= i;
//         }
//         return pro;
//     }
// }
