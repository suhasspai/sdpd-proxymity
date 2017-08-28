package com.sdpd.proxymity;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.util.Log;

/**
 * Created by Suhas on 28 Aug 2017.
 */

public class ProximitySensor implements SensorEventListener {
	private SensorManager mSensorManager;

	private MainActivity activity;

	private static String TAG="ProxyMity";

	public ProximitySensor(MainActivity activity) {
		this.activity=activity;
		mSensorManager=(SensorManager)this.activity.getSystemService(Context
			.SENSOR_SERVICE);
		if (mSensorManager.getDefaultSensor(Sensor
			.TYPE_PROXIMITY)!=null){
			Log.d(TAG, "Success! There's a proximity sensor.");
			registerProximitySensorListener();
		} else {
			Log.e(TAG, "Failure! No proximity sensor.");
			AlertDialog dialog=new AlertDialog.Builder(activity)
				.setNeutralButton(R.string.ok,
					new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface dialog, int which) {
							System.exit(1);
						}
					}).setMessage(R.string.proximityError).create();
			dialog.show();
		}
	}

	public void registerProximitySensorListener() {
		mSensorManager.registerListener(this, mSensorManager
			.getDefaultSensor(Sensor.TYPE_PROXIMITY), SensorManager
			.SENSOR_DELAY_NORMAL, SensorManager.SENSOR_DELAY_UI);
		Log.d(TAG, "Event listener registered!");
	}

	public void unregisterProximitySensorListener() {
		mSensorManager.unregisterListener(this);
		Log.d(TAG, "Event listener unregistered!");
	}

	@Override
	public void onSensorChanged(SensorEvent event) {
		Log.d(TAG, "Sensor value changed!");
		if (event.sensor==mSensorManager.getDefaultSensor
			(Sensor.TYPE_PROXIMITY)) {
			Log.d(TAG, "Proximity sensor value changed!");
			Log.d(TAG, String.valueOf(event.values[0]));
			this.activity.updateText(event.values[0]);
		}
	}

	@Override
	public void onAccuracyChanged(Sensor sensor, int accuracy) {
		Log.d(TAG, "Sensor accuracy changed!");
	}
}
