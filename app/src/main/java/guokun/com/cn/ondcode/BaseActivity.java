package guokun.com.cn.ondcode;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public abstract class BaseActivity extends AppCompatActivity implements TitleBar.OnTitleBarClickListener {
    protected TitleBar mTitleBar;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutid());
        Log.d("guokun", getClass().getSimpleName());
        ActivityControler.addActivity(this);
        mTitleBar = findViewById(R.id.mTitleBar);
        if (mTitleBar != null){
            mTitleBar.setTitleBarClick(this);
        }
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null){
            actionBar.hide();
        }
    }

    @Override
    public void onLeftClick() {
    }

    @Override
    public void onCenterClick() {

    }

    @Override
    public void onRightClick() {

    }

    protected abstract int getLayoutid() ;

}
