class task6 {
    public static void main(String[] args) throws Exception {
        System.out.println("Enter the value in Dollars:");

        double dollars = 0;
        int input;
        String number = "";


        while ((input = System.in.read()) != '\n') {
            number += (char) input;
        }

        dollars = Double.parseDouble(number.trim());

        double exchangeRate = 280.71; 
        double rupees = dollars * exchangeRate;

        System.out.println("Value in Rupees: " + rupees);
    }
}
