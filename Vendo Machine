package com.example.vendomachine;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button  = findViewById(R.id.button);
        ImageButton cokeB = findViewById(R.id.coke);
        ImageButton tropicanaB = findViewById(R.id.tropicana);
        ImageButton spriteB = findViewById(R.id.sprite);
        ImageButton vivaB = findViewById(R.id.viva);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText inputText = findViewById(R.id.amount);
                String text = inputText.getText().toString();
                String inputAmount = text;
                int convertedAmount = Integer.valueOf(inputAmount);
                if (!inputAmount.isEmpty()){
                    for(int i = 0; i < 5; i++){
                        switch (i){
                            case 1: {
                                if (convertedAmount >=17){
                                    TextView coke = findViewById(R.id.coket);
                                    coke.setTextColor(Color.parseColor("#00FF00"));
                                    cokeB.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View view) {
                                            Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                                            TextView price = (TextView)  findViewById(R.id.cokeP);
                                            String value = price.getText().toString();
                                            String amount = inputAmount;
                                            intent.putExtra("price", value);
                                            intent.putExtra("amount", amount);
                                            intent.putExtra("image", 1);
                                            startActivity(intent);
                                        }
                                    });
                                } else {
                                    TextView coke = findViewById(R.id.coket);
                                    coke.setTextColor(Color.parseColor("FF0000"));
                                }
                                break;
                            }
                            case 2: {
                                if (convertedAmount >=18) {
                                    TextView sprite = findViewById(R.id.spritet);
                                    sprite.setTextColor(Color.parseColor("#00FF00"));
                                    spriteB.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View view) {
                                            Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                                            TextView price = (TextView)  findViewById(R.id.spriteP);
                                            String value = price.getText().toString();
                                            String amount = inputAmount;
                                            intent.putExtra("price", value);
                                            intent.putExtra("amount", amount);
                                            intent.putExtra("image", 1);
                                            startActivity(intent);
                                        }
                                    });
                                } else {
                                    TextView sprite = findViewById(R.id.spritet);
                                    sprite.setTextColor(Color.parseColor("FF0000"));
                                }
                                break;
                            }
                            case 3: {
                                if (convertedAmount >=20) {
                                    TextView viva = findViewById(R.id.vivat);
                                    viva.setTextColor(Color.parseColor("#00FF00"));
                                    vivaB.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View view) {
                                            Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                                            TextView price = (TextView)  findViewById(R.id.vivaP);
                                            String value = price.getText().toString();
                                            String amount = inputAmount;
                                            intent.putExtra("price", value);
                                            intent.putExtra("amount", amount);
                                            intent.putExtra("image", 1);
                                            startActivity(intent);
                                        }
                                    });
                                } else {
                                    TextView viva = findViewById(R.id.vivat);
                                    viva.setTextColor(Color.parseColor("FF0000"));
                                }
                                break;
                            }
                            case 4: {
                                if (convertedAmount >=34) {
                                    TextView tropicana = findViewById(R.id.tropicanat);
                                    tropicana.setTextColor(Color.parseColor("#00FF00"));
                                    tropicanaB.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View view) {
                                            Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                                            TextView price = (TextView)  findViewById(R.id.vivaP);
                                            String value = price.getText().toString();
                                            String amount = inputAmount;
                                            intent.putExtra("price", value);
                                            intent.putExtra("amount", amount);
                                            intent.putExtra("image", 1);
                                            startActivity(intent);
                                        }
                                    });
                                } else {
                                    TextView tropicana = findViewById(R.id.tropicanat);
                                    tropicana.setTextColor(Color.parseColor("FF0000"));
                                }
                                break;
                            }

                                }
                            }
                        }
                    }
                });
            }

    }
