package guokun.com.cn.ondcode.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;

import guokun.com.cn.ondcode.R;
import guokun.com.cn.ondcode.entity.Msg;

public class MsgAdapter extends RecyclerView.Adapter<MsgAdapter.ViewHolder> {
    private List<Msg> msgs;

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.msg_item,viewGroup,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        Msg msg = msgs.get(i);
        if (msg.getType() == Msg.TYPE_SEND){//发送
            viewHolder.leftLayout.setVisibility(View.GONE);//左边设置不可见
            viewHolder.rightLayout.setVisibility(View.VISIBLE);
            viewHolder.rightView.setText(msg.getContent());
        }else if (msg.getType() == Msg.TYPE_RECEIVED){//接收
            viewHolder.rightLayout.setVisibility(View.INVISIBLE);
            viewHolder.leftLayout.setVisibility(View.VISIBLE);
            viewHolder.leftView.setText(msg.getContent());
        }

    }

    @Override
    public int getItemCount() {
        return msgs.size();
    }

    public MsgAdapter(List<Msg> msgs) {
        this.msgs = msgs;
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        LinearLayout leftLayout;
        LinearLayout rightLayout;
        TextView leftView;
        TextView rightView;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            leftLayout = itemView.findViewById(R.id.leftLayout);
            rightLayout = itemView.findViewById(R.id.rightLayout);
            leftView = itemView.findViewById(R.id.leftMsg);
            rightView = itemView.findViewById(R.id.rightMsg);
        }
    }
}
