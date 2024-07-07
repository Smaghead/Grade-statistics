import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kelem
 */
public class PointCalculator {
    ArrayList<Integer> points;
    
    public PointCalculator() {
        this.points = new ArrayList();
    }
    
    public void add(int toAdd) {
        points.add(toAdd);
    }
    
    public double sum() {
        double sum = 0.00;
        for(Integer asd: points) {
            sum += asd;
        }
        return sum;
    }
    
    public double average() {
        return this.sum() / points.size();
    }
    
    public double passingGradeAverage() {
        double passingCount = 0.00;
        double passingSum = 0.00;
        for (int i = 0; i < points.size(); i++) {
            if (points.get(i) >= 50) {
                passingCount++;
                passingSum += points.get(i);
            }
        }
        if (passingCount >= 1) {
            return passingSum / passingCount;
        } else {
            return -1;
        }
    }
    
    public double passPercent() {
        double passingCount = 0;
        for (int i = 0; i < points.size(); i++) {
            if (points.get(i) >= 50) {
                passingCount++;
            }
        }
        return 100 * passingCount / points.size();
    }
    // won't work redo!!
    public void gradeDistribution() {
        int grade0 = 0;
        int grade1 = 0;
        int grade2 = 0;
        int grade3 = 0;
        int grade4 = 0;
        int grade5 = 0;
        for(Integer asd: points){
            if(asd >= 90){
                grade5++;
            } else if (asd < 90 && asd >= 80) {
                grade4++;
            } else if (asd < 80 && asd >= 70) {
                grade3++;
            } else if (asd < 70 && asd >= 60) {
                grade2++;
            } else if (asd < 60 && asd >= 50) {
                grade1++;
            } else {
                grade0++;
            }
        }
        System.out.print("5: ");
        for(int i = 0; i < grade5; i++) {
            System.out.print("*");
        }
        System.out.println("");
        System.out.print("4: ");
        for(int i = 0; i < grade4; i++) {
            System.out.print("*");
        }
        System.out.println("");
        System.out.print("3: ");
        for(int i = 0; i < grade3; i++) {
            System.out.print("*");
        }
        System.out.println("");
        System.out.print("2: ");
        for(int i = 0; i < grade2; i++) {
            System.out.print("*");
        }
        System.out.println("");
        System.out.print("1: ");
        for(int i = 0; i < grade1; i++) {
            System.out.print("*");
        }
        System.out.println("");
        System.out.print("0: ");
        for(int i = 0; i < grade0; i++) {
            System.out.print("*");
        }
    }
        
    public String pointAverage() {
        return "Point average (all): " + this.average();
    }
    
    public String passingAverage() {
        if (this.passingGradeAverage() == -1) {
            return "Point average (passing): -";
        }
        return "Point average (passing): " + this.passingGradeAverage();        
    }
    
    public String passingPercentage() {
        return "Pass percentage: " + this.passPercent();
    }
}
