package jp.st_ventures.kotlin_tabbar_demo

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class SearchFragment: Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        setTitle(getString(R.string.tab_search))
        return inflater.inflate(R.layout.fragment_search, null)
    }

    private fun setTitle(title: String) {
        (activity as MainActivity).title = title
    }
}