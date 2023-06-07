package org.example.chaino_responsibility;

public class LoggingHandler extends Handler {
    public LoggingHandler(Handler next) {
        super(next);
    }

    @Override
    boolean process(Request request) {
        System.out.println("登录验证。。。");
        if (request.isLoggedOn()) {
            Handler next = getNext();
            if (next == null) {
                return true;
            }
            return next.process(request);
        }
        return false;
    }
}
