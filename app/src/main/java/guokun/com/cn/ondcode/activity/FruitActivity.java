package guokun.com.cn.ondcode.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import guokun.com.cn.ondcode.entity.Fruit;
import guokun.com.cn.ondcode.adapter.FruitAdapter;
import guokun.com.cn.ondcode.R;

public class FruitActivity extends AppCompatActivity {
    private List<Fruit> fruitList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fruit);
        initFruits();
        FruitAdapter adapter = new FruitAdapter(this, R.layout.fruit_item, fruitList);
        ListView listItem = findViewById(R.id.listItem);
        listItem.setAdapter(adapter);
    }

    private void initFruits() {
        for (int i = 0; i < 50; i++) {
            Fruit fruit = new Fruit("苹果" + (i+1) , R.mipmap.ic_launcher);
            fruitList.add(fruit);
        }
    }
}
