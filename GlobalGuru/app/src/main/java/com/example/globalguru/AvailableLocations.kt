package com.example.globalguru

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class AvailableLocations : AppCompatActivity() {
    lateinit var myRecyclerView: RecyclerView
    lateinit var destinationList : ArrayList<Destination>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_available_locations)

        val text = intent.getStringExtra("extra")
        var editText = findViewById<TextView>(R.id.locText)
        editText.text = "Top destinations in $text"
        val txt = findViewById<TextView>(R.id.downer)
        txt.setOnClickListener {
            Toast.makeText(this, text, Toast.LENGTH_SHORT).show()
        }

        myRecyclerView = findViewById(R.id.recyclerView)
        val asiaImage = arrayOf(
            R.drawable.asia1, R.drawable.asia2, R.drawable.asia3, R.drawable.asia4,
            R.drawable.asia5, R.drawable.asia6, R.drawable.asia7, R.drawable.asia8,
            R.drawable.asia9, R.drawable.asia10,
        )
        val asiaCity = arrayOf("Indonesia", "Japan", "Thailand", "China", "", "South Korea",
            "Malaysia", "Nepal", "India", "UAE"
        )

        val asiaLocations = arrayOf("Bali", "Tokyo", "Bangkok", "Hong Kong", "Singapore", "Seoul",
            "Kuala Lumpur", "Kathmandu", "Jaipur", "Dubai"
        )

        val asiaDetails = arrayOf(
            "Bali is a popular tourist destination located in Indonesia. Known for its stunning beaches, ancient temples, and unique culture, Bali attracts millions of visitors each year. The island is home to a rich and diverse culture, which is reflected in its art, dance, music, and architecture. Visitors to Bali can explore the island's many temples, including the famous Tanah Lot Temple and the Besakih Temple, which is known as the \"Mother Temple\" of Bali. Bali is also home to beautiful rice terraces, such as the Tegalalang Rice Terrace, and has a thriving art scene, with many galleries and markets selling traditional Balinese art and crafts.\nIn addition to its cultural attractions, Bali is also known for its beautiful beaches and outdoor activities. The island is a popular destination for surfing, with many beaches offering ideal conditions for beginners and experienced surfers alike. Visitors can also enjoy a range of water sports, including snorkeling, diving, and parasailing. Bali is also home to several volcanoes, such as Mount Agung and Mount Batur, which offer stunning views and challenging hikes for adventurous visitors. Other popular tourist activities include exploring the island's many markets and shopping areas, visiting local spas and wellness centers, and sampling the delicious local cuisine.",
            "Tokyo is a bustling metropolis and one of the most popular tourist destinations in Japan. It is a city that seamlessly blends traditional Japanese culture with modern technology and innovation. Visitors to Tokyo can explore the city's many cultural landmarks, such as the famous Senso-ji Temple, the Meiji Shrine, and the Imperial Palace. Tokyo is also home to a range of museums and art galleries, including the Tokyo National Museum and the Mori Art Museum.\nTokyo is also known for its modern attractions, such as its famous shopping districts, including the trendy Shibuya and Harajuku areas, and the Ginza district, which is known for its luxury shopping. Visitors can also enjoy a range of entertainment options, such as visiting Tokyo Disneyland or DisneySea, or attending a traditional Japanese Kabuki or Noh theater performance. Tokyo is also famous for its culinary scene, which offers a range of delicious Japanese dishes, including sushi, ramen, and tempura. Overall, Tokyo is a city that has something for everyone, and its unique blend of tradition and modernity make it a must-visit destination for anyone traveling to Japan.",
            "Bangkok is the capital city of Thailand and a popular tourist destination in Southeast Asia. Known for its vibrant street life, rich cultural heritage, and delicious cuisine, Bangkok is a city that offers visitors a unique and unforgettable experience. Visitors to Bangkok can explore the city's many temples, including the famous Wat Phra Kaew and Wat Arun, which are stunning examples of traditional Thai architecture. The Grand Palace is another popular attraction, which offers visitors a glimpse into the country's royal history and culture.\nBangkok is also a shopping and culinary paradise, with many street markets and shopping malls selling everything from designer brands to local crafts and souvenirs. Visitors can indulge in the city's delicious street food, including its famous pad thai, satay, and mango sticky rice. Bangkok is also known for its lively nightlife, with many bars and nightclubs offering a range of entertainment options, from live music to cabaret shows.\n" +
                    "\n" +
                    "In addition to its cultural and entertainment attractions, Bangkok is also a gateway to many other destinations in Thailand, such as the ancient city of Ayutthaya, the beautiful beaches of Phuket and Koh Samui, and the stunning mountainous region of Chiang Mai. Bangkok's convenient location and excellent transport links make it an ideal base for exploring the rest of the country. Overall, Bangkok is a city that offers visitors a unique blend of culture, entertainment, and adventure, and is a must-visit destination for anyone traveling to Southeast Asia.",
            "Hong Kong is a bustling city-state and one of the most popular tourist destinations in Asia. It is known for its stunning skyline, rich cultural heritage, and delicious cuisine. Visitors to Hong Kong can explore the city's many landmarks, including Victoria Peak, which offers stunning panoramic views of the city, the famous Big Buddha statue on Lantau Island, and the historic Kowloon Walled City.\n" +
                    "\n" +
                    "Hong Kong is also a shopper's paradise, with a range of markets and shopping malls selling everything from designer brands to local souvenirs. Visitors can also indulge in the city's famous cuisine, including dim sum, Cantonese roast meats, and seafood delicacies. The city is also known for its vibrant nightlife, with many bars, nightclubs, and karaoke lounges offering a range of entertainment options.\n" +
                    "\n" +
                    "In addition to its cultural and entertainment attractions, Hong Kong is also a gateway to many other destinations in Asia, such as mainland China and Macau. The city's excellent transport links and proximity to other countries make it an ideal base for exploring the region. Overall, Hong Kong is a city that offers visitors a unique blend of culture, entertainment, and adventure, and is a must-visit destination for anyone traveling to Asia.",
            "Singapore is a modern city-state and one of the most popular tourist destinations in Southeast Asia. Known for its stunning architecture, vibrant culture, and mouth-watering cuisine, Singapore offers visitors a unique and unforgettable experience. Visitors to Singapore can explore the city's many landmarks, including the iconic Marina Bay Sands, Gardens by the Bay, and the Merlion statue, which is the symbol of the city.\n" +
                    "\n" +
                    "Singapore is also a shopper's paradise, with a range of markets and shopping malls selling everything from luxury brands to local souvenirs. Visitors can also indulge in the city's famous cuisine, which includes a variety of delicious dishes from Chinese, Malay, Indian, and Peranakan cultures. The city is also known for its vibrant nightlife, with many bars, nightclubs, and rooftop bars offering a range of entertainment options.\n" +
                    "\n" +
                    "In addition to its cultural and entertainment attractions, Singapore is also a hub for business and finance, and has a thriving arts and cultural scene. The city is home to many museums, art galleries, and performing arts venues, and hosts many festivals and events throughout the year. Singapore is also a gateway to many other destinations in Southeast Asia, such as Malaysia, Indonesia, and Thailand. Its excellent transport links and world-class infrastructure make it an ideal base for exploring the region.\n" +
                    "\n" +
                    "Overall, Singapore is a city that offers visitors a unique blend of culture, entertainment, and business opportunities, and is a must-visit destination for anyone traveling to Southeast Asia.",
            "Seoul is the vibrant capital city of South Korea and a popular tourist destination in East Asia. The city is known for its rich history, fascinating culture, and stunning modern architecture. Visitors to Seoul can explore the city's many landmarks, including Gyeongbokgung Palace, Bukchon Hanok Village, and Namsan Tower, which offers panoramic views of the city.\n" +
                    "\n" +
                    "Seoul is also a food lover's paradise, with a range of delicious dishes such as Korean BBQ, Bibimbap, and Kimchi. Visitors can experience traditional Korean cuisine in one of the city's many restaurants or indulge in street food at one of the many markets. The city is also known for its vibrant nightlife, with many bars, nightclubs, and karaoke rooms offering a range of entertainment options.\n" +
                    "\n" +
                    "In addition to its cultural and entertainment attractions, Seoul is also a hub for business and technology, and has a thriving arts and culture scene. The city is home to many museums, art galleries, and performing arts venues, and hosts many festivals and events throughout the year. Seoul is also a gateway to many other destinations in Asia, such as Japan and China, with excellent transport links and world-class infrastructure.\n" +
                    "\n" +
                    "Overall, Seoul is a city that offers visitors a unique blend of tradition and modernity, culture, and entertainment, and is a must-visit destination for anyone traveling to East Asia.",
            "Kuala Lumpur is the bustling capital city of Malaysia and a popular tourist destination in Southeast Asia. The city is known for its stunning architecture, vibrant culture, and delicious cuisine. Visitors to Kuala Lumpur can explore the city's many landmarks, including the iconic Petronas Twin Towers, Batu Caves, and Merdeka Square.\n" +
                    "\n" +
                    "Kuala Lumpur is also a shopping mecca, with a range of markets and shopping malls selling everything from luxury brands to local souvenirs. Visitors can also indulge in the city's famous cuisine, which includes a variety of delicious dishes from Malay, Chinese, and Indian cultures. The city is also known for its vibrant nightlife, with many bars, nightclubs, and rooftop bars offering a range of entertainment options.\n" +
                    "\n" +
                    "In addition to its cultural and entertainment attractions, Kuala Lumpur is also a hub for business and finance, and has a thriving arts and cultural scene. The city is home to many museums, art galleries, and performing arts venues, and hosts many festivals and events throughout the year. Kuala Lumpur is also a gateway to many other destinations in Southeast Asia, such as Thailand, Indonesia, and Singapore. Its excellent transport links and world-class infrastructure make it an ideal base for exploring the region.\n" +
                    "\n" +
                    "Overall, Kuala Lumpur is a city that offers visitors a unique blend of culture, entertainment, and business opportunities, and is a must-visit destination for anyone traveling to Southeast Asia.\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n",
            "Kathmandu is the vibrant and bustling capital city of Nepal, and a popular tourist destination in South Asia. Known for its rich culture, ancient history, and stunning natural beauty, Kathmandu is a city that captivates visitors with its unique blend of tradition and modernity.\n" +
                    "\n" +
                    "The city is home to many landmarks and attractions, including the ancient Durbar Square, the historic Swayambhunath Stupa, and the Pashupatinath Temple, which is considered one of the holiest sites in Hinduism. Visitors can also explore the city's many markets and bazaars, which offer a range of goods such as handicrafts, textiles, and spices.\n" +
                    "\n" +
                    "Kathmandu is also a gateway to many of Nepal's stunning natural wonders, including the Himalayan mountains, which are visible from the city on a clear day. Visitors can trek to the base of Mount Everest, explore the Annapurna mountain range, or go on a wildlife safari in one of the country's national parks.\n" +
                    "\n" +
                    "In addition to its cultural and natural attractions, Kathmandu is also a center for spirituality and meditation. The city is home to many yoga and meditation centers, and visitors can participate in classes and retreats to learn more about these ancient practices.\n" +
                    "\n" +
                    "Overall, Kathmandu is a city that offers visitors a unique and unforgettable experience, with its rich culture, stunning natural beauty, and spiritual traditions. It is a must-visit destination for anyone interested in exploring the wonders of South Asia.",
            "Jaipur, also known as the Pink City, is a vibrant and colorful city located in the Indian state of Rajasthan. The city is known for its rich history, stunning architecture, and vibrant culture, and is a popular tourist destination in India.\n" +
                    "\n" +
                    "The city is home to many landmarks and attractions, including the historic City Palace, which is a sprawling complex of courtyards, gardens, and buildings that blend Rajasthani and Mughal architectural styles. Visitors can also explore the Hawa Mahal, a beautiful palace made of red and pink sandstone that features intricate latticework and balconies, and the Amber Fort, a sprawling fort and palace complex that offers stunning views of the surrounding landscape.\n" +
                    "\n" +
                    "Jaipur is also famous for its vibrant markets and bazaars, which offer a range of goods such as textiles, jewelry, and handicrafts. Visitors can also sample the city's delicious cuisine, which is known for its bold flavors and unique blend of spices.\n" +
                    "\n" +
                    "In addition to its cultural and architectural attractions, Jaipur is also a center for traditional arts and crafts, such as block printing, pottery, and jewelry-making. Visitors can learn more about these crafts by visiting workshops and studios located throughout the city.\n" +
                    "\n" +
                    "Overall, Jaipur is a city that offers visitors a unique and unforgettable experience, with its rich history, stunning architecture, and vibrant culture. It is a must-visit destination for anyone interested in exploring the wonders of India.",
            "The United Arab Emirates (UAE) is a federation of seven emirates located in the Middle East. The country is known for its stunning skyscrapers, luxury shopping, and rich cultural heritage, making it a popular tourist destination.\n" +
                    "\n" +
                    "Dubai is the most popular destination in the UAE, with its iconic landmarks such as the Burj Khalifa, the tallest building in the world, and the man-made Palm Jumeirah island. Visitors can also explore the Dubai Mall, one of the largest malls in the world, and experience the thrills of indoor skiing at Ski Dubai.\n" +
                    "\n" +
                    "Abu Dhabi, the capital of the UAE, is another popular destination, with its stunning architecture, cultural attractions, and luxurious shopping experiences. Visitors can explore the Sheikh Zayed Grand Mosque, one of the largest mosques in the world, or visit the Louvre Abu Dhabi, a museum that showcases art and artifacts from around the world.\n" +
                    "\n" +
                    "The UAE is also known for its stunning desert landscapes, which can be explored through various desert safari tours. Visitors can experience dune bashing, camel riding, and traditional Bedouin hospitality, as well as enjoy a traditional Emirati meal under the stars.\n" +
                    "\n" +
                    "Overall, the UAE offers visitors a unique blend of modern luxury and ancient heritage, making it a must-visit destination for anyone looking to explore the wonders of the Middle East.",
        )


        val africaImage = arrayOf(
            R.drawable.africa1, R.drawable.africa2, R.drawable.africa3, R.drawable.africa4,
            R.drawable.africa5, R.drawable.africa6, R.drawable.africa7, R.drawable.africa8,
            R.drawable.africa9, R.drawable.africa10,
        )
        val africaCity = arrayOf("Egypt", "South Africa", "Morocco", "Tanzania", "Kenya", "Zambia and Zimbabwe",
            "South Africa", "Egypt", "Tanzania", "Tanzania"
        )
        val africaLocations = arrayOf("Cairo", "Cape Town", "Marrakech", "Serengeti National Park",
            "Masai Mara National Reserve", "Victoria Falls", "Kruger National Park", "Luxor",
            "Zanzibar", "Mountain Kilimanjaro"
        )

        val africaDetails = arrayOf(
            "Cairo, the capital city of Egypt, is a bustling metropolis that is steeped in rich history and culture. The city is known for its iconic landmarks, such as the Great Pyramids of Giza, the Sphinx, and the Egyptian Museum, which houses an impressive collection of artifacts from ancient Egypt.\n" +
                    "\n" +
                    "Visitors to Cairo can explore the city's many historic sites, including the Citadel of Salahuddin, which offers panoramic views of the city and is home to several mosques and museums. The Khan El-Khalili bazaar is another must-visit destination, where visitors can browse the winding alleys and colorful stalls to shop for spices, souvenirs, and other traditional goods.\n" +
                    "\n" +
                    "Cairo is also known for its vibrant arts and cultural scene, with a variety of festivals and events held throughout the year, including the Cairo International Film Festival and the Cairo Opera House's annual cultural program.\n" +
                    "\n" +
                    "Foodies will also delight in the city's rich culinary offerings, which range from traditional Egyptian dishes like koshari and ful medames to international cuisine from around the world.\n" +
                    "\n" +
                    "Overall, Cairo is a city that offers something for everyone, with its fascinating history, vibrant culture, and modern amenities, making it a must-visit destination for anyone exploring the wonders of Egypt.",
            "Cape Town, located in the southwestern region of South Africa, is a vibrant and diverse city that offers visitors a unique blend of natural beauty, cultural attractions, and outdoor adventures.\n" +
                    "\n" +
                    "One of the most iconic landmarks of Cape Town is Table Mountain, which dominates the city skyline and can be explored through hiking trails or the aerial cableway. Visitors can also explore the stunning Cape Peninsula, which offers stunning views of the ocean, as well as the Cape of Good Hope and the penguin colonies at Boulders Beach.\n" +
                    "\n" +
                    "Cape Town is also known for its rich cultural heritage, which can be explored through the Bo-Kaap neighborhood, known for its colorful homes and Cape Malay cuisine, or the District Six Museum, which showcases the history of forced removals during apartheid.\n" +
                    "\n" +
                    "Foodies will delight in the city's diverse culinary scene, which offers a variety of cuisines, including traditional South African dishes like braai and biltong, as well as international flavors from around the world.\n" +
                    "\n" +
                    "Overall, Cape Town offers visitors a unique blend of natural beauty, cultural attractions, and outdoor adventures, making it a must-visit destination for anyone exploring the wonders of South Africa.",
            "Marrakech, located in the southwestern region of Morocco, is a vibrant and colorful city that is known for its rich cultural heritage, bustling souks, and stunning architecture.\n" +
                    "\n" +
                    "One of the most iconic landmarks of Marrakech is the Medina, which is a UNESCO World Heritage Site and home to many historic landmarks, such as the Koutoubia Mosque, the Saadian Tombs, and the Bahia Palace. Visitors can also explore the bustling souks, where they can find traditional handicrafts, spices, and textiles.\n" +
                    "\n" +
                    "Marrakech is also known for its vibrant arts and cultural scene, with a variety of festivals and events held throughout the year, such as the Marrakech International Film Festival and the Marrakech Biennale.\n" +
                    "\n" +
                    "Foodies will also delight in the city's rich culinary offerings, which range from traditional Moroccan dishes like tagine and couscous to international cuisine from around the world.\n" +
                    "\n" +
                    "Overall, Marrakech offers visitors a unique blend of history, culture, and architecture, making it a must-visit destination for anyone exploring the wonders of Morocco.",
            "The Serengeti National Park is a world-renowned wildlife sanctuary located in the northern region of Tanzania. Spanning over 14,750 square kilometers, the park is home to an incredibly diverse array of wildlife, including lions, elephants, giraffes, zebras, wildebeest, and many more.\n" +
                    "\n" +
                    "One of the most notable features of the Serengeti is the annual wildebeest migration, which sees millions of animals making their way through the park in search of fresh grazing lands. Visitors can witness this incredible natural phenomenon by taking a guided safari tour or hot air balloon ride.\n" +
                    "\n" +
                    "The park also offers a range of other activities, such as guided walking tours, bird watching, and cultural visits to the local Maasai villages. Visitors can also stay in one of the park's many lodges and campsites to fully immerse themselves in the African wilderness experience.\n" +
                    "\n" +
                    "Overall, the Serengeti National Park is a must-visit destination for wildlife enthusiasts and nature lovers, offering an unparalleled opportunity to witness some of Africa's most iconic animals in their natural habitat.",
            "The Masai Mara National Reserve is a wildlife conservation area located in southwestern Kenya, along the Tanzanian border. It is named after the Maasai people and the Mara River that runs through the reserve. Spanning over 1,500 square kilometers, the Masai Mara is home to a rich variety of wildlife, including the famous \"Big Five\" - lions, elephants, leopards, rhinoceros, and buffalo.\n" +
                    "\n" +
                    "One of the most iconic events in the Masai Mara is the annual wildebeest migration, where over a million wildebeest, zebras, and other herbivores travel from the Serengeti in Tanzania to the Masai Mara in search of food and water. This event is considered one of the world's greatest natural spectacles and draws visitors from around the globe.\n" +
                    "\n" +
                    "Apart from the migration, visitors to the Masai Mara can also experience guided game drives, hot air balloon rides, and cultural visits to the Maasai communities. The park also offers luxury lodges, tented camps, and campsites for visitors to stay and experience the African wilderness.\n" +
                    "\n" +
                    "Overall, the Masai Mara National Reserve is a must-visit destination for wildlife enthusiasts and nature lovers, offering a unique opportunity to witness some of Africa's most iconic animals in their natural habitat.",
            "Victoria Falls is a spectacular waterfall located on the border of Zambia and Zimbabwe in southern Africa. Known locally as \"Mosi-oa-Tunya,\" or \"the smoke that thunders,\" it is considered one of the world's largest waterfalls, measuring over 1,700 meters wide and 100 meters tall.\n" +
                    "\n" +
                    "The falls are a popular tourist destination and offer breathtaking views of the Zambezi River plummeting into a gorge below, creating a misty spray that can be seen from miles away. Visitors can take guided tours to explore the area and enjoy activities such as bungee jumping, white-water rafting, and scenic helicopter rides over the falls.\n" +
                    "\n" +
                    "The Victoria Falls area is also home to a rich diversity of wildlife, including elephants, hippos, crocodiles, and numerous bird species. Visitors can experience game drives in nearby national parks such as Zambezi National Park in Zimbabwe and Mosi-oa-Tunya National Park in Zambia.\n" +
                    "\n" +
                    "Overall, Victoria Falls is a must-see destination for nature and adventure lovers alike, offering a unique combination of awe-inspiring natural beauty and exciting activities.",
            "Kruger National Park is one of the largest game reserves in Africa, located in northeastern South Africa. Covering an area of nearly 20,000 square kilometers, the park is home to a diverse array of wildlife, including the Big Five (lion, leopard, elephant, rhino, and buffalo) as well as cheetahs, wild dogs, zebras, giraffes, and many other species.\n" +
                    "\n" +
                    "Visitors to Kruger National Park can enjoy a range of activities, including game drives, guided walks, and birdwatching tours. The park also offers several accommodation options, from luxury lodges to campsites, allowing visitors to stay within the park and immerse themselves in the wilderness experience.\n" +
                    "\n" +
                    "In addition to wildlife viewing, Kruger National Park is also home to a rich cultural history, with evidence of human habitation dating back to the Stone Age. Visitors can explore the park's many archaeological sites, as well as learn about the traditions and customs of the local Shangaan and Tsonga tribes.\n" +
                    "\n" +
                    "Overall, Kruger National Park is a must-see destination for anyone interested in wildlife, nature, and culture. With its vast wilderness areas, diverse wildlife, and rich history, it offers an unforgettable experience for visitors of all ages and interests.",
            "Luxor is a city located on the east bank of the Nile River in southern Egypt. It is known for its rich cultural heritage, including the famous Karnak Temple and Luxor Temple, which are among the best-preserved ancient temples in the country. The city is also home to the Valley of the Kings, where many pharaohs of the New Kingdom era were buried, including Tutankhamun.\n" +
                    "\n" +
                    "Visitors to Luxor can explore the city's many archaeological sites and museums, which offer a glimpse into the ancient Egyptian civilization. The Luxor Museum, for example, features artifacts from the ancient Theban temples and tombs, while the Mummification Museum offers a fascinating look at the process of mummification.\n" +
                    "\n" +
                    "In addition to its historical and cultural attractions, Luxor also offers a range of outdoor activities, such as hot air balloon rides over the Valley of the Kings, felucca (traditional sailboat) rides on the Nile River, and desert safaris. The city is also known for its bustling bazaars, where visitors can shop for souvenirs and local handicrafts.\n" +
                    "\n" +
                    "Overall, Luxor is a must-visit destination for anyone interested in ancient Egyptian history and culture. With its well-preserved temples, tombs, and museums, as well as its natural beauty and outdoor activities, it offers a unique and unforgettable experience for visitors of all ages and interests.\n" +
                    "\n" +
                    "\n" +
                    "\n",
            "Zanzibar is a semi-autonomous archipelago located off the coast of Tanzania in East Africa. It is a popular tourist destination known for its pristine beaches, turquoise waters, and vibrant culture. Zanzibar is made up of several islands, including Unguja (also known as Zanzibar Island) and Pemba Island.\n" +
                    "\n" +
                    "The main attraction of Zanzibar is its stunning beaches, which are perfect for swimming, snorkeling, and sunbathing. Some of the most popular beaches include Nungwi Beach, Kendwa Beach, and Paje Beach. Visitors can also take part in a variety of water sports, such as scuba diving, kite surfing, and sailing.\n" +
                    "\n" +
                    "Zanzibar is also known for its rich history and cultural heritage. The island was a hub for the spice trade in the 19th century, and visitors can explore the historic Stone Town, which is a UNESCO World Heritage site. The town is famous for its labyrinthine alleyways, bustling bazaars, and ornate architecture, which blends African, Arab, and European styles.\n" +
                    "\n" +
                    "Other popular attractions on the island include the Jozani Forest, which is home to the endangered Zanzibar Red Colobus Monkey, and the Prison Island, which is famous for its giant tortoises. Visitors can also take a spice tour to learn about the island's history as a spice producer, and sample some of the local cuisine, which features a blend of African, Indian, and Arab flavors.\n" +
                    "\n" +
                    "Overall, Zanzibar is a paradise for beach lovers, history buffs, and adventure seekers alike. Its stunning natural beauty, rich cultural heritage, and wide range of activities make it a must-visit destination in East Africa.",
            "Kilimanjaro is a majestic mountain located in Tanzania, East Africa, and is a popular destination for adventure travelers and outdoor enthusiasts from around the world. Its summit stands at an impressive 5,895 meters (19,341 feet) above sea level, making it the highest mountain in Africa and one of the Seven Summits. Climbing Kilimanjaro is a challenging yet rewarding experience, requiring physical fitness and mental preparation. There are several routes to the summit, each with varying degrees of difficulty and duration, offering a unique adventure for each climber.\n" +
                    "\n" +
                    "Around Kilimanjaro, there are also several tourist destinations worth visiting. The town of Moshi, located at the foot of Kilimanjaro, is a popular destination for climbers, offering a wide range of accommodation options, restaurants, and shops. The nearby Arusha National Park is also worth a visit, known for its scenic landscapes, diverse wildlife, and the stunning Mt. Meru. Additionally, the nearby Serengeti National Park offers visitors the chance to witness the annual wildebeest migration, as well as a wide range of wildlife and natural wonders. A trip to Kilimanjaro offers adventure, nature, and cultural experiences, making it a must-visit destination for travelers seeking an unforgettable experience.\n" +
                    "\n" +
                    "\n" +
                    "\n",
        )


        val europeImage = arrayOf(
            R.drawable.europe1, R.drawable.europe2, R.drawable.europe3, R.drawable.europe4, R.drawable.europe5,R.drawable.europe6, R.drawable.europe7, R.drawable.europe8,
            R.drawable.europe9, R.drawable.europe10,

        )
        val europeCity = arrayOf("France", "Italy", "Spain", "The Netherlands", "Austria",
            "Germany", "Greece", "Scotland", "Denmark", "Czech Republic"
        )
        val europeLocations = arrayOf("Paris", "Rome", "Barcelona", "Amsterdam", "Vienna", "Berlin",
            "Athens", "Edinburgh", "Copenhagen", "Prague"
        )

        val europeDetails = arrayOf(
            "Paris is a city of lights and love, known for its romantic ambiance, rich history, and artistic culture. Located in the heart of France, Paris is one of the most visited cities in the world, attracting millions of tourists each year. The city is home to many iconic landmarks, including the Eiffel Tower, the Louvre Museum, Notre-Dame Cathedral, and the Arc de Triomphe. The River Seine winds through the city, offering visitors the chance to explore the city's picturesque streets and neighborhoods via boat.\n" +
                    "\n" +
                    "Paris is also famous for its world-renowned cuisine, fashion, and art scene. Visitors can indulge in delicious French cuisine at one of the many Michelin-starred restaurants, or sample local street food like crepes and croissants. The city is also a shopping mecca, offering everything from high-end designer boutiques to vintage flea markets. Art lovers can explore the numerous museums and galleries in the city, including the Musee d'Orsay, the Centre Pompidou, and the Picasso Museum.\n" +
                    "\n" +
                    "Overall, Paris is a vibrant and diverse city, offering something for everyone. Whether you're looking for a romantic getaway, a cultural experience, or simply to soak up the city's unique atmosphere, Paris is a must-visit destination for anyone traveling to France.",
            "Rome, also known as the \"Eternal City,\" is a destination that offers a rich blend of history, culture, art, and architecture. As the capital of Italy, Rome has been an important city for thousands of years, serving as the center of the Roman Empire and the Catholic Church. Visitors to Rome can explore the many iconic landmarks, including the Colosseum, the Pantheon, the Trevi Fountain, and the Vatican City.\n" +
                    "\n" +
                    "In addition to its historic sites, Rome is also famous for its culinary delights. The city is known for its delicious pizza, pasta, and gelato, as well as its local wines. Visitors can also experience the city's vibrant nightlife scene, which includes everything from trendy rooftop bars to traditional wine bars.\n" +
                    "\n" +
                    "Art lovers will also appreciate Rome's many museums and galleries, which house some of the world's most important works of art. The Vatican Museums, for example, feature a vast collection of priceless art and artifacts, including the Sistine Chapel.\n" +
                    "\n" +
                    "Overall, Rome is a city that offers a wealth of experiences, from its rich history and culture to its delicious food and vibrant nightlife. Whether you're a history buff, an art enthusiast, or simply looking for a great place to eat and drink, Rome is a destination that should be on every traveler's list.",
            "Barcelona is a vibrant city located on the northeastern coast of Spain. It is the capital of Catalonia and one of the most popular tourist destinations in Europe. The city is famous for its rich history, stunning architecture, beautiful beaches, delicious food, and exciting nightlife.\n" +
                    "\n" +
                    "One of the most popular attractions in Barcelona is the Sagrada Familia, a massive basilica designed by the famous architect Antoni Gaudí. The church has been under construction for over 100 years and is still not complete, but visitors can still see the stunning façade and intricate details of the building. Other must-see attractions in Barcelona include Park Güell, a beautiful park also designed by Gaudí, the Gothic Quarter, a historic neighborhood full of narrow streets and beautiful architecture, and La Rambla, a famous street full of shops, restaurants, and street performers. Finally, Barcelona is also known for its beaches, including Barceloneta Beach, which is just a short walk from the city center.\n" +
                    "\n" +
                    "In addition to these popular attractions, Barcelona is also a great destination for foodies. The city is famous for its seafood and traditional Catalan dishes such as paella, fideuà, and escalivada. Finally, Barcelona is also known for its exciting nightlife, with many bars and clubs staying open until the early hours of the morning. Overall, Barcelona has something for everyone and is a must-visit destination for anyone traveling to Spain or Europe.",
            "Amsterdam is the largest city in the Netherlands, and is famous for its canals, stunning architecture, and vibrant culture. With a rich history dating back to the 13th century, the city is home to an abundance of museums, galleries, and historic landmarks. From world-class art museums to charming canal-side cafes, Amsterdam offers something for everyone.\n" +
                    "\n" +
                    "One of the city's most famous attractions is the Rijksmuseum, which features an extensive collection of Dutch art and artifacts, including works by Rembrandt and Vermeer. The Van Gogh Museum is also a must-visit destination for art enthusiasts, with a collection of over 200 paintings and 500 drawings by the famous artist. Other notable landmarks in the city include the Anne Frank House, the Royal Palace of Amsterdam, and the iconic Dam Square. Visitors can also explore the charming neighborhood of Jordaan, with its narrow streets and cozy cafes, or take a scenic boat ride through the city's picturesque canals. Amsterdam's vibrant culture, laid-back atmosphere, and endless charm make it one of Europe's most beloved cities.",
            "Vienna, the capital of Austria, is a cultural and historic city that offers a wide range of activities for visitors. The city is known for its classical music, with famous composers like Mozart, Beethoven, and Strauss having lived and worked there. The Vienna State Opera and Musikverein are two of the city's most prestigious concert halls, with performances of classical music throughout the year. The city is also home to numerous museums and art galleries, including the Kunsthistorisches Museum and the Belvedere Palace, where visitors can see works of art by famous artists such as Gustav Klimt and Egon Schiele.\n" +
                    "\n" +
                    "Aside from its cultural offerings, Vienna is also a popular destination for food and wine lovers. The city is famous for its coffee houses and pastries, including the Sachertorte, a chocolate cake with apricot jam filling. The Naschmarkt is a bustling outdoor market where visitors can sample a variety of foods and wines from Austria and beyond. The city is also known for its wine taverns, known as Heurigers, which offer a relaxed atmosphere to enjoy local wines and traditional Austrian dishes. Overall, Vienna is a city that offers a mix of history, culture, and culinary delights, making it a must-visit destination for travelers.",
            "Berlin is the capital and largest city of Germany, located in the northeast of the country. It is a fascinating city that blends a rich history, vibrant culture, and modern lifestyle. Berlin is a city of contrasts, with an eclectic mix of old and new, traditional and trendy, historic and modern, and it attracts millions of visitors every year.\n" +
                    "\n" +
                    "The city's main attractions include the iconic Brandenburg Gate, the Berlin Wall, the Reichstag building, Checkpoint Charlie, and the Berlin Cathedral. Berlin is also home to many world-renowned museums, including the Pergamon Museum, the Alte Nationalgalerie, and the Museum Island. Visitors can explore the city's fascinating history by taking a walking tour or visiting the many memorials and monuments throughout the city. Berlin also boasts a vibrant nightlife scene, with countless bars, clubs, and restaurants that cater to all tastes and budgets.\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n",
            "Athens, the capital city of Greece, is a city rich in history, culture, and natural beauty. It is one of the oldest cities in the world, with a history spanning over 3,400 years. Athens is home to many historical landmarks and ancient ruins, such as the Acropolis, the Parthenon, and the Ancient Agora. The Acropolis, a UNESCO World Heritage Site, is the most famous attraction in Athens and is an iconic symbol of ancient Greece. The Parthenon, a temple dedicated to the goddess Athena, is also located on the Acropolis and is considered one of the most important cultural monuments in the world. The Ancient Agora, another important archaeological site, was once the center of Athenian public life and a place of political and social gathering.\n" +
                    "\n" +
                    "Aside from its historical and cultural significance, Athens is also known for its vibrant nightlife and culinary scene. The city offers a wide range of restaurants and cafes serving traditional Greek cuisine, as well as international cuisine. The neighborhoods of Plaka and Monastiraki are particularly popular among tourists for their picturesque streets and bustling markets, selling everything from local handicrafts to souvenirs. The Athens Riviera, a 70-kilometer coastline stretching along the Saronic Gulf, is a popular tourist destination for its crystal-clear waters, beaches, and seaside cafes and restaurants.\n" +
                    "\n" +
                    "There are also many nearby tourist destinations worth visiting when in Athens. The nearby island of Aegina is a popular day trip destination, known for its charming fishing villages, beaches, and historic temples. The town of Marathon, famous for its historic battle and the origin of the modern marathon race, is also located near Athens. Delphi, a UNESCO World Heritage Site and one of the most important archaeological sites in Greece, is located about two and a half hours away from Athens and is known for its well-preserved ancient ruins and stunning mountainous scenery.",
            "Edinburgh is the capital city of Scotland, located in the southeastern part of the country. It is known for its stunning architecture, historic landmarks, cultural festivals, and vibrant arts scene. One of the most popular tourist destinations in Edinburgh is the Edinburgh Castle, which sits atop an extinct volcano in the heart of the city. Visitors can explore the castle's grand halls and learn about Scotland's fascinating history. The Royal Mile is another must-visit spot, a cobblestoned street that stretches from the castle to the Palace of Holyroodhouse, the official residence of the British monarch in Scotland. Along the way, visitors can enjoy street performers, traditional Scottish pubs, and souvenir shops.\n" +
                    "\n" +
                    "Edinburgh is also known for its many museums and galleries. The National Museum of Scotland is a great place to learn about the country's history, while the Scottish National Gallery features works of art by famous painters such as Botticelli, Monet, and Van Gogh. For nature lovers, the Royal Botanic Garden is a beautiful oasis of greenery in the heart of the city. In the evenings, visitors can enjoy a variety of entertainment options, including traditional Scottish music, theatre performances, and comedy shows. Edinburgh truly has something for everyone, making it a top destination for travelers from around the world.\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n",
            "Copenhagen, the capital city of Denmark, is a charming and picturesque destination that offers a blend of rich history, modern attractions, and a vibrant cultural scene. The city is known for its stunning architecture, beautiful parks, and canals that wind their way through the city. Visitors can explore the famous landmarks such as the Little Mermaid statue, Rosenborg Castle, and the Tivoli Gardens amusement park. The city also has a thriving culinary scene, with numerous Michelin-starred restaurants and street food markets serving up traditional Danish cuisine.\n" +
                    "\n" +
                    "There are also several destinations around Copenhagen that are worth visiting. Just a short train ride away is the charming town of Hillerød, which is home to the stunning Frederiksborg Castle. Visitors can also explore the famous Louisiana Museum of Modern Art, located on the coast in Humlebæk. Further afield, visitors can take a trip to the historic town of Roskilde, where they can explore the UNESCO-listed Roskilde Cathedral and the Viking Ship Museum. Overall, Copenhagen and its surrounding areas offer a wealth of attractions and activities that are sure to please any type of traveler.",
            "Prague, the capital city of the Czech Republic, is a stunning destination that is steeped in history and culture. Known as the \"city of a hundred spires,\" Prague is famous for its beautiful architecture, which ranges from Gothic and Baroque to Art Nouveau and modern. The city's most iconic landmarks include the Charles Bridge, the Old Town Square, and the Prague Castle, which is the largest ancient castle in the world. Visitors can also explore the city's many museums, galleries, and theaters, as well as sample its delicious cuisine and world-renowned beer.\n" +
                    "\n" +
                    "There are also several tourist destinations around Prague that are worth exploring. Just a short drive from the city is the picturesque town of Kutná Hora, which is home to the famous Sedlec Ossuary, a chapel decorated with the bones of around 40,000 people. Visitors can also explore the Bohemian Paradise nature reserve, which is renowned for its stunning rock formations and hiking trails. For those interested in history, the Terezin concentration camp is located just an hour's drive from Prague and offers a sobering insight into the atrocities committed during the Holocaust. Overall, Prague and its surrounding areas offer a wealth of attractions and activities that are sure to captivate and enchant visitors.\n" +
                    "\n" +
                    "\n" +
                    "\n",
        )



        val northAmericaImage = arrayOf(
            R.drawable.na1, R.drawable.na2, R.drawable.na3, R.drawable.na4, R.drawable.na5,
            R.drawable.na6, R.drawable.na7, R.drawable.na8, R.drawable.na9, R.drawable.na10,
        )
        val northAmericaLocations = arrayOf(
            "New York", "Los Angeles", "San Francisco", "Toronto", "Vancouver", "Las Vegas",
            "Cancun", "Hawaii", "Quebec City", "New Orleans"
        )
        val northAmericaCity = arrayOf("USA", "USA", "USA", "Canada", "Canada", "USA", "Mexico",
            "USA", "Canada", "USA"
        )

        val northAmericaDetails = arrayOf(
            "New York City, also known as the \"City that Never Sleeps,\" is one of the most iconic and popular travel destinations in the world. With a rich history, diverse culture, and endless attractions, there is something for everyone to enjoy.\n" +
                    "\n" +
                    "One of the most famous attractions in New York City is the Statue of Liberty, a symbol of freedom and democracy that stands on Liberty Island in New York Harbor. Visitors can take a ferry to the island to see the statue up close, or take a cruise around the harbor for stunning views of the city skyline.\n" +
                    "\n" +
                    "The city is also known for its iconic landmarks such as the Empire State Building, Central Park, Times Square, and the Brooklyn Bridge, all of which offer unique experiences and breathtaking views. Visitors can also explore the city's many world-class museums, including the Metropolitan Museum of Art, the American Museum of Natural History, and the Museum of Modern Art.\n" +
                    "\n" +
                    "New York City is also famous for its food scene, offering a diverse range of cuisines from around the world. From street vendors selling hot dogs and pretzels to Michelin-starred restaurants, the city has something for every palate.\n" +
                    "\n" +
                    "Finally, the city's vibrant nightlife is another draw for visitors, with countless bars, clubs, and music venues to explore. Whether you're looking to dance the night away or catch a Broadway show, there is always something happening in the city that never sleeps.\n" +
                    "\n" +
                    "Overall, New York City is a must-visit destination for anyone traveling to the United States. Its iconic landmarks, rich culture, diverse food scene, and vibrant nightlife make it an unforgettable destination that showcases the best of American culture and innovation.\n" +
                    "\n" +
                    "\n" +
                    "\n",
            "Los Angeles, or LA for short, is one of the most dynamic and diverse cities in the world. Located in southern California, it is famous for its mild climate, beautiful beaches, and vibrant entertainment industry.\n" +
                    "\n" +
                    "One of the most popular attractions in Los Angeles is Hollywood, the birthplace of the American film industry. Visitors can take a stroll down the Hollywood Walk of Fame, visit the TCL Chinese Theatre, or take a guided tour of the studios where their favorite movies and TV shows were filmed.\n" +
                    "\n" +
                    "Another must-visit destination in Los Angeles is the iconic Santa Monica Pier, which offers breathtaking ocean views, classic amusement park rides, and a variety of dining and shopping options. The nearby Venice Beach Boardwalk is also a popular spot for tourists, offering eclectic street performers, unique shops, and world-class people-watching.\n" +
                    "\n" +
                    "For art lovers, the Getty Center and the Los Angeles County Museum of Art (LACMA) are must-visit destinations. Both museums offer extensive collections of world-class art, as well as stunning architecture and beautiful gardens.\n" +
                    "\n" +
                    "Foodies will also love Los Angeles, which is known for its diverse and delicious cuisine. From Mexican street tacos to vegan cafes, the city offers something for every taste and budget.\n" +
                    "\n" +
                    "Finally, sports fans can catch a game at one of the city's many professional sports venues, including Dodger Stadium (baseball), Staples Center (basketball and hockey), and the Rose Bowl (football).\n" +
                    "\n" +
                    "Overall, Los Angeles is a vibrant and exciting city that offers endless opportunities for exploration and entertainment. Its combination of natural beauty, cultural richness, and Hollywood glamour make it an unforgettable destination that captures the essence of California's unique and vibrant culture.\n" +
                    "\n" +
                    "\n" +
                    "\n",
            "San Francisco is a vibrant and eclectic city located on the coast of northern California. Known for its steep hills, historic landmarks, and diverse culture, it's a must-visit destination for anyone exploring the West Coast.\n" +
                    "\n" +
                    "One of the most iconic landmarks in San Francisco is the Golden Gate Bridge, a suspension bridge that spans the Golden Gate strait and connects San Francisco to Marin County. Visitors can take a walk or bike ride across the bridge, or admire its stunning architecture and views from afar.\n" +
                    "\n" +
                    "Another popular attraction in San Francisco is Alcatraz Island, a former federal prison that once housed some of the country's most notorious criminals. Visitors can take a ferry to the island and tour the prison, learning about its history and notorious inmates.\n" +
                    "\n" +
                    "For foodies, San Francisco is a culinary paradise, offering a wide range of cuisines from around the world. The city's famous Fisherman's Wharf is a great place to sample fresh seafood, while the Mission District is known for its delicious Mexican cuisine.\n" +
                    "\n" +
                    "Art lovers will appreciate the many museums and galleries that San Francisco has to offer, including the San Francisco Museum of Modern Art and the de Young Museum. The city is also home to many street artists, whose colorful murals can be found throughout the city.\n" +
                    "\n" +
                    "Finally, the city's eclectic neighborhoods, such as Chinatown, the Haight-Ashbury district, and the Castro, offer a unique glimpse into San Francisco's diverse culture and history.\n" +
                    "\n" +
                    "Overall, San Francisco is a city that captures the essence of California's unique and vibrant culture, offering something for everyone to enjoy. Its stunning landmarks, delicious cuisine, and eclectic neighborhoods make it a must-visit destination for anyone exploring the West Coast.\n" +
                    "\n" +
                    "\n" +
                    "\n",
            "Toronto is a vibrant and diverse city located on the shores of Lake Ontario in Canada. As Canada's largest city, Toronto is home to a diverse range of cultures and is known for its friendly locals, world-class cuisine, and stunning architecture.\n" +
                    "\n" +
                    "One of the most iconic landmarks in Toronto is the CN Tower, a towering structure that offers stunning views of the city and Lake Ontario from its observation deck. Visitors can also enjoy a meal at the revolving restaurant, which offers panoramic views of the city.\n" +
                    "\n" +
                    "Another must-visit destination in Toronto is the St. Lawrence Market, a historic market that dates back to the 19th century. Here, visitors can sample a variety of local foods and shop for artisanal products, fresh produce, and meats.\n" +
                    "\n" +
                    "Toronto also has a thriving arts and culture scene, with many museums and galleries showcasing everything from modern art to ancient artifacts. The Royal Ontario Museum, for example, is one of the largest museums in Canada and is home to a diverse collection of artifacts from around the world.\n" +
                    "\n" +
                    "For outdoor enthusiasts, Toronto offers many parks and green spaces, including High Park, which spans over 400 acres and features walking trails, picnic areas, and even a zoo. The Toronto Islands, a group of small islands just off the city's shore, offer stunning views of the city skyline and are a popular spot for boating, picnicking, and swimming.\n" +
                    "\n" +
                    "Finally, Toronto is known for its world-class cuisine, with everything from classic Canadian dishes to international fare. Visitors can sample poutine, a Canadian classic made with french fries, gravy, and cheese curds, or enjoy a multicultural dining experience in one of the city's many diverse neighborhoods.\n" +
                    "\n" +
                    "Overall, Toronto is a city that offers something for everyone, whether you're interested in history and culture, outdoor recreation, or delicious cuisine. Its friendly locals, stunning architecture, and vibrant culture make it a must-visit destination in Canada.\n" +
                    "\n" +
                    "\n" +
                    "\n",
            "Vancouver is a coastal city located in western Canada, known for its stunning natural beauty, cultural diversity, and vibrant city life. The city is situated between the Pacific Ocean and the Coast Mountains, offering breathtaking views and endless opportunities for outdoor recreation.\n" +
                    "\n" +
                    "One of Vancouver's most iconic landmarks is Stanley Park, a 1,000-acre park that borders the downtown core. Here, visitors can stroll along the seawall, cycle through the forest, or visit the Vancouver Aquarium to see local marine life up close.\n" +
                    "\n" +
                    "Another popular destination in Vancouver is Granville Island, a former industrial area that has been transformed into a bustling cultural hub. Visitors can explore the many artisanal shops, galleries, and restaurants, or take in a show at one of the island's many theaters.\n" +
                    "\n" +
                    "Vancouver is also known for its thriving food scene, which showcases a diverse range of cuisines and local ingredients. Visitors can sample fresh seafood at one of the city's many seafood restaurants, or try a traditional Canadian dish like poutine or Nanaimo bars.\n" +
                    "\n" +
                    "For outdoor enthusiasts, Vancouver offers a wide range of activities, including skiing and snowboarding in the nearby mountains, kayaking in the harbor, or hiking through the city's many parks and trails.\n" +
                    "\n" +
                    "Finally, Vancouver is a culturally diverse city that celebrates its many different communities. Visitors can explore the vibrant neighborhoods of Chinatown, Little India, or the Punjabi Market, or attend one of the many cultural festivals that take place throughout the year.\n" +
                    "\n" +
                    "Overall, Vancouver is a city that offers a unique blend of natural beauty, cultural diversity, and urban excitement. Its stunning scenery, thriving food scene, and endless opportunities for outdoor recreation make it a must-visit destination for anyone traveling to western Canada.",
            "Las Vegas, located in the southwestern United States, is a world-famous destination known for its vibrant nightlife, endless entertainment options, and luxurious resorts. The city is often referred to as the \"Entertainment Capital of the World\" and is home to some of the most iconic casinos and hotels in the world.\n" +
                    "\n" +
                    "One of the main draws of Las Vegas is its thriving casino scene. Visitors can try their luck at popular games like blackjack, roulette, and slot machines, or take in one of the many shows featuring world-renowned performers. The city is also home to numerous nightclubs and bars, making it a prime destination for those looking to party.\n" +
                    "\n" +
                    "For those interested in exploring beyond the casino scene, Las Vegas offers a range of other activities. The city is located just a short drive away from stunning natural attractions like Red Rock Canyon and the Hoover Dam, making it a great base for outdoor enthusiasts.\n" +
                    "\n" +
                    "Las Vegas is also known for its world-class dining options, with numerous high-end restaurants featuring celebrity chefs and innovative cuisine. Visitors can sample everything from classic American fare to international dishes from around the globe.\n" +
                    "\n" +
                    "Finally, Las Vegas is home to numerous luxury resorts and hotels, offering visitors the chance to indulge in lavish accommodations and amenities. From the iconic Bellagio to the extravagant Wynn Las Vegas, there are plenty of options for those looking for a truly luxurious experience.\n" +
                    "\n" +
                    "Overall, Las Vegas is a city that offers a unique blend of entertainment, luxury, and natural beauty. Its thriving casino scene, world-class dining options, and stunning natural attractions make it a must-visit destination for anyone looking for an exciting and unforgettable vacation.\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n",
            "Cancun is a popular resort city located in the Yucatan Peninsula of Mexico, known for its white sand beaches, crystal-clear waters, and vibrant nightlife. The city is a popular destination for those seeking a tropical getaway, with a range of activities and attractions to suit every traveler.\n" +
                    "\n" +
                    "One of the main draws of Cancun is its stunning beaches. The city is home to miles of pristine white sand beaches, with crystal-clear waters that are perfect for swimming, snorkeling, and diving. Visitors can also take part in a range of water sports, such as jet skiing, parasailing, and windsurfing.\n" +
                    "\n" +
                    "Cancun is also known for its thriving nightlife, with numerous bars, nightclubs, and restaurants that cater to a range of tastes and preferences. Visitors can dance the night away to music from local DJs, or enjoy a more relaxed evening with drinks and food at one of the many beachfront restaurants.\n" +
                    "\n" +
                    "For those interested in history and culture, Cancun offers a range of attractions that showcase the region's rich heritage. Visitors can explore the ancient Mayan ruins of Chichen Itza or Tulum, or visit the Cancun Underwater Museum, which features a collection of submerged sculptures and artwork.\n" +
                    "\n" +
                    "Finally, Cancun is home to numerous luxury resorts and hotels, offering visitors the chance to indulge in lavish accommodations and amenities. From all-inclusive resorts to boutique hotels, there are plenty of options for those looking for a truly luxurious experience.\n" +
                    "\n" +
                    "Overall, Cancun is a city that offers a perfect blend of natural beauty, culture, and luxury. Its stunning beaches, vibrant nightlife, and rich history make it a must-visit destination for anyone seeking a tropical getaway.\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n",
            "Hawaii is a group of volcanic islands located in the middle of the Pacific Ocean, known for its stunning natural beauty, warm tropical climate, and laid-back island lifestyle. The islands offer a range of activities and attractions, from hiking to surfing to cultural experiences.\n" +
                    "\n" +
                    "One of the main draws of Hawaii is its gorgeous beaches. Each island has its own unique beaches, ranging from white sand to black sand to green sand, each with its own breathtaking views and crystal-clear waters. Visitors can enjoy swimming, sunbathing, and a range of water activities, such as snorkeling, scuba diving, and surfing.\n" +
                    "\n" +
                    "Hawaii is also known for its stunning natural landscapes, with numerous national parks and scenic vistas to explore. Visitors can hike through lush rainforests, explore volcanic craters, and even see active lava flows on the Big Island. The islands also offer opportunities for wildlife watching, such as humpback whale watching during the winter months.\n" +
                    "\n" +
                    "For those interested in Hawaiian culture, there are numerous cultural experiences to be had, such as visiting traditional Hawaiian villages, watching hula performances, and learning about the history of the islands. Hawaii also has a thriving food scene, with a range of local dishes that blend traditional Hawaiian ingredients with flavors from around the world.\n" +
                    "\n" +
                    "Finally, Hawaii offers a range of luxurious accommodations, from beachfront resorts to private villas, making it a perfect destination for those looking for a truly indulgent getaway.\n" +
                    "\n" +
                    "Overall, Hawaii is a destination that offers a perfect blend of natural beauty, culture, and relaxation. Its stunning beaches, breathtaking landscapes, and unique cultural experiences make it a must-visit destination for anyone seeking a tropical escape.\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n",
            "Quebec City is a historic and picturesque city located in the Canadian province of Quebec. The city is known for its European charm, stunning architecture, and rich cultural heritage, making it a popular destination for tourists from around the world.\n" +
                    "\n" +
                    "One of the main attractions in Quebec City is the historic Old Town, which is a UNESCO World Heritage Site. Visitors can wander the cobblestone streets and admire the beautiful 17th and 18th century buildings, such as the Chateau Frontenac, which is a famous landmark and a must-see attraction. The Old Town is also home to many quaint shops, cafes, and restaurants, offering visitors a chance to experience the local culture and cuisine.\n" +
                    "\n" +
                    "Another must-visit attraction in Quebec City is the Plains of Abraham, which is a beautiful park that offers stunning views of the St. Lawrence River. The park is also home to the Citadelle of Quebec, a historic military fort that offers guided tours and a chance to learn about the city's rich history.\n" +
                    "\n" +
                    "For those interested in art and culture, Quebec City has several museums and galleries, such as the Quebec National Museum of Fine Arts and the Museum of Civilization, which offers exhibits on Quebec's history and culture.\n" +
                    "\n" +
                    "Finally, Quebec City is known for its festivals and events, such as the Quebec Winter Carnival and the Festival d'été de Québec, which are both popular events that offer a chance to experience the city's vibrant culture and entertainment scene.\n" +
                    "\n" +
                    "Overall, Quebec City is a charming and vibrant destination that offers a unique blend of history, culture, and natural beauty. Its stunning architecture, cultural attractions, and lively festivals make it a must-visit destination for anyone looking to experience the best of Quebec.\n" +
                    "\n" +
                    "\n" +
                    "\n",
            "New Orleans is a vibrant and historic city located in the southern United States. The city is known for its unique culture, delicious food, and lively music scene, making it a popular destination for tourists from around the world.\n" +
                    "\n" +
                    "One of the main attractions in New Orleans is the French Quarter, which is a historic neighborhood filled with beautiful architecture, charming boutiques, and world-class restaurants. Visitors can take a leisurely stroll through the narrow streets, visit historic landmarks such as St. Louis Cathedral, and indulge in delicious Creole and Cajun cuisine.\n" +
                    "\n" +
                    "Another popular attraction in New Orleans is the Garden District, which is a beautiful neighborhood filled with historic mansions, lush gardens, and tree-lined streets. Visitors can take a guided walking tour of the area, visit the historic Lafayette Cemetery, and admire the stunning architecture.\n" +
                    "\n" +
                    "For those interested in music and nightlife, New Orleans is known for its jazz and blues scene. Visitors can visit famous music venues such as Preservation Hall and the Spotted Cat, and enjoy live music performances by talented musicians.\n" +
                    "\n" +
                    "Finally, New Orleans is home to several festivals and events throughout the year, such as the Mardi Gras celebration and the Jazz and Heritage Festival. These events are a great way to experience the city's unique culture and lively atmosphere.\n" +
                    "\n" +
                    "Overall, New Orleans is a vibrant and culturally rich city that offers a unique blend of history, music, and cuisine. Its charming neighborhoods, lively music scene, and festive atmosphere make it a must-visit destination for anyone looking to experience the best of southern hospitality.\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n",
        )





        val southAmericaImage = arrayOf(
            R.drawable.sa1, R.drawable.sa2, R.drawable.sa3, R.drawable.sa4, R.drawable.sa5,
            R.drawable.sa6, R.drawable.sa7, R.drawable.sa8, R.drawable.sa9, R.drawable.sa10,
        )
        val southAmericaCity = arrayOf("Brazil", "Peru", "Argentina", "Colombia", "Brazil",
            "Ecuador", "Argentina and Chile", "Peru and Bolivia", "Chile", "Venezuela"
        )
        val southAmericaLocations = arrayOf(
            "Rio De Janeiro", "Machu Picchu", "Buenos Aires", "Cartagena", "Salvador", "Galapagos",
            "Patagonia", "Lake Titicaca", "Atacama", "Angel Falls"
        )

        val southAmericaDetails = arrayOf(
            "Rio de Janeiro, located in Brazil, is a world-renowned tourist destination known for its stunning beaches, vibrant culture, and natural beauty. The city is famous for its iconic landmarks such as Christ the Redeemer statue, Sugarloaf Mountain, and the Copacabana Beach. Visitors can explore the charming historic neighborhoods of Santa Teresa and Lapa, sample delicious Brazilian cuisine, and experience the city's legendary nightlife. Rio also hosts some of the world's biggest cultural events, such as the Carnival and the Rock in Rio festival.\n" +
                    "\n" +
                    "There are also several tourist destinations around Rio de Janeiro that are worth visiting. Just a short drive from the city is the lush Tijuca National Park, which is home to a wide variety of flora and fauna and offers stunning views of the city from its many hiking trails. The colonial town of Paraty, located a few hours away, is known for its cobblestone streets, historic buildings, and beautiful beaches. Visitors can also take a trip to the nearby Ilha Grande, a stunning tropical island that is home to some of Brazil's most pristine beaches. Overall, Rio de Janeiro and its surrounding areas offer a wealth of attractions and activities that are sure to impress and delight visitors.",
            "Machu Picchu, located in the Andes Mountains of Peru, is one of the most iconic and spectacular tourist destinations in the world. This ancient Inca citadel was built in the 15th century and remained hidden from the outside world for centuries until it was rediscovered in 1911. Visitors can explore the stunning ruins, which are perched on a mountaintop and offer breathtaking views of the surrounding valleys and peaks. The site is also known for its intricate stonework, temples, and terraces that were used for farming and irrigation.\n" +
                    "\n" +
                    "There are also several destinations around Machu Picchu that are worth exploring. Visitors can take a scenic train ride to the nearby town of Aguas Calientes, which is surrounded by lush mountains and offers hot springs and spas for relaxation. The nearby town of Ollantaytambo is home to another impressive Inca archaeological site and is also a popular base for hiking in the surrounding mountains. Visitors can also explore the Sacred Valley of the Incas, which is filled with picturesque villages, colorful markets, and ancient ruins. Overall, Machu Picchu and its surrounding areas offer a unique and unforgettable travel experience that is rich in history, culture, and natural beauty.",
            "Buenos Aires, the capital city of Argentina, is a vibrant and dynamic tourist destination that offers a unique blend of Latin American and European culture. The city is known for its stunning architecture, colorful neighborhoods, and lively cultural scene. Visitors can explore the iconic landmarks such as the Recoleta Cemetery, the Teatro Colón opera house, and the Casa Rosada presidential palace. The city is also famous for its tango music and dance, which can be experienced at the many milongas (tango clubs) throughout the city.\n" +
                    "\n" +
                    "There are also several destinations around Buenos Aires that are worth visiting. Just a short ferry ride away is the picturesque town of Colonia del Sacramento, located in neighboring Uruguay. Visitors can explore the town's historic buildings, cobblestone streets, and beautiful beaches. The nearby Tigre Delta is a popular destination for boat tours and kayaking, offering a unique perspective on the region's natural beauty. Visitors can also explore the wine regions of Mendoza and Salta, located a few hours away, which offer stunning vineyards, wineries, and outdoor activities. Overall, Buenos Aires and its surrounding areas offer a rich and diverse travel experience that is sure to captivate and inspire visitors.",
            "Cartagena, located on the Caribbean coast of Colombia, is a beautiful and historic tourist destination known for its colonial architecture, colorful streets, and vibrant cultural scene. The city's old town, known as the \"walled city,\" is a UNESCO World Heritage Site that is filled with historic buildings, churches, and plazas. Visitors can explore the Castillo San Felipe de Barajas, a colonial-era fortress that offers stunning views of the city and the sea. The city is also known for its delicious seafood and vibrant nightlife, with many bars and restaurants serving up live music and dance performances.\n" +
                    "\n" +
                    "There are also several destinations around Cartagena that are worth visiting. Just a short drive from the city is the beautiful Rosario Islands, a chain of small islands with crystal clear waters and white sand beaches. Visitors can enjoy snorkeling, diving, and sunbathing, as well as exploring the many colorful fishing villages on the islands. The nearby mud volcano of El Totumo is also a popular destination, where visitors can take a relaxing mud bath and enjoy the therapeutic properties of the mud. Overall, Cartagena and its surrounding areas offer a unique and unforgettable travel experience that is rich in history, culture, and natural beauty.",
            "Salvador, located on the northeast coast of Brazil, is a historic and culturally rich tourist destination known for its colorful colonial architecture, vibrant music and dance scene, and Afro-Brazilian heritage. The city's historic center, known as the \"Pelourinho,\" is a UNESCO World Heritage Site that is filled with stunning colonial buildings, churches, and plazas. Visitors can explore the many cultural attractions of the city, such as the Afro-Brazilian Museum and the Casa do Carnaval, which celebrate the city's rich cultural heritage.\n" +
                    "\n" +
                    "There are also several destinations around Salvador that are worth visiting. Just a short drive from the city is the beautiful Praia do Forte, a picturesque beach town that is home to a sea turtle conservation project and a variety of other natural attractions. The nearby Morro de Sao Paulo is a popular destination for those seeking a more laid-back and secluded beach experience. Visitors can also explore the nearby Chapada Diamantina National Park, which is home to stunning waterfalls, rock formations, and hiking trails. Overall, Salvador and its surrounding areas offer a unique and unforgettable travel experience that is rich in history, culture, and natural beauty.\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n",
            "The Galapagos Islands, located in the Pacific Ocean off the coast of Ecuador, are one of the most unique and ecologically diverse tourist destinations in the world. The islands are known for their incredible array of wildlife, many of which are found nowhere else on earth. Visitors can see giant tortoises, marine iguanas, sea lions, and a variety of bird species, including the famous blue-footed booby. The islands also offer stunning natural landscapes, with volcanic formations, pristine beaches, and crystal clear waters.\n" +
                    "\n" +
                    "There are also several destinations around the Galapagos Islands that are worth visiting. The nearby town of Puerto Ayora is home to the Charles Darwin Research Station, where visitors can learn more about the islands' unique ecosystem and conservation efforts. The islands are also a popular destination for scuba diving and snorkeling, with many dive sites offering the opportunity to see a variety of marine life up close. Visitors can also explore the nearby islands of Santa Cruz, Isabela, and San Cristobal, each of which offers its own unique blend of natural beauty and cultural attractions. Overall, the Galapagos Islands offer a one-of-a-kind travel experience that is sure to amaze and inspire visitors.",
            "Patagonia is a vast and rugged region located in the southernmost part of South America, covering parts of Argentina and Chile. It is a world-renowned tourist destination known for its stunning natural landscapes, including glaciers, lakes, mountains, and forests. The region is home to many national parks, including Torres del Paine and Los Glaciares, which offer incredible hiking trails, wildlife viewing opportunities, and stunning vistas. Visitors can also explore the many quaint towns and villages throughout the region, each offering their own unique blend of culture and history.\n" +
                    "\n" +
                    "There are also several destinations around Patagonia that are worth visiting. In Argentina, the city of Bariloche is a popular destination for skiing and outdoor recreation, while the nearby Lake District is home to stunning scenery and natural hot springs. In Chile, the city of Punta Arenas offers a glimpse into Patagonian culture and history, while the nearby Tierra del Fuego National Park offers incredible hiking trails and wildlife viewing opportunities. Overall, Patagonia offers a one-of-a-kind travel experience that is sure to captivate and inspire visitors with its rugged natural beauty and rich cultural heritage.\n" +
                    "\n" +
                    "\n" +
                    "\n",
            "Lake Titicaca is a large and beautiful lake located on the border of Peru and Bolivia, in the Andean region of South America. It is the highest navigable lake in the world and is known for its stunning blue waters, as well as the many cultural and historical attractions that surround it. The lake is home to several islands, including the famous floating islands of Uros, which are made entirely out of reeds and are home to a unique community of indigenous people. Visitors can also explore the many other islands on the lake, including Taquile and Amantani, which offer beautiful scenery and a glimpse into the traditional ways of life of the local people.\n" +
                    "\n" +
                    "There are also several destinations around Lake Titicaca that are worth visiting. The city of Puno, located on the shores of the lake, is a popular destination for visitors, with its vibrant cultural scene and many historic landmarks, such as the colonial-era Cathedral of Puno. The nearby Sillustani archaeological site is also a popular destination, with its impressive collection of pre-Incan ruins and ancient tombs. Visitors can also explore the surrounding countryside, with its stunning mountain landscapes, traditional villages, and opportunities for hiking and outdoor recreation. Overall, Lake Titicaca offers a unique and unforgettable travel experience that is rich in culture, history, and natural beauty.\n" +
                    "\n" +
                    "\n" +
                    "\n",
            "The Atacama Desert, located in the northern region of Chile, is one of the most unique and striking tourist destinations in the world. It is the driest non-polar desert in the world and is known for its stunning landscapes, including otherworldly rock formations, geysers, salt flats, and colorful lagoons. The desert is also home to a rich cultural history, with evidence of ancient civilizations and indigenous cultures throughout the region.\n" +
                    "\n" +
                    "Visitors to the Atacama Desert can explore the many natural wonders of the region, including the Valle de la Luna (Moon Valley), the Atacama Salt Flat, and the El Tatio Geysers, which offer stunning natural scenery and unique geological formations. The region is also a popular destination for stargazing, with its clear skies and lack of light pollution making it one of the best places in the world for astronomy enthusiasts.\n" +
                    "\n" +
                    "There are also several destinations around the Atacama Desert that are worth visiting. The nearby town of San Pedro de Atacama is a popular destination for visitors, with its charming colonial architecture, vibrant culture, and many cultural and historical landmarks. The nearby Andean highlands offer opportunities for hiking, mountain biking, and other outdoor activities, while the nearby Atacama Large Millimeter Array (ALMA) Observatory offers a unique opportunity to learn about astronomy and space science. Overall, the Atacama Desert offers a unique and unforgettable travel experience that is sure to amaze and inspire visitors with its stunning natural beauty and rich cultural heritage.\n" +
                    "\n" +
                    "\n" +
                    "\n",
            "Angel Falls, located in the Canaima National Park in Venezuela, is the world's highest uninterrupted waterfall, with a height of over 3,200 feet (979 meters). It is one of the most spectacular and awe-inspiring natural wonders in the world and is a must-see destination for any traveler visiting South America. The falls are named after Jimmy Angel, a pilot who discovered the falls in the 1930s, and are located in a remote and rugged region of the Venezuelan jungle.\n" +
                    "\n" +
                    "Visitors to Angel Falls can take a guided tour to the base of the falls, where they can witness the immense power and beauty of the waterfall up close. The surrounding region is also home to a rich variety of flora and fauna, including many unique and endangered species, making it a popular destination for ecotourism and wildlife viewing.\n" +
                    "\n" +
                    "There are also several destinations around Angel Falls that are worth visiting. The nearby town of Canaima is a popular destination for visitors, with its stunning natural beauty and opportunities for hiking and outdoor recreation. The nearby Pemon Indian village is also a popular destination, offering a glimpse into the traditional ways of life of the local people. Overall, Angel Falls is a unique and unforgettable travel experience that is sure to captivate and inspire visitors with its immense natural beauty and stunning scenery.\n" +
                    "\n" +
                    "\n" +
                    "\n",
        )




        val australasiaImage = arrayOf(
            R.drawable.aus1, R.drawable.aus2, R.drawable.aus3, R.drawable.aus4, R.drawable.aus5,
            R.drawable.aus6, R.drawable.aus7, R.drawable.aus8, R.drawable.aus9, R.drawable.aus10,
        )
        val australasiaCity = arrayOf("Australia", "Australia", "Australia", "New Zealand", "New Zealand",
            "New Zealand", "Fiji", "French Polynesia", "Australia", "Australia"
        )
        val australasiaLocations = arrayOf("Sydney Opera House", "Greater Barrier Reef", "Uluru (Ayers Rock)",
            "Milford Sound", "Queenstown", "Rotorua", "Fiji Islands", "Bora Bora", "The Great Ocean Road",
            "The Daintree Rainforest",
        )

        val australasiaDetails = arrayOf(
            "The Sydney Opera House is one of the most iconic landmarks in Australia and one of the most recognizable buildings in the world. Located in Sydney Harbour, the Opera House is a UNESCO World Heritage Site and is renowned for its stunning design, which features a series of white sails that seem to float on the water. The Opera House is home to multiple performance venues, including a concert hall, a drama theater, and an opera theater, and hosts a wide range of world-class performances throughout the year.\n" +
                    "\n" +
                    "Visitors to the Sydney Opera House can take a guided tour of the building to learn about its history, architecture, and cultural significance. They can also attend one of the many performances or events hosted at the Opera House, which range from classical music concerts to theater productions, dance performances, and contemporary music gigs.\n" +
                    "\n" +
                    "The Opera House is located in one of the most vibrant and cosmopolitan cities in the world, with plenty of other attractions and destinations for visitors to explore. The nearby Sydney Harbour Bridge is another iconic landmark and offers stunning views of the city and the harbor, while the beaches of Bondi and Manly are popular destinations for swimming, surfing, and sunbathing. The city is also home to many museums, galleries, and cultural institutions, as well as a thriving food and drink scene with plenty of restaurants, cafes, and bars to explore. Overall, the Sydney Opera House is a must-see destination for anyone visiting Australia, offering a unique and unforgettable experience that is rich in culture, history, and natural beauty.\n" +
                    "\n" +
                    "\n" +
                    "\n",
            "The Great Barrier Reef is the largest coral reef system in the world and one of Australia's most famous natural wonders. Located off the coast of Queensland, the Great Barrier Reef is home to thousands of species of marine life, including hundreds of species of coral, fish, sharks, dolphins, and sea turtles. It is also a popular destination for snorkeling and diving, with its crystal-clear waters and vibrant coral reefs offering a unique and unforgettable underwater experience.\n" +
                    "\n" +
                    "Visitors to the Great Barrier Reef can take guided tours or boat trips to explore the various parts of the reef and witness the many different types of marine life that call it home. There are also several nearby islands that offer opportunities for swimming, sunbathing, and other water-based activities. Visitors can also learn about the ecology and conservation of the reef at one of the many education and research centers located throughout the region.\n" +
                    "\n" +
                    "The Great Barrier Reef is located in one of the most beautiful and diverse regions of Australia, with plenty of other attractions and destinations for visitors to explore. The nearby cities of Cairns and Townsville offer opportunities for cultural and historical exploration, while the Daintree Rainforest and Atherton Tablelands provide opportunities for hiking and wildlife viewing. The region is also home to many charming small towns and villages, offering a glimpse into the laid-back and friendly lifestyle of the locals. Overall, the Great Barrier Reef is a unique and unforgettable travel experience that is sure to amaze and inspire visitors with its stunning natural beauty and rich biodiversity.\n" +
                    "\n" +
                    "\n" +
                    "\n",
            "Uluru, also known as Ayers Rock, is a massive sandstone rock formation located in the heart of Australia's Red Centre. It is one of the most recognizable and iconic natural landmarks in the world and is considered sacred by the local Aboriginal people. Uluru is a popular destination for tourists, offering a unique and unforgettable travel experience that is rich in culture, history, and natural beauty.\n" +
                    "\n" +
                    "Visitors to Uluru can take guided tours to learn about the rock's cultural and spiritual significance to the local Anangu people, as well as its geological history and unique features. There are also several nearby attractions and destinations that are worth visiting, including the nearby Kata Tjuta rock formations, the Uluru-Kata Tjuta National Park, and the town of Alice Springs, which is located about 280 miles (450 km) to the north.\n" +
                    "\n" +
                    "The region surrounding Uluru is also home to a rich variety of wildlife, including kangaroos, wallabies, dingoes, and a wide variety of bird species. Visitors can explore the region on foot, by bike, or by car, and can take advantage of the many hiking trails, lookout points, and natural attractions located throughout the area.\n" +
                    "\n" +
                    "Overall, Uluru is a unique and unforgettable travel destination that offers visitors the opportunity to connect with nature, learn about the local culture and history, and experience the beauty and majesty of one of the world's most iconic natural landmarks.",
            "Milford Sound is a stunning fjord located on the southwest coast of New Zealand's South Island. Known for its dramatic cliffs, emerald waters, and misty waterfalls, Milford Sound is one of the most beautiful natural attractions in New Zealand and is a popular destination for tourists and outdoor enthusiasts.\n" +
                    "\n" +
                    "Visitors to Milford Sound can take guided boat tours or kayaking trips to explore the fjord and its many natural wonders, including the famous Mitre Peak, which rises more than 5,500 feet (1,675 meters) above the water. The fjord is also home to a wide variety of wildlife, including dolphins, seals, and penguins, which can often be spotted from the boats.\n" +
                    "\n" +
                    "The surrounding region is also home to several hiking trails, including the Milford Track, which is one of the most famous and scenic hiking trails in New Zealand. The nearby towns of Te Anau and Queenstown offer opportunities for cultural and historical exploration, as well as outdoor activities such as skiing, mountain biking, and bungee jumping.\n" +
                    "\n" +
                    "Overall, Milford Sound is a unique and unforgettable travel destination that offers visitors the opportunity to connect with nature and experience the beauty and majesty of one of the world's most spectacular natural wonders.",
            "Queenstown is a charming town located on the shores of Lake Wakatipu in New Zealand's South Island. Known for its stunning natural beauty, outdoor activities, and lively nightlife, Queenstown is a popular destination for tourists from around the world.\n" +
                    "\n" +
                    "Visitors to Queenstown can take advantage of the many outdoor activities available in the region, including skiing, snowboarding, hiking, mountain biking, and bungee jumping. The nearby Remarkables mountain range offers some of the best skiing and snowboarding in New Zealand, while the many hiking trails in the area offer opportunities to explore the stunning natural landscapes and wildlife of the region.\n" +
                    "\n" +
                    "In addition to its outdoor activities, Queenstown is also known for its lively nightlife and cultural attractions. The town is home to several museums, art galleries, and cultural centers, as well as a thriving restaurant and bar scene that caters to a wide variety of tastes and preferences.\n" +
                    "\n" +
                    "Overall, Queenstown is a unique and unforgettable travel destination that offers visitors the opportunity to connect with nature, experience the beauty and excitement of outdoor activities, and enjoy the rich culture and nightlife of this vibrant and dynamic town.",
            "Rotorua is a city located on the North Island of New Zealand known for its geothermal activity and Maori culture. The city sits atop the Taupo Volcanic Zone and offers visitors a unique and unforgettable travel experience that is rich in natural beauty, cultural heritage, and outdoor activities.\n" +
                    "\n" +
                    "One of the main attractions of Rotorua is its geothermal activity, which includes bubbling mud pools, steaming geysers, and hot springs. Visitors can explore these natural wonders at several nearby geothermal parks, including Wai-O-Tapu Thermal Wonderland and Te Puia, which also features a traditional Maori cultural center and performance.\n" +
                    "\n" +
                    "Rotorua is also known for its rich Maori cultural heritage, and visitors can learn about the history, customs, and traditions of the local Maori people through guided tours, cultural performances, and visits to historical sites such as Ohinemutu Village.\n" +
                    "\n" +
                    "In addition to its natural and cultural attractions, Rotorua offers a wide variety of outdoor activities, including hiking, mountain biking, rafting, and fishing. The city is also home to several beautiful lakes, including Lake Rotorua and Lake Tarawera, which offer opportunities for swimming, boating, and kayaking.\n" +
                    "\n" +
                    "Overall, Rotorua is a unique and unforgettable travel destination that offers visitors the opportunity to connect with nature, learn about the rich cultural heritage of the local Maori people, and enjoy a wide variety of outdoor activities and adventures.",
            "The Fiji Islands are a group of over 300 islands located in the South Pacific Ocean, known for their pristine beaches, crystal-clear waters, and vibrant coral reefs. The islands are a popular travel destination, offering visitors the opportunity to experience tropical paradise and immerse themselves in the warm and friendly culture of the local Fijian people.\n" +
                    "\n" +
                    "One of the main attractions of the Fiji Islands is their natural beauty, which includes white sandy beaches, turquoise lagoons, and lush tropical forests. Visitors can relax on the beach, swim in the warm waters, and explore the many stunning coral reefs that surround the islands, offering opportunities for snorkeling and diving.\n" +
                    "\n" +
                    "In addition to its natural beauty, Fiji is known for its rich cultural heritage, which is reflected in its traditional villages, markets, and festivals. Visitors can learn about the local Fijian culture through cultural tours, dance performances, and visits to historical sites such as the Sri Siva Subramaniya Temple, the largest Hindu temple in the Southern Hemisphere.\n" +
                    "\n" +
                    "Fiji is also a popular destination for outdoor activities, including hiking, kayaking, and surfing. Visitors can explore the many islands and hidden coves by boat or participate in a variety of water sports, such as paddleboarding and parasailing.\n" +
                    "\n" +
                    "Overall, the Fiji Islands offer visitors a unique and unforgettable travel experience that is rich in natural beauty, cultural heritage, and outdoor activities. Whether you're looking to relax on the beach, explore the local culture, or embark on an adventure, the Fiji Islands have something to offer everyone.\n" +
                    "\n" +
                    "\n" +
                    "\n",
            "Bora Bora is a small island in the South Pacific, located in French Polynesia. Known for its stunning natural beauty, crystal-clear waters, and luxury resorts, Bora Bora is a popular travel destination for those seeking a tropical paradise.\n" +
                    "\n" +
                    "The main attraction of Bora Bora is its natural beauty, which includes turquoise lagoons, coral reefs, and lush tropical forests. Visitors can explore the island's many beaches and take a dip in the warm waters, or participate in a variety of water sports, such as snorkeling, diving, and paddleboarding.\n" +
                    "\n" +
                    "Bora Bora is also known for its luxury resorts, which offer visitors the opportunity to stay in overwater bungalows and enjoy amenities such as private plunge pools and spa treatments. Visitors can also enjoy fine dining at the island's many restaurants, which serve a variety of French and Polynesian cuisine.\n" +
                    "\n" +
                    "In addition to its natural beauty and luxury resorts, Bora Bora offers a variety of cultural experiences. Visitors can learn about the local culture through visits to traditional villages, dance performances, and cultural festivals.\n" +
                    "\n" +
                    "Overall, Bora Bora is a unique and unforgettable travel destination that offers visitors the opportunity to experience a tropical paradise, immerse themselves in local culture, and indulge in luxury amenities. Whether you're looking for relaxation, adventure, or a romantic getaway, Bora Bora is sure to leave a lasting impression.",
            "The Great Ocean Road is a 243-kilometer stretch of coastal highway located in the state of Victoria, Australia. This scenic road trip is a popular travel destination, offering visitors the opportunity to experience some of Australia's most breathtaking coastal views and natural landmarks.\n" +
                    "\n" +
                    "The main attraction of the Great Ocean Road is the stunning coastline, which features dramatic rock formations, pristine beaches, and crystal-clear waters. One of the most famous landmarks along the road is the Twelve Apostles, a series of limestone stacks that rise out of the ocean. Other natural landmarks include the London Arch, Loch Ard Gorge, and the Gibson Steps.\n" +
                    "\n" +
                    "Visitors can explore the many beaches along the road, such as Bells Beach, a popular spot for surfing, and Apollo Bay, a charming seaside town with a bustling harbor. Inland, the Great Otway National Park offers visitors the opportunity to hike through lush rainforests and see waterfalls and native wildlife.\n" +
                    "\n" +
                    "In addition to its natural beauty, the Great Ocean Road offers visitors a variety of cultural experiences. Visitors can learn about the local Aboriginal culture through cultural tours and artwork displays. The towns along the road, such as Lorne and Port Campbell, offer unique shopping and dining experiences, showcasing local art, crafts, and cuisine.\n" +
                    "\n" +
                    "Overall, the Great Ocean Road is a must-visit destination for anyone traveling to Australia. Its stunning coastal views, natural landmarks, and cultural experiences make it an unforgettable journey that showcases the best of Australia's natural beauty and rich culture.",
            "The Daintree Rainforest is a UNESCO World Heritage Site located in Queensland, Australia. It is one of the oldest and most diverse rainforests in the world, and is home to an incredible variety of plant and animal species.\n" +
                    "\n" +
                    "The main attraction of the Daintree Rainforest is its natural beauty, which includes dense forests, cascading waterfalls, and crystal-clear streams. Visitors can take guided walks through the rainforest to see rare flora and fauna, such as the cassowary and tree kangaroo, or take a river cruise to see crocodiles and other wildlife.\n" +
                    "\n" +
                    "The Daintree Rainforest is also home to a number of Indigenous communities, who have lived in the area for thousands of years. Visitors can learn about their culture and history through guided tours and cultural performances.\n" +
                    "\n" +
                    "Other popular activities in the area include swimming in the pristine waters of Mossman Gorge, visiting the Daintree Discovery Centre to learn about the rainforest's ecology, and exploring the nearby Great Barrier Reef, which is one of the world's most important natural wonders.\n" +
                    "\n" +
                    "Overall, the Daintree Rainforest is a must-visit destination for anyone interested in nature and conservation. Its stunning natural beauty, rich Indigenous culture, and important ecological significance make it an unforgettable destination that showcases the best of Australia's natural wonders.\n" +
                    "\n" +
                    "\n" +
                    "\n",
        )

        myRecyclerView.layoutManager = LinearLayoutManager(this)
        destinationList = arrayListOf<Destination>()

        when (text) {
            "Asia" -> {
                for(index in asiaImage.indices){
                    val destination = Destination(asiaImage[index], asiaLocations[index], asiaCity[index], asiaDetails[index])
                    destinationList.add(destination)
                }
            }
            "Africa" -> {
                for(index in africaImage.indices){
                    val destination = Destination(africaImage[index], africaLocations[index], africaCity[index], africaDetails[index])
                    destinationList.add(destination)
                }
            }
            "Europe" -> {
                for(index in europeImage.indices){
                    val destination = Destination(europeImage[index], europeLocations[index], europeCity[index], europeDetails[index])
                    destinationList.add(destination)
                }
            }
            "North America" -> {
                for(index in northAmericaImage.indices){
                    val destination = Destination(northAmericaImage[index], northAmericaLocations[index], northAmericaCity[index], northAmericaDetails[index])
                    destinationList.add(destination)
                }
            }
            "South America" -> {
                for(index in southAmericaImage.indices){
                    val destination = Destination(southAmericaImage[index], southAmericaLocations[index], southAmericaCity[index], southAmericaDetails[index])
                    destinationList.add(destination)
                }
            }
            "Australasia" -> {
                for(index in australasiaImage.indices){
                    val destination = Destination(australasiaImage[index], australasiaLocations[index], australasiaCity[index], australasiaDetails[index])
                    destinationList.add(destination)
                }
            }
        }


        myRecyclerView.adapter = MyAdapter(destinationList, this)

    }
}