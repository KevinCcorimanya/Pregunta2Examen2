package examen2.pregunta

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        graph_view.setData(generateRandomDataPoints())
    }

    private fun generateRandomDataPoints(): List<DataPoint> {
        val random = Random()
        return (0..6).map {
            DataPoint(it, random.nextInt(5) + 1)
        }
    }
}
