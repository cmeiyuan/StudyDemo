package com.cmy.rxjava;

import io.reactivex.Flowable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;
import org.reactivestreams.Publisher;

/**
 * Created by cmy on 2017/10/15
 */
public class Test1 {

    public static void main(String[] args) {


        Flowable.just("1")
                .map(new Function<String, Object>() {
                    @Override
                    public Object apply(String s) throws Exception {
                        System.out.println(s + " id:" + Thread.currentThread().getId());
                        return s;
                    }
                })
                .subscribeOn(Schedulers.io())
                .subscribe(new Consumer<Object>() {
            @Override
            public void accept(Object o) throws Exception {
                System.out.println(o + " return id:" + Thread.currentThread().getId());
            }
        });

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }

}
