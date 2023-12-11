public class Q12_CustomizeMessage {
    /**
     * Matching name, full name, number and date with appropriate values in the message using regex.
     * @param message
     */
    public static void customizeMessage(String message){
        message = message.replaceAll("<<[a-z]*>>","Akshita");
        message = message.replaceAll("<<[a-z]* [a-z]*>>","Akshita Sah");
        message = message.replaceAll("91[-][x]{10}","91-9999999999");
        message = message.replaceAll("[0-9]{2}/[0-9]{2}/[0-9]{4}","12/11/2023");
        System.out.println(message);
    }

    public static void main(String[] args)
    {
        String message = "Read in the following message: Hello <<name>>, We have your full" +
                "name as <<full name>> in our system. your contact number is 91-xxxxxxxxxx." +
                "Please,let us know in case of any clarification Thank you BridgeLabz 01/01/2016.";
        customizeMessage(message);
    }
}
