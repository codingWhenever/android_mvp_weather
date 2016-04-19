package weather.leo.com.mvp_weather.presenter;

import android.content.Context;

import weather.leo.com.mvp_weather.model.CityResultModelBean;
import weather.leo.com.mvp_weather.model.CityWeatherModel;
import weather.leo.com.mvp_weather.view.WeatherView;

/**
 * Created by leo on 2016/4/18.
 */
public class WeatherPresenter implements IPresenter<WeatherView>, IWeatherPresenter<CityResultModelBean> {
    private WeatherView mWeatherView;
    private CityWeatherModel mCityWeatherModel;


    public WeatherPresenter(WeatherView mWeatherView, Context context) {
        this.mWeatherView = mWeatherView;
        mCityWeatherModel = new CityWeatherModel(this, context);
    }

    @Override
    public void attachView(WeatherView view) {
        this.mWeatherView = view;
    }

    @Override
    public void detachView() {
        this.mWeatherView = null;
    }

    @Override
    public void loadDataSuccess(CityResultModelBean cityWeatherModelBean) {
        mWeatherView.showData(cityWeatherModelBean);
        mWeatherView.hideProgress();
    }

    @Override
    public void loadDataFailure() {
        mWeatherView.hideProgress();
    }

    /**
     * load data
     */
    public void loadData() {
        mWeatherView.showProgress();
        mCityWeatherModel.loadData();
    }
}
