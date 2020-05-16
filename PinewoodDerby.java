import java.util.Scanner;

public class PinewoodDerby {
    public static void main(String[] args) {
        Scanner pen = new Scanner(System.in);
        System.out.println("How many racers");
        int nheats = pen.nextInt();
        pen.nextLine();
        Heat heat[] = new Heat[nheats];
        Contestant cons[] = new Contestant[nheats];
        for (int i = 0; i < nheats; i++) {
            cons[i] = new Contestant(i+1);
        }
        for(int x = 0; x < nheats; x++) {
            System.out.println("Enter the heat name (1-2 characters) followed by the contestants");
            String d = pen.nextLine();
            String[] splited = d.split("\\s+");
            heat[x]= new Heat(splited[0]) ;
            for(int i = 1; i <= 5; i++) {
                int c = Integer.parseInt(splited[i]);

                heat[x].addContestant(cons[c-1],i-1);

            }
        }
        for(int x = 0; x < nheats; x++) {
            System.out.println("Enter the results in the same manner");
            String d = pen.nextLine();
            String[] splited = d.split("\\s+");
            for(int i = 1; i <=5; i++) {
                int r = Integer.parseInt(splited[i]);

                heat[x].updateResult(i-1,r);
            }
        }
        Contestant sortedCons[] = sort(cons);
        String pos[] = {"FIRST", "SECOND", "THIRD", "FOURTH", "FIFTH"};
        int c = 0;
        for(int i = 0; i < 5; i++) {
            System.out.print(pos[i] + " PLACE " + sortedCons[c].contestantID);
            int p = sortedCons[c].getPoints();
            while (sortedCons[c+1].getPoints() == p) {
                c++;
                System.out.print(" " + sortedCons[c].contestantID);
            }
            c++;
            System.out.println();
        }
        pen.close();
    }
    public static Contestant[] sort(Contestant[] arr) {

        for (int x = 0; x < arr.length; x++){
            for (int i = 1; i<arr.length; i++){
                if (arr[i].getPoints() < arr[i-1].getPoints()){
                    Contestant placeholder = arr[i-1];
                    arr[i-1] = arr[i];
                    arr[i] = placeholder;
                }
            }
        }

        return arr;
    }
}