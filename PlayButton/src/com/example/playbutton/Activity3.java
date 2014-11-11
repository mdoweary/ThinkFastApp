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

public class Activity3 extends Activity{
	Button button;
	ImageView image;
	private Button btnSubmitQuiz;
	int ans1;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity3);
		RadioGroup champ=(RadioGroup)findViewById(R.id.question1);
		champ.setOnCheckedChangeListener(new OnCheckedChangeListener() {
		public void onCheckedChanged(RadioGroup group, int checkedId) {
			// TODO Auto-generated method stub
			switch(checkedId) {
				case R.id.liberty:
				                                  ans1 =1;
				break;
				case R.id.brooklyn:
				                                  ans1 =2;
				break;
				case R.id.empire:
				                                  ans1 =3;
				break;
			}
		}
		});

		
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
		
		
		btnSubmitQuiz = (Button) findViewById(R.id.submit);
		btnSubmitQuiz.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if(ans1 == 2){
					Toast.makeText(Activity3.this, "Your choice is incorrect, try again", 5).show();
				}
				                                 
				if(ans1 == 1){
					Toast.makeText(Activity3.this, "Your choice is correct", 5).show();
				}
				                                  
				if(ans1 == 3){
					Toast.makeText(Activity3.this, "Your choice is incorrect, try again", 5).show();
					
				}
				                                  
				
			}
		});

	}
	/*@Override
    public boolean onCreateOptionsMenu(Menu menu) {
	getMenuInflater().inflate(R.menu.main, menu);
	return true;
	}*/
	}




