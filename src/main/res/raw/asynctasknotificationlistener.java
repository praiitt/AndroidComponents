package raw;

public interface AsyncTaskNotificationListener<T> {
    void onTaskFinished(AsyncTaskWithNotifications asyncTask, T result);
    void onTaskCancelled(AsyncTaskWithNotifications asyncTask);
}