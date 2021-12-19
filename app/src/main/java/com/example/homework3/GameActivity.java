package com.example.homework3;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.Animator;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;

public class GameActivity extends AppCompatActivity {

    TextView tvText;
    ImageView imImage;
    Button btnImage1;
    Button btnImage2;
    Button btnImage3;
    Button btnOneJorno;
    Button btnTwoJotaro;
    Button btnThreeJosuke;
    boolean jorno, jotaro, josuke;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        initialization();
        listiners();

    }


    private void initialization() {
        tvText = findViewById(R.id.tv_text);
        imImage = findViewById(R.id.im_image);
        btnImage1 = findViewById(R.id.btn_image1);
        btnImage2 = findViewById(R.id.btn_image2);
        btnImage3 = findViewById(R.id.btn_image3);
        btnOneJorno = findViewById(R.id.btn_jorno);
        btnTwoJotaro = findViewById(R.id.btn_jotaro);
        btnThreeJosuke = findViewById(R.id.btn_josuke);
    }


    public void changeImage(View view) {
        switch (view.getId()) {
            case R.id.btn_image1:
                imImage.setImageResource(R.drawable.jorno);
                jorno = true;
                jotaro = false;
                josuke = false;
                break;
            case R.id.btn_image2:
                imImage.setImageResource(R.drawable.jotaro);
                jorno = false;
                jotaro = true;
                josuke = false;
                break;
            case R.id.btn_image3:
                imImage.setImageResource(R.drawable.josuke);
                jorno = false;
                jotaro = false;
                josuke = true;
                break;
        }
    }

    private void  listiners(){


        btnOneJorno.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {
                if (jorno){
                    Toast.makeText(GameActivity.this , "Yes" , Toast.LENGTH_SHORT).show();
                    YoYo.with(Techniques.Swing)
                            .duration(800)
                            .repeat(1)
                            .withListener(new Animator.AnimatorListener() {
                                @Override
                                public void onAnimationStart(Animator animator) {
                                    btnOneJorno.setBackgroundColor(Color.GREEN);
                                }

                                @Override
                                public void onAnimationEnd(Animator animator) {
                                    btnOneJorno.setBackgroundColor(Color.BLACK);
                                }

                                @Override
                                public void onAnimationCancel(Animator animator) {

                                }

                                @Override
                                public void onAnimationRepeat(Animator animator) {

                                }
                            })
                            .playOn(btnOneJorno);

                }else {
                    Toast.makeText(GameActivity.this , "No" , Toast.LENGTH_SHORT).show();
                    YoYo.with(Techniques.RubberBand).duration(800)
                            .repeat(1)
                            .withListener(new Animator.AnimatorListener() {
                                @Override
                                public void onAnimationStart(Animator animator) {
                                    btnOneJorno.setBackgroundColor(Color.RED);
                                }

                                @Override
                                public void onAnimationEnd(Animator animator) {
                                    btnOneJorno.setBackgroundColor(Color.BLACK);
                                }

                                @Override
                                public void onAnimationCancel(Animator animator) {

                                }

                                @Override
                                public void onAnimationRepeat(Animator animator) {

                                }
                            })
                            .playOn(btnOneJorno);
                }
            }
        });
        btnTwoJotaro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (jotaro){
                    Toast.makeText(GameActivity.this , "Yes" , Toast.LENGTH_SHORT).show();
                    YoYo.with(Techniques.Swing)
                            .duration(800)
                            .repeat(1)
                            .withListener(new Animator.AnimatorListener() {
                                @Override
                                public void onAnimationStart(Animator animator) {
                                    btnTwoJotaro.setBackgroundColor(Color.GREEN);
                                }

                                @Override
                                public void onAnimationEnd(Animator animator) {
                                    btnTwoJotaro.setBackgroundColor(Color.BLACK);
                                }

                                @Override
                                public void onAnimationCancel(Animator animator) {

                                }

                                @Override
                                public void onAnimationRepeat(Animator animator) {

                                }
                            })
                            .playOn(btnTwoJotaro);

                }else {
                    Toast.makeText(GameActivity.this , "No" , Toast.LENGTH_SHORT).show();
                    YoYo.with(Techniques.RubberBand)
                            .duration(800)
                            .repeat(1)
                            .withListener(new Animator.AnimatorListener() {
                                @Override
                                public void onAnimationStart(Animator animator) {
                                    btnTwoJotaro.setBackgroundColor(Color.RED);
                                }

                                @Override
                                public void onAnimationEnd(Animator animator) {
                                    btnTwoJotaro.setBackgroundColor(Color.BLACK);
                                }

                                @Override
                                public void onAnimationCancel(Animator animator) {

                                }

                                @Override
                                public void onAnimationRepeat(Animator animator) {

                                }
                            })
                            .playOn(btnTwoJotaro);
                }
            }
        });
        btnThreeJosuke.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (josuke){
                    Toast.makeText(GameActivity.this , "Yes" , Toast.LENGTH_SHORT).show();
                    YoYo.with(Techniques.Swing)
                            .duration(800)
                            .repeat(1)
                            .withListener(new Animator.AnimatorListener() {
                                @Override
                                public void onAnimationStart(Animator animator) {
                                    btnThreeJosuke.setBackgroundColor(Color.GREEN);
                                }

                                @Override
                                public void onAnimationEnd(Animator animator) {
                                    btnThreeJosuke.setBackgroundColor(Color.BLACK  );
                                }

                                @Override
                                public void onAnimationCancel(Animator animator) {

                                }

                                @Override
                                public void onAnimationRepeat(Animator animator) {

                                }
                            })
                            .playOn(btnThreeJosuke);

                }else {
                    Toast.makeText(GameActivity.this , "No" , Toast.LENGTH_SHORT).show();
                    YoYo.with(Techniques.RubberBand)
                            .duration(800)
                            .repeat(1)
                            .withListener(new Animator.AnimatorListener() {
                                @Override
                                public void onAnimationStart(Animator animator) {
                                    btnThreeJosuke.setBackgroundColor(Color.RED);
                                }

                                @Override
                                public void onAnimationEnd(Animator animator) {
                                    btnThreeJosuke.setBackgroundColor(Color.BLACK);
                                }

                                @Override
                                public void onAnimationCancel(Animator animator) {

                                }

                                @Override
                                public void onAnimationRepeat(Animator animator) {

                                }
                            })
                            .playOn(btnThreeJosuke);
                }
            }
        });
    }
}

