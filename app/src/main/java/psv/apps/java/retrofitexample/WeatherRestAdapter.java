/**
 * Created by ajaythakur on 6/16/15.
 */
package psv.apps.java.retrofitexample;

import android.util.Log;

import retrofit.Callback;
import retrofit.RestAdapter;

public class WeatherRestAdapter {
    protected final String TAG = getClass().getSimpleName();
    protected RestAdapter mRestAdapter;
    protected WeatherApi mApi;
    static final String WEATHER_URL="http://api.openweathermap.org";
    static final String OPEN_WEATHER_API = "51337ba29f38cb7a5664cda04d84f4cd";

    public WeatherRestAdapter() {
        mRestAdapter = new RestAdapter.Builder()
                .setLogLevel(RestAdapter.LogLevel.FULL)
                .setEndpoint(WEATHER_URL)
                .setErrorHandler(new WeatherApiErrorHandler())
                .build();
        mApi = mRestAdapter.create(WeatherApi.class); // create the interface
        Log.d(TAG, "WeatherRestAdapter -- created");
    }

    public void testWeatherApi(String city, Callback<WeatherData> callback){
        Log.d(TAG, "testWeatherApi: for city:" + city);
        mApi.getWeatherFromApi(city, OPEN_WEATHER_API, callback);
    }

    public WeatherData testWeatherApiSync(String city) {
        WeatherData result;
        Log.d(TAG, "testWeatherApi: for city:" + city);
        result = mApi.getWeatherFromApiSync(city,OPEN_WEATHER_API);
        return result;
    }
}
