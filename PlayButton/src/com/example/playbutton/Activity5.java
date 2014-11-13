package com.example.playbutton;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.Toast;
public class Activity5 extends Activity{
	Button b1;
	ImageView image;
	private Button btnSubmitQuiz2;
	int ans3;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity5);
		/*
		RadioGroup champ=(RadioGroup)findViewById(R.id.question3);
		champ.setOnCheckedChangeListener(new OnCheckedChangeListener() {
			public void onCheckedChanged(RadioGroup group, int checkedId) {
				// TODO Auto-generated method stub
				switch(checkedId) {
					case R.id.everest:
					                                  ans3 =1;
					break;
					case R.id.alps:
					                                  ans3 =2;
					break;
					case R.id.rocky:
					                                  ans3 =3;
					break;
				}
			}
			});*/
		
		addButtonListener();
	}
	public void addButtonListener() {
		image = (ImageView) findViewById(R.id.imageView3);
		b1 = (Button) findViewById(R.id.button4);
		image.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View view) {
				image.setImageResource(R.drawable.alps);	
				
				
				/*Intent intent= new Intent(getActivity(),Activity3.class);
				startActivity(intent,0);*/
				
			}
			
		});
		btnSubmitQuiz2 = (Button) findViewById(R.id.submit3);
		btnSubmitQuiz2.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if(ans3 == 1){
					Toast.makeText(Activity5.this, "Your choice is incorrect, try again", 5).show();
				}
				                                 
				if(ans3 == 2){
					Toast.makeText(Activity5.this, "Your choice is correct", 5).show();
				}
				                                  
				if(ans3 == 3){
					Toast.makeText(Activity5.this, "Your choice is incorrect, try again", 5).show();
					
				}
				                                  
				
			}
		});
	}
}
