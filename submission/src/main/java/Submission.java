import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;


public class Submission {


    private static final String DELIMITER = "-";
    private static final String FORWARD_SLASH = "/";
    private static final String JAVA_SRC_DIR = "/src/main/java/";
    private static final String SOLUTION_FILE_NAME = "Solution.java";

    public static void main(String[] args) throws IOException, JSONException {



//        String code = "import java.util.*;\nimport java.io.*;\n\n\n\nclass Solution" +
//                "{\n    public static void main(String []argh)\n    {\n\n\n\n        " +
//                "Scanner sc = new Scanner(System.in);\n        int t=sc.nextInt();\n\n" +
//                "        for(int i=0;i<t;i++)\n        {\n\n            try\n            " +
//                "{\n                long x=sc.nextLong();\n                " +
//                "System.out.println(x+\" can be fitted in:\");\n                " +
//                "if(x>=-128 && x<=127) {\n                    System.out.println(\"* byte\");\n" +
//                "                }\n                if((x >= -32768) && (x < 32768)) {\n" +
//                "                    System.out.println(\"* short\");\n                }\n" +
//                "                if((x >= -2147483648) && (x <= 2147483647)) {\n" +
//                "                    System.out.println(\"* int\");\n                }\n" +
//                "                System.out.println(\"* long\");\n            }\n            " +
//                "catch(Exception e)\n            {\n                System.out.println(sc.next()" +
//                "+\" can't be fitted anywhere.\");\n            }\n\n        }\n    }\n}\n\n\n\n\n";



        /*Scanner scanner = new Scanner(System.in);
        String domain = scanner.next();
        String slug = scanner.next();/**/

        String domain = "java";
        String slug = "java-datatypes";/**/

        String refinedSlug = trimSlug(slug);
        String moduleName = domain + DELIMITER + refinedSlug;

        String fileName = System.getProperty("user.dir") + FORWARD_SLASH + moduleName + JAVA_SRC_DIR + SOLUTION_FILE_NAME;

        String code = new String(Files.readAllBytes(Paths.get(fileName)), StandardCharsets.UTF_8);
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("code", code);
        jsonObject.put("language", "java8");
        jsonObject.put("contest_slug", "master");
        jsonObject.put("playlist_slug", "");

//        System.out.println(jsonObject.toString());

        submitSolution(slug, jsonObject);

    }

    private static void submitSolution(String slug, JSONObject jsonObject) throws IOException {
        OkHttpClient client = new OkHttpClient().newBuilder()
                .build();
        MediaType mediaType = MediaType.parse("application/json,application/json");
        RequestBody body = RequestBody.create(mediaType, jsonObject.toString());
        Request request = new Request.Builder()
                .url("https://www.hackerrank.com/rest/contests/master/challenges/" + slug + "/submissions")
                .method("POST", body)
                .addHeader("Content-Type", "application/json")
                .addHeader("Authorization", "Basic c2FpbnQxNzI5OjIwMzA3MDQ4")
                .addHeader("Content-Type", "application/json")
                .addHeader("Cookie", "hackerrank_mixpanel_token=a4e6cfb0-6a47-0130-8a0d-22000a9f17ef")
                .build();
        Response response = client.newCall(request).execute();

        System.out.println(response.isSuccessful());
    }

    private static String trimSlug(String slug) {
        String[] tokens = slug.split(DELIMITER);
        String output = "";

        for (String token : tokens) {
            output += token;
        }

        return output;
    }

}
