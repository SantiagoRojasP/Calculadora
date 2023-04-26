package com.example.parcial

import android.R
import android.os.Bundle
import android.widget.EditText
import android.widget.RadioButton
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.lang.String
import kotlin.Double


class CalculatorActivity : AppCompatActivity() {
    private var mFirstNumberEditText: EditText? = null
    private var mSecondNumberEditText: EditText? = null
    private var mSumRadioButton: RadioButton? = null
    private var mSubtractRadioButton: RadioButton? = null
    private var mClearButton: Button? = null
    private var mCalculateButton: Button? = null
    private var mResultTextView: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)


        mFirstNumberEditText = findViewById<EditText>(R.id.first_number_edit_text)
        mSecondNumberEditText = findViewById<EditText>(R.id.second_number_edit_text)
        mSumRadioButton = findViewById<RadioButton>(R.id.sum_radio_button)
        mSubtractRadioButton = findViewById<RadioButton>(R.id.subtract_radio_button)
        mClearButton = findViewById(R.id.clear_button)
        mCalculateButton = findViewById(R.id.calculate_button)
        mResultTextView = findViewById<TextView>(R.id.result_text_view)


        mClearButton.setOnClickListener(object : OnClickListener() {
            fun onClick(v: View?) {
                mFirstNumberEditText.setText("")
                mSecondNumberEditText.setText("")
                mResultTextView.setText("")
            }
        })


        mCalculateButton.setOnClickListener(object : OnClickListener() {
            fun onClick(v: View?) {
                val firstNumber = mFirstNumberEditText.getText().toString().toDouble()
                val secondNumber = mSecondNumberEditText.getText().toString().toDouble()
                val result: Double
                result = if (mSumRadioButton.isChecked()) {
                    firstNumber + secondNumber
                } else {
                    firstNumber - secondNumber
                }
                mResultTextView.setText(
                    String.format(
                        Locale.getDefault(),
                        "Resultado: %.2f",
                        result
                    )
                )
            }
        })
    }
}
