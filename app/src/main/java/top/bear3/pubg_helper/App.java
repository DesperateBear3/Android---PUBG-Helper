package top.bear3.pubg_helper;

import android.app.Application;

import timber.log.Timber;

/**
 * author : TT
 * e-mail : tianruofengxing@163.com
 * time   : 2018/04/26
 * desc   :
 * version: 1.0
 */
public class App extends Application{
    @Override
    public void onCreate() {
        super.onCreate();

        if (BuildConfig.DEBUG) {
            Timber.plant(new Timber.DebugTree());
        }
    }
}
