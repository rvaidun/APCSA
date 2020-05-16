public class missandcan {

    public static void display(char x, char y, int rm, int rc, int lm, int lc, int flag) {
        System.out.println();
        for (int i = 0; i < lm; i++) {
            System.out.print(" M");
        }
        for (int i = 0; i < lc; i++) {
            System.out.print(" C ");
        }
        if (flag == 0) {
            System.out.print("__________W" + "___________B(" + x + "," + y + ")");
        } else {
            System.out.print("B(" + x + "," + y + ")________W__________");
        }
        for (int i = 0; i < rm; i++) {
            System.out.print(" M");
        }
        for (int i = 0; i < rc; i++) {
            System.out.print(" C");
        }
    }
    public static void main(String[] args) {
        display(' ',' ',3,3,0,0,0);
        display('C','C',3,1,0,0,0);
        display('C','C',3,1,0,0,1);
        display('C',' ',3,1,0,1,1);
        display('C',' ',3,1,0,1,0);
        display('C','C',3,0,0,1,0);
        display('C','C',3,0,0,1,1);
        display('C',' ',3,0,0,2,1);
        display('C',' ',3,0,0,2,0);
        display('M','M',1,1,0,2,0);
        display('M','M',1,1,0,2,1);
        display('C','M',1,1,1,1,1);
        display('C','M',1,1,1,1,0);
        display('M','M',0,2,1,1,0);
        display('M','M',0,2,1,1,1);
        display('C',' ',0,2,3,0,1);
        display('C',' ',0,2,3,0,0);
        display('C','C',0,1,3,0,0);
        display('C','C',0,1,3,0,1);
        display('C',' ',0,1,3,1,1);
        display('C',' ',0,1,3,1,0);
        display('C','C',0,0,3,1,0);
        display('C','C',0,0,3,1,1);
        display(' ',' ',0,0,3,3,1);


    }
}