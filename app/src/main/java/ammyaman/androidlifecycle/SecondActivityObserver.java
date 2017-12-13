package ammyaman.androidlifecycle;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.OnLifecycleEvent;
import android.util.Log;

/**
 * Created by CH-E01449 on 13-12-2017.
 */

public class SecondActivityObserver implements LifecycleObserver {

    private static final String TAG = SecondActivityObserver.class.getSimpleName();

    public SecondActivityObserver(LifecycleOwner lifecycleOwner) {
        lifecycleOwner.getLifecycle().addObserver(this);
    }
@OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    void onCreate() {
        Log.e(TAG, "On Create Called");
    }
    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    void onStart() {
        Log.e(TAG, "On Start Called");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    void onResume() {
        Log.e(TAG, "On Resume Called");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    void onPause() {
        Log.e(TAG, "On Pause Called");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    void onStop() {
        Log.e(TAG, "On Stop Called");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    void onDestroy() {
        Log.e(TAG, "On Destroy Called");
    }


}
