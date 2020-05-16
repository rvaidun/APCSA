//Rahul Vaidun
//Period 3
/*
Requirements:
30 Inputs
Words
Phrases
Numbers
Math Altered Numbers
*/
import java.io.FileNotFoundException;
import java.util.*;
public class madLibs {
    public static void main(String[] args) throws FileNotFoundException {
        String name, place, transportation, verb1,verb2,verb3, lengthTime, place2, adjective, adjective2;
        double money,distance;
        int possiblecombos;
        Scanner pen = new Scanner(System.in);
        //1
        System.out.println("Enter a name.");
        name = pen.nextLine();
        //2
        System.out.println("Enter a vacation destination:");
        place = pen.nextLine();
        //3
        System.out.println("Enter a number:");
        money = pen.nextDouble();
        pen.nextLine();
        //4
        System.out.println("Enter a type of transportation:");
        transportation = pen.nextLine();
        //5
        System.out.println("Enter an Integer:");
        distance = pen.nextDouble();
        pen.nextLine();
        //6
        System.out.println("Enter an -ing verb:");
        verb1 = pen.nextLine();
        //7
        System.out.println("Enter an -ing verb:");
        verb2 = pen.nextLine();
        //8
        System.out.println("Enter an -ing verb:");
        verb3 = pen.nextLine();
        //9
        System.out.println("Enter a length of time(ex. 4 years, 3 minutes):");
        lengthTime = pen.nextLine();
        //10
        System.out.println("Enter an adjective:");
        adjective2 = pen.nextLine();
        //11
        System.out.println("Enter another adjective:");
        adjective = pen.nextLine();

        //12
        System.out.println("Enter a number");
        possiblecombos = pen.nextInt();
        pen.nextLine();
        //13
        System.out.println("Enter a type of food:");
        String food = pen.nextLine();
        //14
        System.out.println("Enter a bodypart:");
        String bodypart = pen.nextLine();
        //15
        System.out.println("Enter a descriptive adjective:");
        String adjective3 = pen.nextLine();
        //16
        System.out.println("Enter an -ly adverb:");
        String adverb = pen.nextLine();
        //17
        System.out.println("Enter a emotion:");
        String emotion = pen.nextLine();
        //18
        System.out.println("Enter a drink:");
        String drink = pen.nextLine();
        //19
        System.out.println("Enter another -ly adverb:");
        String adverb2 = pen.nextLine();
        //20
        System.out.println("Enter an phrase:");
        String phrase = pen.nextLine();
        //21
        System.out.println("Enter a small object (Pencil pen etc.):");
        String obJect = pen.nextLine();
        //22
        System.out.println("Enter a descriptive adjective:");
        String adjective4 = pen.nextLine();
        //23
        System.out.println("Enter a color:");
        String color = pen.nextLine();
        //24
        System.out.println("Enter a -ly adverb:");
        String adverb3 = pen.nextLine();
        //25
        System.out.println("Enter another place:");
        place2 = pen.nextLine();
        //26
        System.out.println("Enter a past tense emotion:");
        String emotion2 = pen.nextLine();
        //27
        System.out.println("Enter a number:");
        int acrossTheWorld = pen.nextInt();
        pen.nextLine();
        //28
        System.out.println("Enter a different color:");
        String color2 = pen.nextLine();
        //29
        System.out.println("Enter a number:");
        int num = pen.nextInt();
        pen.nextLine();
        //30
        System.out.println("Enter an adjective ");
        String adjective5 = pen.nextLine();
        System.out.println("\tOver the summer " +name+" decided to vacation at " + place + " He spent " + money + " dollars on the very expensive " + transportation + " ticket. The distance to his destination was " + distance + " miles, so he payed about " + money/distance + " dollars per mile to reach his destination. In " + place + " he did many fun activities such as " + verb1 + ", " + verb2 +" and " + verb3 + ". ");
        System.out.println();
        System.out.println("\t" + name + " thought his vacation was boring as he was spending all his time at the hotel. He decided to go on a " + lengthTime + " long trip to the famous maze. At the maze he went on an " + adjective + " adventure to find his way through the " + adjective2 + " maze. At the start of the maze there were " + possiblecombos + " different paths for him to take.");
        System.out.println();
        System.out.println("\t He decided to go on the first path. After a while he found a plate of " + food + ". He could not resist taking a bite of the " + food + " and as soon as he bit into it his " + adjective3 + " " + bodypart + " " + adverb + " started shrinking. " + name + " was " + emotion + ". He could not believe what was happening to him. A few moments later he spotted a bottle of " + drink  + ". He decided to drink the " + drink + " and " + adverb2 + " his head grew back to the normal size. He exclaimed \"" + phrase + " I'm never eating weird food again! \"");
        System.out.println();
        System.out.println("\t He continued on his journey through the maze and found a magical " + obJect + ". The " + obJect + " was " + adjective4 + " and " + color + ". The moment " + name + " picked up the " + obJect + " he " + adverb3 + " teleported to " + place2 + ". He was " + emotion2 + " at what just happened. He had just been transported " + acrossTheWorld + " miles in less than a second. He luckily discovered a small " + color2 + " button on the " + obJect + "and pressed it. The moment he pressed the button he transported back to his hotel in less than " + num + " seconds. He suddenly woke up from his " + adjective5 + " dream and realized that his adventure was just a dream.");
        pen.close();
    }
}