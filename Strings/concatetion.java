package Strings;
public class concatetion {
    public static void main(String[] args) {
        // String FirstName ="tony";
        // String lastName = "kakkad";
        // String fullName = FirstName +" "+ lastName;
        // System.out.println(fullName.length());

        //length
        String FirstName ="tony";
        String lastName = "kakkad";
        String fullName = FirstName +" "+ lastName;
        System.out.println(fullName.length());
        //CharAt
        for(int i=0; i<fullName.length(); i++){
            System.out.println(fullName.charAt(i));
        }
    }
}

