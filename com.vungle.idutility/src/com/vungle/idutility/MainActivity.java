package com.vungle.idutility;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.provider.Settings;
import android.view.Menu;
import android.widget.EditText;

public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText t = (EditText) findViewById(R.id.editText1);
		t.setText(getAndroidId(this));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
    
	/**
	 * Retrieve ANDROID_ID.
	 *
	 * @param context Context of application
	 * @return This will return unique identifier for device.
	 */
	public static  String getAndroidId( Context context ) {
		return	Settings.Secure.getString( context.getContentResolver(), Settings.Secure.ANDROID_ID);
	}

    
}
