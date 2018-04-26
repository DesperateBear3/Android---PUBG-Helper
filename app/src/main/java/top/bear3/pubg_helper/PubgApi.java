package top.bear3.pubg_helper;

import io.reactivex.Observable;
import io.reactivex.annotations.NonNull;
import okhttp3.ResponseBody;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * author : TT
 * e-mail : tianruofengxing@163.com
 * time   : 2018/04/26
 * desc   :
 * version: 1.0
 */
public interface PubgApi {
    @GET("{region}/players")
    Observable<Response<ResponseBody>> getPlayersInfo(@Path("region") String region, @NonNull @Query("filter[playerNames]") String... playerNames);

    @GET("{region}/matches/{id}")
    Observable<Response<ResponseBody>> getMatchInfo(@Path("region") String region, @Path("id") String id);
}
