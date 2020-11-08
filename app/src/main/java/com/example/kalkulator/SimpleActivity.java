package com.example.kalkulator;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Stack;

import androidx.appcompat.app.AppCompatActivity;

public class SimpleActivity extends AppCompatActivity{

    String str_result = "0";
    int c_cnt = 0;
    String sub_str = "";
    String vtext = "";
    String v1text = "";
    TextView mTextView;
    TextView mTextView1;
    private static final String SUB = "sub";
    private static final String CNT = "cnt";
    private static final String TEXT = "text";
    private static final String TEXT1 = "text1";

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);
        savedInstanceState.putString("sub", sub_str);
        savedInstanceState.putInt("cnt",c_cnt);
        savedInstanceState.putString("text",vtext);
        savedInstanceState.putString("text1",v1text);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple);

        if (savedInstanceState != null) {
            mTextView = (TextView) findViewById(R.id.textView);
            mTextView1 = (TextView) findViewById(R.id.textView1);
            Button btn_c = (Button)findViewById(R.id.btn_c);
            sub_str = savedInstanceState.getString(SUB);
            c_cnt = savedInstanceState.getInt(CNT);
            vtext = savedInstanceState.getString(TEXT);
            v1text = savedInstanceState.getString(TEXT1);
            mTextView.setText(vtext);
            mTextView1.setText(v1text);
            if(c_cnt == 0){
                btn_c.setText("C");
            }
        }

        final Button btn_c = (Button)findViewById(R.id.btn_c);
        btn_c.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    TextView tv = (TextView)findViewById(R.id.textView);
                    TextView tv1 = (TextView)findViewById(R.id.textView1);
                    c_cnt= c_cnt + 1;
                    if(c_cnt == 1){
                        tv.setText("");
                        btn_c.setText("C");
                    }else{
                        tv.setText("");
                        tv1.setText("");
                        str_result = "0";
                        sub_str = "";
                        c_cnt = 3;
                        btn_c.setText("CE");
                    }
                    vtext = tv.getText().toString();
                    v1text = tv1.getText().toString();
                }
            });

        Button btn_bksp = (Button)findViewById(R.id.btn_bksp);
        btn_bksp.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView tv = (TextView)findViewById(R.id.textView);
                TextView tv1 = (TextView)findViewById(R.id.textView1);
                String temp_str = tv.getText().toString();
                if(!temp_str.isEmpty()) {
                    temp_str = temp_str.substring(0, tv.length() - 1);
                    tv.setText(temp_str);
                }
                if(temp_str.isEmpty()){
                    tv.setText("");
                }
                vtext = tv.getText().toString();
                v1text = tv1.getText().toString();
            }
        });

        Button btn_plmi = (Button)findViewById(R.id.btn_plmi);
        btn_plmi.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView tv = (TextView)findViewById(R.id.textView);
                TextView tv1 = (TextView)findViewById(R.id.textView1);
                String temp_str = tv.getText().toString();
                if(!temp_str.isEmpty()) {
                    if (!temp_str.equals("0")) {
                        if (temp_str.charAt(0) == '-') {
                            temp_str = temp_str.substring(1, temp_str.length());
                        } else {
                            temp_str = "-" + temp_str;
                        }
                    }
                }
                tv.setText(temp_str);
                vtext = tv.getText().toString();
                v1text = tv1.getText().toString();
            }
        });

        Button btn_1 = (Button)findViewById(R.id.btn_1);
        btn_1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView tv = (TextView)findViewById(R.id.textView);
                TextView tv1 = (TextView)findViewById(R.id.textView1);
                String temp_str = tv.getText().toString();
                String operation_str = tv1.getText().toString();
                if(temp_str.length() == 1 && temp_str.charAt(0) == '0'){
                    tv.setText("1");
                }
                else{
                    tv.append("1");
                }
                c_cnt = 0;
                btn_c.setText("C");
                if(operation_str.contains("=")) {
                    tv1.setText("");
                }
                vtext = tv.getText().toString();
                v1text = tv1.getText().toString();
            }
        });

        Button btn_2 = (Button)findViewById(R.id.btn_2);
        btn_2.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView tv = (TextView)findViewById(R.id.textView);
                TextView tv1 = (TextView)findViewById(R.id.textView1);
                String temp_str = tv.getText().toString();
                String operation_str = tv1.getText().toString();
                if(temp_str.length() == 1 && temp_str.charAt(0) == '0'){
                    tv.setText("2");
                }
                else {
                    tv.append("2");
                }
                c_cnt = 0;
                btn_c.setText("C");
                if(operation_str.contains("=")) {
                    tv1.setText("");
                }
                vtext = tv.getText().toString();
                v1text = tv1.getText().toString();
            }
        });

        Button btn_3 = (Button)findViewById(R.id.btn_3);
        btn_3.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView tv = (TextView)findViewById(R.id.textView);
                TextView tv1 = (TextView)findViewById(R.id.textView1);
                String temp_str = tv.getText().toString();
                String operation_str = tv1.getText().toString();
                if(temp_str.length() == 1 && temp_str.charAt(0) == '0'){
                    tv.setText("3");
                }
                else {
                    tv.append("3");
                }
                c_cnt = 0;
                btn_c.setText("C");
                if(operation_str.contains("=")) {
                    tv1.setText("");
                }
                vtext = tv.getText().toString();
                v1text = tv1.getText().toString();
            }
        });

        Button btn_4 = (Button)findViewById(R.id.btn_4);
        btn_4.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView tv = (TextView)findViewById(R.id.textView);
                TextView tv1 = (TextView)findViewById(R.id.textView1);
                String temp_str = tv.getText().toString();
                String operation_str = tv1.getText().toString();
                if(temp_str.length() == 1 && temp_str.charAt(0) == '0'){
                    tv.setText("4");
                }
                else {
                    tv.append("4");
                }
                c_cnt = 0;
                btn_c.setText("C");
                if(operation_str.contains("=")) {
                    tv1.setText("");
                }
                vtext = tv.getText().toString();
                v1text = tv1.getText().toString();
            }
        });

        Button btn_5 = (Button)findViewById(R.id.btn_5);
        btn_5.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView tv = (TextView)findViewById(R.id.textView);
                TextView tv1 = (TextView)findViewById(R.id.textView1);
                String temp_str = tv.getText().toString();
                String operation_str = tv1.getText().toString();
                if(temp_str.length() == 1 && temp_str.charAt(0) == '0'){
                    tv.setText("5");
                }
                else {
                    tv.append("5");
                }
                c_cnt = 0;
                btn_c.setText("C");
                if(operation_str.contains("=")) {
                    tv1.setText("");
                }
                vtext = tv.getText().toString();
                v1text = tv1.getText().toString();
            }
        });

        Button btn_6 = (Button)findViewById(R.id.btn_6);
        btn_6.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView tv = (TextView)findViewById(R.id.textView);
                TextView tv1 = (TextView)findViewById(R.id.textView1);
                String temp_str = tv.getText().toString();
                String operation_str = tv1.getText().toString();
                if(temp_str.length() == 1 && temp_str.charAt(0) == '0'){
                    tv.setText("6");
                }
                else {
                    c_cnt = 0;
                    tv.append("6");
                    btn_c.setText("C");
                    if(operation_str.contains("=")) {
                        tv1.setText("");
                    }
                }
                vtext = tv.getText().toString();
                v1text = tv1.getText().toString();
            }
        });

        Button btn_7 = (Button)findViewById(R.id.btn_7);
        btn_7.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView tv = (TextView)findViewById(R.id.textView);
                TextView tv1 = (TextView)findViewById(R.id.textView1);
                String temp_str = tv.getText().toString();
                String operation_str = tv1.getText().toString();
                if(temp_str.length() == 1 && temp_str.charAt(0) == '0'){
                    tv.setText("7");
                }
                else {
                    tv.append("7");
                }
                c_cnt = 0;
                btn_c.setText("C");
                if(operation_str.contains("=")) {
                    tv1.setText("");
                }
                vtext = tv.getText().toString();
                v1text = tv1.getText().toString();
            }
        });

        Button btn_8 = (Button)findViewById(R.id.btn_8);
        btn_8.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView tv = (TextView)findViewById(R.id.textView);
                TextView tv1 = (TextView)findViewById(R.id.textView1);
                String temp_str = tv.getText().toString();
                String operation_str = tv1.getText().toString();
                if(temp_str.length() == 1 && temp_str.charAt(0) == '0'){
                    tv.setText("8");
                }
                else {
                    tv.append("8");
                }
                c_cnt = 0;
                btn_c.setText("C");
                if(operation_str.contains("=")) {
                    tv1.setText("");
                }
                vtext = tv.getText().toString();
                v1text = tv1.getText().toString();
            }
        });

        Button btn_9 = (Button)findViewById(R.id.btn_9);
        btn_9.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView tv = (TextView)findViewById(R.id.textView);
                TextView tv1 = (TextView)findViewById(R.id.textView1);
                String temp_str = tv.getText().toString();
                String operation_str = tv1.getText().toString();
                if(temp_str.length() == 1 && temp_str.charAt(0) == '0'){
                    tv.setText("9");
                }
                else {
                    tv.append("9");
                }
                c_cnt = 0;
                btn_c.setText("C");
                if(operation_str.contains("=")) {
                    tv1.setText("");
                }
                vtext = tv.getText().toString();
                v1text = tv1.getText().toString();
            }
        });

        Button btn_0 = (Button)findViewById(R.id.btn_0);
        btn_0.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView tv = (TextView)findViewById(R.id.textView);
                TextView tv1 = (TextView)findViewById(R.id.textView1);
                String temp_str = tv.getText().toString();
                String operation_str = tv1.getText().toString();
                if(!temp_str.isEmpty()){
                    if(temp_str.equals("0")){
                        tv.setText("0");
                    }else {
                        tv.append("0");
                    }
                }else{
                    if(operation_str.isEmpty()){
                        tv.setText("0");
                    }else {
                        sub_str = operation_str.substring(operation_str.length() - 2, operation_str.length());
                        if (sub_str.equals("/ ")) {
                            zeroDiv();
                        } else {
                            tv.setText("0");
                        }
                    }
                }

                if(operation_str.contains("=")) {
                    tv1.setText("");
                }
                btn_c.setText("C");
                vtext = tv.getText().toString();
                v1text = tv1.getText().toString();
            }
        });

        Button btn_sep = (Button)findViewById(R.id.btn_sep);
        btn_sep.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView tv = (TextView)findViewById(R.id.textView);
                TextView tv1 = (TextView)findViewById(R.id.textView1);
                String temp_str = tv.getText().toString();
                String operation_str = tv1.getText().toString();
                char ch = '.';
                int count = 0;
                for (int i = 0; i < temp_str.length(); i++) {
                    if (temp_str.charAt(i) == ch) {
                        count++;
                    }
                }
                if(count == 0) {
                    tv.append(".");
                    c_cnt = 0;
                }
                if(temp_str.isEmpty()){
                    if(!operation_str.isEmpty()) {
                        sub_str = operation_str.substring(operation_str.length() - 2, operation_str.length());
                    }
                    tv.setText("0.");
                    c_cnt = 0;
                }
                btn_c.setText("C");
                vtext = tv.getText().toString();
                v1text = tv1.getText().toString();
            }
        });

        Button btn_add = (Button) findViewById(R.id.btn_add);
        btn_add.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
            TextView tv = (TextView)findViewById(R.id.textView);
            TextView tv1 = (TextView)findViewById(R.id.textView1);
            String temp_str = tv.getText().toString();
            String operation_str = tv1.getText().toString();
            if(!temp_str.isEmpty()){
                float num = Float.parseFloat(temp_str);
                if (!sub_str.equals("/ ")  || Math.signum(num) !=0 ) {
                    if (operation_str.contains("=")) {
                        tv1.setText("");
                    }
                    tv1.append(temp_str + " + ");
                    c_cnt = 0;
                    tv.setText("");
                    btn_c.setText("C");
                }else{
                    zeroDiv();
                }

            }else{
                if(!operation_str.isEmpty()) {
                    operation_str = operation_str.substring(0, operation_str.length() - 3);
                    tv1.setText(operation_str + " + ");
                }
            }
                vtext = tv.getText().toString();
                v1text = tv1.getText().toString();
            }
        });

        Button btn_sub = (Button) findViewById(R.id.btn_sub);
        btn_sub.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView tv = (TextView) findViewById(R.id.textView);
                TextView tv1 = (TextView)findViewById(R.id.textView1);
                String temp_str = tv.getText().toString();
                String operation_str = tv1.getText().toString();
                if(!temp_str.isEmpty()) {
                    float num = Float.parseFloat(temp_str);
                    if (!sub_str.equals("/ ")  || Math.signum(num) !=0 ) {
                        if (operation_str.contains("=")) {
                            tv1.setText("");
                        }
                        tv1.append(temp_str + " - ");
                        c_cnt = 0;
                        tv.setText("");
                        btn_c.setText("C");
                    }else{
                        zeroDiv();
                    }
                }else {
                    if (!operation_str.isEmpty()) {
                        operation_str = operation_str.substring(0, operation_str.length() - 3);
                        tv1.setText(operation_str + " - ");
                    }
                }
                vtext = tv.getText().toString();
                v1text = tv1.getText().toString();
            }
        });

        Button btn_multi = (Button) findViewById(R.id.btn_multi);
        btn_multi.setOnClickListener(new OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                TextView tv = (TextView) findViewById(R.id.textView);
                TextView tv1 = (TextView)findViewById(R.id.textView1);
                String temp_str = tv.getText().toString();
                String operation_str = tv1.getText().toString();
                    if(!temp_str.isEmpty()) {
                        float num = Float.parseFloat(temp_str);
                        if (!sub_str.equals("/ ")  || Math.signum(num) !=0 ) {
                            if (operation_str.contains("=")) {
                                tv1.setText("");
                            }
                            tv1.append(temp_str + " * ");
                            tv.setText("");
                            btn_c.setText("C");
                        }else{
                            zeroDiv();
                        }
                    }else{
                        if(!operation_str.isEmpty()) {
                            operation_str = operation_str.substring(0, operation_str.length() - 3);
                            tv1.setText(operation_str + " * ");
                        }
                    }
                vtext = tv.getText().toString();
                v1text = tv1.getText().toString();
            }
        });

        Button btn_div = (Button) findViewById(R.id.btn_div);
        btn_div.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView tv = (TextView) findViewById(R.id.textView);
                TextView tv1 = (TextView)findViewById(R.id.textView1);
                String temp_str = tv.getText().toString();
                String operation_str = tv1.getText().toString();
                    if(!temp_str.isEmpty()) {
                        float num = Float.parseFloat(temp_str);
                        if (!sub_str.equals("/ ")  || Math.signum(num) !=0 ) {
                            if (operation_str.contains("=")) {
                            tv1.setText("");
                            }
                            tv1.append(temp_str + " / ");
                            c_cnt = 0;
                            tv.setText("");
                            btn_c.setText("C");
                        }else{
                            zeroDiv();
                        }

                    }else{
                        if(!operation_str.isEmpty()) {
                            operation_str = operation_str.substring(0, operation_str.length() - 3);
                            tv1.setText(operation_str + " / ");
                        }
                    }
                vtext = tv.getText().toString();
                v1text = tv1.getText().toString();
            }
        });

        Button btn_res = (Button) findViewById(R.id.btn_res);
        btn_res.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView tv = (TextView) findViewById(R.id.textView);
                TextView tv1 = (TextView) findViewById(R.id.textView1);
                String temp_str = tv.getText().toString();
                String operation_str = tv1.getText().toString();
                String str = "";
                if (!temp_str.isEmpty()) {
                    if(!operation_str.isEmpty() && temp_str.length() != 1) {
                        str = operation_str.substring(operation_str.length() - 2, operation_str.length());
                    }
                    float num = Float.parseFloat(temp_str);
                    if (!sub_str.equals("/ ")  || Math.signum(num) !=0 ) {
                    if (temp_str == " " || temp_str.isEmpty()) {
                        tv.setText("");
                    }
                    if (!operation_str.contains("=")) {
                        tv1.append(temp_str);
                    }
                    operation_str = tv1.getText().toString();
                    if(!operation_str.isEmpty() && temp_str.length() != 1) {
                        String sub_s = operation_str.substring(operation_str.length() - 2, operation_str.length());
                        if (sub_s.equals("/ ") || sub_s.equals("* ") || sub_s.equals("+ ") || sub_s.equals("- ")) {
                            operation_str = operation_str.substring(0, operation_str.length() - 3);
                        }
                    }
                    float fin_result = calculate(operation_str);
                    float modulo = fin_result % 1;
                    if (modulo == 0.0) {
                        if(fin_result > Integer.MAX_VALUE){
                            str_result = String.valueOf(fin_result);
                        }else{
                            int res = (int) fin_result;
                            str_result = String.valueOf(res);
                        }
                    } else {
                        str_result = String.valueOf(fin_result);
                    }
                    if(!operation_str.contains("=")) {
                        operation_str = operation_str + " = " + str_result;
                        tv1.setText(operation_str);
                        tv.setText(str_result);
                    }
                    c_cnt = 0;
                    btn_c.setText("C");

                } else {
                        zeroDiv();
                }
                }
                vtext = tv.getText().toString();
                v1text = tv1.getText().toString();
            }
        });
    }

    public void zeroDiv(){
        Context context = getApplicationContext();
        CharSequence text = "Do not divide by zero";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

public Float calculate(String op_string)
{
    String[] op_arr;
    op_arr = op_string.split("\\s+");

    Stack<Float> numbers = new Stack<Float>();
    Stack<String> operators = new Stack<String>();

    boolean flag = false;
    for (int i = 0; i < op_arr.length; i++){
        if(isNumeric(op_arr[i])){
            String snum = op_arr[i];
            numbers.push(Float.parseFloat(snum));
        }
        else{

            while (!operators.empty() &&
                    operationPriority(op_arr[i],
                            operators.peek()))
                numbers.push(operationResult(operators.pop(),
                        numbers.pop(),
                        numbers.pop()));

            operators.push(op_arr[i]);
        }
    }

    while (!operators.empty())
        numbers.push(operationResult(operators.pop(),
                numbers.pop(),
                numbers.pop()));

    return numbers.pop();
}

    private static boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            double d = Double.parseDouble(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }

    public static boolean operationPriority(
            String op1, String op2)
    {
        if ((op1.equals("*") || op1.equals("/")) &&
                (op2.equals("+") || op2.equals("-")))
            return false;
        else
            return true;
    }


    public float operationResult(String op,
                                 Float b, Float a)
    {
        switch (op)
        {
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "*":
                return a * b;
            case "/":
                if (b == 0) {
                    throw new
                            UnsupportedOperationException(
                            "Cannot divide by zero");
                }
                return a / b;
        }
        return 0;
    }
}
