package Project;

public class Racer {
    private String sex;
    private int finishingTime;

    @Override
    public String toString() {
        return "Racer{" +
                "sex='" + sex + '\'' +
                ", finishingTime=" + finishingTime +
                '}';
    }

    public Racer(String sex, int finishingTime) {
        this.sex = sex;
        this.finishingTime = finishingTime;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getFinishingTime() {
        return finishingTime;
    }

    public void setFinishingTime(int finishingTime) {
        this.finishingTime = finishingTime;
    }
}
