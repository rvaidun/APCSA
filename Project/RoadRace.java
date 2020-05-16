package Project;
import java.util.ArrayList;
import java.util.Scanner;

public class RoadRace {
    public static ArrayList<Racer> bubbleSort(ArrayList<Racer> arr) {

        for (int x = 0; x < arr.size(); x++){
            for (int i = 1; i<arr.size(); i++){
                if (arr.get(i).getFinishingTime() < arr.get(i-1).getFinishingTime()){
                    Racer placeholder = arr.get(i-1);
                    arr.set(i-1,arr.get(i));
                    arr.set(i,placeholder);
                }
            }
        }
        return arr;
    }
    public static void FindRacer(ArrayList<Racer> racelist, String sex, int place){
        for(int x = 2; x < racelist.size(); x++){
            if (racelist.get(x).getSex().equals(sex)){
                if (place == 1){
                    System.out.println(racelist.get(x).getFinishingTime());
                    return;
                }
                place--;
            }
        }
        System.out.println("No more " + sex);
    }

    public static void main(String[] args) {
        Scanner pen = new Scanner(System.in);
        System.out.println("How many racers");
        int totalRacers = pen.nextInt();
        pen.nextLine();
        ArrayList<Racer> racerList = new ArrayList<Racer>();
        for(int x = 0; x < totalRacers; x++){
            System.out.println("Racer #" + (x+1));
            System.out.println("Enter data as 'time sex' for example '48 F' ");
            int finishTime = pen.nextInt();
            String sex = pen.nextLine();
            sex = sex.replaceAll("\\s","");
            sex = sex.toUpperCase();
            Racer racer = new Racer(sex,finishTime);
            racerList.add(racer);
        }
        racerList = bubbleSort(racerList);

        System.out.println(racerList.get(0).getFinishingTime());
        FindRacer(racerList,"F",1);
        FindRacer(racerList,"M",1);
        FindRacer(racerList,"M",2);
        pen.close();
    }
}
