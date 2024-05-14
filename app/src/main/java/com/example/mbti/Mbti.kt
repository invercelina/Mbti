package com.example.mbti

open class Mbti(val ie: String, val sn: String, val tf: String, val jp: String) {
    val mbti: String = ie + sn + tf + jp
    val comment: String = "당신의 MBTI는 $mbti 입니다."
    open fun mbtiPrint() {
        println(comment)
    }
}

class Analysts(ie: String, jp: String) : Mbti(ie, "N", "T", jp) {
    val type: String = "분석가형"
    val analystsComment: String = "당신의 MBTI는 분석가형입니다."
    override fun mbtiPrint() {
        super.mbtiPrint()
        println(analystsComment)
    }
}

class Diplomats(ie: String, jp: String) : Mbti(ie, "N", "F", jp) {
    val type: String = "외교관형"
    val diplomatsComment: String = "당신의 MBTI는 외교관형입니다."
    override fun mbtiPrint() {
        super.mbtiPrint()
        println(diplomatsComment)
    }
}

class Sentinels(ie: String, tf: String) : Mbti(ie, "S", tf, "J") {
    val type: String = "관리자형"
    val sentinelsComment: String = "당신의 MBTI는 관리자형입니다."
    override fun mbtiPrint() {
        super.mbtiPrint()
        println(sentinelsComment)
    }
}

class Explorers(ie: String, tf: String) : Mbti(ie, "S", tf, "P") {
    val type: String = "탐험가형"
    val explorersComment: String = "당신의 MBTI는 탐험가형입니다."
    override fun mbtiPrint() {
        super.mbtiPrint()
        println(explorersComment)
    }
}

val persona1 = Analysts("I","J")
persona1.mbtiPrint()
println(persona1.mbti)
val persona2 = Diplomats("I","J")
persona2.mbtiPrint()
println(persona2.mbti)
