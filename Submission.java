import java.util.*;
import java.io.*;

class Submission {
    public static void main(String[] argh) {
        Scanner sc = new Scanner(System.in);
        OkHttpClient client = new OkHttpClient().newBuilder()
                .build();
        MediaType mediaType = MediaType.parse("application/json");
        RequestBody body = RequestBody.create(mediaType, "{\n    \"code\": \"import java.util.*;\\nimport java.io.*;\\n\\n\\n\\nclass Solution{\\n    public static void main(String []argh)\\n    {\\n\\n\\n\\n        Scanner sc = new Scanner(System.in);\\n        int t=sc.nextInt();\\n\\n        for(int i=0;i<t;i++)\\n        {\\n\\n            try\\n            {\\n                long x=sc.nextLong();\\n                System.out.println(x+\\\" can be fitted in:\\\");\\n                if(x>=-128 && x<=127) {\\n                    System.out.println(\\\"* byte\\\");\\n                }\\n                if((x >= -32768) && (x < 32768)) {\\n                    System.out.println(\\\"* short\\\");\\n                }\\n                if((x >= -2147483648) && (x <= 2147483647)) {\\n                    System.out.println(\\\"* int\\\");\\n                }\\n                System.out.println(\\\"* long\\\");\\n            }\\n            catch(Exception e)\\n            {\\n                System.out.println(sc.next()+\\\" can't be fitted anywhere.\\\");\\n            }\\n\\n        }\\n    }\\n}\\n\\n\\n\\n\\n\",\n    \"language\": \"java8\",\n    \"contest_slug\": \"master\",\n    \"playlist_slug\": \"\"\n}");
        Request request = new Request.Builder()
                .url("https://www.hackerrank.com/rest/contests/master/challenges/java-datatypes/submissions")
                .method("POST", body)
                .addHeader("Content-Type", "application/json")
                .build();
        Response response = client.newCall(request).execute();
    }
}
