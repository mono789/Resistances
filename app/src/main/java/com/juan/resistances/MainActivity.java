package com.juan.resistances;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Spinner sColor1, sColor2, sColor3, sColor4;
    private TextView tValue;
    private String color1, color2, color3, color4;
    private Button bCalculate;
    private String v="", v1="",v2="";
    private Double V;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sColor1= (Spinner) findViewById(R.id.sColor1);
        sColor2= (Spinner) findViewById(R.id.sColor2);
        sColor3= (Spinner) findViewById(R.id.sColor3);
        sColor4= (Spinner) findViewById(R.id.sColor4);
        tValue= (TextView) findViewById(R.id.tValue);
        bCalculate =(Button) findViewById(R.id.bCalculate);

        ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(this,
                R.array.colores1, android.R.layout.simple_spinner_item);
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        sColor1.setAdapter(adapter1);
        sColor1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                color1= adapterView.getItemAtPosition(i).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource(this,
                R.array.colores2, android.R.layout.simple_spinner_item);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        sColor2.setAdapter(adapter2);
        sColor2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                color2= adapterView.getItemAtPosition(i).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        ArrayAdapter<CharSequence> adapter3 = ArrayAdapter.createFromResource(this,
                R.array.colores3, android.R.layout.simple_spinner_item);
        adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        sColor3.setAdapter(adapter3);
        sColor3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                color3= adapterView.getItemAtPosition(i).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        ArrayAdapter<CharSequence> adapter4 = ArrayAdapter.createFromResource(this,
                R.array.colores4, android.R.layout.simple_spinner_item);
        adapter4.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        sColor4.setAdapter(adapter4);
        sColor4.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                color4= adapterView.getItemAtPosition(i).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        bCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(color1.isEmpty() || color2.isEmpty() || color3.isEmpty() || color4.isEmpty()){
                    tValue.setText("Colors are missing");
                }
                else{

                    if(color1.equals("Brown")){
                       v1="1";

                    }
                    if(color1.equals("Red")){
                        v1="2";
                    }
                    if(color1.equals("Orange")){
                        v1="3";
                    }
                    if(color1.equals("Yellow")){
                        v1="4";
                    }
                    if(color1.equals("Green")){
                        v1="5";
                    }
                    if(color1.equals("Blue")){
                        v1="6";
                    }
                    if(color1.equals("Purple")){
                        v1="7";
                    }
                    if(color1.equals("Grey")){
                        v1="8";
                    }
                    if(color1.equals("White")){
                        v1="9";
                    }
/******************************************************************************/
                    if(color2.equals("Black")){
                        v2="0";

                    }
                    if(color2.equals("Brown")){
                        v2="1";

                    }
                    if(color2.equals("Red")){
                        v2="2";
                    }
                    if(color2.equals("Orange")){
                        v2="3";
                    }
                    if(color2.equals("Yellow")){
                        v2="4";
                    }
                    if(color2.equals("Green")){
                        v2="5";
                    }
                    if(color2.equals("Blue")){
                        v2="6";
                    }
                    if(color2.equals("Purple")){
                        v2="7";
                    }
                    if(color2.equals("Grey")){
                        v2="8";
                    }
                    if(color2.equals("White")) {
                        v2 = "9";
                    }
                    v=v1+v2;
                    V= Double.parseDouble(v);
/***************************************************************************************/
                    if(color3.equals("Black")){
                        V*=1;

                    }
                    if(color3.equals("Brown")){
                        V*=10;

                    }
                    if(color3.equals("Red")){
                        V*=100;
                    }
                    if(color3.equals("Orange")){
                        V*=1000;
                    }
                    if(color3.equals("Yellow")){
                        V*=10000;
                    }
                    if(color3.equals("Green")){
                        V*=100000;
                    }
                    if(color3.equals("Blue")){
                        V*=1000000;
                    }
                    if(color3.equals("Golden")){
                        V/=10;
                    }
                    if(color3.equals("Silver")){
                        V/=100;
                    }
/***************************************************************************************/
                    if(color4.equals("Brown")){
                        V/=1000;
                        Double V1=(V*0.01)+V;
                        Double V2=V-(V*0.01);
                        tValue.setText("Value:"+V+"K"+ "\nMax value: "+V1+"K"+"\nMin value: "+V2+"K");
                    }
                    if(color4.equals("Red")){
                        V/=1000;
                        Double V1=(V*0.02)+V;
                        Double V2=V-(V*0.02);
                        tValue.setText("Value:"+V+"K"+ "\nMax value: "+V1+"K"+"\nMin value: "+V2+"K");
                    }
                    if(color4.equals("Golden")){
                        V/=1000;
                        Double V1=(V*0.05)+V;
                        Double V2=V-(V*0.05);
                        tValue.setText("Value:"+V+"K"+ "\nMax value: "+V1+"K"+"\nMin value: "+V2+"K");
                    }
                    if(color4.equals("Silver")){
                        V/=1000;
                        Double V1=(V*0.1)+V;
                        Double V2=V-(V*0.1);
                        tValue.setText("Value:"+V+"K"+ "\nMax value: "+V1+"K"+"\nMin value: "+V2+"K");
                    }

                }

            }
        });
    }
}
