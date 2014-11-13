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

public class Activity4 extends Activity{
	Button b;
	ImageView image;
	private Button btnSubmitQuiz1;
	int ans2;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity4);
		
		RadioGroup champ=(RadioGroup)findViewById(R.id.question2);
		champ.setOnCheckedChangeListener(new OnCheckedChangeListener() {
			public void onCheckedChanged(RadioGroup group, int checkedId) {
				// TODO Auto-generated method stub
				switch(checkedId) {
					case R.id.yello_hammer:
					                                  ans2 =1;
					break;
					case R.id.finch:
					                                  ans2 =2;
					break;
					case R.id.meadowlark:
					                                  ans2 =3;
					break;
				}
			}
			});
		addButtonListener();
	 	
	}
	public void addButtonListener() {
		image = (ImageView) findViewById(R.id.imageView2);
		b = (Button) findViewById(R.id.button2);
		image.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View view) {
				image.setImageResource(R.drawable.ic_launcher);	
				
				
				/*Intent intent= new Intent(getActivity(),Activity3.class);
				startActivity(intent,0);*/
				
			}
			
		});
		
		btnSubmitQuiz1 = (Button) findViewById(R.id.submit2);
		btnSubmitQuiz1.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if(ans2 == 2){
					Toast.makeText(Activity4.this, "Your choice is incorrect, try again", 5).show();
				}
				                                 
				if(ans2 == 3){
					Toast.makeText(Activity4.this, "Your choice is correct", 5).show();
				}
				                                  
				if(ans2 == 1){
					Toast.makeText(Activity4.this, "Your choice is incorrect, try again", 5).show();
					
				}
				                                  
				
			}
		});

	}
}
