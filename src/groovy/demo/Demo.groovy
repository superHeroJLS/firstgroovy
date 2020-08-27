package demo
/**
 * jiangls 2020/08/25
 */
@DemoAnnotation
class Demo implements DemoInterface{
    static void main(String[] args) {
        new Demo().print()
        println "----------"
        new Demo().printEnumName()
    }

    void print() {
        println "this is extends method pring"
    }

    void printEnumName() {
        println DemoEnum.FIRST.name()
        println DemoEnum.FIRST.getAttr()
        println DemoEnum.SECOND.name()
        println DemoEnum.SECOND.getAttr()

    }
}
