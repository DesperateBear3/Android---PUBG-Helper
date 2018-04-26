package top.bear3.pubg_helper;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;

/**
 * author : TT
 * e-mail : tianruofengxing@163.com
 * time   : 2018/04/26
 * desc   :
 * version: 1.0
 */
public class HttpUtil {
    private static OkHttpClient sOkHttpClient;
    private static PubgApi sPubgApi;

    public static PubgApi getPubgApi() {
        if (sPubgApi == null) {
            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl(Constant.BASE_URL)
                    .client(getOkHttpClient())
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .build();

            sPubgApi = retrofit.create(PubgApi.class);
        }

        return sPubgApi;
    }

    private static OkHttpClient getOkHttpClient() {
        if (sOkHttpClient == null) {
            sOkHttpClient = new OkHttpClient.Builder().addInterceptor(new RequestInterceptor())
                    .connectTimeout(10, TimeUnit.SECONDS)
                    .build();
        }

        return sOkHttpClient;
    }
}
