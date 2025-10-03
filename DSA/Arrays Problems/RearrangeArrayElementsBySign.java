//Brute Force

class RearrangeArrayElementsBySign {
    public int[] rearrangeArray(int[] arr) {
        int n = arr.length;
          
        ArrayList<Integer> p = new ArrayList<>();
        ArrayList<Integer> ne = new ArrayList<>();

        for(int i=0;i<n;i++){
            if(arr[i]>0){
                p.add(arr[i]);
            }
            else{
                ne.add(arr[i]);
            }
        }

        for(int i=0;i<n/2;i++){
            arr[2*i] = p.get(i);
            arr[2*i+1] = ne.get(i);
        }
        return arr;
    }
}

/*Time Complexity: O(N+N/2) { O(N) for traversing the array once for segregating positives and negatives and another O(N/2) for adding those elements alternatively to the array, where N = size of the array A}.

Space Complexity:  O(N/2 + N/2) = O(N) { N/2 space required for each of the positive and negative element arrays, where N = size of the array A}.*/