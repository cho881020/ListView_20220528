package com.neppplus.listview_20220528.datas

class StudentData(
    val name: String,
    val birthYear: Int,
    val address: String,
) {

    fun getKoreanAge( year: Int ) : Int {

        val koreanAge =  year - this.birthYear + 1

        return koreanAge

    }

}