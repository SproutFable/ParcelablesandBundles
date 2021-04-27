package com.ehsankolivand.parcelablesandbundles

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.ehsankolivand.parcelablesandbundles.model.Person

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        intent.let {
           val person: Person? =  it.getParcelableExtra("person")
            if (person != null) {
                Toast.makeText(this,"${person.name} ${person.family}  ${person.age}",Toast.LENGTH_LONG).show()
            }else {
                Toast.makeText(this,"it is null",Toast.LENGTH_LONG).show()

            }
        }
    }
}