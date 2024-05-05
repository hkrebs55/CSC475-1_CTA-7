package com.example.csc475_1_cta_7

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText

class WetMeasurementsActivity : AppCompatActivity() {
    private var lock: Boolean = false;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_wet_measurements)

        findViewById<Button>(R.id.backButton).setOnClickListener {
            clearValues()
            finish()
        }

        findViewById<TextInputEditText>(R.id.tbEditTextView).addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {}
            override fun afterTextChanged(s: Editable?) {
                if (!lock) {
                    lock = true

                    if (TextUtil.isStringDouble(s.toString()) && s.toString() != "") {
                        val floz: Double  = UnitConverterUtil.tablespoonsToFluidOunces(s.toString().toDouble())
                        val cups: Double  = UnitConverterUtil.tablespoonsToCups(s.toString().toDouble())
                        val pints: Double  = UnitConverterUtil.tablespoonsToPints(s.toString().toDouble())
                        val quarts: Double  = UnitConverterUtil.tablespoonsToQuarts(s.toString().toDouble())
                        val gallons: Double  = UnitConverterUtil.tablespoonsToGallons(s.toString().toDouble())

                        findViewById<TextInputEditText>(R.id.flozEditTextView).setText(floz.toString())
                        findViewById<TextInputEditText>(R.id.cupsEditTextView).setText(cups.toString())
                        findViewById<TextInputEditText>(R.id.pintsEditTextView).setText(pints.toString())
                        findViewById<TextInputEditText>(R.id.quartsEditTextView).setText(quarts.toString())
                        findViewById<TextInputEditText>(R.id.gallonsEditTextView).setText(gallons.toString())
                    } else {
                        clearValues()
                    }

                    lock = false
                }
            }
        })

        findViewById<TextInputEditText>(R.id.flozEditTextView).addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {}
            override fun afterTextChanged(s: Editable?) {
                if (!lock) {
                    lock = true

                    if (TextUtil.isStringDouble(s.toString()) && s.toString() != "") {
                        val tb: Double  = UnitConverterUtil.fluidOuncesToTablespoons(s.toString().toDouble())
                        val cups: Double  = UnitConverterUtil.fluidOuncesToCups(s.toString().toDouble())
                        val pints: Double  = UnitConverterUtil.fluidOuncesToPints(s.toString().toDouble())
                        val quarts: Double  = UnitConverterUtil.fluidOuncesToQuarts(s.toString().toDouble())
                        val gallons: Double  = UnitConverterUtil.fluidOuncesToGallons(s.toString().toDouble())

                        findViewById<TextInputEditText>(R.id.tbEditTextView).setText(tb.toString())
                        findViewById<TextInputEditText>(R.id.cupsEditTextView).setText(cups.toString())
                        findViewById<TextInputEditText>(R.id.pintsEditTextView).setText(pints.toString())
                        findViewById<TextInputEditText>(R.id.quartsEditTextView).setText(quarts.toString())
                        findViewById<TextInputEditText>(R.id.gallonsEditTextView).setText(gallons.toString())
                    } else {
                        clearValues()
                    }

                    lock = false
                }
            }
        })

        findViewById<TextInputEditText>(R.id.cupsEditTextView).addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {}
            override fun afterTextChanged(s: Editable?) {
                if (!lock) {
                    lock = true

                    if (TextUtil.isStringDouble(s.toString()) && s.toString() != "") {
                        val tb: Double  = UnitConverterUtil.cupsToTablespoons(s.toString().toDouble())
                        val floz: Double  = UnitConverterUtil.cupsToFluidOunces(s.toString().toDouble())
                        val pints: Double  = UnitConverterUtil.cupsToPints(s.toString().toDouble())
                        val quarts: Double  = UnitConverterUtil.cupsToQuarts(s.toString().toDouble())
                        val gallons: Double  = UnitConverterUtil.cupsToGallons(s.toString().toDouble())

                        findViewById<TextInputEditText>(R.id.tbEditTextView).setText(tb.toString())
                        findViewById<TextInputEditText>(R.id.flozEditTextView).setText(floz.toString())
                        findViewById<TextInputEditText>(R.id.pintsEditTextView).setText(pints.toString())
                        findViewById<TextInputEditText>(R.id.quartsEditTextView).setText(quarts.toString())
                        findViewById<TextInputEditText>(R.id.gallonsEditTextView).setText(gallons.toString())
                    } else {
                        clearValues()
                    }

                    lock = false
                }
            }
        })

        findViewById<TextInputEditText>(R.id.pintsEditTextView).addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {}
            override fun afterTextChanged(s: Editable?) {
                if (!lock) {
                    lock = true

                    if (TextUtil.isStringDouble(s.toString()) && s.toString() != "") {
                        val tb: Double  = UnitConverterUtil.pintsToTablespoons(s.toString().toDouble())
                        val floz: Double  = UnitConverterUtil.pintsToFluidOunces(s.toString().toDouble())
                        val cups: Double  = UnitConverterUtil.pintsToCups(s.toString().toDouble())
                        val quarts: Double  = UnitConverterUtil.pintsToQuarts(s.toString().toDouble())
                        val gallons: Double  = UnitConverterUtil.pintsToGallons(s.toString().toDouble())

                        findViewById<TextInputEditText>(R.id.tbEditTextView).setText(tb.toString())
                        findViewById<TextInputEditText>(R.id.flozEditTextView).setText(floz.toString())
                        findViewById<TextInputEditText>(R.id.cupsEditTextView).setText(cups.toString())
                        findViewById<TextInputEditText>(R.id.quartsEditTextView).setText(quarts.toString())
                        findViewById<TextInputEditText>(R.id.gallonsEditTextView).setText(gallons.toString())
                    } else {
                        clearValues()
                    }

                    lock = false
                }
            }
        })

        findViewById<TextInputEditText>(R.id.quartsEditTextView).addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {}
            override fun afterTextChanged(s: Editable?) {
                if (!lock) {
                    lock = true

                    if (TextUtil.isStringDouble(s.toString()) && s.toString() != "") {
                        val tb: Double  = UnitConverterUtil.quartsToTablespoons(s.toString().toDouble())
                        val floz: Double  = UnitConverterUtil.quartsToFluidOunces(s.toString().toDouble())
                        val cups: Double  = UnitConverterUtil.quartsToCups(s.toString().toDouble())
                        val pints: Double  = UnitConverterUtil.quartsToPints(s.toString().toDouble())
                        val gallons: Double  = UnitConverterUtil.quartsToGallons(s.toString().toDouble())

                        findViewById<TextInputEditText>(R.id.tbEditTextView).setText(tb.toString())
                        findViewById<TextInputEditText>(R.id.flozEditTextView).setText(floz.toString())
                        findViewById<TextInputEditText>(R.id.cupsEditTextView).setText(cups.toString())
                        findViewById<TextInputEditText>(R.id.pintsEditTextView).setText(pints.toString())
                        findViewById<TextInputEditText>(R.id.gallonsEditTextView).setText(gallons.toString())
                    } else {
                        clearValues()
                    }

                    lock = false
                }
            }
        })

        findViewById<TextInputEditText>(R.id.gallonsEditTextView).addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {}
            override fun afterTextChanged(s: Editable?) {
                if (!lock) {
                    lock = true

                    if (TextUtil.isStringDouble(s.toString()) && s.toString() != "") {
                        val tb: Double  = UnitConverterUtil.gallonsToTablespoons(s.toString().toDouble())
                        val floz: Double  = UnitConverterUtil.gallonsToFluidOunces(s.toString().toDouble())
                        val cups: Double  = UnitConverterUtil.gallonsToCups(s.toString().toDouble())
                        val pints: Double  = UnitConverterUtil.gallonsToPints(s.toString().toDouble())
                        val quarts: Double  = UnitConverterUtil.gallonsToQuarts(s.toString().toDouble())

                        findViewById<TextInputEditText>(R.id.tbEditTextView).setText(tb.toString())
                        findViewById<TextInputEditText>(R.id.flozEditTextView).setText(floz.toString())
                        findViewById<TextInputEditText>(R.id.cupsEditTextView).setText(cups.toString())
                        findViewById<TextInputEditText>(R.id.pintsEditTextView).setText(pints.toString())
                        findViewById<TextInputEditText>(R.id.quartsEditTextView).setText(quarts.toString())
                    } else {
                        clearValues()
                    }

                    lock = false
                }
            }
        })
    }


    private fun clearValues() {
        findViewById<TextInputEditText>(R.id.tbEditTextView).setText("")
        findViewById<TextInputEditText>(R.id.flozEditTextView).setText("")
        findViewById<TextInputEditText>(R.id.cupsEditTextView).setText("")
        findViewById<TextInputEditText>(R.id.pintsEditTextView).setText("")
        findViewById<TextInputEditText>(R.id.quartsEditTextView).setText("")
        findViewById<TextInputEditText>(R.id.gallonsEditTextView).setText("")
    }
}