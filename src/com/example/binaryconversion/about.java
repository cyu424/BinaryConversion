package com.example.binaryconversion;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.example.binaryconversion.R;

public class about extends Activity {

	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.about);      //�����ļ����ȵ���!!!!!!!!!!
		TextView tv = (TextView) findViewById(R.id.mytext2);
		Intent in = getIntent();
		//String value= in.getStringExtra("ca");   //���ܴ�������ֵ
		//tv.setText("other activity!"+ value);
		
	}
}
