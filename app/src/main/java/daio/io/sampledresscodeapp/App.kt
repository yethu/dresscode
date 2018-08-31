package daio.io.sampledresscodeapp

import android.app.Application
import daio.io.dresscode.declareDressCode

class App : Application() {
    override fun onCreate() {
        super.onCreate()

        declareDressCode(
                R.style.ThemeOne,
                R.style.ThemeTwo
        )
    }
}