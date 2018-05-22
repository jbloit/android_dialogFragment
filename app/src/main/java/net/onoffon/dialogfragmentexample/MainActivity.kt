package net.onoffon.dialogfragmentexample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), AlarmFirst.OnSomeValueChanged {


    override fun onSomeValueChanged(value: Int) {
        text_someValue.text = "value : $value"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button_showDialog.setOnClickListener{
            val pop = AlarmFirst.newInstance()
            val fm = supportFragmentManager
            pop.show(fm!!, "alarm")
        }
    }
}
