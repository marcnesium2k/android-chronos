package de.netnoobs.chronos;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class ChronosActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chronos);
    }
    
    private static final String TAG = "ChronosActivity";
    
    public void exitWelcomeScreen (View view){
    	//Log.d(TAG, "exitWelcomeScreen");
    	Intent intent = new Intent(this, MenuActivity.class);
    	startActivity(intent);
    }
}
