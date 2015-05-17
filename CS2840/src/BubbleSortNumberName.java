
public class BubbleSortNumberName {

    public void iMessage(PhoneBookEntry[] b, int pass, int count, String message) {
        
        if (message != null) {
            System.out.print(message + "{ ");
        } else {
            System.out.print("pass: " + pass + " count: " + count + " { ");
        }
        
        for (int i = 0; i < b.length; i++) {
            if (b[i].name != null) {
                System.out.print(b[i].name + ",");
                System.out.println(b[i].number + " ");
            }
            System.out.println("} compares: " + PhoneBookEntry.compareCount + " swaps: " + PhoneBookEntry.swapCount);
        }      
    }
    
    public void iMessage(PhoneBookEntry[] b, String message) {
        iMessage(b, 0, 0, message);
    }
    
    public void iMessage(PhoneBookEntry[] b, int pass, int count) {
        iMessage(b, pass, count, null);
    }
    
    public void iMessage(PhoneBookEntry[] b) {
        PhoneBookEntry temp = new PhoneBookEntry();
        
        PhoneBookEntry.swapCount = PhoneBookEntry.compareCount = 0;
        iMessage(b, "Initial:      ");
        
        for (int pass = 1; pass < b.length; pass++)
        {
            for (int count = 0; count < b.length - 1; count++) {
                if (b[count].compareNumberName(b[count + 1]) > 0) {
                    b[count].swap(b[count + 1]);
                    iMessage(b, pass, count);
                }
                
                iMessage(b, "Final            ");
            }
        }
    }
    
}
