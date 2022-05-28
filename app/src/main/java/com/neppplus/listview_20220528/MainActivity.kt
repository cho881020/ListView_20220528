package com.neppplus.listview_20220528

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.neppplus.listview_20220528.datas.StudentData

class MainActivity : AppCompatActivity() {

    val mStudentList = ArrayList<StudentData>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mStudentList.add(  StudentData( "조경진", 1988, "서울시 동대문구" )  )
        mStudentList.add(  StudentData( "강도훈", 1997, "서울시 구로구" )  )
        mStudentList.add(  StudentData( "권석현", 1982, "서울시 동대문구" )  )
        mStudentList.add(  StudentData( "박대윤", 1988, "서울시 은평구" )  )
        mStudentList.add(  StudentData( "이무한", 1977, "서울시 성북구" )  )
        mStudentList.add(  StudentData( "이석", 1979, "서울시 동작구" )  )
        mStudentList.add(  StudentData( "이상민", 1979, "서울시 동대문구" )  )

    }
}