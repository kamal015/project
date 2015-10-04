package com.kamal.converter;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity  {
	   EditText Selection1,Selection2;
	   Button Convert,Clear;
	   TextView Result;
	   Spinner spinneroptions;
	   
	   
	   
	    @Override
	    protected void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.activity_main);
	       spinneroptions=(Spinner) findViewById(R.id.spinneroptions);
	       Selection1=(EditText) findViewById(R.id.editTextselection1);
	       Selection2=(EditText) findViewById(R.id.editTextselection2);
	       Clear=(Button) findViewById(R.id.buttonclear);
	       Convert=(Button) findViewById(R.id.buttonconvert);
	      
	       Result=(TextView) findViewById(R.id.textViewresult);
	       
	        final String[] options={"Temperature","Distance","Currency"};
	       ArrayAdapter<String> adapter=new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_dropdown_item_1line,options);
	    
	       spinneroptions.setAdapter(adapter);
	       
	       
	       Clear.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Selection1.setText("");
				Selection2.setText("");
				Result.setText("");
			}
		});
	    
	     
	       
	       spinneroptions.setOnItemSelectedListener(new OnItemSelectedListener() {

			@Override
			public void onItemSelected(AdapterView<?> arg0, View arg1, int position,
					long arg3) {
				
				
				switch(position){
				case 0:
					Selection1.setText("");
					Selection2.setText("");
					Result.setText("");
					convertTemperature();
				    break;
				case 1:
			        Selection1.setText("");
				    Selection2.setText("");
				    Result.setText("");
				    convertDistance();
				    break;
				    
				case 2:
					Selection1.setText("");
					Selection2.setText("");
					Result.setText("");
					convertCurrency();
					
					break;
				
				    default:
				    	break;
				}
				
			}
				
					
					
			@Override
			public void onNothingSelected(AdapterView<?> arg0) {
				
				
			}
		});
	   
	    
	    }
	   
		protected void convertTemperature()
	    {
	    	Selection1.setHint("Celsius");
	    	Selection2.setHint("Farenheit");
		


	    	Convert.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View argo) {
				String s1 = Selection1.getText().toString();
				String s2 = Selection2.getText().toString();
				
			if(s1.length()>0 && s2.length()>0)
			{
				Result.setText("Enter the value only in one field");
				
			}
			else if(s1.length()>0)
			{
				double i = Double.parseDouble(s1);
				double j = i*1.8+32;
				 Result.setText(j+"Farenheit");
			}
			else if(s2.length()>0)
			{
				double i = Double.parseDouble(s2);
				double j = (i-32)/1.8;
				Result.setText(j+"Celsius");
			}
			else
			{
				Result.setText("fields are empty");
			}

				}
			});
	    }
			
			 protected void convertDistance(){
				 
				 Selection1.setHint("kilometers");
				 Selection2.setHint("meters");
				 Convert.setOnClickListener(new OnClickListener() {
					
					@Override
					public void onClick(View arg0) {
						
						String s1=Selection1.getText().toString();
						String s2=Selection2.getText().toString();
						if(s1.length()>0 && s2.length()>0)
						{
							Result.setText("enter value only in any one field");
						}
						else if(s1.length()>0)
						{
							double i=Double.parseDouble(s1);
							double j=i*1000;
							Result.setText(j+"meters");
							
						}
						else if(s2.length()>0)
						{
							double i=Double.parseDouble(s2);
							double j=i/1000;
							Result.setText(j+"Kilometer");
						}
						else
						{
							Result.setText("fields are empty");
							
						}
					}
					});
				 }
			 
			 protected void convertCurrency()
			 {
			 
				     Selection1.setHint("Dollar");
			    	 Selection2.setHint("Rupee");
			    	 Convert.setOnClickListener(new OnClickListener() {
							
							@Override
							public void onClick(View arg0) {
								
								String s1=Selection1.getText().toString();
								String s2=Selection2.getText().toString();
								if(s1.length()>0 && s2.length()>0)
								{
									Result.setText("enter value only in any one field");
								}
								else if(s1.length()>0)
								{
									double i=Double.parseDouble(s1);
									double j=i*66.19;
									Result.setText(j+"Rupee");
									
								}
								else if(s2.length()>0)
								{
									double i=Double.parseDouble(s2);
									double j=i/66.19;
									Result.setText(j+"Dollar");
								}
								else
								{
									Result.setText("fields are empty");
									
								}
							}
							});
		
			
	
                    }


}


				
			
  
    

