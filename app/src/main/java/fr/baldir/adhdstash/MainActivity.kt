package fr.baldir.adhdstash

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import fr.baldir.adhdstash.domain.Stash
import fr.baldir.adhdstash.domain.Stash.Persistence.toPersistFormat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

       val stashData =  getSharedPreferences(getString(R.string.stashData), Context.MODE_PRIVATE)
        stashData.getString(getString(R.string.stashDataKey), Stash().toPersistFormat())
        // Initialize with fresh state


        setContentView(R.layout.activity_main)

    }

    fun stash(view:View){

//            savedInstanceState.
        // get domain state from context
        // compute domain
        // apply infrastructure side effect from updated domain
        // update context with domain
    }

}

