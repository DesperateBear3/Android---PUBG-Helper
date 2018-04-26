package top.bear3.pubg_helper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.io.IOException;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import okhttp3.ResponseBody;
import retrofit2.Response;
import timber.log.Timber;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getMatchInfo();

//        HttpUtil.getPubgApi().getPlayersInfo(Region.Asia.getRegion(), "Pangdudu0609").subscribeOn(Schedulers.io())
//                .observeOn(AndroidSchedulers.mainThread())
//                .subscribe(new Observer<Response<ResponseBody>>() {
//                    @Override
//                    public void onSubscribe(Disposable d) {
//
//                    }
//
//                    @Override
//                    public void onNext(Response<ResponseBody> responseBodyResponse) {
//                        try {
//                            Timber.d(responseBodyResponse.body().string());
//                        } catch (IOException e) {
//
//                        }
//
//                    }
//
//                    @Override
//                    public void onError(Throwable e) {
//                        Timber.e(e.toString());
//                    }
//
//                    @Override
//                    public void onComplete() {
//
//                    }
//                });

    }

    private void getMatchInfo() {
        HttpUtil.getPubgApi().getMatchInfo(Region.Asia.getRegion(), "864aad5a-a3de-47fa-b282-a08303176429")
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<Response<ResponseBody>>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(Response<ResponseBody> responseBodyResponse) {
                        try {
                            Timber.d(responseBodyResponse.body().string());
                        } catch (IOException e) {

                        }
                    }

                    @Override
                    public void onError(Throwable e) {
                        Timber.e(e.toString());
                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }
}
