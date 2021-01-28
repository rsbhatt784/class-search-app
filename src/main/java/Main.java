//import kong.unirest.HttpResponse;
//import kong.unirest.JsonNode;
//import kong.unirest.Unirest;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("JHU - WSE - CS Dpt.");
        System.out.println("Spring 2021");
        System.out.println("Class Search");
        System.out.println("Enter your search query");
        String query = input.nextLine();

        search(query);
    }

    private static void search(String query) {
        final String BASE_URL = "https://sis.jhu.edu/api/classes";
        final String KEY = "YOUR_KEY_GOES_HERE";

        String endpoint = BASE_URL + "/codes/schools?Key=" + KEY;
        HttpResponse<JsonNode> jsonResponse = Unirest.get(endpoint).asJson();
        System.out.println(jsonResponse.getBody().toString());
        //System.out.println("Search not implemented yet!");
    }
}
