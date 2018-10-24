package guokun.com.cn.ondcode;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class TitleLayout extends LinearLayout implements View.OnClickListener {
    public TitleLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
        LayoutInflater.from(context).inflate(R.layout.title, this);
        TextView back = findViewById(R.id.back);
        TextView title = findViewById(R.id.title);
        TextView more = findViewById(R.id.more);
        back.setOnClickListener(this);
        title.setOnClickListener(this);
        more.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.back:
                Toast.makeText(getContext(), "back", Toast.LENGTH_SHORT).show();
                break;
            case R.id.title:
                Toast.makeText(getContext(), "title", Toast.LENGTH_SHORT).show();
            break;
            case R.id.more:
                Toast.makeText(getContext(), "more", Toast.LENGTH_SHORT).show();
                break;

        }

    }
}
