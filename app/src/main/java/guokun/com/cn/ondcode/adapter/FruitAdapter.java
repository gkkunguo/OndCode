package guokun.com.cn.ondcode.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import guokun.com.cn.ondcode.entity.Fruit;
import guokun.com.cn.ondcode.R;

public class FruitAdapter extends ArrayAdapter<Fruit> {
    private int resource;


    public FruitAdapter(Context context, int resource, List<Fruit> objects) {
        super(context, resource, objects);
        this.resource = resource;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Fruit fruit = getItem(position);
        String name = fruit.getName();
        int id = fruit.getId();
        View view;
        ViewHolder viewHolder;
        if (convertView == null) {
            view = LayoutInflater.from(getContext()).inflate(resource, parent, false);
            viewHolder = new ViewHolder();
            viewHolder.imageView = view.findViewById(R.id.imageView);
            viewHolder.textView = view.findViewById(R.id.tvFruits);
            view.setTag(viewHolder);
        } else {
            view = convertView;
            viewHolder = (ViewHolder) view.getTag();
        }
        viewHolder.imageView.setImageResource(id);
        viewHolder.textView.setText(name);
        return view;
    }
    class ViewHolder{
        ImageView imageView;
        TextView textView;
    }


}
