package psv.apps.java.retrofitexample;

import android.util.Log;

import retrofit.ErrorHandler;
import retrofit.RetrofitError;
import retrofit.client.Response;

/**
 * Created by ajaythakur on 6/16/15.
 */
public class WeatherApiErrorHandler implements ErrorHandler {
    protected final String TAG = getClass().getSimpleName();
    @Override
    public Throwable handleError(RetrofitError cause) {
        Response r = cause.getResponse();
        if (r != null && r.getStatus() == 401) {
            Log.e(TAG, "Error:", cause);
        }
        return cause;

    }
}
