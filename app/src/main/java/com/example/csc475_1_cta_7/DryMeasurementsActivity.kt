package com.example.csc475_1_cta_7

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText

class DryMeasurementsActivity : AppCompatActivity() {
    private var lock: Boolean = false;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dry_measurements)

        findViewById<Button>(R.id.backButton).setOnClickListener {
            clearValues()
            finish()
        }

        findViewById<TextInputEditText>(R.id.tsEditTextView).addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {}
            override fun afterTextChanged(s: Editable?) {
                if (!lock) {
                    lock = true

                    if (TextUtil.isStringDouble(s.toString()) && s.toString() != "") {
                        val tb: Double  = UnitConverterUtil.tsToTb(s.toString().toDouble())
                        val cups: Double  = UnitConverterUtil.tsToCups(s.toString().toDouble())

                        findViewById<TextInputEditText>(R.id.tbEditTextView).setText(tb.toString())
                        findViewById<TextInputEditText>(R.id.cupsEditTextView).setText(cups.toString())
                    } else {
                        clearValues()
                    }

                    lock = false
                }
            }
        })

        findViewById<TextInputEditText>(R.id.tbEditTextView).addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {}
            override fun afterTextChanged(s: Editable?) {
                if (!lock) {
                    lock = true

                    if (TextUtil.isStringDouble(s.toString()) && s.toString() != "") {
                        val ts: Double  = UnitConverterUtil.tbToTs(s.toString().toDouble())
                        val cups: Double  = UnitConverterUtil.tbToCups(s.toString().toDouble())

                        findViewById<TextInputEditText>(R.id.tsEditTextView).setText(ts.toString())
                        findViewById<TextInputEditText>(R.id.cupsEditTextView).setText(cups.toString())
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
                        val ts: Double  = UnitConverterUtil.cupsToTs(s.toString().toDouble())
                        val tb: Double  = UnitConverterUtil.cupsToTb(s.toString().toDouble())

                        findViewById<TextInputEditText>(R.id.tsEditTextView).setText(ts.toString())
                        findViewById<TextInputEditText>(R.id.tbEditTextView).setText(tb.toString())
                    } else {
                        clearValues()
                    }

                    lock = false
                }
            }
        })
    }

    private fun clearValues() {
        findViewById<TextInputEditText>(R.id.tsEditTextView).setText("")
        findViewById<TextInputEditText>(R.id.tbEditTextView).setText("")
        findViewById<TextInputEditText>(R.id.cupsEditTextView).setText("")
    }
}