//Trayvon Daigle
// 3/3/2020
// first project
/*
 In this game, the player is in a land full of dragons. The dragons all live in caves with their large piles of collected
  treasure. Some dragons are friendly and share their treasure. Other dragons are hungry and eat anyone who enters their
  cave. The player approaches two caves, one with a friendly dragon and the other with a hungry dragon, but doesn’t know
   which dragon is in which cave. The player must choose between the two.
        */

import java.util.Scanner;
public class Dragon {
    public static void main(String[] args){
        int D;
        Scanner c = new Scanner(System.in);
    System.out.println("You are in a land full of dragons. In front of you,\n" +
            "\n" +
            "you see two caves. In one cave, the dragon is friendly\n" +
            "\n" +
            "and will share his treasure with you. The other dragon\n" +
            "\n" +
            "is greedy and hungry and will eat you on sight.\n" +
            "\n" +
            "Which cave will you go into? (1 or 2)");

             D = c.nextInt();
                    switch(D){
                case 1: System.out.println("You approach the cave...\n" +
                        "\n" +
                        "It is dark and spooky...\n" +
                        "\n" +
                        "A large dragon jumps out in front of you! He opens his jaws and...\n" +
                        "\n" +
                        "Gobbles you down in one bite!");
                break;
                case 2: System.out.println("You approach the cave...\n" +
                        "\n" +
                        "It is dark and spooky...\n" +
                        "\n" +
                        "A large dragon flies over you! He leaves you his treasure\n" +
                        "\n" +
                        "Congrats you're now rich!");
                break;
                default:System.out.println("Are you a little girl?");
                break;
            };
    }
}
