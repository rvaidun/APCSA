//Rahul Vaidun
//Period 3
package APStatFrau;

import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        Scanner pen = new Scanner(System.in);
        System.out.println("Enter 10 numbers");
        double num1 = pen.nextDouble();
        double num2 = pen.nextDouble();
        double num3 = pen.nextDouble();
        double num4 = pen.nextDouble();
        double num5 = pen.nextDouble();
        double num6 = pen.nextDouble();
        double num7 = pen.nextDouble();
        double num8 = pen.nextDouble();
        double num9 = pen.nextDouble();
        double num10 = pen.nextDouble();
        for (int x = 0; x < 10; x++){
            for(int n = 0; n < 10; n++){
                if (num1 > num2){
                    num1 = num1 + num2;
                    num2 = num1 - num2;
                    num1 = num1 - num2;
                }
                if (num2 > num3){
                    num2 = num2 + num3;
                    num3 = num2 - num3;
                    num2 = num2 - num3;
                }
                if (num3 > num4){
                    num3 = num3 + num4;
                    num4 = num3 - num4;
                    num3 = num3 - num4;
                }
                if (num4 > num5){
                    num4 = num4 + num5;
                    num5 = num4 - num5;
                    num4 = num4 - num5;
                }
                if (num5 > num6){
                    num5 = num5 + num6;
                    num6 = num5 - num6;
                    num5 = num5 - num6;
                }
                if (num6 > num7){
                    num6 = num6 + num7;
                    num7 = num6 - num7;
                    num6 = num6 - num7;
                }
                if (num7 > num8){
                    num7 = num7 + num8;
                    num8 = num7 - num8;
                    num7 = num7 - num8;
                }
                if (num8 > num9){
                    num8 = num8 + num9;
                    num9 = num8 - num9;
                    num8 = num8 - num9;
                }
                if (num9 > num10){
                    num9 = num9 + num10;
                    num10 = num9 - num10;
                    num9 = num9 - num10;
                }
            }
        }
        double a = mean(num1,num2,num3,num4,num5,num6,num7,num8,num9,num10);
        double b = median(num5,num6);
        double c = mode(num1,num2,num3,num4,num5,num6,num7,num8,num9,num10);
        System.out.println("The mean is " + a);
        System.out.println("The median is " + b);
        if (c < num1){
            System.out.println("No Mode");
        } else{
            System.out.println("The mode is " + c);
        }


        //mode

//        System.out.println(num1);
//        System.out.println(num2);
//        System.out.println(num3);
//        System.out.println(num4);
//        System.out.println(num5);
//        System.out.println(num6);
//        System.out.println(num7);
//        System.out.println(num8);
//        System.out.println(num9);
//        System.out.println(num10);
    }
    public static double mean(double num1, double num2, double num3, double num4, double num5, double num6, double num7, double num8, double num9, double num10){
        double d = (num1+num2+num3+num4+num5+num6+num7+num8+num9+num10)/10;
        return d;
    }
    public static double median(double num5, double num6){
        double d = (num5 + num6)/2;
        return d;
    }
    public static double mode(double num1, double num2, double num3, double num4, double num5, double num6, double num7, double num8, double num9, double num10){
        double mode = -1;
        int maxFrequency = 1;
        int frequency = 1;
        int invalidFrequency = 0;

        if (num1 == num2){
            frequency++;
            mode = num2;
        }

        if (num2 == num3){
            frequency++;

        } else{
            if(maxFrequency == frequency){
                invalidFrequency = frequency;
            } else if(maxFrequency < frequency){
                maxFrequency = frequency;
            }
            frequency = 1;
        }
        if (num3 == num4){
            frequency++;
        } else{
            if(maxFrequency == frequency){
                invalidFrequency = frequency;
            } else if(maxFrequency < frequency){
                maxFrequency = frequency;
                mode = num3;
            }
            frequency = 1;
        }
        if (num4 == num5){
            frequency++;
        } else{
            if(maxFrequency == frequency){
                invalidFrequency = frequency;
            } else if(maxFrequency < frequency){
                maxFrequency = frequency;
                mode = num4;
            }
            frequency = 1;
        }
        if (num5 == num6){
            frequency++;
            mode = num6;
        } else{
            if(maxFrequency == frequency){
                invalidFrequency = frequency;
            } else if(maxFrequency < frequency){
                maxFrequency = frequency;
                mode = num5;
            }
            frequency = 1;
        }
        if (num6 == num7){
            frequency++;

        } else{
            if(maxFrequency == frequency){
                invalidFrequency = frequency;
            } else if(maxFrequency < frequency){
                maxFrequency = frequency;
                mode = num6;
            }
            frequency = 1;
        }
        if (num7 == num8){
            frequency++;

        } else{
            if(maxFrequency == frequency){
                invalidFrequency = frequency;
            } else if(maxFrequency < frequency){
                maxFrequency = frequency;
                mode = num7;
            }
            frequency = 1;
        }
        if (num8 == num9){
            frequency++;

        } else{
            if(maxFrequency == frequency){
                invalidFrequency = frequency;
            } else if(maxFrequency < frequency){
                maxFrequency = frequency;
                mode = num8;
            }
            frequency = 1;
        }
        if (num9 == num10){
            frequency++;

        } else{
            if(maxFrequency == frequency){
                invalidFrequency = frequency;
            } else if(maxFrequency < frequency){
                maxFrequency = frequency;
                mode = num9;
            }
            frequency = 1;
        }
        if (invalidFrequency == maxFrequency){
            return num1-1;
        }
        else{
            return mode;
        }
    }
}