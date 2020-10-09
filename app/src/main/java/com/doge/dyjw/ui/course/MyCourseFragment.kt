package com.doge.dyjw.ui.course

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.doge.dyjw.R

class MyCourseFragment : Fragment() {

    private lateinit var myCourseViewModel: MyCourseViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        myCourseViewModel =
                ViewModelProviders.of(this).get(MyCourseViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_course, container, false)
        val textView: TextView = root.findViewById(R.id.text_home)
        myCourseViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }
}