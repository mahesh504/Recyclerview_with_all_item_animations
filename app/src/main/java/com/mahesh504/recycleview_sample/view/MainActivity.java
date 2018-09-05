package com.mahesh504.recycleview_sample.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LayoutAnimationController;
import android.widget.ImageView;
import android.widget.Toast;

import com.mahesh504.recycleview_sample.R;
import com.mahesh504.recycleview_sample.adapters.PropertyListAdapter;
import com.mahesh504.recycleview_sample.data.PropertyData;
import com.mahesh504.recycleview_sample.model.PropertyModel;
import com.mahesh504.recycleview_sample.util.Common;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private Context mContext;
    private RecyclerView rcv_pro;
    private LinearLayoutManager layoutManager;
    private List<PropertyModel> propertyDataList;
    private PropertyListAdapter propertyListAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        bind();

    }

    private void bind() {

        propertyDataList = PropertyData.getPropertyData();
        propertyListAdapter = new PropertyListAdapter(propertyDataList, mContext, rcv_pro);
        rcv_pro.setAdapter(propertyListAdapter);

    }

    private void init() {
        mContext = MainActivity.this;
        layoutManager = new LinearLayoutManager(mContext);
        rcv_pro = findViewById(R.id.rcv_pro);
        rcv_pro.setLayoutManager(layoutManager);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();

        inflater.inflate(R.menu.rcv_type_menu, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {

            case R.id.bottom:

                Toast.makeText(mContext, "Bottom", Toast.LENGTH_SHORT).show();
                Common.anim_type = Common.BOTTOM;
                bind();
                return true;

            case R.id.left:

                Toast.makeText(mContext, "Left", Toast.LENGTH_SHORT).show();
                Common.anim_type = Common.LEFT;
                bind();
                return true;
            case R.id.right:

                Toast.makeText(mContext, "Right", Toast.LENGTH_SHORT).show();
                Common.anim_type = Common.RIGHT;
                bind();
                return true;
            default:

                return super.onOptionsItemSelected(item);
        }
    }
}