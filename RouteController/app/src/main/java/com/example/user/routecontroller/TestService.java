package com.example.user.routecontroller;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.support.annotation.Nullable;

/**
 * Created by user on 2016/10/11.
 */
public class TestService extends Service{

    private Messenger messenger;

    @Override
    public void onCreate(){
        this.messenger = new Messenger(new MyHandler(getApplicationContext()));
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return this.messenger.getBinder();
    }









    class MyHandler extends Handler{

        private Context context;

        public MyHandler(Context context){
            this.context = context;
        }

        @Override
        public void handleMessage(Message message){

        }

    }







}
