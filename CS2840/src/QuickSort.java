
public class QuickSort {
    
    public QuickSort() {
        int s[] = {4,3,1,2, 5, 19, 8, 0, 39};
        quick_sort(0, s.length - 1, s);
        
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }
        
    }
    
    public static void main (String[] args) {
        new QuickSort();
    }
    
    int partition (int low, int high, int s[]) {
        
        int pivot = s[low];
        int k = low;
        
        for (int i = low + 1; i <= high; i++) {
            if (s[i] < pivot) {
                s[k] = s[i];
                s[i] = s[k+1];
                k = k+1;
            }
        }
            s[k] = pivot;
            return k;           
    }
    
    void quick_sort(int low, int high, int s[]) {
        if (low < high) {
            int k = partition(low, high, s);
            quick_sort(low, k-1, s);
            quick_sort(k+1, high, s);
        }
    }

}
