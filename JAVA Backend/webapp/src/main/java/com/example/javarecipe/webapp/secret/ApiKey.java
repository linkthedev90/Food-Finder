package secret;

import io.github.cdimascio.dotenv.Dotenv;

import java.util.HashMap;

public class ApiKey {

    public static String getKey(String key) {
        Dotenv dotenv = null;
        dotenv = Dotenv.configure().load();

        //System.out.println(dotenv.get("KEY"));
        //return apiKey.get(key);
        return dotenv.get("KEY");
    }
}
