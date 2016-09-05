package edu.feicui.contacts.main;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class LogoActivity extends AppCompatActivity {
    private ImageView imageView;
    private Animation animation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logo);
        //初始化
        imageView= (ImageView) findViewById(R.id.imageView);
        animation= AnimationUtils.loadAnimation(this,R.anim.anim_logo);

        //创建动画监听器
        Animation.AnimationListener animationListener=new Animation.AnimationListener() {
            //动画开始
            @Override
            public void onAnimationStart(Animation animation) {
            //开始动画的效果
            }
            //结束动画的效果
            @Override
            public void onAnimationEnd(Animation animation) {
            //动画结束需要做的事情
                Intent intent=new Intent(LogoActivity.this,TelmsgActivity.class);
                //启动activity
                startActivity(intent);
                finish();
            }
                //重复动画效果
            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        };
        //给图片添加动画
        animation.setAnimationListener(animationListener);
        imageView.setAnimation(animation);
    }
}
