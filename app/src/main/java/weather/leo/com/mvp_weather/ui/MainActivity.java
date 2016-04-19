package weather.leo.com.mvp_weather.ui;

import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;

import weather.leo.com.mvp_weather.R;
import weather.leo.com.mvp_weather.model.CityResultModelBean;
import weather.leo.com.mvp_weather.presenter.WeatherPresenter;
import weather.leo.com.mvp_weather.view.WeatherView;

public class MainActivity extends AppCompatActivity implements WeatherView<CityResultModelBean> {

    private ProgressBar mProgressBar;
    private TextView mTextView;
    private WeatherPresenter mWeatherPresenter;
    private Handler mHandler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    /**
     * init
     */
    private void initView() {
        mTextView = (TextView) findViewById(R.id.text);
        mProgressBar = (ProgressBar) findViewById(R.id.mProgressBar);
        mWeatherPresenter = new WeatherPresenter(this, this);
        mWeatherPresenter.attachView(this);
        mHandler.postDelayed(new Runnable() {
            @Override
            public void run() {
                mWeatherPresenter.loadData();
            }
        }, 2000);
    }

    @Override
    public void showData(CityResultModelBean bean) {

        CityResultModelBean.ResultBean.TodayBean today = bean.getResult().getToday();

        String showData = getResources().getString(R.string.city) + today.getCity()
                + getResources().getString(R.string.temp) + today.getTemperature()
                + getResources().getString(R.string.wd) + today.getWind()
                + getResources().getString(R.string.advice) + today.getDressing_advice()
                + getResources().getString(R.string.time) + today.getDate_y();
        mTextView.setText(showData);
    }

    @Override
    public void showProgress() {
        if (mProgressBar != null) {
            mProgressBar.setVisibility(View.VISIBLE);
        }
    }

    @Override
    public void hideProgress() {
        if (mProgressBar != null) {
            mProgressBar.setVisibility(View.GONE);
        }
    }

    @Override
    protected void onDestroy() {
        mHandler.removeCallbacksAndMessages(null);
        mWeatherPresenter.detachView();
        super.onDestroy();
    }
}
