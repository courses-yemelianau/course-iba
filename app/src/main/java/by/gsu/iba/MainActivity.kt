package by.gsu.iba

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import by.gsu.iba.ui.main.LoginFragment
import by.gsu.iba.ui.main.RegisterFragment

class MainActivity : AppCompatActivity() {

    private val loginFragment = LoginFragment.newInstance()
    private val registerFragment = RegisterFragment.newInstance()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)

        supportFragmentManager.beginTransaction().add(R.id.container, loginFragment).commitNow()

        /*loginFragment.textView3.setOnClickListener {
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.container, registerFragment)
                .addToBackStack("flags")
                .commitNow()
        }*/

        /*registerFragment.textView2.setOnClickListener {
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.container, loginFragment)
                .addToBackStack("flags")
                .commitNow()
        }*/
    }

}
