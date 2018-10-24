package guokun.com.cn.ondcode;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class TitleBar extends RelativeLayout {
    private OnTitleBarClickListener mListener;
    public TitleBar(Context context, AttributeSet attrs) {
        super(context, attrs);
        LayoutInflater.from(getContext()).inflate(R.layout.title,this);
        Button back = findViewById(R.id.back);
        TextView title = findViewById(R.id.title);
        Button more = findViewById(R.id.more);

        back.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                mListener.onLeftClick();
            }
        });
        title.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                mListener.onCenterClick();
            }
        });
        more.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                mListener.onRightClick();
            }
        });


    }

    public interface OnTitleBarClickListener{
        void onLeftClick();
        void onCenterClick();
        void onRightClick();
    }
    public void setTitleBarClick(OnTitleBarClickListener l) {
        this.mListener = l;
    }


}
