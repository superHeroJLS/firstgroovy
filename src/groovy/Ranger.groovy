//groovy中的集合
//不需要类似java import > define > add，groovy的集合操作非常方便
def range = 0..4//这里def甚至可以去掉，都不影响运行，groovy会自动推测类型
for (i in range)
	println i
println range.class
assert range instanceof List

//Groovy 的魔法背后，一切都是标准的 Java 对象。每个 Groovy 集合都是 java.util.Collection 或 java.util.Map 的实例。
println "----------"
def coll = ["Groovy", "Java", "Ruby"]
println coll.class
assert  coll instanceof Collection
assert coll instanceof ArrayList

//集合添加新元素
coll[3] = "Perl"
coll.add "Python"
coll << "Smalltalk"
for (i in coll)
	println i

//检索元素
assert coll[1] == "Java"

//集合增加删除集合
def numbers = [1,2,3,4]
assert numbers + 5 == [1,2,3,4,5]
assert numbers - [2,3] == [1,4]

//可以在集合实例上调用特殊的方法，分布操作符（spread operator） 是个特别方便的工具，使用这个工具不用在集合上迭代，就能够调用集合的每个项上的方法。
def numbers1 = [1,2,3,4]
assert numbers1.join(",") == "1,2,3,4"
assert [1,2,3,4,3].count(3) == 2

//集合字符串转大写，注意 *. 标记。对于以上列表中的每个值，都会调用 toUpperCase()，生成的集合中每个 StringInGroovy 实例都是大写的
assert ["JAVA", "GROOVY"] == ["Java", "Groovy"]*.toUpperCase()

//groovy中的Map
//Groovy 映射中的键不必是 StringInGroovy。在这个示例中，name 看起来像一个变量，但是在幕后，Groovy 会将它变成 StringInGroovy。
println "----------"
def hash = [name:"Andy", "VPN-#":45]
assert hash.getClass() == java.util.LinkedHashMap
for(i in hash)
	println i











