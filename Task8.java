class task8{
    public static void main(String[] args) throws Exception {
        System.out.println("Enter speed in miles per hour:");

        int mph = System.in.read() - '0';  
        System.in.read();

        double conversionFactor = 1.60934;

        double kmh = mph * conversionFactor;

        System.out.println("Speed in kilometers per hour: " + kmh);
    }
}
