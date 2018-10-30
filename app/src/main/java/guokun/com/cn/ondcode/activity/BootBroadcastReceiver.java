package guokun.com.cn.ondcode.activity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

public class BootBroadcastReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context,"消息提示了",Toast.LENGTH_SHORT).show();
        Log.i("BootBroadcastReceiver","BootBroadcastReceiverBootBroadcastReceiverBootBroadcastReceiver");
        Intent intent1 = new Intent(context,BroadcastActivity.class);
        intent1.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(intent1);
    }
}
