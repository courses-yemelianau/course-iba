package by.gsu.iba

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import by.gsu.iba.ui.main.LoginFragment
import by.gsu.iba.ui.main.RegisterFragment

class MainActivity : AppCompatActivity() {

    private val loginFragment = LoginFragment.newInstance()
    private val registerFragment = RegisterFragment.newInstance()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        supportFragmentManager.beginTransaction().add(R.id.container, loginFragment).commitNow()
    }

    fun underButtonTextClick(view: View) {
        when (view.id) {
            R.id.loginUnderButtonText -> {
                supportFragmentManager
                    .beginTransaction()
                    .replace(R.id.container, registerFragment)
                    .commitNow()
            }
            R.id.registerUnderButtonText -> {
                supportFragmentManager
                    .beginTransaction()
                    .replace(R.id.container, loginFragment)
                    .commitNow()
            }
        }
    }

}
