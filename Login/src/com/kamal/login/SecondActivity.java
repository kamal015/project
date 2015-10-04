package com.kamal.login;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.widget.TextView;

public class SecondActivity extends Activity {
  TextView option1,option2,option3,option4;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_second);
		option1= (TextView)findViewById(R.id.textViewoption1);
		option2=(TextView)findViewById(R.id.textViewoption2);
		option3=(TextView)findViewById(R.id.textViewoption3);
		option4=(TextView)findViewById(R.id.textViewoption4);
String s1;
double d;
    double d1=5;

Intent intent=getIntent();
Bundle b1=intent.getExtras();
 s1=(String) b1.getSerializable("100");
 option1.setText(s1);
d=(Double) b1.getSerializable("101");
option2.setText(String.valueOf(d+d1));
option3.setText(String.valueOf(d*d1));
option4.setText(String.valueOf(d-d1));
}
}
