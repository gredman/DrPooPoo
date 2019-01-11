package nz.gen.nil.drpoopoo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import java.util.*


class RubbishTruckSimulatorActivity : AppCompatActivity() {
    private val rando = Random()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rubbish_truck_simulator)

        rando.setSeed(Date().time)

        val noun = rollForString(R.array.nouns)
        val adjective = rollForString(R.array.adjectives)
        val reason = rollForString(R.array.reasons)

        val textView = findViewById<TextView>(R.id.somethingoriginal)
        textView.setText(resources.getString(R.string.dana_scully, noun, adjective, reason))
    }

    private fun rollForString(id: Int): String {
        val strings = resources.getStringArray(id)
        val index = rando.nextInt(strings.size)
        return strings[index]
    }
}
