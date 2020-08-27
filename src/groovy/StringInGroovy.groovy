//groovy中的字符串
def a = 'Hello Single'//单引号
def b = "Hello Double"//双引号
def c = "'Hello Triple " +
        "Multiple lines'"//三引号，跨多行
println a
println b
println c

//字符串索引
println '----------'
def sample = "Hello world"
println(sample[4]) 
println(sample[-1])
println(sample[1..2]) 
println(sample[4..2]) 
