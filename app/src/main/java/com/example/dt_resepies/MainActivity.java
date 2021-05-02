package com.example.dt_resepies;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import org.json.JSONArray;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    JSONArray jsonArray;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void viewRecipes(View view){
        setContentView(R.layout.recipe_list);
        listView = findViewById(R.id.recipes_list);
        jsonArray = (jsonArray) ;// дописать парсер написать тестовый json
    }
}