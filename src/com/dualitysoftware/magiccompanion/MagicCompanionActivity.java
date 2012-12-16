package com.dualitysoftware.magiccompanion;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class MagicCompanionActivity extends Activity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.magic_companion_activity);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.magic_companion_activity, menu);
		return true;
	}
}
