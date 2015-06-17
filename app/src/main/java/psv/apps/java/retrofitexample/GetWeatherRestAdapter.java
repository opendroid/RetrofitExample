package psv.apps.java.retrofitexample;

import android.util.Log;

import retrofit.Callback;
import retrofit.RestAdapter;

/**
 * Created by ajaythakur on 6/16/15.
 */
public class GetWeatherRestAdapter {
    protected final String TAG = getClass().getSimpleName();
    protected RestAdapter mRestAdapter;
    protected GetWeatherApi mApi;
    static final String WEATHER_URL="http://api.openweathermap.org";

    public GetWeatherRestAdapter() {
        mRestAdapter = new RestAdapter.Builder()
                .setLogLevel(RestAdapter.LogLevel.FULL)
                .setEndpoint(WEATHER_URL)
                .setErrorHandler(new WeatherApiErrorHandler())
                .build();
        mApi = mRestAdapter.create(GetWeatherApi.class); // create the interface
        Log.d(TAG, "GetWeatherRestAdapter -- created");
    }

    public void testWeatherApi(String city, Callback<WeatherData> callback){
        Log.d(TAG, "testWeatherApi: for city:" + city);
        mApi.getWeatherFromApi(city, callback);
    }

    public WeatherData testWeatherApiSync(String city) {
        WeatherData result=null;
        Log.d(TAG, "testWeatherApi: for city:" + city);
        result = mApi.getWeatherFromApiSync(city);
        return result;
    }
}
