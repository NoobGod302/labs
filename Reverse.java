import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner word = new Scanner(System.in);
        System.out.println("Enter username");
        String wordInput = word.nextLine();
        System.out.println("Your word is: " + wordInput);
        reverseWord(wordInput);
    }

    public static  void reverseWord(String wordInput)
    {
        for( int i=wordInput.length()-1; i >= 0 ;i-- )
        {
            System.out.print(wordInput.charAt(i));
        }
    }
}
