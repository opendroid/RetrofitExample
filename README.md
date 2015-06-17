# RetrofitExample

This is a sample project to show how to use Square Retrofit Library on your Android Programs.

1. MainActivity: Main test activity. Preserves state on rotation of device.
     - Uses material design construct by having styles.xml and v21/styles.xml works with colors.xml
     - Handles device rotation well.
     - Pay attention to runOnUiThread runnable. It takes cars of cases where 'runOnUiThread'
       may not update UX on roation as Activity may have been recrated.
2. GetWeatherApi: The API to access weather
       - Async API: getWeatherFromApi, results are passed back to caller in a Callback
                                       on a different thread.
       - Sync API: getWeatherFromApiSync, not called from a UX thread. Blocking call, places the
                                       call from a thread.
3. GetWeatherRestAdapter: Defines the REST adapter and also a container for Weather API.
4. WeatherData: is a plain old java object that mirrors names on the JSON response.
5. Open issues: Did not check error issues. So app may crash on Retrofit errors.

