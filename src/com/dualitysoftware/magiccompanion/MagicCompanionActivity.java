package com.dualitysoftware.magiccompanion;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;

public class MagicCompanionActivity extends Activity {
	
	int health = 20;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.magic_companion_activity);
		
		TextView healthText = (TextView) findViewById(R.id.health);
		healthText.setText(Integer.toString(health));
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.magic_companion_activity, menu);
		return true;
	}
	
	public void addHealth(View view) {
		health += 1;
	}
	
	public void subHealth(View view) {
		health -= 1;
	}
	
	public void resetHealth(View view) {
		health = 20;
	}
}
