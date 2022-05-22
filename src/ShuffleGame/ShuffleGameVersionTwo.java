package ShuffleGame;

import java.util.Random;
import java.util.Scanner;

public class ShuffleGameVersionTwo {

    public static void main(String[] args) {
      while(true) {
            int[] arr = {0, 1, 2};
            Scanner sc = new Scanner(System.in);
            Random rand = new Random();


            System.out.println("Are you ready to play?y/n");
            char c = sc.next().charAt(0);
            if (c == 'y') {
                int sElement = rand.nextInt(3);
                int fElement = rand.nextInt(3);
                int temp = arr[fElement];
                arr[fElement] = arr[sElement];
                arr[sElement] = temp;
                System.out.println("Pick 1,2 or 3!");
                int i = sc.nextInt();
                if (arr[i - 1] == 0) {
                    System.out.println("Good Guess!");
                } else
                    System.out.println("Sorry! Wrong Guess");
                while (true) {
                    System.out.println("Do you want to try again?y/n");
                    c = sc.next().charAt(0);
                    if (c == 'y' || c == 'n')
                        break;
                }
                if (c == 'n'){
                    System.out.println("See you next time!");
                    break;
                }

            } else if (c == 'n'){
                System.out.println("See you next time!");
                break;
            }
        }
    }
}


