package thirdpaty

import groovy.Song

class SongExample {
    static void main(args) {
        //使用Song自动生成的constructor
        def sng1 = new Song(name: "le freak")
        def sng2 = new Song(name: "le freak", artist:"chic")
        def sng3 = new Song(name: "le freak", artist:"chic", genre: "disco")
        println sng1.name + "-" + sng1.artist + "-" + sng1.genre
        println sng2.name + "-" + sng2.artist + "-" + sng1.genre
        println sng3.name + "-" + sng3.artist + "-" + sng1.genre
        println sng1.artist?.toUpperCase()//使用 ? 可以有效的防止NPE的发生

        //还可以如下直接操作song，但是如果Song class中的field被private修饰，则不会生成getter和setter
        def sng4 = new Song()
        sng4.name = "Funkytown"
        sng4.artist = "Lipps Inc."
        println sng4.artist
        sng4.setGenre("Disco")
        sng4.setGenre "no Disco"
        assert sng4.getArtist() == "Lipps Inc."
        println sng4.genre.toUpperCase()

        //闭包在方法中的定义和调用
        println "----------"
        def excite = { word ->
            return "${word}!!"
        }
        println excite("hello closure!")
    }
}
