package com.example.user.routecontroller.moving;

import java.util.LinkedList;

import tuat.daily.phonepos.feature.name.Axis;
import tuat.daily.phonepos.window.window.Window;

/**
 * ユーザの移動状態を判別するクラス
 * スレッドでセンサ値を更新し，移動状態を整数値で返す責務を負う．
 * Created by user on 2016/10/11.
 */
public class MovingEstimatorImpl implements Runnable{

    public static final int WINDOW_SIZE = 256;
    public static final double SLIDING_RATE = 0.5;
    private MovingEstimator estimator;
    private InertialSensorObserver observer;
    private Window window;

    public MovingEstimatorImpl(MovingEstimator estimator,InertialSensorObserver observer){
        this.estimator = estimator;
        this.observer = observer;
        this.window = new Window(Axis.ACC_3AXIS,WINDOW_SIZE);
    }

    @Override
    public void run() {
        float[] sensorData = observer.getSensorData();
        double[] array = this.window.getArray();
        this.window.addElement((double) sensorData[0]);
        if(array == null) {
            return;
        }


    }
}
