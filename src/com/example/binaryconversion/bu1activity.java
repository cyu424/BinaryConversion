package com.example.binaryconversion;

import com.example.binaryconversion.MainActivity.bu1;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class bu1activity extends Activity{

	private EditText et1;
	private EditText et2;
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.bu1);     //换布局
		TextView tv1 = (TextView) findViewById(R.id.textView1); //强制类型转换，获取对象id!!!!
		TextView tv2 = (TextView) findViewById(R.id.textView12); 
		TextView tv3 = (TextView) findViewById(R.id.textView13); 
		Button bu1 = (Button) findViewById(R.id.button1);
		 et1 = (EditText) findViewById(R.id.editText1); 
		 et2 = (EditText) findViewById(R.id.editText2);  
		bu1.setOnClickListener(new cal());
		
	}
	
	class cal implements OnClickListener{

		@Override
		public void onClick(View v) {
			String src = et1.getText().toString(); //获取EditText's value
			int t = Integer.parseInt(src);         //change String to int!!!!!
			String re = Integer.toBinaryString(t); //change int to binary int(string class)
			et2.setText(re);
		}
		
	}
	
}
