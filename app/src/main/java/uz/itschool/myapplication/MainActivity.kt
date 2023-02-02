package uz.itschool.myapplication

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var anim: Animation =AnimationUtils.loadAnimation(this,R.anim.scale)
        var anim1: Animation =AnimationUtils.loadAnimation(this,R.anim.scale2)
        var btn=findViewById<Button>(R.id.button)
        var img=findViewById<ImageView>(R.id.img)
        var tv=findViewById<TextView>(R.id.text)
       img.setOnClickListener{
       img.setImageResource(R.drawable.images)
         img.startAnimation(anim)
           anim.setAnimationListener(object:Animation.AnimationListener{
               override fun onAnimationStart(p0: Animation?) {

               }

               override fun onAnimationEnd(p0: Animation?) {
                  img.setImageResource(R.drawable.img3)
                   img.startAnimation(anim1)
               }

               override fun onAnimationRepeat(p0: Animation?) {

               }
           })

    }
}}