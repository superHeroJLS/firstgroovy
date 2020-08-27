import groovy.Computer

//groovy元对象编程，groovy在运行时轻松地为对象指定新方法和属性
//Computer必须implements GroovyInterceptable
def computer = new Computer();
computer.cpu = 'intel'
println computer.cpu
computer.addMarks()

//修改private field，方法缺失
println '----------'
computer.name = 'lenovo'
println computer.name
computer.tttt()
