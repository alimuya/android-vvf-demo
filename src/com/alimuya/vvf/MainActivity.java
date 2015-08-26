package com.alimuya.vvf;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;

import com.alimuya.resfacade.test.TestUser;
import com.alimuya.resfacade.test.spring.SpringTest;
import com.google.gson.Gson;
import com.google.gson.JsonObject;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				TestUser testUser=new TestUser();
				testUser.setAge(18);
				testUser.setNickname("xiaoxin");
				testUser.setPassword("123456");
				testUser.setTime(System.currentTimeMillis());
//				RetrofitTest.create(testUser);
//				TestUser user = RestTest.load(1);
//				Log.v("alimuya", user.toString());
				SpringTest test=new SpringTest();
				TestUser user = test.create(testUser);
//				TestUser user =test.load(1);
				Log.v("alimuya", user.toString());
			}
		}).start();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
