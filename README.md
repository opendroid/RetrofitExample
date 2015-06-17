# RetrofitExample
This is a sample project to show how to use Square Retrofilt Library on your Android Programs.

#1) MainActivity: Main test activity.
#2) GetWeatherApi: The API to access weather
       - Async API: getWeatherFromApi, results are passed back to caller in a Callback
                                       on a different thread.
       - Sync API: getWeatherFromApiSync, not called from a UX thread. Blocking call, places the
                                       call from a thread.
#3) GetWeatherRestAdapter: Defines the REST adpater and also a container for Weather API.
#4)
