package com.example.yan.secondclass;

import android.graphics.drawable.AnimationDrawable;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView imageView;
    private AnimationDrawable ad;
    private MediaPlayer mp;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = (ImageView)findViewById(R.id.imageView);

    }

    public void duzi(View v){

        //播放音频文件
        if(mp!=null){
            mp.stop();
        }

        mp=MediaPlayer.create(this,R.raw.p_belly1);
        mp.start();

        //执行动画
        if(ad!=null){
            ad.stop();
        }

        //设置背景动画
        imageView.setBackgroundResource(R.drawable.stomach_anim);
        //获取动画
        ad = (AnimationDrawable)imageView.getBackground();
        //启动动画
        ad.start();

    }

    public void footleft(View v){

        //播放音频文件
        if(mp!=null){
            mp.stop();
        }

        mp=MediaPlayer.create(this,R.raw.p_foot4);
        mp.start();

        //执行动画
        if(ad!=null){
            ad.stop();
        }

        //设置背景动画
        imageView.setBackgroundResource(R.drawable.footleft_anim);
        //获取动画
        ad = (AnimationDrawable)imageView.getBackground();
        //启动动画
        ad.start();

    }

    public void weiba(View v){

        //播放音频文件
        if(mp!=null){
            mp.stop();
        }

        mp=MediaPlayer.create(this,R.raw.angry);
        mp.start();

        //执行动画
        if(ad!=null){
            ad.stop();
        }

        //设置背景动画
        imageView.setBackgroundResource(R.drawable.angry_anim);
        //获取动画
        ad = (AnimationDrawable)imageView.getBackground();
        //启动动画
        ad.start();

    }
}
