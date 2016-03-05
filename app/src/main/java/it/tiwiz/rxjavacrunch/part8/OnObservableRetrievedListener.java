package it.tiwiz.rxjavacrunch.part8;

import android.support.annotation.NonNull;
import android.support.annotation.StringDef;

import rx.Observable;

public interface OnObservableRetrievedListener {
    String PUBLISH = "PublishSubject";
    String ASYNC = "AsyncSubject";

    @StringDef({PUBLISH, ASYNC})
    @interface Subjects{}

    void onObservableRetrieved(@NonNull Observable<Integer> observable, @Subjects String type);
}