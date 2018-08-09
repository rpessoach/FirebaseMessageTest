package com.qxl.Client.Beta;
import android.util.Log;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

public class NotificationMessagingService extends FirebaseMessagingService {
private static String TAG = "NotificationMessagingService";
  @Override
  public void onMessageReceived(RemoteMessage remoteMessage) {
    Log.d(TAG, "From: " + remoteMessage.getFrom());
  }

  @Override
  public void onNewToken(String s) {
    super.onNewToken(s);
  Log.d(TAG, s);
  }
}
