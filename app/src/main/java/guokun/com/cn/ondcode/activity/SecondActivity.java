package guokun.com.cn.ondcode.activity;

import android.os.Bundle;
import android.view.View;

import guokun.com.cn.ondcode.base.ActivityControler;
import guokun.com.cn.ondcode.activity.base.BaseActivity;
import guokun.com.cn.ondcode.R;

public class SecondActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected int getLayoutid() {
        return R.layout.activity_second;
    }

    public void kills(View view){
        ActivityControler.removeAllActivity();
    }
}
