//public class MisAndC {
//    int rm, rc, lm, lc, status, flag, select;
//
//    public MisAndC() {
//        rm = rc = 3;
//        lm = lc = 0;
//        status = flag = select = 0;
//
//    }
//
//    public int succesorMethods() {
//        if (lc == 3 && lm == 3) {
//            return 0;
//        } else {
//            return 1;
//        }
//    }
//
//    public void display(char x, char y) {
//        System.out.println();
//        for (int i = 0; i < lm; i++) {
//            System.out.print(" M");
//        }
//        for (int i = 0; i < lc; i++) {
//            System.out.print(" C");
//        }
//        if (flag == 0) {
//            System.out.print("___W" + "___B(" + x + "," + y + ")");
//        } else {
//            System.out.print("B(" + x + "," + y + "___W___");
//        }
//        for (int i = 0; i < rm; i++) {
//            System.out.print(" M");
//        }
//        for (int i = 0; i < rc; i++) {
//            System.out.print(" C");
//        }
//    }
//
//    public void solution() {
//        if (succesorMethods() == 1) {
//            if (flag == 0) {
//                switch (select) {
//                    case 1:
//                        display('C', ' ');
//                        rc++;
//                        break;
//                    case 2:
//                        display('C', 'M');
//                        rc++;
//                        rm++;
//                        break;
//                }
//                if (((rm - 2) >= rc && (lm + 2) >= lc) || (rm - 2) == 0) {
//                    rm = rm - 2;
//                    select = 1;
//                    display('M', 'M');
//                    flag = 1;
//                } else if ((rc - 2) < rm && (lm == 0 || (lc + 2) <= lm) || rm == 0) {
//                    rc = rc - 2;
//                    select = 2;
//                    display('C', 'C');
//                    flag = 1;
//
//                } else if ((rc--) <= (rm--) && (lm++) >= (lc++)) {
//                    rc = rc - 1;
//                    rm = rm - 1;
//                    select = 3;
//                    display('M', 'C');
//                    flag = 1;
//                }
//            }
//        } else {
//            switch (select) {
//                case 1:
//                    display('M', 'M');
//                    lm = lm + 2;
//                    break;
//                case 2:
//                    display('C', 'C');
//                    lc = lc + 2;
//                    break;
//                case 3:
//                    display('M', 'C');
//                    lc = lc + 1;
//                    lm = lm + 1;
//                    break;
//            }
//            if (succesorMethods() == 1) {
//                if (((lc > 1 && lm == 0) || rm == 0)) {
//                    lc--;
//                    select = 1;
//                    display('C', ' ');
//                    flag = 0;
//
//                } else if ((rc + 2) > rm) {
//                    lc--;
//                    lm--;
//                    select = 2;
//                    display('C', 'M');
//                    flag = 0;
//                }
//            }
//        }
//        solution();
//    }
//
//    public static void main(String[] args) {
//        MisAndC can = new MisAndC();
//        can.display(' ',' ');
//        can.solution();
//        can.display(' ',' ');
//        System.out.println();
//    }
//}