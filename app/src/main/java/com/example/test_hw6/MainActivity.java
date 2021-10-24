package com.example.test_hw6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.test_hw6.databinding.ActivityMainBinding;
import com.example.test_hw6.model.MathTest;

public
class MainActivity extends AppCompatActivity {

    private ActivityMainBinding ui;
    private MathTest mathTest;

    @Override
    protected
    void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        ui = ActivityMainBinding.inflate( getLayoutInflater() );
        setContentView( ui.getRoot() );

        ui.addBtn.setOnClickListener( v -> {
            int num1 = Integer.valueOf( ui.input1.getText().toString() );
            int num2 = Integer.valueOf( ui.input2.getText().toString() );
            ui.resultText.setText( String.valueOf( mathTest.add( num1, num2 ) ) );
        } );

        ui.subtractBtn.setOnClickListener( v -> {
            int num1 = Integer.valueOf( ui.input1.getText().toString() );
            int num2 = Integer.valueOf( ui.input2.getText().toString() );
            ui.resultText.setText( String.valueOf( mathTest.subtract( num1, num2 ) ) );
        } );

        ui.multiplyBtn.setOnClickListener( v -> {
            int num1 = Integer.valueOf( ui.input1.getText().toString() );
            int num2 = Integer.valueOf( ui.input1.getText().toString() );
            ui.resultText.setText( String.valueOf( mathTest.multiply( num1, num2 ) ) );
        } );

        ui.divBtn.setOnClickListener( v -> {
            int num1 = Integer.valueOf( ui.input1.getText().toString() );
            int num2 = Integer.valueOf( ui.input2.getText().toString() );
            ui.resultText.setText( String.valueOf( mathTest.div( num1, num2 ) ) );
        } );

    }
}
