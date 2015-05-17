import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TestHarness {
    
    static PhoneBookEntry[] makeTestArray(int size, String filename) throws FileNotFoundException {
        
        PhoneBookEntry b[] = new PhoneBookEntry[size];
        
        if (filename == null) {
            for (int i = 0; i < b.length; i++)
            {
                b[i] = new PhoneBookEntry(b.length - i, null);
            }
        }
            else {
                Scanner scan = new Scanner(new File(filename));
            
                
                for(int i = 0; i < b.length && scan.hasNext(); i++)
                {
                    b[i] = new PhoneBookEntry(scan.nextInt(), scan.nextLine());
                }           
            }
        return b;      
            }
    
        static void writeTestArray(PhoneBookEntry b[], String filename) throws FileNotFoundException {
            
            PrintWriter output = new PrintWriter(filename);
            
            for (int i = 0; i < b.length; i++) {
                output.printf("%d %s \n", b[i].number, b[i].name);
            }           
            output.close();
        }
        
        public static void main(String[] args) throws FileNotFoundException {
            PhoneBookEntry b[] = makeTestArray(4, null);
            
            // PhoneBookEntry b[] = makeTestArray(6578, "phone.ran");
            
            //new InsertionSortNumberName(b);
            //new BubbleSortNumberName(b);
            
            writeTestArray(b, "test.out");
            
        }
    
        }


