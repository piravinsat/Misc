
public class LinearSearch{ //n
    
    public static void main (String[] args) {
        int phone_book_size = 4;
        int index = 0;
        PhoneBookEntry phone_book[] = new PhoneBookEntry[phone_book_size];
        phone_book[0] = new PhoneBookEntry(23143142, "John");
        phone_book[1] = new PhoneBookEntry(2313213, "Bob");
        phone_book[2] = new PhoneBookEntry(231434, "Mike");
        phone_book[3] = new PhoneBookEntry(231321, "Dan");
        
        while ((index < phone_book_size) && (phone_book[index].number != 32142141))
        {
            index++;
        }
        
        if (index == phone_book_size) {
            System.out.println("Target number not found");
        }
        else {
            System.out.println("Target number belongs to" + phone_book[index].name);
        }
        
    }
}