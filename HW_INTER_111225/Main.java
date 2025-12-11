public class Main {
    public static void main(String[] args) {
        Logger simpleLog = new SimpleLogger();
        Logger smartLog = new SmartLogger();
        simpleLog.log("Start");
        System.out.println();
        smartLog.log("No problem here");
        smartLog.log("There's an Error");
        smartLog.log("Fixed");
    }
}
