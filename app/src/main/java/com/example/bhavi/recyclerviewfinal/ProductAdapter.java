package com.example.bhavi.recyclerviewfinal;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.InflateException;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;
import java.util.zip.Inflater;

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.viewholder>{

    private Context mctx;
    private List<Product> productlist;

    public ProductAdapter(Context mctx, List<Product> productlist) {
        this.mctx = mctx;
        this.productlist = productlist;
    }

    @NonNull
    @Override
    public viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater= LayoutInflater.from(mctx);
        View view=inflater.inflate(R.layout.item_recycler,null);
        return new viewholder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull viewholder holder, int position) {
        Product prduct=productlist.get(position);
        holder.imgview.setImageDrawable(mctx.getResources().getDrawable(prduct.getImage()));

    }

    @Override
    public int getItemCount() {
        return productlist.size();
    }

    public class viewholder extends RecyclerView.ViewHolder
    {
        ImageView imgview;
        TextView tvTitle,tvDesc,tvPrice,tvRating;
        public viewholder(View itemView) {
            super(itemView);
            tvDesc=itemView.findViewById(R.id.textViewShortDesc);
            tvTitle=itemView.findViewById(R.id.showTitle);
            tvPrice=itemView.findViewById(R.id.textViewPrice);
            tvRating=itemView.findViewById(R.id.textViewRating);
            imgview=itemView.findViewById(R.id.imageView);
        }
    }

}
