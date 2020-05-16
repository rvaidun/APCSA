//Rahul Vaidun
//Period 3
package Project;

public class Student {
    String math;
    String english;
    String pe;
    String history;
    String science;
    String band;

    public String getMath() {
        return math;
    }

    public String getEnglish() {
        return english;
    }

    public String getPe() {
        return pe;
    }

    public String getHistory() {
        return history;
    }

    public String getScience() {
        return science;
    }

    public String getBand() {
        return band;
    }

    public void setMath(String math) {
        this.math = math;
    }

    public void setEnglish(String english) {
        this.english = english;
    }

    public void setPe(String pe) {
        this.pe = pe;
    }

    public void setHistory(String history) {
        this.history = history;
    }

    public void setScience(String science) {
        this.science = science;
    }

    public void setBand(String band) {
        this.band = band;
    }
    private double Score(String grade){
        int a = "E".compareTo(this.math);
        if (a < 0) {
            a = 0;
        }
        return a;

    }
    public double GPA(){
        double a = Score(this.math) + Score(this.band) + Score(this.english) + Score(this.history) + Score(this.pe) + Score(this.science);
        System.out.println();
        return a/6;

    }

    public Student (String a, String b, String c, String d, String e, String f){
        math = a;
        english = b;
        pe = c;
        history = d;
        science = e;
        band = f;


    }

}
