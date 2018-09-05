package com.mahesh504.recycleview_sample.adapters;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.v7.app.AlertDialog;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationUtils;
import android.view.animation.LayoutAnimationController;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.mahesh504.recycleview_sample.R;
import com.mahesh504.recycleview_sample.model.PropertyModel;
import com.mahesh504.recycleview_sample.util.AnimationUtil;
import com.mahesh504.recycleview_sample.util.CommonUtl;
import com.squareup.picasso.MemoryPolicy;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class PropertyListAdapter extends RecyclerView.Adapter<PropertyListAdapter.RcvViewHolder> {

    private List<PropertyModel> propertyModelList = new ArrayList<>();
    private Context mContext;
    private RecyclerView rcvPro;
    int Previusposition = 0;

    public PropertyListAdapter(List<PropertyModel> propertyModelList, Context mContext, RecyclerView rcvPro) {

        this.propertyModelList = propertyModelList;
        this.mContext = mContext;
        this.rcvPro = rcvPro;

    }

    @NonNull
    @Override
    public RcvViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.rcv_pro_row, null);
        return new RcvViewHolder(v);
    }

    @SuppressLint("ResourceAsColor")
    @Override
    public void onBindViewHolder(@NonNull RcvViewHolder holder, int position) {

        Picasso.with(mContext).load(propertyModelList.get(position).getPro_image()).transform(new CommonUtl.CircleTransform()).into(holder.img_pr);
        holder.txt_name.setText(propertyModelList.get(position).getPro_name());
        holder.txt_ads.setText(propertyModelList.get(position).getPro_adrs());

        if (Previusposition == 0) {
            AnimationUtil.animate(holder, true);
        } else if (position > Previusposition) {
            AnimationUtil.animate(holder, true);
        } else {
            AnimationUtil.animate(holder, false);
        }
        Previusposition = position;



    }


    @Override
    public int getItemCount() {
        if (propertyModelList.size() > 0)
            return propertyModelList.size();
        else
            return 0;
    }

    class RcvViewHolder extends RecyclerView.ViewHolder {
        ImageView img_pr;
        TextView txt_name, txt_ads;
        LinearLayout lyt_content_view;

        public RcvViewHolder(View itemView) {
            super(itemView);
            img_pr = itemView.findViewById(R.id.img_pro);
            txt_name = itemView.findViewById(R.id.pro_name);
            txt_ads = itemView.findViewById(R.id.pro_ads);
            lyt_content_view= itemView.findViewById(R.id.lyt_content_view);

        }
    }
}
