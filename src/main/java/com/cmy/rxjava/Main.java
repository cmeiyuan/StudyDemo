package com.cmy.rxjava;

import io.reactivex.Flowable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cmy on 2017/10/15
 */
public class Main {

    public static void main(String[] args) {
        List<Flowable<String>> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(Flowable.just(String.valueOf(i))
                    .subscribeOn(Schedulers.newThread())
                    .map(new Function<String, String>() {
                        @Override
                        public String apply(String s) throws Exception {

                            System.out.println("thread id:" + Thread.currentThread().getId());

                            System.out.println("start:" + s);
                            Thread.sleep(500);
                            System.out.println("end:" + s);

                            return "map" + s;
                        }
                    }));
        }

        Flowable.zip(list, new Function<Object[], String>() {

            @Override
            public String apply(Object[] strings) throws Exception {

                System.out.println(strings.length);

                return "success";
            }
        }).observeOn(Schedulers.newThread())
                .blockingSubscribe(new Consumer<String>() {
                    @Override
                    public void accept(String s) throws Exception {
                        System.out.println(s);
                    }
                });

    }

}
