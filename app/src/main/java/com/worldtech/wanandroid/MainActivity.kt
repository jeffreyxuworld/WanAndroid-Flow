package com.worldtech.wanandroid

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.worldtech.wanandroid.databinding.ActivityMainBinding
import kotlinx.coroutines.flow.flow

class MainActivity : AppCompatActivity() {

    private var binding: ActivityMainBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)

    }


//    private suspend fun testFlow() {
//        //上游操作符，创建Flow的同时，发射数据
//        flow {
//            emit(1)
//            emit(2)
//            emit(3)
//            emit(4)
//            emit(5)
//        }.collect {
//                //终止操作符，接收数据
//                Log.i("xulei", it.toString())
//            }
//    }

}