package uk.co.tommywebdesign.feedme.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;

import uk.co.tommywebdesign.feedme.R;

public class CoordActivity extends AppCompatActivity {private String LOG_TAG = "TOMMY/DEBUG";


    ImageButton gotoIngredientsBtn;
    ImageButton gotoRecipeBtn;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.coord_layout);
        initatieInterfaceObjects();
        setListeners();

    }



    private void setListeners(){

        gotoIngredientsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadActivity(v);
            }
        });

        gotoRecipeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadActivity(v);
            }
        });

    }




    private  void initatieInterfaceObjects(){
        gotoIngredientsBtn=(ImageButton)findViewById(R.id.goto_ingredients_act);
        gotoRecipeBtn=(ImageButton)findViewById(R.id.goto_recipe_act);

    }







    private void loadActivity(View view){

        if(view.getId() == R.id.goto_ingredients_act){

            Intent intent = new Intent("uk.co.tommy.INGREDIENTS");
            startActivity(intent);



            Log.d(LOG_TAG, "Goto ingriedents");
        }else if(view.getId() ==R.id.goto_recipe_act){
            Log.d(LOG_TAG, "Gotorecipe");
            Intent intent = new Intent("uk.co.tommy.RECIPE");
            startActivity(intent);
        }



    }

}
