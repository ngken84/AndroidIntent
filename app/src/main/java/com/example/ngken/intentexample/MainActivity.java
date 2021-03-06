package com.example.ngken.intentexample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private Button bundleButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.mainActivityButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Main2Activity.class);
                intent.putExtra("message", "Hello From Activity 1");
                startActivity(intent);
            }
        });

        bundleButton = findViewById(R.id.bundleActivityButton);
        bundleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), BundleActivityExample.class);
                Bundle bundle = new Bundle();
                bundle.putString("message", "This string is from a bundle");
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });

    }
}
