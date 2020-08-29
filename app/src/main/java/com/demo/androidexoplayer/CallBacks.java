package com.demo.androidexoplayer;

public interface CallBacks {

    void callbackObserver(Object obj);

     interface playerCallBack {
        void onItemClickOnItem(Integer albumId);

        void onPlayingEnd();
    }
}
