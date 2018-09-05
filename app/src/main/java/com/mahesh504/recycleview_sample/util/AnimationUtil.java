package com.mahesh504.recycleview_sample.util;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.annotation.SuppressLint;
import android.support.v7.widget.RecyclerView;

public class AnimationUtil {
    public static void animate(RecyclerView.ViewHolder holder,boolean goesdown)
    {
        AnimatorSet animatorSet=new AnimatorSet();
        @SuppressLint("ObjectAnimatorBinding") ObjectAnimator animatorTransilateY= ObjectAnimator.ofFloat(holder.itemView,"translationY",goesdown==true ? 200 :-200,0);
        animatorTransilateY.setDuration(1200);

        @SuppressLint("ObjectAnimatorBinding") ObjectAnimator animatorTransilateX= ObjectAnimator.ofFloat(holder.itemView,"translationX",200,0);
        animatorTransilateX.setDuration(1500);

        @SuppressLint("ObjectAnimatorBinding") ObjectAnimator rotation=  ObjectAnimator.ofFloat(holder.itemView, "rotation", 360);
        rotation.setDuration(1000);
        if(Common.anim_type == Common.BOTTOM)
        {
            animatorSet.playTogether(animatorTransilateY);
            animatorSet.start();
        }else if(Common.anim_type == Common.LEFT)
        {
            animatorSet.playTogether(animatorTransilateX);
            animatorSet.start();
        }else if(Common.anim_type == Common.RIGHT)
        {
            animatorSet.playTogether(rotation);
            animatorSet.start();
        }

    }

}
