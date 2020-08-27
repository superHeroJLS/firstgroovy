package groovy

/**
 * jiangls 2020/08/26
 */
class Computer implements GroovyInterceptable {
    private def name = 'hp'
    protected dynamicProps=[:]

    void setProperty(String pName,val) {
        dynamicProps[pName] = val
    }

    def getProperty(String pName) {
        dynamicProps[pName]
    }

    //动态调用Computer未定义的方法时，不会报错
    def invokeMethod(String name, Object args) {
        return "called invokeMethod $name $args"
    }

    //Computer对象方法缺失时会调用这个方法，但如果有invokeMethod(String name, Object args)就不会调用这个方法
    def methodMissing(String name, def args) {
        println "Missing method"
    }
}
