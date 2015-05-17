
public class BinarySearch { //O(log n)
    
    private static int phone_book_size = 6;
    static PhoneBookEntry phone_book[];
    
    public static int binarySearch(int l, int h) {
        if (l > h)  {
            return -1;
        }
        else
        {
            int mid_index = (l + h)/2;
            
            if (phone_book[mid_index].number == 9)
            {
                return mid_index; //search succeeded
            }
            else {
                if (9 < phone_book[mid_index].number)
                {
                    return binarySearch(l, mid_index - 1);
                }
                else {
                    return binarySearch(mid_index + 1, h);
                }
            }
        }
    }

    public static void main(String[] args)
    {
        phone_book = new PhoneBookEntry[phone_book_size];
        phone_book[0] = new PhoneBookEntry (1, "James");
        phone_book[1] = new PhoneBookEntry (3, "Max");
        phone_book[2] = new PhoneBookEntry (4, "Conan");
        phone_book[3] = new PhoneBookEntry (7, "La Bamba");
        phone_book[4] = new PhoneBookEntry (8, "Andy");
        phone_book[5] = new PhoneBookEntry (9, "O'Brien");
        int index = binarySearch(0, phone_book_size-1);
        if (index == -1)
        {
            System.out.println("Target number not found");
        }
        else
        {
            System.out.println("Target number belongs to " + phone_book[index].name);
        }
    }
}
