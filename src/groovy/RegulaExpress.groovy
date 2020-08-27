//groovy正则表达式
def pattern = ~'Gro{2}vy'
println pattern.class
def matcher = 'lxt'=~'lxt'
println matcher.class
println matcher.matches()

println '----------'
def matcher1 = 'Groovy'=~'∧G'
println matcher1.matches()