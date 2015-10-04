package com.kamal.login;

import android.os.Build;
import android.os.Bundle;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

  public class MainActivity extends Activity {
     EditText Name,Number;
     Button Convert,Clear;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Name=(EditText) findViewById(R.id.editTextname);
		Number=(EditText) findViewById(R.id.editTextNumber);
		Convert=(Button) findViewById(R.id.buttonconvert);
		Clear=(Button) findViewById(R.id.buttonClear);
		
		Clear.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				 Name.setText("");
				 Number.setText("");
			}
		});
		
		
		
		
		Convert.setOnClickListener(new OnClickListener(){
			String s;
			double d;
			
			@TargetApi(Build.VERSION_CODES.GINGERBREAD)
			@Override
			public void onClick(View arg0) {
				if( Name.getText().toString().length() !=0){
					s="welcome"+" "+Name.getText().toString();
				}
				else{
					s="Hi"+" "+"user";
				}
				
				if(!(Number.getText().toString().isEmpty())){
					d=Double.parseDouble(Number.getText().toString());
				}
				
				
				Intent intent=new Intent(MainActivity.this, SecondActivity.class);
				intent.putExtra("100", s);
				intent.putExtra("101", d);
				startActivity(intent);
				
			}
				
			
				
			});

			}

			


  
    
}
