package com.example.sonuroy.mygame;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button b2,b3,b4,b5,b6,b7,b8,b9,b10,b11;
    TextView t1;
    int count=0,tye=0;
    String s1 = "0";
    String s2 = "x";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        t1=(TextView)findViewById(R.id.textView);
        b2=(Button)findViewById(R.id.button2);
        b3=(Button)findViewById(R.id.button3);
        b4=(Button)findViewById(R.id.button4);
        b5=(Button)findViewById(R.id.button5);
        b6=(Button)findViewById(R.id.button6);
        b7=(Button)findViewById(R.id.button7);
        b8=(Button)findViewById(R.id.button8);
        b9=(Button)findViewById(R.id.button9);
        b10=(Button)findViewById(R.id.button10);
        b11=(Button)findViewById(R.id.button11);
    }
    public void fun3(){
        b2.setEnabled(false);
        b3.setEnabled(false);
        b4.setEnabled(false);
        b5.setEnabled(false);
        b6.setEnabled(false);
        b7.setEnabled(false);
        b8.setEnabled(false);
        b9.setEnabled(false);
        b10.setEnabled(false);
        t1.setText("match tye");
    }
    public void fun1(){

        b2.setEnabled(false);
        b3.setEnabled(false);
        b4.setEnabled(false);
        b5.setEnabled(false);
        b6.setEnabled(false);
        b7.setEnabled(false);
        b8.setEnabled(false);
        b9.setEnabled(false);
        b10.setEnabled(false);
        t1.setText("X won");

    }
    public void fun2(){

        b2.setEnabled(false);
        b3.setEnabled(false);
        b4.setEnabled(false);
        b5.setEnabled(false);
        b6.setEnabled(false);
        b7.setEnabled(false);
        b8.setEnabled(false);
        b9.setEnabled(false);
        b10.setEnabled(false);
        t1.setText("Team B won");
    }

    public void on2Click(View view){
        if(count%2==0){
            b2.setText("x");
        }
        else {
         b2.setText("0");
        }
        count++;
        tye++;
        onCheck2();
        b2.setEnabled(false);
    }
    public void on3Click(View view){
        if(count%2==0){
            b3.setText("x");
        }
        else {
            b3.setText("0");
        }
        count++;
        onCheck3();
        tye++;
        b3.setEnabled(false);
    }

    public void on4Click(View view){
        if(count%2==0){
            b4.setText("x");
        }
        else {
            b4.setText("0");
        }
        count++;
        tye++;
        onCheck4();
        b4.setEnabled(false);
    }

    public void on5Click(View view){
        if(count%2==0){
            b5.setText("x");
        }
        else {
            b5.setText("0");
        }
        count++;
        onCheck5();
        tye++;
        b5.setEnabled(false);
    }

    public void on6Click(View view){

        if(count%2==0){
            b6.setText("x");
        }
        else {
            b6.setText("0");
        }
        count++;
        tye++;
        onCheck6();
        b6.setEnabled(false);
    }

    public void on7Click(View view){

        if(count%2==0){
            b7.setText("x");
        }
        else {
            b7.setText("0");
        }
        count++;
        tye++;
        onCheck7();
        b7.setEnabled(false);
    }

    public void on8Click(View view){

        if(count%2==0) {
            b8.setText("x");
        }
        else {
            b8.setText("0");
        }
        count++;
        tye++;
        onCheck8();
        b8.setEnabled(false);
    }

    public void on9Click(View view){

        if(count%2==0){
            b9.setText("x");
        }
        else {
            b9.setText("0");
        }
        count++;
        tye++;
        onCheck9();
        b9.setEnabled(false);
    }

    public void on10Click(View view){

        if(count%2==0){
            b10.setText("x");
        }
        else {
            b10.setText("0");
        }
        count++;
        tye++;
        onCheck10();
        b10.setEnabled(false);
    }

    public void onReset(View view){
        b2.setText("");
        b3.setText("");
        b4.setText("");
        b5.setText("");
        b6.setText("");
        b7.setText("");
        b8.setText("");
        b9.setText("");
        b10.setText("");
        t1.setText("");

        b2.setEnabled(true);
        b3.setEnabled(true);
        b4.setEnabled(true);
        b5.setEnabled(true);
        b6.setEnabled(true);
        b7.setEnabled(true);
        b8.setEnabled(true);
        b9.setEnabled(true);
        b10.setEnabled(true);
        count=0;
        tye=0;
    }

    public void onCheck2(){
        if (s1.equals(b2.getText()) && s1.equals(b3.getText()) && s1.equals(b4.getText())) {
            fun1();
        }
        else if (s2.equals(b2.getText()) && s2.equals(b3.getText()) && s2.equals(b4.getText())) {
            fun2();
        }
        else if (s1.equals(b2.getText()) && s1.equals(b5.getText()) && s1.equals(b8.getText())) {
            fun1();
        }
        else if (s2.equals(b2.getText()) && s2.equals(b5.getText()) && s2.equals(b8.getText())) {
            fun2();
        }
        else if (s1.equals(b2.getText()) && s1.equals(b6.getText()) && s1.equals(b10.getText())) {
            fun1();
        }
        else if (s2.equals(b2.getText()) && s2.equals(b6.getText()) && s2.equals(b10.getText())) {
            fun2();
        }
        else {
            if (tye == 9) {
                fun3();
            }
        }
    }
    public void onCheck3(){

        if (s1.equals(b2.getText()) && s1.equals(b3.getText()) && s1.equals(b4.getText())) {
            fun1();
        }
        else if (s2.equals(b2.getText()) && s2.equals(b3.getText()) && s2.equals(b4.getText())) {
            fun2();
        }
        else if (s1.equals(b3.getText()) && s1.equals(b6.getText()) && s1.equals(b9.getText())) {
            fun1();
        }
        else if (s2.equals(b3.getText()) && s2.equals(b6.getText()) && s2.equals(b9.getText())) {
            fun2();
        }
        else{
            if(tye==9) {
                fun3();
            }
        }
    }
    public void onCheck4() {
        if (s1.equals(b2.getText()) && s1.equals(b3.getText()) && s1.equals(b4.getText())) {
            fun1();
        } else if (s2.equals(b2.getText()) && s2.equals(b3.getText()) && s2.equals(b4.getText())) {
            fun2();
        } else if (s1.equals(b4.getText()) && s1.equals(b7.getText()) && s1.equals(b10.getText())) {
            fun1();
        } else if (s2.equals(b4.getText()) && s2.equals(b7.getText()) && s2.equals(b10.getText())) {
            fun2();
        } else if (s1.equals(b4.getText()) && s1.equals(b6.getText()) && s1.equals(b8.getText())) {
            fun1();
        } else if (s2.equals(b4.getText()) && s2.equals(b6.getText()) && s2.equals(b8.getText())) {
            fun2();
        }
        else {
            if (tye == 9) {
                fun3();
            }
        }
    }
    public void onCheck5(){
        if (s1.equals(b5.getText()) && s1.equals(b6.getText()) && s1.equals(b7.getText())) {
            fun1();
        }
        else if (s2.equals(b5.getText()) && s2.equals(b6.getText()) && s2.equals(b7.getText())) {
            fun2();
        }
        else if (s1.equals(b2.getText()) && s1.equals(b5.getText()) && s1.equals(b8.getText())) {
            fun1();
        }
        else if (s2.equals(b2.getText()) && s2.equals(b5.getText()) && s2.equals(b8.getText())) {
            fun2();
        }
        else {
            if (tye == 9) {
                fun3();
            }
        }
    }
    public void onCheck6(){
        if (s1.equals(b5.getText()) && s1.equals(b6.getText()) && s1.equals(b7.getText())) {
            fun1();
        }
        else if (s2.equals(b5.getText()) && s2.equals(b6.getText()) && s2.equals(b7.getText())) {
            fun2();
        }
        else if (s1.equals(b3.getText()) && s1.equals(b6.getText()) && s1.equals(b9.getText())) {
            fun1();
        }
        else if (s2.equals(b3.getText()) && s2.equals(b6.getText()) && s2.equals(b9.getText())) {
            fun2();
        }
        else if (s1.equals(b4.getText()) && s1.equals(b6.getText()) && s1.equals(b8.getText())) {
            fun1();
        }
        else if (s2.equals(b4.getText()) && s2.equals(b6.getText()) && s2.equals(b8.getText())) {
            fun2();
        }
        else if (s1.equals(b2.getText()) && s1.equals(b6.getText()) && s1.equals(b10.getText())) {
            fun1();
        }
        else if (s2.equals(b2.getText()) && s2.equals(b6.getText()) && s2.equals(b10.getText())) {
            fun2();
        }
        else {
            if (tye == 9) {
                fun3();
            }
        }
    }
    public void onCheck7(){
        if (s1.equals(b5.getText()) && s1.equals(b6.getText()) && s1.equals(b7.getText())) {
            fun1();
        }
        else if (s2.equals(b5.getText()) && s2.equals(b6.getText()) && s2.equals(b7.getText())) {
            fun2();
        }
        else if (s1.equals(b4.getText()) && s1.equals(b7.getText()) && s1.equals(b10.getText())) {
            fun1();
        }
        else if (s2.equals(b4.getText()) && s2.equals(b7.getText()) && s2.equals(b10.getText())) {
            fun2();
        }
        else {
            if (tye == 9) {
                fun3();
            }
        }
    }
    public void onCheck8(){
        if (s1.equals(b8.getText()) && s1.equals(b9.getText()) && s1.equals(b10.getText())) {
            fun1();
        }
        else if (s2.equals(b8.getText()) && s2.equals(b9.getText()) && s2.equals(b10.getText())) {
            fun2();
        }
        else if (s1.equals(b2.getText()) && s1.equals(b5.getText()) && s1.equals(b8.getText())) {
            fun1();
        }
        else if (s2.equals(b2.getText()) && s2.equals(b5.getText()) && s2.equals(b8.getText())) {
            fun2();
        }
        else if (s1.equals(b4.getText()) && s1.equals(b6.getText()) && s1.equals(b8.getText())) {
            fun1();
        }
        else if (s2.equals(b4.getText()) && s2.equals(b6.getText()) && s2.equals(b8.getText())) {
            fun2();
        }
        else{
            if(tye==9) {
                fun3();
            }
        }
    }
    public void onCheck9(){
        if (s1.equals(b8.getText()) && s1.equals(b9.getText()) && s1.equals(b10.getText())) {
            fun1();
        }
        else if (s2.equals(b8.getText()) && s2.equals(b9.getText()) && s2.equals(b10.getText())) {
            fun2();
        }
        else if (s1.equals(b3.getText()) && s1.equals(b6.getText()) && s1.equals(b9.getText())) {
            fun1();
        }
        else if (s2.equals(b3.getText()) && s2.equals(b6.getText()) && s2.equals(b9.getText())) {
            fun2();
        }
        else {
            if (tye == 9) {
                fun3();
            }
        }
    }
    public void onCheck10(){
        if (s1.equals(b8.getText()) && s1.equals(b9.getText()) && s1.equals(b10.getText())) {
            fun1();
        }
        else if (s2.equals(b8.getText()) && s2.equals(b9.getText()) && s2.equals(b10.getText())) {
            fun2();
        }
        else if (s1.equals(b4.getText()) && s1.equals(b7.getText()) && s1.equals(b10.getText())) {
            fun1();
        }
        else if (s2.equals(b4.getText()) && s2.equals(b7.getText()) && s2.equals(b10.getText())) {
            fun2();
        }
        else if (s1.equals(b2.getText()) && s1.equals(b6.getText()) && s1.equals(b10.getText())) {
            fun1();
        }
        else if (s2.equals(b2.getText()) && s2.equals(b6.getText()) && s2.equals(b10.getText())) {
            fun2();
        }
        else {
            if (tye == 9) {
                fun3();
            }
        }
    }
}
