//groovy中文件操作
//逐行读取文件内容
new File("D:/example.props").eachLine{line -> println line}
new File("D:/example.props").eachLine {println it}

//读取文件内容到字符串
println '----------'
println new File("d:/example.props").text

//写入文件内容
println '----------'
new File('d:/','examplew.txt').withWriterAppend('utf-8') {
    writer -> writer.writeLine 'Hello World!'
}

//获取文件大小
println '----------'
def file = new File(new URI("file:///D:/gradle/gradle-5.6.3-all/gradle-5.6.3/getting-started.html"))
println "The file ${file.absolutePath} has ${file.length()/1024} kbytes!"

//判断目录
def file1 = new File('d:/')
println "File? ${file1.isFile()}"
println "Directory? ${file1.isDirectory()}"

//创建目录，如果不存在
println '----------'
def file2 = new File('d:/test')
println 'mkdir?' + file2.mkdir()

//删除文件
def file3 = new File('d:/test.txt')
println 'delete?' + file3.delete()

//复制文件
def src = new File("d:/example.props")
def dst = new File("d:/test/example1.txt")
println dst << src.text

//显示所有驱动器
def rootFiles = new File("test").listRoots()
rootFiles.each {
    f -> println f.absolutePath
}

//列出目录中文件和子文件夹名称
println '----------'
new File("d:/test").eachFile() {
    f->println f.getAbsolutePath()
}

//递归列出目录中的文件，闭包可以递归调用自身
println '----------'
irecusive = {File f ->
    if (f.isDirectory()) {
        println 'dir:' + f.absolutePath
        f.eachFile {ff -> irecusive(ff)}
    } else {
        println f.absolutePath
    }
}
//irecusive(new File("d:/test"))

//groovy递归文件
println '----------'
new File("d:/test").eachFileRecurse() {
    f -> println f.getAbsolutePath()
}




