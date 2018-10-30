package guokun.com.cn.ondcode.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.List;

import guokun.com.cn.ondcode.R;
import guokun.com.cn.ondcode.adapter.MsgAdapter;
import guokun.com.cn.ondcode.entity.Msg;

public class MsgActivity extends AppCompatActivity {
    private List<Msg> msgs = new ArrayList<>();
    private Button send;
    private EditText editText;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_msg);
        send = findViewById(R.id.send);
        editText= findViewById(R.id.msg);
        initData();

         recyclerView = findViewById(R.id.recyclerView);

        LinearLayoutManager manager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(manager);

        final MsgAdapter adapter = new MsgAdapter(msgs);

        recyclerView.setAdapter(adapter);

        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String content = editText.getText().toString();
                if (!"".equals(content)){
                    msgs.add(new Msg(content,Msg.TYPE_SEND));
                    adapter.notifyItemInserted(msgs.size() - 1);
                    recyclerView.scrollToPosition(msgs.size() -1);
                    editText.setText("");
                }
            }
        });


    }

    private void initData() {
        Msg msgs1 = new Msg("你好！",Msg.TYPE_SEND);
        Msg msgr1 = new Msg("很高兴认识你！",Msg.TYPE_RECEIVED);

        Msg msgs2 = new Msg("你是做什么工作的！",Msg.TYPE_SEND);
        Msg msgr2 = new Msg("我是的职业是皇帝！",Msg.TYPE_RECEIVED);

        Msg msgs3 = new Msg("这么吊！",Msg.TYPE_SEND);
        Msg msgr3 = new Msg("可不是嘛！",Msg.TYPE_RECEIVED);

        msgs.add(msgs1);
        msgs.add(msgr1);
        msgs.add(msgs2);
        msgs.add(msgr2);
        msgs.add(msgs3);
        msgs.add(msgr3);


    }
}
