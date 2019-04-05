package by.gsu.iba

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import by.gsu.iba.ui.main.LoginFragment
import by.gsu.iba.ui.main.RegisterFragment

class MainActivity : AppCompatActivity() {

    private var loginFragmentManager = supportFragmentManager
    private var loginFragmentTransaction = loginFragmentManager.beginTransaction()
    private var loginFragment = LoginFragment()

    private var registerFragmentManager = supportFragmentManager
    private var registerFragmentTransaction = registerFragmentManager.beginTransaction()
    private var registerFragment = RegisterFragment()

    private var buf = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)

        if (savedInstanceState == null) {
            loginFragmentTransaction.replace(R.id.container, loginFragment).commitNow()
            //registerFragmentTransaction.replace(R.id.container, registerFragment).commitNow()
        }

        //var lfr = supportFragmentManager.findFragmentById(R.id.login)
        //var rfr = supportFragmentManager.findFragmentById(R.id.register)
    }

}
