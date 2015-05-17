/**
 * 
 */

/**
 * @author Piravin
 *
 */
public class MergeSort {
    
    public MergeSort() {
        
        
        int s[] = {4,3,1,2, 5, 19, 8, 0, 39};
        int u[] = new int [9]; 
        merge_sort1(0, 8, s, u);
        
        for( int i = 0; i < 9; i++) {
        System.out.println(s[i]);
        }
    }
    
    public static void main(String args[]) {

        new MergeSort();
    }
    
    
    public void merge1(int low, int high, int s[], int u[] )
    {
        int k = (high - low + 1)/2; //k = the number of elements divided by 2
        //Used to split the array
        
        for (int q = low; q <= high; q++) { //Lowest element to highest element in that part of the array
            u[q] = s[q]; //Creates a second array where that is only changed when the correct position of elements are established
        }
        
        int j = low, p = low;
        int i = low + k; //Lowest point of that array plus half of the elements
        
        /**
         * j is less than or equal to (low + k - 1)
         * and
         * i less than or equal to high
         */
        while ((j <= low + k - 1) && (i <= high)) {
            
            if (u[j] <= u[i]) { //If the element at j is greater than the element at i
                s[p] = u[j]; //Copies the element at j of the original array to the element at p of the u array
                j++; //Increments j
            } else {
                s[p] = u[i]; //Copies the element at i of the original array to the element p of the u array
                i++; //Increments i
            }
            p++; //Increments p         
        }
        /**
         * if j is less than or equal to low + k - 1
         */
        if (j <= low + k - 1) {
            for (int q = p; q <= high; q++)
            {
                s[q] = u[j]; //Copies the element at j of the original array to the element q of the u array
                j++; //Increments j
            }
        }       
    }
    
    public void merge_sort1(int low, int high, int s[], int u[])
    {      
        if (low < high) { //if low less than high
            int k = (high - low + 1)/2;
            merge_sort1(low, low+k-1, s, u);
            merge_sort1(low+k, high, s, u);
            merge1(low, high, s, u);
        }
    }

}
