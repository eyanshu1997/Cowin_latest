package com.eyanshu.cowin_latest;

import android.app.Application;
import android.content.Context;

public class cont extends Application {
    private static Context mContext;
    public static String deviceId;
    public static Context getContext() {
        return mContext;
    }

    public static void setContext(Context mCont) {
        mContext = mCont;
    }
}
