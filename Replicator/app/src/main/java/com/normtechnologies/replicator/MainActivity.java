package com.normtechnologies.replicator;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText text,number;
    Button butt;
    TextView results;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        results=(TextView)findViewById(R.id.results);
        text=(EditText)findViewById(R.id.etext);
        number=(EditText)findViewById(R.id.etext2);

        butt=(Button)findViewById(R.id.butt);
        butt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            StringBuilder builder = new StringBuilder();
                String word=text.getText().toString();

                String  num=number.getText().toString();
                int a=Integer.parseInt(num);
                int i;
                   for(i=0;i<a;i++){
                       builder.append(word);
                   }
                results.setText(builder);


            }
        });
    }
}
