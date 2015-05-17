/**
 * 
 */

/**
 * @author Piravin
 *
 */
public class BubbleSort {
        
    private int pass;
    private int phone_book_size = 4;
    
    public BubbleSort() {
        
        PhoneBookEntry phone_book[] = new PhoneBookEntry[phone_book_size];
        phone_book[0] = new PhoneBookEntry(19, "John");
        phone_book[1] = new PhoneBookEntry(5, "Bob");
        phone_book[2] = new PhoneBookEntry(3, "Mike");
        phone_book[3] = new PhoneBookEntry(1, "Dan");
        
        for (pass = 0; pass < phone_book_size; pass++) {
            int element;
            
            for (element = 0; element < (phone_book_size - 1) - pass; element++) {
                if (phone_book[element].number > phone_book[element + 1].number) {
                    PhoneBookEntry temp = phone_book[element];
                    phone_book[element] = phone_book[element + 1];
                    phone_book[element + 1] = temp;
                }
            }
        }
        
        for(int i = 0; i < phone_book_size; i++)
        {
        System.out.println(phone_book[i].name + " " + phone_book[i].number);
        }
    }
    
    public static void main(String args[]) {
        new BubbleSort();
    }
    
        
}
