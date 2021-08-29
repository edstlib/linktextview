package id.co.edtslib.linktextview.example

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import id.co.edtslib.linktextview.LinkTextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<LinkTextView>(R.id.textView).setOnClickListener {
            Toast.makeText(this, "Hello Link", Toast.LENGTH_SHORT).show()
        }
    }
}