package uk.co.tommywebdesign.feedme.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import uk.co.tommywebdesign.feedme.R;

/**
 * Created by tommy on 16/10/16.
 */

public class StartScreenAct  extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.start_screen_layout);
        Thread timer =new Thread(){

            public void run(){

                try{
                    sleep(1000);
                }catch(InterruptedException e){
                    e.printStackTrace();
                }finally {
                    Intent beginApplication = new Intent("uk.co.tommy.COORD");
                    startActivity(beginApplication);

                }



            }
        };
        timer.start();
    }


    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }

}