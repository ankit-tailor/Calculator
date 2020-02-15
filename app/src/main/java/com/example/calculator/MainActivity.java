package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Stack;

public class MainActivity extends AppCompatActivity {
    String str = "";
    int number1 = 0;
    char operator;
    int number2 = 0;
    int answer = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       final TextView numberView1 = (TextView) findViewById(R.id.number1_text_view);
       final TextView numberView2 = (TextView) findViewById(R.id.number2_text_view);
       final TextView operatorView = (TextView) findViewById(R.id.operator_text_view);
        final EditText input = (EditText) findViewById(R.id.input_view_button);
        final Button clear = (Button) findViewById(R.id.clear_button);
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str = "";
                input.setText(str);
                numberView1.setText("");
                numberView2.setText("");
                operatorView.setText("");
            }
        });
        final Button backspace = (Button) findViewById(R.id.backspace_button);
        backspace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str2 = "";
                for(int i=0; i<str.length()-1; i++) {
                    str2 += str.charAt(i);
                }
                str = str2;
                input.setText(str);
            }
        });
         Button plus = (Button) findViewById(R.id.plus_button);
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberView1.setText(str);
                if(answer != 0)
                    number1 = answer;
                else if(str == "")
                    number1 = 0;
                else
                    number1 = Integer.parseInt(str);
                operator = '+';
                operatorView.setText("+");
                str = "";
                input.setText(str);
            }
        });
        Button minus = (Button) findViewById(R.id.minus_button);
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberView1.setText(str);
                if(answer != 0)
                    number1 = answer;
                else if(str == "")
                    number1 = 0;
                else
                    number1 = Integer.parseInt(str);
                operator = '-';
                operatorView.setText("-");
                str = "";
                input.setText(str);
            }
        });
        Button multiply = (Button) findViewById(R.id.multiply_button);
        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberView1.setText(str);
                if(str == "")
                    number1 = 0;
                else
                    number1 = Integer.parseInt(str);
                operator = '*';
                operatorView.setText("×");
                str = "";
                input.setText(str);
            }
        });
        Button divide = (Button) findViewById(R.id.divide_button);
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberView1.setText(str);
                if(answer != 0)
                    number1 = answer;
                else if(str == "")
                    number1 = 0;
                else
                    number1 = Integer.parseInt(str);
                operator = '/';
                operatorView.setText("/");
                str = "";
                input.setText(str);
            }
        });
        final Button equal = (Button) findViewById(R.id.equal_button);
        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberView2.setText(str);
                if(str == "")
                    number2 = 0;
                else
                    number2 = Integer.parseInt(str);
                if(operator == '+')
                    answer = number1 + number2;
                else if(operator == '-')
                    answer = number1 - number2;
                else if(operator == '*')
                    answer = number1 * number2;
                else if(operator == '/')
                    answer = number1 / number2;
                str = String.valueOf(answer);
                input.setText(str);
                answer = 0;
            }
        });
        final Button nine = (Button) findViewById(R.id.nine_button);
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str += nine.getText().toString();
                input.setText(str);
            }
        });
        final Button eight = (Button) findViewById(R.id.eight_button);
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str += eight.getText().toString();
                input.setText(str);
            }
        });
        final Button seven = (Button) findViewById(R.id.seven_button);
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str += seven.getText().toString();
                input.setText(str);
            }
        });
        final Button six = (Button) findViewById(R.id.six_button);
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str += six.getText().toString();
                input.setText(str);
            }
        });
        final Button five = (Button) findViewById(R.id.five_button);
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str += five.getText().toString();
                input.setText(str);
            }
        });
        final Button four = (Button) findViewById(R.id.four_button);
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str += four.getText().toString();
                input.setText(str);
            }
        });
        final Button three = (Button) findViewById(R.id.three_button);
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str += three.getText().toString();
                input.setText(str);
            }
        });
        final Button two = (Button) findViewById(R.id.two_button);
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str += two.getText().toString();
                input.setText(str);
            }
        });
        final Button one = (Button) findViewById(R.id.one_button);
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str += one.getText().toString();
                input.setText(str);
            }
        });
        final Button zero = (Button) findViewById(R.id.zero_button);
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str += zero.getText().toString();
                input.setText(str);
            }
        });
//        final Button percentage = (Button) findViewById(R.id.percetage_button);
//        percentage.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                number1 /= 100;
//                str = String.valueOf(number1);
//                numberView1.setText(str);
//            }
//        });
        final Button exit = (Button) findViewById(R.id.exit_button);
        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}