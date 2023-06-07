package org.example.chaino_responsibility;

public class RequestFrequentHandler extends Handler {
    public RequestFrequentHandler(Handler next) {
        super(next);
    }

    @Override
    boolean process(Request request) {
        System.out.println("访问频率控制。。。");
        if (request.isFrequentOk()) {
            Handler next = getNext();
            if (next == null) {
                return true;
            }
            return next.process(request);
        }
        return false;
    }
}
