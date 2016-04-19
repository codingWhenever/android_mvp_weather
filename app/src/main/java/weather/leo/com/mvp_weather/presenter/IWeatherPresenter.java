package weather.leo.com.mvp_weather.presenter;

import weather.leo.com.mvp_weather.model.CityResultModelBean;

/**
 * Created by leo on 2016/4/18.
 */
public interface IWeatherPresenter<T> {
    void loadDataSuccess(CityResultModelBean cityWeatherModelBean);

    void loadDataFailure();
}
