/**
 * 
 */

/**
 * @author Piravin
 *
 */
public class InsertionSort {
    
    InsertionSort() {
        int s[] = {2,1,3,4};
        
        for(int pass = 1; pass < 4; pass++) {
            int count, temp = s[pass];
            int compare;
            int copy;
            
            for (count = pass - 1; count >= 0 && temp < s[count]; count--)
            {
                s[count + 1] = s[count];
           }   
            s[count + 1] = temp;
        }
        
        //Print the result
        for (int i = 0; i < s.length; i++)
        {
            System.out.println(s[i] + " ");
        }
    }
    
   public static void main(String[] args) {
       new InsertionSort();
   }

}
