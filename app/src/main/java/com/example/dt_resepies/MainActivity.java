package com.example.dt_resepies;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    String file_name = "recipe.json";
    ListView listView;
    ArrayList<String> arrayList = new ArrayList<>();
    JSONArray jsonArray;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void viewRecipes(View view){
        setContentView(R.layout.recipe_list);
        listView = findViewById(R.id.recipes_list);

        try {
            jsonArray = (JSONArray) new JSONParser().parse(new Save_json().getAssetsfile(file_name,this));
        }
        catch (Exception e)
        {
        e.printStackTrace();
        }

        for (Object object: jsonArray)
        {
            JSONObject jsonObject = (JSONObject) object;
            String name = (String) jsonObject.get("name");
            arrayList.add(name);
            ArrayAdapter<String> adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1, arrayList);
            listView.setAdapter(adapter);
        }
    }
}