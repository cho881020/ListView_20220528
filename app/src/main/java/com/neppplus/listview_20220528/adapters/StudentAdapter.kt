package com.neppplus.listview_20220528.adapters

import android.content.Context
import android.widget.ArrayAdapter
import com.neppplus.listview_20220528.datas.StudentData

class StudentAdapter(
    val mContext: Context,
    val resId: Int,
    val mList: ArrayList<StudentData>
) : ArrayAdapter<StudentData>(mContext, resId, mList) {
}