
public class PhoneBookEntry {

    int number;
    String name;
    static int compareCount;
    static int assignCount;
    static int swapCount;
    
    public PhoneBookEntry(int number, String name) {
        this.number = number;
        this.name = name;
    }
    
    public PhoneBookEntry() {
        this.number = 0;
        this.name = null;
    }
    
    int compareNumberName(PhoneBookEntry p) {
        compareCount++;
        if(number > p.number) {
            return -1;
        }
        else {
            if (name == null || p.name == null)
            {
                return 0;
            }
            else {
                return name.compareTo(p.name);
            }
        }
    }
    
    int compareNameNumber(PhoneBookEntry p) {
        compareCount++;
        if(name == null || p.name == null) {
            return 0;
        }
        
        int temp = name.compareTo(p.name);
        if (temp != 0) {
            return temp;
        }
        
        if (number > p.number)
        {
            return 1;
        }
        else if (number < p.number) {
            return -1;
        }
        else {
            return 0;
        }
    }
        
        public void assign(PhoneBookEntry p) {
            assignCount++;
            number = p.number;
            name = p.name;
        }
        
        public void swap(PhoneBookEntry p) {
            swapCount++;
            int tmpNumber = p.number; p.number = number; number = tmpNumber;
            String tmpName = p.name; p.name = name; name = tmpName;
        }
    }