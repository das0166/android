package com.daelim;

import android.util.Log;

public class myThread extends Thread{
    boolean flag = true;
    @Override
    public void run() {
        while(flag){
            try{
                Thread.sleep(4000);
                Log.e("~","음악이 시작되었습니다.");
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
    public void setFlag(boolean k){
        flag = k;
    }
}
