package inClass;

import java.util.ArrayList;

public class ArraylistOfArraysOfKimberly {
    String name;
    double GPA;

    public ArraylistOfArraysOfKimberly(String name, double GPA) {
        this.name = name;
        this.GPA = GPA;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    @Override
    public String toString() {
        return name;
    }

    public static void main(String[] args) {
        ArrayList<ArraylistOfArraysOfKimberly[]> arr = new ArrayList<ArraylistOfArraysOfKimberly[]>();
        ArraylistOfArraysOfKimberly[] y = new ArraylistOfArraysOfKimberly[30];
        ArraylistOfArraysOfKimberly Kimberly = new ArraylistOfArraysOfKimberly("Kimberly", 4.0);
        y[0] = Kimberly;
        arr.add(y);
        System.out.println(arr.get(0)[0]);



    }
}
