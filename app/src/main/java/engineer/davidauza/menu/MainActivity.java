package engineer.davidauza.menu;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void printToLogs(View view) {
        String javaFile = "MainActivity.java";
        String textToDisplay;

        // Find first menu item TextView and print the text to the logs
        TextView textViewOne = findViewById(R.id.menu_item_1);
        textToDisplay = (String) textViewOne.getText();
        Log.i(javaFile, textToDisplay);

        // Find second menu item TextView and print the text to the logs
        TextView textViewTwo = findViewById(R.id.menu_item_2);
        textToDisplay = (String) textViewTwo.getText();
        Log.i(javaFile, textToDisplay);

        // Find third menu item TextView and print the text to the logs
        TextView textViewThree = findViewById(R.id.menu_item_3);
        textToDisplay = (String) textViewThree.getText();
        Log.i(javaFile, textToDisplay);
    }
}