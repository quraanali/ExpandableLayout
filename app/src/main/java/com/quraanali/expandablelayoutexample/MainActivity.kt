package com.quraanali.expandablelayoutexample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatImageView
import androidx.constraintlayout.widget.ConstraintLayout
import com.quraanali.expandablelayout.ExpandableLayout

class MainActivity : AppCompatActivity() {
    private var expandableLayout: ExpandableLayout? = null
    private var layout: ConstraintLayout? = null
    private var icon: AppCompatImageView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        expandableLayout = findViewById(R.id.expandableLayout)
        layout = findViewById(R.id.layout1)
        icon = findViewById(R.id.imgExpandIcon)


        layout?.setOnClickListener {
            if (expandableLayout?.isExpanded == true) {
                expandableLayout?.collapse()
                icon?.animate()?.rotationBy(180f)
                    ?.setDuration(500)?.start()
            } else {
                expandableLayout?.expand()
                icon?.animate()?.rotationBy(-180f)
                    ?.setDuration(500)?.start()
            }
        }

    }
}