package com.example.playbutton;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;

public class Activity3 extends Activity{
	Button button;
	ImageView image;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity3);
		
		addButtonListener();
	}
	
	public void addButtonListener() {
		image = (ImageView) findViewById(R.id.imageView1);
		button = (Button) findViewById(R.id.button1);
		image.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View view) {
				image.setImageResource(R.drawable.iberty);
				/*Intent intent= new Intent(getActivity(),Activity3.class);
				startActivity(intent,0);*/
			}
		});

	}
}


