package net.onoffon.dialogfragmentexample

import android.os.Bundle
import android.support.v4.app.DialogFragment
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

/**
 * Created by julien on 5/18/18.
 */
class AlarmFirst : DialogFragment() {

    companion object {
        fun newInstance(): AlarmFirst {
            return AlarmFirst()
        }
    }

    override fun onCreateView(inflater: LayoutInflater?, container:
    ViewGroup?, savedInstanceState: Bundle?): View {


        dialog.window.setGravity(Gravity.BOTTOM )


        var myView = inflater!!.inflate(R.layout.fragment_alarm_first
                , container, false)

        return myView
    }
}