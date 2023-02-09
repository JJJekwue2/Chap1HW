public class Cycle {
    public static void main(String[] args) {
        short bicycles = 10;
        short totalWheels = 47;
        short triWheels = (short) (totalWheels-(bicycles * 2));
        short tricycles = (short) (triWheels / 3);
        System.out.println("The shop has" + tricycles + "tricycles");
    }
}
