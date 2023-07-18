package jp.ac.it_college.std.s22016.hellosample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import jp.ac.it_college.std.s22016.hellosample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //setContentView(R.layout.activity_main)

        //val btClick = findViewById<Button>(R.id.btClick)
        val listener = HelloListener()
        binding.btClick.setOnClickListener(listener)
    }
    private inner class HelloListener : View.OnClickListener {
        override fun onClick(v: View?) {
            // val input = findViewById<EditText>(R.id.etName)
            // val input = binding.etName

            //val output = findViewById<TextView>(R.id.tvOutput)
            // val output = binding.tvOutput
            val input = binding.etName
            val output = binding.tvOutput
            val inputStr = binding.etName.text.toString()

            binding.tvOutput.text = "${inputStr}さん、こんにちは"
        }

    }
}