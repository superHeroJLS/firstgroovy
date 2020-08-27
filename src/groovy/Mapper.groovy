//groovy中的Map
def hash = [name:"Andy", "VPN-#":45]
assert hash.getClass() == java.util.LinkedHashMap
//put get
hash.put("id", 23)
assert hash.get("name") == "Andy"
//.符号
hash.dob = "01/29/76"
println hash.dob
println "----------"
//[]语法，[]中的key一定是String
hash["gender"] = "male"
println hash["gender"]
println "----------"

for(i in hash)
    println i.key + ":" + i.value