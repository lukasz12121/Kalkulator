package com.example.kalkulator;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class AdvancedActivity extends AppCompatActivity {

    String str_result = "0";
    String last_op = "";
    int c_cnt = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advanced);

        Button btn_c = (Button)findViewById(R.id.btn_c);
        btn_c.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView tv = (TextView)findViewById(R.id.textView3);
                tv.setText("0");
                String str_result = "0";
                String str = "0";
                last_op = "";
            }
        });

        Button btn_bksp = (Button)findViewById(R.id.btn_bksp);
        btn_bksp.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView tv = (TextView)findViewById(R.id.textView3);
                String temp_str = tv.getText().toString();
                if(!temp_str.isEmpty()) {
                    temp_str = temp_str.substring(0, tv.length() - 1);
                    tv.setText(temp_str);
                }
                if(temp_str.isEmpty()){
                    tv.setText("0");
                }
            }
        });

        Button btn_plmi = (Button)findViewById(R.id.btn_plmi);
        btn_plmi.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView tv = (TextView)findViewById(R.id.textView3);
                String temp_str = tv.getText().toString();
                if(!temp_str.isEmpty()){
                    if(temp_str.charAt(0) == '-'){
                        temp_str = temp_str.substring(1,temp_str.length());
                    }
                    else{
                        temp_str = "-" + temp_str;
                    }
                }
                tv.setText(temp_str);
            }
        });

        Button btn_1 = (Button)findViewById(R.id.btn_1);
        btn_1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView tv = (TextView)findViewById(R.id.textView3);
                String temp_str = tv.getText().toString();
                if(temp_str.length() == 1 && temp_str.charAt(0) == '0'){
                    tv.setText("1");
                }
                else{
                    tv.append("1");
                }
            }
        });

        Button btn_2 = (Button)findViewById(R.id.btn_2);
        btn_2.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView tv = (TextView)findViewById(R.id.textView3);
                String temp_str = tv.getText().toString();
                if(temp_str.length() == 1 && temp_str.charAt(0) == '0'){
                    tv.setText("2");
                }
                else {
                    tv.append("2");
                }
            }
        });

        Button btn_3 = (Button)findViewById(R.id.btn_3);
        btn_3.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView tv = (TextView)findViewById(R.id.textView3);
                String temp_str = tv.getText().toString();
                if(temp_str.length() == 1 && temp_str.charAt(0) == '0'){
                    tv.setText("3");
                }
                else {
                    tv.append("3");
                }
            }
        });

        Button btn_4 = (Button)findViewById(R.id.btn_4);
        btn_4.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView tv = (TextView)findViewById(R.id.textView3);
                String temp_str = tv.getText().toString();
                if(temp_str.length() == 1 && temp_str.charAt(0) == '0'){
                    tv.setText("4");
                }
                else {
                    tv.append("4");
                }
            }
        });

        Button btn_5 = (Button)findViewById(R.id.btn_5);
        btn_5.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView tv = (TextView)findViewById(R.id.textView3);
                String temp_str = tv.getText().toString();
                if(temp_str.length() == 1 && temp_str.charAt(0) == '0'){
                    tv.setText("5");
                }
                else {
                    tv.append("5");
                }
            }
        });

        Button btn_6 = (Button)findViewById(R.id.btn_6);
        btn_6.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView tv = (TextView)findViewById(R.id.textView3);
                String temp_str = tv.getText().toString();
                if(temp_str.length() == 1 && temp_str.charAt(0) == '0'){
                    tv.setText("6");
                }
                else {
                    tv.append("6");
                }
            }
        });

        Button btn_7 = (Button)findViewById(R.id.btn_7);
        btn_7.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView tv = (TextView)findViewById(R.id.textView3);
                String temp_str = tv.getText().toString();
                if(temp_str.length() == 1 && temp_str.charAt(0) == '0'){
                    tv.setText("7");
                }
                else {
                    tv.append("7");
                }
            }
        });

        Button btn_8 = (Button)findViewById(R.id.btn_8);
        btn_8.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView tv = (TextView)findViewById(R.id.textView3);
                String temp_str = tv.getText().toString();
                if(temp_str.length() == 1 && temp_str.charAt(0) == '0'){
                    tv.setText("8");
                }
                else {
                    tv.append("8");
                }
            }
        });

        Button btn_9 = (Button)findViewById(R.id.btn_9);
        btn_9.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView tv = (TextView)findViewById(R.id.textView3);
                String temp_str = tv.getText().toString();
                if(temp_str.length() == 1 && temp_str.charAt(0) == '0'){
                    tv.setText("9");
                }
                else {
                    tv.append("9");
                }
            }
        });

        Button btn_0 = (Button)findViewById(R.id.btn_0);
        btn_0.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView tv = (TextView)findViewById(R.id.textView3);
                String temp_str = tv.getText().toString();

                boolean flag = false;
                if (temp_str.contains(".")) {
                    flag = true;
                }
                if(flag ||(!flag && temp_str.charAt(0) != '0')){
                    tv.append("0");
                }
            }
        });

        Button btn_sep = (Button)findViewById(R.id.btn_sep);
        btn_sep.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView tv = (TextView)findViewById(R.id.textView3);
                String temp_str = tv.getText().toString();
                char ch = '.';
                int count = 0;
                for (int i = 0; i < temp_str.length(); i++) {
                    if (temp_str.charAt(i) == ch) {
                        count++;
                    }
                }
                if(count == 0) {
                    tv.append(".");
                }
                if(temp_str.isEmpty()){
                    tv.setText("0.");
                }
            }
        });

        Button btn_add = (Button) findViewById(R.id.btn_add);
        btn_add.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView tv = (TextView)findViewById(R.id.textView3);
                String temp_str = tv.getText().toString();
                float number = Float.parseFloat(temp_str);
                float result = Float.parseFloat(str_result);
                if(last_op != "+" && last_op !=""){
                    switch (last_op){
                        case "+":
                            result = result + number;
                            break;
                        case "-":
                            result = result - number;
                            break;
                        case "*":
                            result = result * number;
                            break;
                        case "/":
                            result = result / number;
                            break;
                    }
                    str_result = String.valueOf(result);
                }
                else{
                    result = result + number;
                    str_result = String.valueOf(result);
                }
                tv.setText("");
                last_op = "+";
            }
        });

        Button btn_sub = (Button) findViewById(R.id.btn_sub);
        btn_sub.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView tv = (TextView)findViewById(R.id.textView3);
                String temp_str = tv.getText().toString();
                float number = Float.parseFloat(temp_str);
                float result = Float.parseFloat(str_result);
                if(last_op != "-" && last_op !=""){
                    switch (last_op){
                        case "+":
                            result = result + number;
                            break;
                        case "-":
                            result = result - number;
                            break;
                        case "*":
                            result = result * number;
                            break;
                        case "/":
                            result = result / number;
                            break;
                    }
                    str_result = String.valueOf(result);
                }
                else {
                    if (str_result.equals("0")) {
                        str_result = temp_str;
                    } else {
                        result = result - number;
                        str_result = String.valueOf(result);
                    }
                }
                tv.setText("");
                last_op = "-";

            }
        });

        Button btn_multi = (Button) findViewById(R.id.btn_multi);
        btn_multi.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {

                TextView tv = (TextView)findViewById(R.id.textView3);
                String temp_str = tv.getText().toString();
                float number = Float.parseFloat(temp_str);
                float result = Float.parseFloat(str_result);
                if(last_op != "*" && last_op !=""){
                    switch (last_op){
                        case "+":
                            result = result + number;
                            break;
                        case "-":
                            result = result - number;
                            break;
                        case "*":
                            result = result * number;
                            break;
                        case "/":
                            result = result / number;
                            break;
                    }
                    str_result = String.valueOf(result);
                }
                else {
                    if(str_result.equals("0")) {
                        //str_result = "1";
                        str_result = temp_str;
                    } else {
                        result = result * number;
                        str_result = String.valueOf(result);
                    }
                }
                tv.setText("");
                last_op = "*";
            }
        });

        Button btn_div = (Button) findViewById(R.id.btn_div);
        btn_div.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView tv = (TextView)findViewById(R.id.textView3);
                String temp_str = tv.getText().toString();
                float number = Float.parseFloat(temp_str);
                float result = Float.parseFloat(str_result);
                if(last_op != "/" && last_op !=""){
                    switch (last_op){
                        case "+":
                            result = result + number;
                            break;
                        case "-":
                            result = result - number;
                            break;
                        case "*":
                            result = result * number;
                            break;
                        case "/":
                            result = result / number;
                            break;
                    }
                    str_result = String.valueOf(result);
                }
                else {
                    if (str_result.equals("0")) {
                        str_result = temp_str;
                    } else {
                        result = result / number;
                        if(number == 0){
                            result= 0;
                        }
                        str_result = String.valueOf(result);
                    }
                }
                tv.setText("");
                last_op = "/";
            }
        });

        Button btn_sqrt = (Button) findViewById(R.id.btn_sqrt);
        btn_sqrt.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView tv = (TextView) findViewById(R.id.textView3);
                String temp_str = tv.getText().toString();
                float number = Float.parseFloat(temp_str);
                float result = (float) Math.sqrt(number);
                float modulo = result % 1;
                if(modulo == 0.0){
                    int i_res = (int) result;
                    str_result = String.valueOf(i_res);
                }else {
                    str_result = String.valueOf(result);
                }
                tv.setText(str_result);
                str_result = "0";
            }
            });

        Button btn_sqroot = (Button) findViewById(R.id.btn_sqroot);
        btn_sqroot.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView tv = (TextView) findViewById(R.id.textView3);
                String temp_str = tv.getText().toString();
                float number = Float.parseFloat(temp_str);
                float result = (float) Math.sqrt(number);
                result = (float) Math.pow(number,2);

                float modulo = result % 1;
                if(modulo == 0.0){
                    int i_res = (int) result;
                    str_result = String.valueOf(i_res);
                }else {
                    str_result = String.valueOf(result);
                }

                tv.setText(str_result);
                str_result = "0";
            }
        });

        Button btn_root = (Button) findViewById(R.id.btn_root);
        btn_root.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView tv = (TextView) findViewById(R.id.textView3);
                String temp_str = tv.getText().toString();
                str_result = temp_str;
                tv.setText("");
                last_op = "btn_root";
            }
        });

        Button btn_log = (Button) findViewById(R.id.btn_log);
        btn_log.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView tv = (TextView) findViewById(R.id.textView3);
                String temp_str = tv.getText().toString();
                float number = Float.parseFloat(temp_str);
                float result = (float) Math.log10(number);
                float modulo = result % 1;
                if(modulo == 0.0){
                    int i_res = (int) result;
                    str_result = String.valueOf(i_res);
                }else {
                    str_result = String.valueOf(result);
                }
                tv.setText(str_result);
                str_result = "0";
            }
        });

        Button btn_sin = (Button) findViewById(R.id.btn_sin);
        btn_sin.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView tv = (TextView) findViewById(R.id.textView3);
                String temp_str = tv.getText().toString();
                float number = Float.parseFloat(temp_str);
                number = (float) Math.toRadians(number);
                float result = (float) Math.sin(number);
                float modulo = result % 1;
                if(modulo == 0.0){
                    int i_res = (int) result;
                    str_result = String.valueOf(i_res);
                }else {
                    str_result = String.valueOf(result);
                }
                tv.setText(str_result);
                str_result = "0";
            }
        });

        Button btn_cos = (Button) findViewById(R.id.btn_cos);
        btn_cos.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView tv = (TextView) findViewById(R.id.textView3);
                String temp_str = tv.getText().toString();
                float number = Float.parseFloat(temp_str);
                number = (float) Math.toRadians(number);
                float result = (float) Math.cos(number);
                float modulo = result % 1;
                if(modulo == 0.0){
                    int i_res = (int) result;
                    str_result = String.valueOf(i_res);
                }else {
                    str_result = String.valueOf(result);
                }
                tv.setText(str_result);
                str_result = "0";
            }
        });

        Button btn_tan = (Button) findViewById(R.id.btn_tan);
        btn_tan.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView tv = (TextView) findViewById(R.id.textView3);
                String temp_str = tv.getText().toString();
                float number = Float.parseFloat(temp_str);
                number = (float) Math.toRadians(number);
                float result = (float) Math.tan(number);
                float modulo = result % 1;
                if(modulo == 0.0){
                    int i_res = (int) result;
                    str_result = String.valueOf(i_res);
                }else {
                    str_result = String.valueOf(result);
                }
                tv.setText(str_result);
                str_result = "0";
            }
        });

        Button btn_ln = (Button) findViewById(R.id.btn_ln);
        btn_ln.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView tv = (TextView) findViewById(R.id.textView3);
                String temp_str = tv.getText().toString();
                float number = Float.parseFloat(temp_str);
                float result = (float) Math.sqrt(number);
                result = (float) Math.log(number);
                float modulo = result % 1;
                if(modulo == 0.0){
                    int i_res = (int) result;
                    str_result = String.valueOf(i_res);
                }else {
                    str_result = String.valueOf(result);
                }
                tv.setText(str_result);
                str_result = "0";
            }
        });

        Button btn_perc = (Button) findViewById(R.id.btn_perc);
        btn_perc.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView tv = (TextView) findViewById(R.id.textView3);
                String temp_str = tv.getText().toString();
                str_result = temp_str;
                tv.setText("");
                last_op = "%";
            }
        });

        Button btn_res = (Button) findViewById(R.id.btn_res);
        btn_res.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView tv = (TextView)findViewById(R.id.textView3);
                String temp_str = tv.getText().toString();
                float number = Float.parseFloat(temp_str);
                float result = Float.parseFloat(str_result);

                switch (last_op){
                    case "+":
                        result = result + number;
                        break;
                    case "-":
                        result = result - number;
                        break;
                    case "*":
                        result = result * number;
                        break;
                    case "/":
                        result = result / number;
                        break;
                    case "btn_root":
                        result = (float) Math.pow(result,number);
                        break;
                    case "%":
                        result = (float) (result/100) * number;
                        break;
                }
                float modulo = result % 1;
                if(modulo == 0.0){
                    int i_res = (int) result;
                    str_result = String.valueOf(i_res);
                }else {
                    str_result = String.valueOf(result);
                }
                tv.setText(str_result);
                str_result = "0";
                last_op = "";
            }
        });
    }
}
