package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Splash : AppCompatActivity() {
    lateinit var myRecyclerView : RecyclerView
    lateinit var newsArrayList: ArrayList<News>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        myRecyclerView = findViewById(R.id.recyclerView)
        val imageArr = arrayOf(
            R.drawable.pic0,
            R.drawable.pic1,
            R.drawable.pic2,
            R.drawable.pic3,
            R.drawable.pic4,
            R.drawable.pic5,
            R.drawable.pic6,
            R.drawable.pic7,
            R.drawable.pic8,
            R.drawable.pic9,
            R.drawable.pic10
        )

        val newsHeading = arrayOf(
            "Areas Streets Come Alive with Holi Festivities!",
            "Massive Earthquake Rocks Indonesia: Tsunami Warning Issued for Coastal Areas",
            "Successful Liver Transplant Gives Second Chance to Young Patient",
            "SpaceX Launches 60 More Starlink Satellites into Orbit",
            "Experts Warn of Surge in Fake News on Social Media Ahead of Elections",
            "Major Corporation Hit by Cyberattack, Data Breach Reported",
            "Apple Unveils New Lineup of Products and Services at Annual Event",
            "India Must Win Final Test Match Against Australia to Secure Spot in WTC Final",
            "Google Launches New Search Algorithm to Improve Results Accuracy",
            "High-Speed Car Chase Results in Arrest of Wanted Criminal",
            "International Trade Deal Reached to Boost Global Economy"
        )

        val newsPara = arrayOf(
            "As the vibrant festival of Holi approaches, the streets of various areas have come alive with colorful festivities. The atmosphere is filled with joy, as people gather in groups to celebrate the arrival of spring and the triumph of good over evil. The sight of people throwing colored powder and water at each other, dancing to the rhythm of traditional music, and indulging in delicious sweets is a common sight. Communities have come together to organize Holi events, complete with vibrant decorations, delicious food, and games. From children to elders, everyone is participating in the festivities with great enthusiasm. The celebrations are a beautiful reflection of the cultural diversity and spirit of unity that exists in the area.",
            "A massive earthquake has struck Indonesia, leaving the nation in a state of shock and emergency. The earthquake, measuring 7.2 on the Richter scale, was felt across several cities and regions, causing severe damage to buildings and infrastructure. The earthquake was followed by a tsunami warning, which has been issued for the coastal areas, increasing the risk of further devastation. Emergency services are currently working tirelessly to rescue survivors, treat the injured, and minimize the damage caused by the disaster. People in affected areas are being advised to stay calm, follow safety procedures, and evacuate to higher ground in case of a tsunami. This natural disaster is a harsh reminder of the fragility of life and the importance of being prepared for such unforeseen events. Our thoughts and prayers are with the people of Indonesia during this difficult time.",
            "In a medical breakthrough, a young patient has been given a second chance at life with a successful liver transplant. The patient, who was suffering from a severe liver disease, had been on the waiting list for a liver donor for months. The medical team had to act fast as the patient's condition was deteriorating rapidly. Fortunately, a suitable liver donor was found, and the transplant was carried out successfully. The patient is now recovering well and is expected to make a full recovery in due time. The success of this liver transplant is a testament to the advancements in medical science and the dedication of healthcare professionals in providing the best care for their patients. The patient's family has expressed their gratitude to the medical team and the liver donor, who have given their loved one a second chance at life. This heartwarming news is a reminder of the value of organ donation and the hope it brings to those in need.",
            "In yet another milestone for space exploration, SpaceX has successfully launched 60 more Starlink satellites into orbit. The launch took place from the Kennedy Space Center in Florida and was carried out by the Falcon 9 rocket. The mission aims to expand the network of low Earth orbit (LEO) satellites that will provide high-speed internet connectivity to users around the world. This is the 20th launch of Starlink satellites by SpaceX, bringing the total number of Starlink satellites in orbit to over 1,000. The successful launch is a testament to the technological prowess of SpaceX and the vision of its founder, Elon Musk, to make high-speed internet accessible to people everywhere. The deployment of Starlink satellites will not only improve internet connectivity in remote and rural areas but also has potential applications in areas such as disaster relief, military communications, and scientific research. The successful launch of 60 more Starlink satellites is a significant step forward in making the vision of global internet connectivity a reality.",
            "As elections approach in several countries, experts are warning of a potential surge in fake news on social media. The spread of misinformation and disinformation has become a major concern in recent years, with social media platforms being the primary source for the dissemination of false information. Fake news can have a significant impact on the democratic process, influencing public opinion and even swaying election results. Experts are urging people to be vigilant and verify the authenticity of news before sharing it on social media. They are also calling on social media platforms to take a more proactive role in identifying and removing false information from their platforms. Governments and civil society organizations are also working to raise awareness about the dangers of fake news and promote media literacy among citizens. As the world becomes increasingly connected through social media, the responsibility of ensuring the accuracy and credibility of information shared online falls on all of us. It is essential to remain vigilant and critically assess the information we receive before sharing it on social media.",
            "A major corporation has fallen victim to a cyberattack, resulting in a data breach that has put sensitive information at risk. The attack, which was carried out by sophisticated hackers, has compromised the security of the corporation's computer systems, potentially exposing personal information of its customers and employees. The corporation has since notified affected individuals and is taking steps to mitigate the damage caused by the breach. Cybersecurity experts are warning that attacks like these are becoming increasingly common and sophisticated, with businesses of all sizes being targeted. They are urging organizations to invest in robust cybersecurity measures to protect their systems and data from potential breaches. As the world becomes more reliant on technology, the threat of cyberattacks continues to grow, and businesses need to take proactive steps to protect themselves and their customers. The ramifications of a cyberattack and data breach can be far-reaching and long-lasting, underscoring the need for constant vigilance and preparedness in the face of these threats.",
            "Apple has unveiled its latest lineup of products and services at its highly anticipated annual event. The tech giant introduced several new products, including the iPhone 13, the iPad mini, and the Apple Watch Series 7. The iPhone 13 features a new A15 Bionic chip, improved camera capabilities, and an updated design. The iPad mini now features a larger 8.3-inch Liquid Retina display and the latest A15 Bionic chip, while the Apple Watch Series 7 has a larger, more durable screen and new fitness features. In addition to the hardware updates, Apple also announced new software updates, including iOS 15, iPadOS 15, and watchOS 8, which will bring new features and improvements to its devices. The event also showcased Apple's growing focus on sustainability, with the company announcing plans to become carbon neutral by 2030 and introducing new recycling programs for its products. The new lineup of products and services is set to drive further growth for Apple, which has seen record sales in recent years. As one of the world's most valuable companies, Apple's continued innovation and success have made it a leader in the tech industry.",
            "India faces a do-or-die situation as it enters the final Test match against Australia, needing a win to secure a spot in the World Test Championship (WTC) final. The four-match series has been a closely contested battle between two of cricket's biggest rivals, with both teams winning one game each and the other ending in a draw. India's hopes rest on their ability to overcome Australia on their home turf, where they have traditionally struggled. The Indian team will be buoyed by their recent win in the previous match, where they produced a remarkable comeback to clinch victory from the jaws of defeat. However, they will need to be at their best to overcome a formidable Australian side that boasts a strong batting and bowling lineup. The stakes are high, with the winner of the series securing a place in the WTC final against New Zealand. India's journey to the final has been a long and hard-fought one, and a victory in the final Test match against Australia would be a fitting end to their campaign. The team's hopes now rest on the shoulders of their star players, who will need to produce their best performances if they are to achieve their goal and secure their spot in the WTC final.",
            "Google has launched a new search algorithm aimed at improving the accuracy of its search results. The new algorithm, called \"MUM\" (Multitask Unified Model), is designed to better understand the intent behind users' queries and provide more relevant and useful results. According to Google, MUM is capable of processing information across multiple languages and modalities, including text, images, and videos. This allows it to understand complex queries and provide more comprehensive answers to users' questions. In addition to improving the accuracy of search results, MUM is also expected to make it easier for users to find information on complex or niche topics that may be difficult to search for using traditional keyword-based methods. Google has stated that the new algorithm is still in the early stages of development and will be rolled out gradually over the coming months. Nonetheless, it represents an important step forward in the ongoing effort to improve the accuracy and usefulness of search engines, and is sure to be welcomed by users around the world.",
            "A high-speed car chase ended in the arrest of a wanted criminal yesterday. The chase, which lasted for more than an hour, began when police attempted to pull over a vehicle matching the description of a car that had been reported stolen earlier in the day. The driver of the car, who was later identified as a wanted criminal with a history of violent crimes, refused to stop and led police on a chase through the city and onto the highway. During the pursuit, the driver of the car swerved dangerously through traffic, narrowly avoiding collisions with other vehicles on several occasions. Eventually, the car crashed into a barricade and the driver was apprehended by police. No injuries were reported as a result of the chase. The suspect has been taken into custody and will be charged with a number of offenses, including theft, reckless driving, and evading arrest. Police have praised the efforts of the officers involved in the chase and expressed relief that no one was injured as a result of the suspect's reckless driving.",
            "An international trade deal has been reached between several major countries aimed at boosting the global economy. The deal, which was negotiated over several months, is expected to remove trade barriers and increase cooperation between the participating countries. The agreement is set to have a significant impact on the world economy, with analysts predicting increased trade and economic growth as a result of the deal. Several key industries, including technology, manufacturing, and agriculture, are expected to benefit from the increased access to international markets and the removal of tariffs and other trade barriers. The deal has been hailed as a significant step forward for international trade and cooperation, and is seen as a positive sign for the global economy as it continues to recover from the impact of the COVID-19 pandemic. The participating countries have committed to working together to implement the agreement and ensure that it has a positive impact on their economies and on the world as a whole.",
        )

        // layout manager , to set hav bhav of inside recyclerview, vertically scrolling, horizontally, uniform grid
        myRecyclerView.layoutManager = LinearLayoutManager(this)
        newsArrayList = arrayListOf<News>()

        for(index in imageArr.indices){
            val news = News(newsHeading[index], imageArr[index], newsPara[index])
            newsArrayList.add(news)
        }

        myRecyclerView.adapter = MyAdapter(newsArrayList, this)

//        val newsContent = arrayOf(
//            R.string.news_content, R.string.news_content, R.string.news_content, R.string.news_content,
//            R.string.news_content, R.string.news_content, R.string.news_content, R.string.news_content,
//            R.string.news_content, R.string.news_content, R.string.news_content
//        )


    }

}
