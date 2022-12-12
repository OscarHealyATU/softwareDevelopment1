package MiscProjects;
import java.util.Scanner;

/**
 * quest
 */
public class quest {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //double money  = 12.38;
        String name;
        // characters true = alive
        // 0 = dead
        int bearBeast = 100;
        boolean Jeweller = true;
        String ans = "n";
        // plot
        System.out.println("An injured man aproaches you in the woods: 'Good day Sir, apologies for interupting you on your walk but i need your help! \nwill you come along with me?!'\n");
        System.out.println("Enter 'Y' for yes and 'N' for no\n");
        // answer
        ans = input.next();
        if (ans.equals("n")  ||ans.equals("N") )  {
            System.out.println("The man becomes even more desperate and starts begging for you for help, A bear then comes out from behind you, \npouncing on the man and rips out his entrails, and throws the now screaming stranger to the side. The bear then turns to you");
            Jeweller = false;
        }
        if (ans.equals("y")  ||ans.equals("Y") )  {
            System.out.println("The man exclaims 'thank the Gods!' He introduces himself as julie the town Jeweller.\n ");
            System.out.println("'Quick! we must hurry, I am running from a great predator; a viscious girzzly bear with a taste for blood!\n\n you see I was part of a large group from the town, thirty strong, to kill this horrendous beast. \nWe found its cave and confronted it.");
            System.out.println("Everything happened so quickly, felt like two swipes of its claws was enough to throw ten men into the air. \nIt was a blood bath. I fear i be the only survivor.' ");
            System.out.println("\nThe man stops 'Do you hear that?..' he quivers. \nYou hear a low growl and sniffing coming from behind. \n you both run for cover behind some trees \nThe biggest and mostintimidating grizzly bear you have ever lets out a defining roars");

        }
        //plot
        System.out.println("\nWhat do you do?\n1. run for the hills\n2. pull out your dagger and slay the bear\n3. Use the trees as cover. \n\n(Enter '1', '2', or '3' to answer)\n");
        //answer
        ans = input.next();
        if (ans.equals("1"))  {
            System.out.println("The bear is unnaturally strong and fast. It catches up to you, swoops you up 40 foot into the air. \nYou land on your back winded and in agony, you cant move your legs and your arm is broken. \nThe bear swipes, degloving your other arm. \nIt then goes for your head and the last thing you here is the cracking of your skull.");
            Jeweller = false;
        }else if(ans.equals("2")){
            System.out.println("You run up towards the bear, slip on a mud puddle. ");
            if (Jeweller) {
                System.out.println("The Jeweller yells histerically 'GO FOR THE NECK' ");
                System.out.println("The Bear pounces on you slashing your arm");
                System.out.println("The Jeweller jumps onto the bears back punching it in the eyes, he pulls out his pocket knife and starts to stab the scruff of the bears neck");
                bearBeast = bearBeast - 50;
            }
            System.out.println("The Bear roars and swipes at you but misses, leaving a deep imprint on the ground.\nYou're still holding your knife and take the opportunity to plunge the knife deep into the Bears throat. ");
            if (Jeweller) {
                System.out.println("The Jeweller, still on the bear, continues to stab the bears head, but is shaken off");
            }
            if (bearBeast <= 50) {
                System.out.println("while the bear is distracted, you grab back onto your knife and pull it out of the bears neck, \nthe bear reacts to the knifes removal by snapping at your hand. \nThe bite made with such  an immense force that your hand comes clean off but with that same force, your knife pierces the roof of the mighty beasts mouth and the creature collapses ");
                bearBeast = 0;
            }
            if (bearBeast >50) {
                System.out.println("The bear pounces on you. Goes to bite your head, you instinctively put up your arm. \nLuckily the bears paw slips on the same puddle that you had, and it ends up biting into the ground. \nYou lunge at the bears face slashing its eye, the bear snaps at your hand, biting it clean off and yelps in a pained condusion before running off");
                bearBeast = 75;
            }
        }else if(ans.equals("3")){
            System.out.println("The Beast with an impressive feat of strength rips the trees Your hiding behind from the ground you have no where to go, no choice but to fight.");
            System.out.println("you pull out your knife and run towards the bear, barrel rolling to dodge its swiping. \nYou then jump onto its back and start stabbing it with all your might.\n The bear reaches around and pulls you off biting your hand off in the process. as you come down you manage to slash its face with the dagger, blinding the beast in the process");
            System.out.println("The beast yelps in pain, throws you against a tree and runs off.");
            bearBeast = 75;
        }
        if (!Jeweller) {
            System.out.println("The Man still screaming, starts to make some gargling noises, as he sees the bear has left, \nhe begins to quiten down, he looks over to you, wheezing and gargling. \n'You survived what 30 men couldn't but be warned; the beast still lives.' \nThe man stops breathing.");
        }
        if (Jeweller) {
            if (bearBeast <= 50) {
                System.out.println("I cannot believe that you have slaine this beast, you have accomplished what 30 men set out to do, all but one slaughtered. you must be compensated for your efforts");
            }
            System.out.println("Sir, what is your name, i must know it so i can tell this tale.");
            System.out.println("\n tell the Jeweller your name\n");
            name = input.nextLine();

            System.out.println("well " + name + ", dear Sir, I can not tell you how glad i am to meet you, you saved me!");
        }
        input.close();
    }
}