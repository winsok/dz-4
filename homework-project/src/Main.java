public class Main {
    public static void main(String[] args) {

        Car toyota = new Car();
        String initialString = toyota.printCost();
        String newString = initialString.replace("---","" );
        System.out.println("~~~"+ newString + "\"~~~");
    }
}