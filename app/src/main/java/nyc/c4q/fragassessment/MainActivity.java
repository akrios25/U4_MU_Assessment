package nyc.c4q.fragassessment;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        JSONObject jsonObject = new JSONObject();
        try {
            jsonObject.put("books", new JSONArray()
                    .put( new JSONObject()
                    .put("title", "Northanger Abbey")
                    .put("author", "Jane Austen")
                    .put("publishingYear", 1814))
                    .put(new JSONObject()
                    .put("title", "War and Peace")
                    .put("author", "Leo Tolstoy")
                    .put("publishingYear", 1865))
                    .put(new JSONObject()
                    .put("title", "Anna Karenina")
                    .put("author", "Leo Tolstoy")
                    .put("publishingYear", 1875))
                    .put(new JSONObject()
                    .put("title", "Mrs. Dalloway")
                    .put("author", "Virginia Woolf")
                    .put("publishingYear", 1925))
                    .put(new JSONObject()
                    .put("title", "The Hours")
                    .put("author", "Michael Cunningham")
                    .put("publishingYear", 1999))
                    .put(new JSONObject()
                    .put("title", "Huckleberry Finn")
                    .put("author", "Mark Twain")
                    .put("publishingYear", 1865))
                    .put(new JSONObject()
                    .put("title", "Bleak House")
                    .put("author", "Charles Dickens")
                    .put("publishingYear", 1870))
                    .put(new JSONObject()
                    .put("title", "Tom Sawyer")
                    .put("author", "Mark Twain")
                    .put("publishingYear", 1862)));

        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
