package br.digitalhouse.appaulatesterevisao.wifi

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.net.wifi.WifiManager

class NetworkReceiver: BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        var wifiState =
            intent?.getIntExtra(WifiManager.EXTRA_WIFI_STATE, WifiManager.WIFI_STATE_UNKNOWN)
        when (wifiState) {
            WifiManager.WIFI_STATE_ENABLED -> {
                var intent = Intent(context, TelaVerde::class.java)
                context?.startActivity(intent)
            }
            WifiManager.WIFI_STATE_DISABLED -> {
                var intent = Intent(context, TelaVermelha::class.java)
                context?.startActivity(intent)
            }
        }
    }
}