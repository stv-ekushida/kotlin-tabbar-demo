package jp.st_ventures.kotlin_tabbar_demo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        loadFragment(HomeFragment())
        setEventListener()
    }

    /// タブ切替イベント
    private fun setEventListener() {
        bottom_navigation.setOnNavigationItemSelectedListener {

            var fragment: Fragment? = null

            when (it.getItemId()) {
                R.id.navi_home -> fragment = HomeFragment()
                R.id.navi_search -> fragment = SearchFragment()
                R.id.navi_settings -> fragment = SettingsFragment()
            }

            this.loadFragment(fragment)
        }
    }

    /// フラグメントの呼び出し
    private fun loadFragment(fragment: Fragment?): Boolean {

        if (fragment != null) {
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.fragment_container, fragment)
                .commit()
            return true
        }
        return false
    }
}
