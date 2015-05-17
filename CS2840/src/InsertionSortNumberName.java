
public class InsertionSortNumberName {
    
    public void iMessage(PhoneBookEntry[] b, int pass, int count, String message) {
        if (message != null) {
            System.out.println(message + "{");
        }
        else {
            System.out.println("pass: " + pass + "count: " + count + " { ");
        }
        
        for (int i = 0; i < b.length; i++) {
            if (b[i].name != null) {
                System.out.println(b[i].name + ",");
                System.out.println(b[i].number + " ");
            }            
        }
        System.out.println("} compares: " + PhoneBookEntry.compareCount + " assigns: " + PhoneBookEntry.assignCount);
    }
    
    void iMessage(PhoneBookEntry[] b, String message) {
        iMessage(b, 0, 0, message); }
    
    void iMessage(PhoneBookEntry[] b, int pass, int count) {
        iMessage(b, pass, count, null);
    }
    
    InsertionSortNumberName(PhoneBookEntry b[]) {
        PhoneBookEntry temp = new PhoneBookEntry();
        
        PhoneBookEntry.assignCount = PhoneBookEntry.compareCount = 0;
        iMessage(b, "Initial:      ");
        
        for(int pass = 1; pass < b.length; pass++) {
            int count;
            temp.assign(b[pass]);
            
            for (count = pass - 1; count >= 0 && temp.compareNumberName(b[count]) < 0; count--) {
                b[count + 1].assign(b[count]);
                iMessage(b, pass, count);
            }
            b[count + 1].assign(temp);
        }
        
        iMessage(b, "Final:      ");
    }
}
