package guokun.com.cn.ondcode.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import guokun.com.cn.ondcode.R;
import guokun.com.cn.ondcode.fragment.AuthorFragment;
import guokun.com.cn.ondcode.fragment.BookFragment;

public class FragmentTestActivity extends AppCompatActivity {
    private AuthorFragment authorFragment;
    private BookFragment bookFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_test);
        authorFragment = (AuthorFragment) getSupportFragmentManager().findFragmentById(R.id.author);
        bookFragment = (BookFragment) getSupportFragmentManager().findFragmentById(R.id.book);
        Log.i("FragmentTestActivity","_onCreate");
    }

}
