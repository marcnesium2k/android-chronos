package de.netnoobs.chronos;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MenuActivity extends ListActivity {

	private static final String TAG = "MenuActivity";
	
	static final String[] ENTRIES = new String[] {"Kunden", "Projekte", "Leistungen", "Zeiten"};
	
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		this.setTitle("Hautmenü");
		this.setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, ENTRIES));
		
		ListView listView = getListView();
		listView.setOnItemClickListener(new OnItemClickListener() {
			
			public void onItemClick(AdapterView<?> parent, View view, int position, long id){
				switch (position){
					case 0:
						Log.d(TAG, "Eintrag 1");
						break;
					case 1:
						Log.d(TAG, "Eintrag 2");
						break;
					case 2:
						Log.d(TAG, "Eintrag 3");
						startActivity(new Intent(MenuActivity.this, LeistungActivity.class)); 
					case 3:
						Log.d(TAG, "Eintrag 4");
					break;
				}
			}
		} );
	
	}
	
	
}
