package ua.dk.p0111_resources;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button);
        imageView = (ImageView) findViewById(R.id.imageView);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView.setImageDrawable(getResources().getDrawable(R.drawable.ic_add_to_photos_black_48dp));
            }
        });

     /*   ImageView imageView = (ImageView) findViewById(R.id.imageView);
          imageView.setImageDrawable(getResources().getDrawable(R.drawable.ic_add_to_photos_black_48dp));
     */

    }
}
