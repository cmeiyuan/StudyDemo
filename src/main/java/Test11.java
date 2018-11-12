import io.reactivex.*;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by cmy on 2018/6/25
 */
public class Test11 {

    public static Disposable disposable;

    public static void main(String[] args) {

        Observable.just("111")
                .create(new ObservableOnSubscribe<String>() {
                    @Override
                    public void subscribe(ObservableEmitter<String> emitter) throws Exception {
                        System.out.println("doing1:" + Thread.currentThread());

                        try{
                            Thread.sleep(500);
                        }catch (Exception e){

                        }

                        System.out.println("doing2:" + Thread.currentThread());

                        emitter.onNext("abc");
                        emitter.onNext("def");
                        emitter.onComplete();

                        System.out.println("end");
                    }
                })
                .subscribeOn(Schedulers.io())
                .observeOn(Schedulers.io())
                .subscribe(new Observer<String>() {
                    @Override
                    public void onSubscribe(Disposable d) {
                        System.out.println("onSubscribe():" + Thread.currentThread());
                        disposable = d;
                    }

                    @Override
                    public void onNext(String s) {
                        System.out.println("onNext:" + s);
                    }

                    @Override
                    public void onError(Throwable e) {
                        System.out.println("onError:" + e.getMessage());
                    }

                    @Override
                    public void onComplete() {
                        System.out.println("onComplete()");
                    }
                });

        System.out.println("start:" + Thread.currentThread());

        Flowable.just("111")
                .subscribeOn(Schedulers.newThread())
                .observeOn(Schedulers.io())
                .subscribe(new Consumer<String>() {
                    @Override
                    public void accept(String s) throws Exception {
                        System.out.println(s);
                    }
                });

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("test");
            }
        }).start();

    }


}
