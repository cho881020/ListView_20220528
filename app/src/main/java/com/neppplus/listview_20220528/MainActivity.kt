package com.neppplus.listview_20220528

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.neppplus.listview_20220528.adapters.StudentAdapter
import com.neppplus.listview_20220528.datas.StudentData
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val mStudentList = ArrayList<StudentData>()

    lateinit var mAdapter :  StudentAdapter

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

        mAdapter = StudentAdapter( this, R.layout.student_list_item, mStudentList )

        studentListView.adapter = mAdapter

        studentListView.setOnItemClickListener { adapterView, view, position, l ->

            val clickedStudent = mStudentList[position]

            Toast.makeText(this, "${clickedStudent.name} 클릭됨", Toast.LENGTH_SHORT).show()

        }

        studentListView.setOnItemLongClickListener { adapterView, view, position, l ->

            val longClickedStudent = mStudentList[position]

//            Toast.makeText(this, "${longClickedStudent.name} 길게 클릭됨", Toast.LENGTH_SHORT).show()

            val alert = AlertDialog.Builder(this)
                .setTitle("삭제 확인")
                .setMessage("정말 ${longClickedStudent.name} 학생을 삭제 하시겠습니까?")
                .setPositiveButton("확인", DialogInterface.OnClickListener { dialogInterface, i ->

                    mStudentList.remove( longClickedStudent )

                    mAdapter.notifyDataSetChanged()

                })
                .setNegativeButton("취소", null)
                .show()



            return@setOnItemLongClickListener true
        }

    }
}