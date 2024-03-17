import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class HashMappractice1 {
    public static void main(String[] args) {
        HashMap<String, String> accountManagement = new HashMap<>();
        accountManagement.put("John Wick", "johnWick@mail.com");
        accountManagement.put("John Wick", "joeWick@mail.com");
        accountManagement.put("Adam Smith", "adamSmith@mail.com");
        accountManagement.put("Edgar Poe", null);

        HashMap<String, ArrayList<String>> library = new HashMap<>();
        library.put("Sci Fi", new ArrayList<>(Arrays.asList("Lord of the rings", "Harry Potter")));
        library.get("Sci Fi").add("Star Wars");
        System.out.println(library);

        HashMap<String, HashMap<String, String>> passwordManagementSystem = new HashMap<>();
        passwordManagementSystem.put("www.netflix.com", addLoginCredentials("JohnWick@mail.com", "password"));
        passwordManagementSystem.put("www.amazon.com", addLoginCredentials("John_Wick@mail.com", "password2"));



    }

    /*
    - login id -- 2
    - password -- 3
    - URL/website info -- comes first 1
     */

    public static HashMap<String, String> addLoginCredentials(String loginId, String password) {
        HashMap<String, String> credantials = new HashMap<>();
        credantials.put(loginId, password);
        return credantials;


    }


}
