package demo

/**
 * jiangls 2020/08/25
 */
enum DemoEnum {
    FIRST("fir"),SECOND("sec")

    private String attr;

    DemoEnum(String attr) {
        this.attr = attr
    }

    String getAttr() {
        return attr
    }

    void setAttr(String attr) {
        this.attr = attr
    }
}