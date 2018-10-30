package guokun.com.cn.ondcode.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import guokun.com.cn.ondcode.R;
import guokun.com.cn.ondcode.adapter.Fruit2Adapter;
import guokun.com.cn.ondcode.adapter.FruitAdapter;
import guokun.com.cn.ondcode.entity.Fruit;

public class Fruit2Activity extends AppCompatActivity {
    private List<Fruit> fruitList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fruit2);
        //加载数据
        initFruits();
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        //使用布局形式
//        LinearLayoutManager manager = new LinearLayoutManager(this);
//        manager.setOrientation(LinearLayoutManager.HORIZONTAL);
        StaggeredGridLayoutManager manager = new StaggeredGridLayoutManager(3,StaggeredGridLayoutManager.VERTICAL);
//        GridLayoutManager manager = new GridLayoutManager(this,4);
        recyclerView.setLayoutManager(manager);
        //设置适配器
        Fruit2Adapter adapter = new Fruit2Adapter(fruitList);
        recyclerView.setAdapter(adapter);
    }
    private void initFruits() {
        for (int i = 0; i < 50; i++) {
            Fruit fruit = new Fruit(getRound("苹1果" + (i+1)) , R.mipmap.ic_launcher);
            fruitList.add(fruit);
        }
    }

    private String getRound(String str ){
        Random random = new Random();
        int lenght = random.nextInt(20)+1;
        StringBuffer buffer= new StringBuffer();
        for (int i = 0;i<lenght;i++){
            buffer.append(str);
        }
        return buffer.toString();
    }
}
