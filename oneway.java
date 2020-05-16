public class oneway {
    public static int fact(int x) {
        if(x==1) {
            return 1;
        }
        else {
            return(x*fact(x-1));
        }
    }
    public static int divide(int x, int y) {
        if(x==0)
            return 0;
        else
            return 1 +divide(x-y,y);
    }

    public static void binary(int x) {
        if(x==0) {
        }
        else {
            System.out.print(x%2);
            binary(x/2);
        }
    }
}
