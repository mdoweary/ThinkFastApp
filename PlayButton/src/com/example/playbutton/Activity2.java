package com.example.playbutton;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
//import android.widget.ImageView;

public class Activity2 extends Activity{
	
	//ImageView image;
	
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity2);
		addListenerOnButton();
	}
	public void addListenerOnButton() {
		
		//image = (ImageView) findViewById(R.id.imageView1);
		Button easy = (Button)findViewById(R.id.easy);
		Button medium = (Button)findViewById(R.id.button2);
		Button hard = (Button)findViewById(R.id.button3);
		
		easy.setOnClickListener(new OnClickListener(){
			public void onClick(View v){
				Intent intent= new Intent(v.getContext(),Activity3.class);
				startActivityForResult(intent,0);
				//image.setImageResource(R.drawable.iberty);
			}
			
		});
	
	
}
}

