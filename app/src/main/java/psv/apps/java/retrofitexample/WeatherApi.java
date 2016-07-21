/**
 * Created by ajaythakur on 6/16/15.
 */
package psv.apps.java.retrofitexample;

import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Query;

public interface WeatherApi {
    @GET("/data/2.5/weather")
    void getWeatherFromApi (
            @Query("q") String cityName,
            @Query("APPID") String appId,
            Callback<WeatherData> callback);
    @GET("/data/2.5/weather")
    WeatherData getWeatherFromApiSync (
            @Query("q") String cityName,
            @Query("APPID") String appId);
}
