public class Main {
    public static void main(String[] args) {
        //TODO 1: Declare and initialize variable for First Name
        String firstname="Sandy";
        //TODO 1: Declare and initialize variable for Last Name
        String lastname="Jones";
        //TODO 1: Declare and initialize variable for Movie Title
        String movieTitle="The Source Code";
        //TODO 1: Declare and initialize variable for Number of tickets
        int Numberoftickets=8;
        //TODO 1: Declare and initialize variable for Price per ticket
        double Priceperticket=10.57;
        //TODO 2: Calculate the total price based on number of tickets and price per ticket. Print the output of the total price
        double Totalpriceofticket=Numberoftickets*Priceperticket;
        //TODO 3: Concatenate first name and last name into new variable username with no space in between
        String Username=firstname.toLowerCase()+lastname.toLowerCase();
//        // first and last name and convert them to lower case
        System.out.println("Congratulations!! You have successfully booked the tickets");
        System.out.println("     ");
        System.out.println("Username:"+ Username);
        String movieName=movieTitle.toUpperCase();
        System.out.println("Movie:"+ movieName);
        System.out.println("Number of Tickets:"+ Numberoftickets);
        System.out.println("Price per ticket in USD:"+ Priceperticket);
        System.out.println("Total Price of 8 tickets:"+ Totalpriceofticket);
        System.out.println("     ");
        System.out.println("Thank you for choosing us for booking your movie tickets\n" +
                "Enjoy your movie!!!");

    }
}
