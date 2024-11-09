package org.fersho.review_ch06.q23;

class Canine {
    public Canine(boolean t) {
        looger.append("a");
    }

    public Canine() {
        looger.append("q");
    }

    private StringBuilder looger = new StringBuilder();

    protected void print(String v) {
        looger.append(v);
    }

    protected String view() {
        return looger.toString();
    }
}
