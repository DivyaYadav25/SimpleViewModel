package com.example.testdatabinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import com.example.testdatabinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var viewModel : SimpleViewModel?= null
    private lateinit var mBinding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        viewModel = ViewModelProviders.of(this).get(SimpleViewModel::class.java)
        mBinding.lifecycleOwner = this
        mBinding.viewModel = viewModel
    }
}
