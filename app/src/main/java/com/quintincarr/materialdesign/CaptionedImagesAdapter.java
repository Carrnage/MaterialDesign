package com.quintincarr.materialdesign;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.card.MaterialCardView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.Random;

public class CaptionedImagesAdapter extends RecyclerView.Adapter<CaptionedImagesAdapter.ViewHolder>{

    public static class ViewHolder extends RecyclerView.ViewHolder{
        private MaterialCardView materialCardView;
        public ViewHolder(MaterialCardView materialCardView){
            super(materialCardView);
            this.materialCardView = materialCardView;
        }
    }

    private String [] names;
    private int[] imageIds;

    public CaptionedImagesAdapter(String[] names, int[] imageIds){
        this.names = names;
        this.imageIds = imageIds;
    }


    @NonNull
    @Override
    public CaptionedImagesAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        MaterialCardView materialCardView = (MaterialCardView) LayoutInflater.from(parent.getContext()).inflate(R.layout.card_captioned_image, parent, false);
        return new ViewHolder(materialCardView);
    }

    @Override
    public void onBindViewHolder(@NonNull CaptionedImagesAdapter.ViewHolder holder, int position) {
        MaterialCardView mcv = holder.materialCardView;
        ImageView imageView = mcv.findViewById(R.id.info_image);
        imageView.setImageResource(imageIds[position]);
        imageView.setContentDescription(names[position]);
        TextView textView = mcv.findViewById(R.id.info_text);
        textView.setText(names[position]);
        //configures a new random height:
        int heightInDp = new Random().nextInt(101) + 150;
        //convert dp into pixels
        float density = holder.itemView.getContext().getResources().getDisplayMetrics().density;
        int heightInPx = Math.round(heightInDp * density);
        //set the height of materialCardView
        holder.itemView.getLayoutParams().height = heightInPx;
        //call this after setting the height
        holder.itemView.requestLayout();

    }

    @Override
    public int getItemCount() {
        return names.length;
    }

}
