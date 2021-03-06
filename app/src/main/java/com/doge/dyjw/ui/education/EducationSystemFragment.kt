package com.doge.dyjw.ui.education

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.doge.dyjw.R

class EducationSystemFragment : Fragment() {

    private lateinit var educationSystemViewModel: EducationSystemViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        educationSystemViewModel =
                ViewModelProviders.of(this).get(EducationSystemViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_education, container, false)
        val textView: TextView = root.findViewById(R.id.text_dashboard)
        educationSystemViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }
}