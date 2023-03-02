package com.example.photoframe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    var currentImage = 0
    lateinit var image : ImageView

    var sentences = arrayOf(
        "Let's revisit the origins and history of Holi with some historical pictures.",
        "Prahlada was a young prince and the son of the demon king Hiranyakashipu. He is known for his unwavering devotion to Lord Vishnu despite his father's attempts to dissuade him from worshiping Vishnu.",
        "Hiranyakashipu was vehemently against his son Prahlada's devotion to Lord Vishnu. His behavior towards Prahlada stemmed from his extreme hatred and jealousy towards Lord Vishnu, whom he considered his mortal enemy.",
        "Despite his father's cruel torture and attempts to dissuade him, Prahlada's devotion to Lord Vishnu remained unshaken in Hindu mythology.",
        "Hiranyakashipu, made several attempts to kill his son in Hindu mythology. He tried to trample Prahlada with elephants, poison him, burn him alive, and throw him off a cliff, among other methods.",
        "However, each time, Lord Vishnu saved Prahlada and protected him from harm, showcasing the triumph of good over evil",
        "Hiranyakashipu's sister, Holika, attempted to kill Prahlada by luring him into a fire while wearing a fire-resistant cloak.",
        "However, due to Prahlada's unwavering devotion to Lord Vishnu, the cloak flew off Holika and protected Prahlada,",
        "leading to Holika's demise and the celebration of the Hindu festival of Holi.",
        "Wishing everyone a very happy Holi! Let's spread love and happiness with colors and celebrate this joyous festival together."

    )

    var check : String = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.hide()
        val prev = findViewById<ImageButton>(R.id.imgPrev)
        val next = findViewById<ImageButton>(R.id.imgNext)

        var history = findViewById<TextView>(R.id.textDetails)

        prev.setOnClickListener{
            val idCurrentImageString = "pic$currentImage"
            val idCurrentImageInt = this.resources.getIdentifier(idCurrentImageString, "id", packageName)
            image = findViewById(idCurrentImageInt)
            image.alpha = 0f

            currentImage = (10+ currentImage -1)%10
            val idImageToShowString = "pic$currentImage"
//            convert String id into integer address associated with it
            val idImageToShowInt = this.resources.getIdentifier(idImageToShowString, "id", packageName)
            image = findViewById(idImageToShowInt)
            image.alpha = 1f
            history.text = sentences[currentImage]
        }

        next.setOnClickListener{
            val idCurrentImageString = "pic$currentImage"
            val idCurrentImageInt = this.resources.getIdentifier(idCurrentImageString, "id", packageName)
            image = findViewById(idCurrentImageInt)
            image.alpha = 0f

            currentImage = (10+ currentImage + 1)%10
            val idImageToShowString = "pic$currentImage"
//            convert String id into integer address associated with it
            val idImageToShowInt = this.resources.getIdentifier(idImageToShowString, "id", packageName)
            image = findViewById(idImageToShowInt)
            image.alpha = 1f
            history.text = sentences[currentImage]
        }
    }
}