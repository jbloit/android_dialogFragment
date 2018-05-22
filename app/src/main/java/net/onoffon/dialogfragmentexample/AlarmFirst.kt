package net.onoffon.dialogfragmentexample

import android.content.Context
import android.os.Bundle
import android.support.v4.app.DialogFragment
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.SeekBar
import android.widget.Toast

/**
 * Created by julien on 5/18/18.
 */
class AlarmFirst : DialogFragment(), SeekBar.OnSeekBarChangeListener {

    // listener interface
    interface OnSomeValueChanged {
        fun onSomeValueChanged(value: Int)
    }

    // SEEK BAR CALLBACKS
    override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
       listener.onSomeValueChanged(progress)
    }

    override fun onStartTrackingTouch(seekBar: SeekBar?) {

    }

    override fun onStopTrackingTouch(seekBar: SeekBar?) {

    }

    // reference to the listener, ie the activity in the current case
    private lateinit var listener: OnSomeValueChanged


    companion object {
        fun newInstance(): AlarmFirst {
            return AlarmFirst()
        }
    }

    override fun onAttach(context: Context?) {
        super.onAttach(context)


        if (context is OnSomeValueChanged) {
            listener = context
        } else {
            throw ClassCastException(context.toString() + " must implement OnSomeValueChanged.")
        }
    }

    override fun onCreateView(inflater: LayoutInflater?, container:
    ViewGroup?, savedInstanceState: Bundle?): View {

        dialog.window.setGravity(Gravity.BOTTOM )

        var myView = inflater!!.inflate(R.layout.fragment_alarm_first
                , container, false)

        val seekbar = myView.findViewById<SeekBar>(R.id.seekBar_someValue)
        seekbar.setOnSeekBarChangeListener(this)
        return myView
    }
}