package ShuffleGame;

import java.util.Random;
import java.util.Scanner;

    public class ShuffleGame {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();


        System.out.println("-------------welcome to shuffle game-------------------");

        while (true) {

            int[] array = {0, 1, 2};
            System.out.println("Are you ready to play? y/n?");
            char x = sc.next().charAt(0);

            if (x == 'y' || x == 'Y') {
                int rand1 = rand.nextInt(3);
                int rand2 = rand.nextInt(3);
                int temp = array[rand1];
                array[rand1] = array[rand2];
                array[rand2] = temp;

                System.out.println("Choose 1 2 or 3");
                int input = sc.nextInt();

                if (array[input - 1] == 0) {
                    System.out.println("Good Guess!!!");
                } else {
                    System.out.println("Sorry, wrong guess!!!");

                    while (true) {
                        System.out.println("Do you want to try again? y/n?");
                        x = sc.next().charAt(0);
                        if (x == 'y' || x == 'Y' || x == 'n' || x == 'N')
                            break;
                    }
                    if (x == 'n' || x == 'N') {
                        System.out.println("See you next time!");
                        break;
                    }

                }  if (x == 'n' || x == 'N') {
                    System.out.println("See you next time!");
                    break;
                }
            }
        }
    }
}