package weather.leo.com.mvp_weather.view;

/**
 * Created by leo on 2016/4/18.
 */
public interface WeatherView<T> {
    /**
     * 展示数据
     * @param
     */
    void showData(T t);

    /**
     * 显示loading
     */
    void showProgress();

    /**
     * 隐藏loading
     */
    void hideProgress();
}
