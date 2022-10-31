package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import org.mariuszgromada.math.mxparser.Expression;

public class MainActivity extends AppCompatActivity{

    //Declaration Button
    public String mainthing="";
    public TextView visabletext;
    public Expression exp = new Expression("");
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        visabletext=findViewById(R.id.calculatorScreen);
    }

    public void buttonClicked(View view) {
        if(view.getId() == R.id.n0){
            mainthing+="0";
        }
        else if(view.getId() == R.id.n1){

            mainthing+="1";
        }
        else if(view.getId() == R.id.n2){

            mainthing+="2";
        }
        else if(view.getId() == R.id.n3){

            mainthing+="3";
        }
        else if(view.getId() == R.id.n4){

            mainthing+="4";
        }
        else if(view.getId() == R.id.n5){

            mainthing+="5";
        }
        else if(view.getId() == R.id.n6){

            mainthing+="6";
        }
        else if(view.getId() == R.id.n7){

            mainthing+="7";
        }
        else if(view.getId() == R.id.n8){

            mainthing+="8";
        }
        else if(view.getId() == R.id.n9){

            mainthing+="9";
        }
        else if(view.getId() == R.id.MC){


        }
        else if(view.getId() == R.id.MR){


        }
        else if(view.getId() == R.id.MS){


        }
        else if(view.getId() == R.id.del && !mainthing.isEmpty()){
            if(Character.toString(mainthing.charAt(mainthing.length()-1)).contains(" ")){

                mainthing=mainthing.substring(0,mainthing.length()-2);
            }
            mainthing=mainthing.substring(0,mainthing.length()-1);
        }
        else if(view.getId() == R.id.clearEverything){
            mainthing="";

        }
        else if(view.getId() == R.id.factorial){
            exp.setExpressionString("("+mainthing+")!");
            mainthing=Double.toString(exp.calculate());
        }
        else if(view.getId() == R.id.procent){
            mainthing+= " % ";

        }
        else if(view.getId() == R.id.mMinus){


        }
        else if(view.getId() == R.id.mPlus){


        }
        else if(view.getId() == R.id.division){

            mainthing+=" / ";
        }
        else if(view.getId() == R.id.multiplication){

            mainthing+=" * ";
        }
        else if(view.getId() == R.id.nxx){

            mainthing+=" - ";
        }
        else if(view.getId() == R.id.nxxx){
            mainthing+=" + ";
        }
        else if(view.getId() == R.id.eq){

            exp.setExpressionString(mainthing);

            mainthing=Double.toString(exp.calculate());
        }
        visabletext.setText(mainthing);
    }
}