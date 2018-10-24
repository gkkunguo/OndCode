package guokun.com.cn.ondcode;

import android.app.Activity;

import java.util.ArrayList;
import java.util.List;

public class ActivityControler {
    public static List<Activity> activityList = new ArrayList<>();

    public static void addActivity(Activity activity){
        activityList.add(activity);
    }
    public static void removeActivity(Activity activity){
            activityList.remove(activity);
    }
    public static void removeAllActivity(){
        for (Activity activity: activityList) {
            if (!activity.isFinishing()){
                activity.finish();
                android.os.Process.killProcess(android.os.Process.myPid());
            }
        }
    }
}
