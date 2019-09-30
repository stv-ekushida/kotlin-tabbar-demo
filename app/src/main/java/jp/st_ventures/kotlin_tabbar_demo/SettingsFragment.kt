package jp.st_ventures.kotlin_tabbar_demo

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class SettingsFragment: Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        setTitle(getString(R.string.tab_settings))
        return inflater.inflate(R.layout.fragment_settings, null)
    }

    private fun setTitle(title: String) {
        (activity as MainActivity).title = title
    }
}