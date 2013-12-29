package com.example.binaryconversion;

import com.example.binaryconversion.R;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		TextView tv = (TextView) findViewById(R.id.textView1); //强制类型转换，获取对象id!!!!
		Button bu1 = (Button) findViewById(R.id.button1);
		Button bu2 = (Button) findViewById(R.id.button2);
		Button bu3 = (Button) findViewById(R.id.button3);
		Button bu4 = (Button) findViewById(R.id.button4);
		Button bu5 = (Button) findViewById(R.id.button5);
		Button bu6 = (Button) findViewById(R.id.button6);
		bu1.setOnClickListener(new bu1());
		bu2.setOnClickListener(new bu2());
		bu3.setOnClickListener(new bu3());
		bu4.setOnClickListener(new bu4());
		bu5.setOnClickListener(new bu5());
		bu6.setOnClickListener(new bu6());
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) { //获取item，回调函数，一旦点击menu按钮即获取menu
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		menu.add(0,1,1,R.string.exit);
		menu.add(0,2,2,R.string.about);
		return true;
	}
	
	
	

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// TODO Auto-generated method stub
		if(item.getItemId() == 1){
			finish();
		}
		if(item.getItemId() == 2){
			Intent about =  new Intent();
			about.setClass(MainActivity.this, about.class);
			MainActivity.this.startActivity(about);
		}
		return super.onOptionsItemSelected(item);
		
	}


	class bu1 implements OnClickListener{

		@Override
		public void onClick(View arg0) {
			Intent in1 = new Intent();
			in1.setClass(MainActivity.this, bu1activity.class);  //换窗口类
			MainActivity.this.startActivity(in1);
		}
		
	}
	
	class bu2 implements OnClickListener{

		@Override
		public void onClick(View arg0) {
			Intent in1 = new Intent();
			in1.setClass(MainActivity.this, bu2activity.class);
			MainActivity.this.startActivity(in1);
		}
		
	}
	class bu3 implements OnClickListener{

		@Override
		public void onClick(View arg0) {
			Intent in1 = new Intent();
			in1.setClass(MainActivity.this, bu3activity.class);
			MainActivity.this.startActivity(in1);
		}
		
	}
	class bu4 implements OnClickListener{

		@Override
		public void onClick(View arg0) {
			Intent in1 = new Intent();
			in1.setClass(MainActivity.this, bu4activity.class);
			MainActivity.this.startActivity(in1);
		}
		
	}
	class bu5 implements OnClickListener{

		@Override
		public void onClick(View arg0) {
			Intent in1 = new Intent();
			in1.setClass(MainActivity.this, bu5activity.class);
			MainActivity.this.startActivity(in1);
		}
		
	}
	class bu6 implements OnClickListener{

		@Override
		public void onClick(View arg0) {
			Intent in1 = new Intent();
			in1.setClass(MainActivity.this, bu6activity.class);
			MainActivity.this.startActivity(in1);
		}
		
	}


	
	
	
	
}
