package guokun.com.cn.ondcode.activity;

import android.os.Bundle;
import android.widget.Toast;

import guokun.com.cn.ondcode.activity.base.BaseActivity;
import guokun.com.cn.ondcode.R;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    @Override
    protected int getLayoutid() {
        return R.layout.activity_main;
    }

    @Override
    public void onCenterClick() {
        super.onCenterClick();
        Toast.makeText(this, getClass().getInterfaces()+"_title", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onLeftClick() {
        super.onLeftClick();
        Toast.makeText(this, getClass().getInterfaces()+"_left", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onRightClick() {
        super.onRightClick();
        Toast.makeText(this, getClass().getInterfaces()+"_right", Toast.LENGTH_SHORT).show();
    }



}
