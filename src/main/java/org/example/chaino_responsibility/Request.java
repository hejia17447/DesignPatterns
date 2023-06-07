package org.example.chaino_responsibility;
public class Request {

    private final boolean loggedOn;

    private final boolean frequentOk;

    private final boolean isPermits;

    private final boolean containsSensitiveWords;

    private String requestBody;

    public Request(boolean loggedOn, boolean frequentOk, boolean isPermits, boolean containsSensitiveWords) {
        this.loggedOn = loggedOn;
        this.frequentOk = frequentOk;
        this.isPermits = isPermits;
        this.containsSensitiveWords = containsSensitiveWords;
    }

    static class RequestBuilder {
        private boolean loggedOn;

        private boolean frequentOk;

        private boolean isPermits;

        private boolean containsSensitiveWords;

        RequestBuilder loggedOn(boolean loggedOn) {
            this.loggedOn = loggedOn;
            return this;
        }

        RequestBuilder frequentOk(boolean frequentOk) {
            this.frequentOk = frequentOk;
            return this;
        }

        RequestBuilder isPermits(boolean isPermits) {
            this.isPermits = isPermits;
            return this;
        }

        RequestBuilder containsSensitiveWords(boolean containsSensitiveWords) {
            this.containsSensitiveWords = containsSensitiveWords;
            return this;
        }

        public Request build() {
            return new Request(loggedOn, frequentOk, isPermits, containsSensitiveWords);
        }

    }

    public boolean isLoggedOn() {
        return loggedOn;
    }
    public boolean isFrequentOk() {
        return frequentOk;
    }
    public boolean isPermits() {
        return isPermits;
    }
    public boolean isContainsSensitiveWords() {
        return containsSensitiveWords;
    }

}
