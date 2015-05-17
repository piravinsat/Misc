
public class HeapSort {
    
    public HeapSort() {
        int s[] = {4,3,1,2, 5, 19, 8, 0, 39};
        heap(s.length,s);
        
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }
    }
    
    public static void main(String[] args) {
        new HeapSort();
    }
    
    public void sift(int p, int size, int s[]) {
        
        int siftkey = s[p];
        int parent = p;
        boolean notfound = true;
        int largerch;
        
        while ((2*parent+1 <= (size - 1)) && notfound) {
            if ((2*parent+1 <(size - 1)) && (s[2*parent+1] < s[2*parent+2])) {
                largerch = 2*parent + 2;
            }
            else {
                largerch = 2*parent + 1;
            }
            
            if (siftkey < s[largerch]) {
                s[parent] = s[largerch];
                parent = largerch;
            } else {
                notfound = false;
            }
                s[parent] = siftkey;
            }
        }
    
    public void makeHeap(int size, int s[]) {
        for (int i = ((size/2)-1); i>=0; i--) {
            sift(i,size,s);
        }
    }
    
    public void heap(int size, int s[]) {
        makeHeap(size, s);
        for (int i = size-1; i>=0; i--) {
            int hold = s[i];
            s[i] = s[0];
            s[0] = hold;
            sift(0,i,s);
        }
    }
    
    }

