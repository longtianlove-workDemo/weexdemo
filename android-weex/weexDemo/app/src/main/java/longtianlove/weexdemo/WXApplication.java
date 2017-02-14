package longtianlove.weexdemo;

import android.app.Application;

import com.taobao.weex.InitConfig;
import com.taobao.weex.WXSDKEngine;

/**
 * Created by 58 on 2017/2/14.
 */

public class WXApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        InitConfig config=new InitConfig.Builder().setImgAdapter(new ImageAdapter()).build();
        WXSDKEngine.initialize(this,config);
    }
}
