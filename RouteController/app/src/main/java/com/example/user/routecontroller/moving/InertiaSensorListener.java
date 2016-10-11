package com.example.user.routecontroller.moving;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;

import java.util.Arrays;

/**
 * Created by user on 2016/10/11.
 */
public class InertiaSensorListener implements SensorEventListener,InertialSensorObserver{

    private float[] sensorData;

    @Override
    public void onSensorChanged(SensorEvent event) {
        this.sensorData = Arrays.copyOf(event.values,event.values.length);
    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy) {

    }

    @Override
    public float[] getSensorData() {
        return Arrays.copyOf(this.sensorData,this.sensorData.length);
    }
}
