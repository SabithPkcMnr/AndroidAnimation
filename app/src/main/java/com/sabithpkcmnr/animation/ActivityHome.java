package com.sabithpkcmnr.animation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.RadioGroup;

public class ActivityHome extends AppCompatActivity {

    Animation myAnimation;
    ImageView myImageView;
    RadioGroup rgAnimationMode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        myImageView = findViewById(R.id.myImageView);
        rgAnimationMode = findViewById(R.id.rgAnimationMode);
        myAnimation = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.anim_clockwise);

        rgAnimationMode.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if (checkedId == R.id.rbAnimClockwise) {
                    myAnimation = AnimationUtils.loadAnimation(getApplicationContext(),
                            R.anim.anim_clockwise);

                } else if (checkedId == R.id.rbAnimZoomIn) {
                    myAnimation = AnimationUtils.loadAnimation(getApplicationContext(),
                            R.anim.anim_zoom_in);

                } else if (checkedId == R.id.rbAnimZoomOut) {
                    myAnimation = AnimationUtils.loadAnimation(getApplicationContext(),
                            R.anim.anim_zoom_out);

                } else if (checkedId == R.id.rbAnimFadeInOut) {
                    myAnimation = AnimationUtils.loadAnimation(getApplicationContext(),
                            R.anim.anim_fade);

                } else if (checkedId == R.id.rbAnimBlink) {
                    myAnimation = AnimationUtils.loadAnimation(getApplicationContext(),
                            R.anim.anim_blink);

                } else if (checkedId == R.id.rbAnimMove) {
                    myAnimation = AnimationUtils.loadAnimation(getApplicationContext(),
                            R.anim.anim_move);

                } else if (checkedId == R.id.rbAnimSlide) {
                    myAnimation = AnimationUtils.loadAnimation(getApplicationContext(),
                            R.anim.anim_slide);
                }
            }
        });

        myImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myImageView.startAnimation(myAnimation);
            }
        });
    }

}