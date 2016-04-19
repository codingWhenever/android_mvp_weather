package weather.leo.com.mvp_weather.presenter;

/**
 * Created by leo on 2016/4/18.
 */
public interface IPresenter<V> {
    void attachView(V view);

    void detachView();
}
