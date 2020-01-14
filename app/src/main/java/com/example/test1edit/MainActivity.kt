package com.example.test1edit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.test1edit.databinding.EdittextBinding
import kotlinx.android.synthetic.main.edittext.*

class MainActivity : AppCompatActivity() {

    private lateinit var binding: EdittextBinding



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.edittext)
        binding = DataBindingUtil.setContentView(this, R.layout.edittext)
        binding.btnSub.setOnClickListener()
        {
            var name:String=binding.editText1.text.toString()
            var occupation:String=binding.editText2.text.toString()
            var name1:Edittext= Edittext(name,occupation)
            binding.name=name1
        }
    }
}

