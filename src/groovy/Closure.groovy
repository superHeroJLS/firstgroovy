//groovy闭包，java中类似于闭包的结构就是只有一个方法的接口，比如Runable
def acoll = ["groovy", "java", "ruby"]
//each()括号中的代码就是closure
acoll.each((it) -> {println it})
//上述代码可以写的更简单一点
acoll.each(it -> {println it})
//还可以再简单一点
acoll.each {println it}

//Map使用闭包进行迭代
println "-----map iterated by closure-----"
def hash = [name:"Andy", "VPN-#":45]
hash.each{ key, value ->
    println "${key} : ${value}"
}
//闭包的使用方式，定义 > 调用
def excite = { word ->
    return "${word}!!"
}
def excite2 = { word ->
    return word + "!!"
}
println excite("groovy")
println excite.call("groovy")
println excite2("groovy2")
println excite2.call("groovy2")

//最简单的closure定义，一个形参不用定义
println '----------'
def clos = {println "Hello ${it}"};
clos("World");

//closure在定义的时候接受形参和变量
println '----------'
def str1 = "Hello";
def cl = {param -> println "${str1} ${param}"}
cl.call("World");

//closure作为方法参数，groovy很多方法都以closure作为参数，例如DefaultGroovyMethods
println '----------'
def display(clo) {
    // This time the $param parameter gets replaced by the string "Inner"
    clo.call("Inner");
}
display(cl)

println '----------'
def text ='This Tutorial focuses on $TutorialName. In this tutorial you will learn about $Topic'
def binding = ["TutorialName":"Groovy", "Topic":"Templates"]
def engine = new groovy.text.SimpleTemplateEngine()
def template = engine.createTemplate(text).make(binding)
println template

