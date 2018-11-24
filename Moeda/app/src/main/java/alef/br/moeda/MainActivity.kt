package alef.br.moeda

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.InputType
import android.view.View
import android.widget.EditText
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    internal lateinit var valueToConvert: EditText
    internal lateinit var valueConverted: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        valueToConvert = findViewById<View>(R.id.valueToConvert) as EditText
        valueConverted = findViewById<View>(R.id.valueConverted) as EditText
        val buttonDolar = findViewById<View>(R.id.buttonDolar) as Button
        buttonDolar.setOnClickListener(dolarConversion())
        val buttonEuro = findViewById<View>(R.id.buttonEuro) as Button
        buttonEuro.setOnClickListener(euroConversion())
        val buttonCuba = findViewById<View>(R.id.buttonCuba) as Button
        buttonCuba.setOnClickListener(cubaConversion())
        val buttonCan = findViewById<View>(R.id.buttonCan) as Button
        buttonCan.setOnClickListener(canConversion())
        val buttonIrl = findViewById<View>(R.id.buttonIrl) as Button
        buttonIrl.setOnClickListener(irlConversion())
        val buttonIen = findViewById<View>(R.id.buttonIen) as Button
        buttonIen.setOnClickListener(ienConversion())

    }

    inner class dolarConversion : View.OnClickListener{
        override fun onClick(v: View?) {
            if(valueToConvert.text == null || valueToConvert.text.toString() == "" || valueToConvert.text.toString().toDouble() <= 0)
                return
            val toConvert = valueToConvert.text.toString().toDouble()
            val converted = toConvert / 3.83

            valueConverted.setText("U$ " + converted.toString())
        }
    }

    inner class euroConversion : View.OnClickListener{
        override fun onClick(v: View?) {
            if(valueToConvert.text == null || valueToConvert.text.toString() == "" || valueToConvert.text.toString().toDouble() <= 0)
                return
            val toConvert = valueToConvert.text.toString().toDouble()
            val converted = toConvert / 4.34

            valueConverted.setText("EUR " + converted.toString())
        }
    }

    inner class cubaConversion : View.OnClickListener{
        override fun onClick(v: View?) {
            if(valueToConvert.text == null || valueToConvert.text.toString() == "" || valueToConvert.text.toString().toDouble() <= 0)
                return
            val toConvert = valueToConvert.text.toString().toDouble()
            val converted = toConvert / 0.75

            valueConverted.setText("PUC " + converted.toString())
        }
    }

    inner class canConversion : View.OnClickListener{
        override fun onClick(v: View?) {
            if(valueToConvert.text == null || valueToConvert.text.toString() == "" || valueToConvert.text.toString().toDouble() <= 0)
                return
            val toConvert = valueToConvert.text.toString().toDouble()
            val converted = toConvert / 3.28

            valueConverted.setText("CAN " + converted.toString())
        }
    }

    inner class irlConversion : View.OnClickListener{
        override fun onClick(v: View?) {
            if(valueToConvert.text == null || valueToConvert.text.toString() == "" || valueToConvert.text.toString().toDouble() <= 0)
                return
            val toConvert = valueToConvert.text.toString().toDouble()
            val converted = toConvert / 4.15

            valueConverted.setText("IRL " + converted.toString())
        }
    }

    inner class ienConversion : View.OnClickListener{
        override fun onClick(v: View?) {
            if(valueToConvert.text == null || valueToConvert.text.toString() == "" || valueToConvert.text.toString().toDouble() <= 0)
                return
            val toConvert = valueToConvert.text.toString().toDouble()
            val converted = toConvert / 0.15

            valueConverted.setText("¥ " + converted.toString())
        }
    }
}
