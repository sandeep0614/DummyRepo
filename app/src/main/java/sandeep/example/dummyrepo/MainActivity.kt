package sandeep.example.dummyrepo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private val TAG = "MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val a =0;
        val b=0;
        var c=a+b;
        Log.d(TAG,"c=$c")
        val btn=findViewById<Button>(R.id.button)
        btn.setOnClickListener{
            val e=2
            Toast.makeText(this,"This is a toast message",Toast.LENGTH_SHORT).show()
        }
    }
}
