class task7{
    public static void main(String[] args) throws Exception {
        System.out.println("Enter the radius of the cylinder:");
       
        int radius = System.in.read() - '0';  
        System.in.read(); 
        
        System.out.println("Enter the height of the cylinder:");
        
        int height = System.in.read() - '0';  
        System.in.read();
     
        double pi = 3.1416;  

        double volume = pi * radius * radius * height;

        System.out.println("The volume of the cylinder is: " + volume);
    }
}
