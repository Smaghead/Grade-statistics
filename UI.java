public class UI {
    private Scanner scanner;
    private PointCalculator pointCalc;
    
    public UI(Scanner scanner, PointCalculator pointCalc) {
        this.scanner = new Scanner(System.in);
        this.pointCalc = new PointCalculator();
    }
    
    public void start() {
        System.out.println("Enter point totals, -1 stops:");
        //TODO do it with do-while
        while (true) {
            int input = scanner.nextInt();
            if (input == -1) {
                break;
            } else if (input <= 100 && input >= 0) {
                pointCalc.add(input);
            } 
        }
        System.out.println(pointCalc.pointAverage());
        System.out.println(pointCalc.passingAverage());
        System.out.println(pointCalc.passingPercentage());
        this.pointCalc.gradeDistribution();
    }
    
}
