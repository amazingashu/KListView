package com.acrony.klistview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listcourse:ListView=findViewById(R.id.lvcourse)

        var arraofcourses= arrayOf("Android","Iphone","DOtNet","C++","Angular")

        val courseAdapter=ArrayAdapter(this,R.layout.lvitems,arraofcourses)

        listcourse.setAdapter(courseAdapter)

        listcourse.onItemClickListener=object :AdapterView.OnItemClickListener{
            override fun onItemClick(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {

                val selectedcourse=listcourse.getItemAtPosition(position) as String
                val selectedId=listcourse.getItemIdAtPosition(position) as String

                Toast.makeText(applicationContext,"Selected Course:"+selectedId,Toast
                        .LENGTH_LONG).show()
            }


        }

    }
}
