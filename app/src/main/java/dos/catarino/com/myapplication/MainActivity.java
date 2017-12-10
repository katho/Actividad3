package dos.catarino.com.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Se crea la instancia de TextView y liga con un
        //identificador en el XML
        TextView miTextView = (TextView) findViewById(R.id.myTextView);
        //Se establece un nuevo contenido del TextView programáticamente
        miTextView.setText("He modificado TextView con un nuevo texto usando Java");
    }
}
