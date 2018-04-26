package top.bear3.pubg_helper;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/**
 * author : TT
 * e-mail : tianruofengxing@163.com
 * time   : 2018/04/26
 * desc   :
 * version: 1.0
 */
public class RequestInterceptor implements Interceptor {
    @Override
    public Response intercept(Chain chain) throws IOException {
        Request origin = chain.request();
        Request request = origin.newBuilder()
                .header("Authorization", "Bearer " + Constant.API_KEY)
                .header("Accept", "application/vnd.api+json")
                .build();
        return chain.proceed(request);
    }
}
