package groovy

//groovy中的类，groovy类本质上就是java类
class Song {
    def name;
    def artist;
    def genre;

    //override toString
    String toString(){
//        return name + "," + artist + "," + genre
//        return "${name},${artist}, ${genre}"
        "${name},${artist}, ${genre}"//return都可以省略，groovy默认返回最后一行
    }

}
