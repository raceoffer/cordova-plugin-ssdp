package capital.spatium.plugin.ssdp.network;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

public class NetworkUtil {

    public static NetworkInfo getNetworkInfo(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();

        return activeNetworkInfo;
    }

    public static String getConnectivityTypeString(NetworkInfo activeNetworkInfo) {
        switch (activeNetworkInfo.getType()) {
            case ConnectivityManager.TYPE_WIFI:
                return "WiFi";
            case ConnectivityManager.TYPE_MOBILE:
                return "Mobile";
            default:
                return "Not connected";
        }
    }

    public static String getConnectivityStatusString(NetworkInfo activeNetworkInfo) {
        switch (activeNetworkInfo.getState()) {
            case CONNECTED:
                return "Connected";
            case CONNECTING:
                return "Connecting";
            case DISCONNECTED:
                return "Disconnected";
            case DISCONNECTING:
                return "Disconnecting";
            case SUSPENDED:
                return "Suspended";
            case UNKNOWN:
                return "Unknown";
            default:
                return "???";
        }
    }
}