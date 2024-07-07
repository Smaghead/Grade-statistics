import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PointCalculator pointCalc = new PointCalculator();
        UI ui = new UI(scanner, pointCalc);
        
        ui.start();
        //part4 inProgress
        
        
    }
}
