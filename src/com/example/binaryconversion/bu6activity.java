package com.example.binaryconversion;

import com.example.binaryconversion.MainActivity.bu1;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class bu6activity extends Activity{

	private EditText et1;
	private EditText et2;
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.bu6);
		TextView tv1 = (TextView) findViewById(R.id.textView1); //ǿ������ת������ȡ����id!!!!
		TextView tv2 = (TextView) findViewById(R.id.textView12); 
		TextView tv3 = (TextView) findViewById(R.id.textView13); 
		Button bu1 = (Button) findViewById(R.id.button1);
		 et1 = (EditText) findViewById(R.id.editText1); 
		 et2 = (EditText) findViewById(R.id.editText2);  
		bu1.setOnClickListener(new cal());
		
	}
	
	class cal implements OnClickListener{

		@Override
		public void onClick(View v) {    //2=>8,
			String src = et1.getText().toString(); //��ȡEditText's value
			        
			String tem = Integer.valueOf(src,2).toString();  //��ת����ʮ����
			int t = Integer.parseInt(tem);        //ת����int����
			String re = Integer.toHexString(t);   //ʮ����ת����ʮ������
			et2.setText(re);
		}
		
	}
	
}
