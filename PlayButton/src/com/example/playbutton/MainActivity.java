package com.example.playbutton;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
//import android.widget.ImageView;



public class MainActivity extends Activity {

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Button play = (Button)findViewById(R.id.button1);
		Button Continue = (Button)findViewById(R.id.button2);
		Button settings = (Button)findViewById(R.id.button4);
		
		play.setOnClickListener(new OnClickListener(){
			public void onClick(View v){
				Intent intent= new Intent(v.getContext(),Activity2.class);
				startActivityForResult(intent,0);
			}
			
		});
		
		/*Medium.setOnClickListener(new OnClickListener(){
			public void onClick(View v){
				Intent intent= new Intent(v.getContext(),Activity2.class);
				startActivityForResult(intent,0);
			}
			
		});
		Hard.setOnClickListener(new OnClickListener(){
			public void onClick(View v){
				Intent intent= new Intent(v.getContext(),Activity2.class);
				startActivityForResult(intent,0);
			}
			
		});*/

	}
}



