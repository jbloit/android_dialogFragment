package net.onoffon.dialogfragmentexample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val pop = AlarmFirst.newInstance()
        val fm = supportFragmentManager
        pop.show(fm!!, "alarm")
    }
}
