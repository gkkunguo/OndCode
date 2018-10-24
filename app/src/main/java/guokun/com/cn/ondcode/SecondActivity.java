package guokun.com.cn.ondcode;

import android.os.Bundle;
import android.view.View;

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
