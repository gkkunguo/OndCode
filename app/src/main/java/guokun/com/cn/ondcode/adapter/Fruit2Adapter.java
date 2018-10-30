package guokun.com.cn.ondcode.adapter;

import android.media.Image;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

import guokun.com.cn.ondcode.R;
import guokun.com.cn.ondcode.entity.Fruit;

public class Fruit2Adapter extends RecyclerView.Adapter<Fruit2Adapter.ViewHolder> {
    //存放加载数据
    private List<Fruit> fruitList;
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        //返回一个控件持有者
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.fruit_item,viewGroup,false);
        final ViewHolder viewHolder = new ViewHolder(view);
        viewHolder.imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(),"图片",Toast.LENGTH_SHORT).show();
            }
        });
        viewHolder.textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(),viewHolder.textView.getText(),Toast.LENGTH_SHORT).show();
            }
        });
        return viewHolder;
    }

    public Fruit2Adapter(List<Fruit> fruitList) {
        //外部文件传入的数据数组
        this.fruitList = fruitList;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        //绑定持有者：也就是把数组信息显示到布局文件上
        Fruit fruit = fruitList.get(i);
        viewHolder.textView.setText(fruit.getName());
        viewHolder.imageView.setImageResource(fruit.getId());
    }

    @Override
    public int getItemCount() {
        return fruitList.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder{
        ImageView imageView;
        TextView textView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageView);
            textView = itemView.findViewById(R.id.tvFruits);
        }
    }

}
