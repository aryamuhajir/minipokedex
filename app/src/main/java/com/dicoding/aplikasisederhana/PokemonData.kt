package com.dicoding.aplikasisederhana

object PokemonData {
    private val pokemonNames = arrayOf("Pikachu",
        "Abra",
        "Vulpix",
        "Charmander",
        "Zubat",
        "Poliwag",
        "Squirtle",
        "Tentacool",
        "Bulbasaur",
        "Rattata")

    private val pokemonDetails = arrayOf("Pikachu merupakan maskot utama dari pokemon. Pikachu memiliki suara yang khas yaitu “Pika Pika”. Oleh karena itu, pikachu menjadi salah satu pokemon yang paling digemari. Pokemon bertipe listrik sangat ampuh untuk melawan pokemon air dan lemah dengan pokemon tanah.",
        "Abra memiliki kemampuan setrum di atas rata-rata daripada pokemon listrik lain. Pokemon ini lebih sering di dalam hutan untuk mencari mangsa. Pokemon bertipe listrik sangat ampuh untuk melawan pokemon air dan lemah dengan pokemon tanah.",
        "Vulpix memiliki penggemar yang cukup banyak karena imut. Pokemon seperti ini sering menjadi koleksi karena tergolong cukup langka. Pokemon api sangat ampuh untuk melawan pokemon tumbuhan dan lemah dengan pokemon air.",
        "Charmanader si bayi naga api. Salah satu pokemon starter terlaris karena penampilannya terkesan garang. Pokemon ini memiliki tingkat suhu hingga 150 derajat celcius. Pokemon bertipe api sangat ampuh untuk melawan pokemon tumbuhan dan lemah dengan pokemon air.",
        "Zubat memiliki fisik yang mirip dengan kelelawar namun beracun. Banyak ditemukan di goa dekat pantai. Pokemon bertipe racun sangat ampuh untuk melawan pokemon normal dan lemah dengan pokemon es.",
        "Poliwag merupakan pokemon petinju yang cukup terkenal. Pukulan ditambah dorongan pusaran air dapat membuat lubang benda padat. Pokemon bertipe air sangat ampuh untuk melawan pokemon air dan lemah dengan pokemon listrik.",
        "Squirtle merupakan salah satu pokemon air yang paling terkenal. Kemampuan airnya bisa diandalkan dihampir setiap pertarungan. Pokemon bertipe air sangat ampuh untuk melawan pokemon api dan lemah dengan pokemon listrik.",
        "Seperti namanya, tentacool memiliki bentuk yang keren karena terlihat seperti gurita dan cumi-cumi. Kelincahan di dalam air membuat pokemon ini sangat kuat. Pokemon bertipe air sangat ampuh untuk melawan pokemon api dan lemah dengan pokemon listrik.",
        "Memiliki wajah yang garang namun memiliki sifat yang lemah lembut. Hidup di dalam hutan untuk berkamuflase dari serangan predator. Pokemon bertipe tumbuhan sangat ampuh untuk melawan pokemon tanah dan lemah dengan pokemon api.",
        "Salah satu pokemon hama yang dibenci oleh banyak orang. Gampang sekali ditemukan di semak-semak. Pokemon bertipe normal tidak condong ke elemen tertentu dan bisa dibilang bisa untuk melawan semua elemen.")
    private val pokemonImages = intArrayOf(R.drawable.pikachu,
        R.drawable.abra,
        R.drawable.vulpix,
        R.drawable.charmander,
        R.drawable.zubat,
        R.drawable.poliwag,
        R.drawable.squirtle,
        R.drawable.tentacool,
        R.drawable.bulbasaur,
        R.drawable.rattata
    )
    private val habitatGambar = intArrayOf(R.drawable.sungau, R.drawable.hutan,
        R.drawable.gunung,
        R.drawable.gunung,
        R.drawable.goa,
        R.drawable.pantai,
        R.drawable.pantai,
        R.drawable.pantai,
        R.drawable.hutan,
        R.drawable.sungau
    )

    private val pokemonElemen = arrayOf("Listrik",
        "Listrik",
        "Api",
        "Api",
        "Racun",
        "Air",
        "Air",
        "Air",
        "Tumbuhan",
        "Normal")

    private val pokemonAbility = arrayOf("Setrum",
        "Setrum",
        "Bola Api",
        "Nafas Api",
        "Virus",
        "Tinju Air",
        "Bola Air",
        "Sabet Air",
        "Gigit",
        "Gigit")
    private val pokemonHabitat = arrayOf("Daratan",
        "Hutan",
        "Gunung",
        "Gunung",
        "Goa",
        "Pantai",
        "Pantai",
        "Laut",
        "Hutan",
        "Daratan")
    private val pokemonMakanan = arrayOf("Ikan",
        "Ikan",
        "Serangga",
        "Serangga",
        "Kacang",
        "Tumbuhan",
        "Tumbuhan",
        "Ikan",
        "Serangga",
        "Omnivora")

    val listData: ArrayList<Pokemon>
        get() {
            val list = arrayListOf<Pokemon>()
            for (position in pokemonNames.indices) {
                val pokemon = Pokemon()
                pokemon.name = pokemonNames[position]
                pokemon.detail = pokemonDetails[position]
                pokemon.photo = pokemonImages[position]
                pokemon.habitatPhoto = habitatGambar[position]
                pokemon.ability= pokemonAbility[position]
                pokemon.habitat= pokemonHabitat[position]
                pokemon.makanan= pokemonMakanan[position]
                pokemon.elemen= pokemonElemen[position]
                list.add(pokemon)
            }
            return list
        }
}