class Solution {
    public int[] replaceElements(int[] arr) {
        int n = arr.length;
        int MaxSoFar = arr[n-1];

        for(int i = n - 2 ; i >= 0 ; i--){
            int temp = arr[i];
            arr[i] = MaxSoFar;
            if(MaxSoFar < temp){
                MaxSoFar = temp;
            }
        }
        arr[n-1] = -1;
        return arr;
    }
}