package de.netnoobs.chronos;

import android.app.ListActivity;
import android.os.Bundle;

public class LeistungActivity extends ListActivity {

	private static final String TAG = "LeistungActivity";
	
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.setTitle("Leistungen");
		
	}

}
