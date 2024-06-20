public class Switchstatments {
    public static void main(String[] args) {
        String role = "Admin";

        switch (role) {
            case "Admin":
// break tells java to stop evecute the first line than the next
                System.out.println("you are an Admin");
                break;
            case " moderator":
                System.out.println("you are a moderator");
                break;

            default:
                System.out.println(" you are a guest");
        }
        if (role == "Admin") ;
        System.out.println("you are an Admin");
         if (role == "moderator")
            System.out.println("you are a moderator");
        else
            System.out.println(" you are a guest");
    }
}