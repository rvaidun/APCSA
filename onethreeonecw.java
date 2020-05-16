public class onethreeonecw {
    public static void hexadecimal(int x) {
        if(x==0) {
        }
        else {
            if(x%16==10) {
                System.out.print("A");
            }
            else if(x%16==11) {
                System.out.print("B");
            }
            else if(x%16==12) {
                System.out.print("C");
            }
            else if(x%16==13) {
                System.out.print("D");
            }
            else if(x%16==14) {
                System.out.print("E");
            }
            else if(x%16==15) {
                System.out.print("F");
            }
            else {
                System.out.print(x%16);
            }
            hexadecimal(x/16);
        }
    }
    public static void printnum(int x) {
        if(x==0)
            System.out.print("");
        else {
            printnum(x-1);
            System.out.print(x+ " ");
        }
    }
    public static int fibonaccirecursion(int x){
        if (x == 1)
            return 0;
        else if (x == 2)
            return 1;
        else
            return (fibonaccirecursion(x-2) + fibonaccirecursion(x-1));
    }
    public static int fibonacciloop(int x) // index
    {
        int a = 0;
        int b = 1;
        int REEE;
        if (x == 0)
            return 0;

        for (int i = 2; i < x; i++)
        {
            REEE = a + b;
            a= b;
            b = REEE;
        }

        return b;

    }
}
