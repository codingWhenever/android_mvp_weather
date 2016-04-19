package weather.leo.com.mvp_weather.model;

import android.content.Context;
import android.widget.Toast;

import com.google.gson.Gson;
import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.JsonHttpResponseHandler;
import com.loopj.android.http.RequestParams;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import cz.msebera.android.httpclient.Header;
import weather.leo.com.mvp_weather.presenter.IWeatherPresenter;

/**
 * Created by leo on 2016/4/18.
 */
public class CityWeatherModel {
    private static final String KEY = "965917c3a31095fddb01150003a1b95d";
    private static final String RESULT_CODE = "resultcode";
    private static final String REASON = "reason";
    IWeatherPresenter mIWeatherPresenter;
    private Context mContext;

    public CityWeatherModel(IWeatherPresenter mIWeatherPresenter, Context context) {
        this.mIWeatherPresenter = mIWeatherPresenter;
        this.mContext = context;
    }

    /**
     * 联网获取数据
     */
    public void loadData() {
        //深圳
        String url = "http://www.weather.com.cn/adat/sk/101280601.html";//中国天气网
        String url_juhe = "http://v.juhe.cn/weather/index";//聚合数据
        AsyncHttpClient asyncHttpClient = new AsyncHttpClient();
        RequestParams params = new RequestParams();
        params.add("cityname", "深圳");
        params.add("key", KEY);
        asyncHttpClient.get(url_juhe, params, new JsonHttpResponseHandler() {
            @Override
            public void onSuccess(int statusCode, Header[] headers, JSONObject response) {
                super.onSuccess(statusCode, headers, response);

                try {

                    //聚合数据
                    CityResultModelBean juheBean = new Gson().fromJson(response.toString(), CityResultModelBean.class);

                    if (response.getString(REASON).toString().equals("successed!") &&
                            response.getString(RESULT_CODE).toString().equals("200")) {
                        mIWeatherPresenter.loadDataSuccess(juheBean);

                    } else {
                        Toast.makeText(mContext, response.getString(REASON), Toast.LENGTH_SHORT).show();
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }

            }

            @Override
            public void onFailure(int statusCode, Header[] headers, Throwable throwable, JSONArray errorResponse) {
                super.onFailure(statusCode, headers, throwable, errorResponse);
                mIWeatherPresenter.loadDataFailure();
            }
        });
    }

}
