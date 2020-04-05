package com.atilsamancioglu.kotlinogreniyorum

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       //Değişkenler (Variables)

        //Integer (Tam Sayı)

        println("-------Integer-------")

        var x = 5
        var y = 35

        println(x * y)

        println(x)

        x = 10
        y = 20

        println(x * y)

        // Sabit (Constant)

        val a = 10
        val b = 20

        // camelCase
        // snake_case

        var kullaniciYasi = 35

        val islemSonucu = kullaniciYasi / 5 * 10

        println(islemSonucu)

        //Defining (Tanımlama)
        var benimIntegerim : Int

        //Initialization (Değerini atamak, başlatmak)
        benimIntegerim = 10
        benimIntegerim = 20

        val yeniInteger : Int = 5

        println(yeniInteger / 2)

        //Long

        var benimLong : Long = 100
        benimLong = 3000000000


        //Double & Float
        println("-------Double & Float -------")

        val pi = 3.14

        println(pi * 2.0)

        val floatPi : Float = 3.14f

        println(floatPi * 2)

        val yeniDouble : Double = 5.0

        println(yeniDouble / 2)

        //String - Metin
        println("------- String -------")

        val benimStringim = "benim string"

        println(benimStringim.capitalize())

        val isim = "Atıl"
        val soyisim = "Samancıoğlu"

        val tamisim = isim + " " +  soyisim

        println(tamisim)

        val yeniString : String
        yeniString = "5"

        val ikinciString = "10"

        println(yeniString + ikinciString)

        //Boolean
        println("------- Boolean -------")

        var benimBooleanim = false
        benimBooleanim = true

        var canli = true

        // <
        // >
        // <=
        // >=
        // ==
        // !=
        // && -> VE (AND)
        // || -> VEYA (OR)

        println(3 < 5)
        println(8 < 4)
        println(5 == 5)
        println(4 != 4)


        //Veri Tipi Dönüştürme - Conversion
        println("------- Veri Tipi Dönüştürmeleri -------")

        var benimNumaram = 10
        var benimLongaCevrilenNumaram = benimNumaram.toLong()
        println(benimLongaCevrilenNumaram)

        var kullaniciGirdi = "20"
        var kullaniciGirdiInteger = kullaniciGirdi.toInt()
        println(kullaniciGirdiInteger * 2 )

        //Koleksiyonlar

        //Array - Dizi
        println("------- Dizi -------")

        val benimDizim = arrayOf("Atıl","Samancıoğlu","Zeynep")

        //index
        println(benimDizim[0])
        benimDizim[0] = "Mehmet"
        println(benimDizim[0])

        println(benimDizim.get(1))
        benimDizim.set(1,"Atıl")
        println(benimDizim.get(1))

        val numaraDizisi = arrayOf(5,6,7,8,9)
        println(numaraDizisi[0])
        println(numaraDizisi.get(3))

        val doubleDizisi = arrayOf(1.5,2.5,3.5)

        val karisikDizi = arrayOf("Atıl",50,true,"Samancıoğlu")

        println(karisikDizi.get(2))

        //ArrayList - Listeler
        println("------- Listeler -------")

        val isimlerimiz = arrayListOf<String>("Atıl","Samancıoğlu")
        println(isimlerimiz.get(0))

        isimlerimiz.add("Zeynep")
        println(isimlerimiz.get(2))

        isimlerimiz.add(0,"Mahmut")
        println(isimlerimiz.get(0))

        val integerArrayList = ArrayList<Int>()
        integerArrayList.add(2)
        integerArrayList.add(500)
        println(integerArrayList[1])

        val karisikArrayList = arrayListOf<Any>()
        karisikArrayList.add("Atıl")
        karisikArrayList.add(200)
        karisikArrayList.add(true)

        println(karisikArrayList.get(1))

        //Set
        println("------- Set -------")

        val ornekDizi = arrayOf(5,5,10,15,20,20)

        println("index 0: ${ornekDizi[0]}")
        println("index 1: ${ornekDizi[1]}")

        println(ornekDizi.size)

        val benimSet = setOf<Int>(5,5,10,15,20,20)

        println(benimSet.size)

        //For Each

        benimSet.forEach{
            println(it)
        }

        val ornekSet = HashSet<String>()
        ornekSet.add("Atıl")
        ornekSet.add("Atıl")
        ornekSet.add("Samancıoğlu")

        ornekSet.forEach {
            println(it)
        }

        //Map - HashMap - Sözlük - Harita
        println("------- Map -------")

        // Anahtar Kelime - Değer (Key-Value)

        val meyveDizisi = arrayOf("Elma", "Muz", "Karpuz")
        val kaloriDizisi = arrayOf(100,150,200)

        println("${meyveDizisi[0]}'nın Kalorisi: ${kaloriDizisi[0]}")

        val meyveKaloriMap = hashMapOf<String,Int>()
        meyveKaloriMap.put("Elma",100)
        meyveKaloriMap.put("Muz",150)
        meyveKaloriMap.put("Karpuz",200)

        println(meyveKaloriMap.get("Muz"))

        val benimHashMap = HashMap<String,String>()
        benimHashMap.put("AnahtarKelime","Değer")

        val yeniHashMap = hashMapOf<String, Int>("Atıl" to 40, "Samancıoğlu" to 50)
        println(yeniHashMap.get("Atıl"))

        //Matematiksel İşlemler
        println("------- Matematiksel İşlemler -------")


        var sayi = 5
        println(sayi)
        sayi = sayi + 1
        println(sayi)
        sayi++
        println(sayi)
        sayi--
        println(sayi)

        var digerSayi = 10

        println(digerSayi > sayi)

        // && -> VE
        // || -> VEYA

        println(digerSayi > sayi && 2 > 3)
        println(digerSayi > sayi || 2 > 3)

        println(10+2)
        println(20-2)
        println(40*20)
        println(10/5)

        //Remainder - Kalanı Bulmak

        println(10%3)


        // Eğer Kontrolleri (If Statements)
        println("------- Eğer Kontrolleri -------")

        val kullanicidanAlinanBilgi = 50

        if (kullanicidanAlinanBilgi < 20) {
            println("Çok gençsin")
        } else if (kullanicidanAlinanBilgi >= 20 && kullanicidanAlinanBilgi < 30) {
            println("20 - 30 yaş arasındasın")
        } else if (kullanicidanAlinanBilgi >= 30 && kullanicidanAlinanBilgi < 40) {
            println("30 - 40 yaş arasındasın")
        } else {
            println("40 yaş üzerindesin")
        }

        // When - Switch
        println("------- When -------")

        var gun = 3
        var gunString = ""


        /*

        if (gun == 1) {
            gunString = "Pazartesi"
        } else if (gun == 2) {
            gunString = "Salı"
        } else if (gun == 3 ) {
            gunString = "Çarşamba"
        } else {
            gunString = "Pazar"
        }

         */

        when(gun) {
            1 -> gunString = "Pazartesi"
            2 -> gunString = "Salı"
            3 -> gunString = "Çarşamba"
            else -> gunString = "Pazar"
        }

        println(gunString)

        // Döngüler - Loops
        //For Döngüsü
        println("------- For -------")

        val numaralarimizDizisi = arrayOf(6,9,12,15,18,21)
        val q = numaralarimizDizisi[0] / 3 * 5
        println(q)

        for (numara in numaralarimizDizisi) {
            val z = numara / 3 * 5
            println(z)
        }

        for (i in numaralarimizDizisi.indices){
            val k = numaralarimizDizisi[i] / 3 * 5
            println(k)
        }

        for (b in 0..9) {
            println(b)
        }

        val benimStringDizim = ArrayList<String>()

        benimStringDizim.add("Atıl")
        benimStringDizim.add("Samancıoğlu")
        benimStringDizim.add("Osman")

        for (str in benimStringDizim) {
            println(str)
        }

        benimStringDizim.forEach {
            println(it)
        }


        //While Döngüsü
        println("------- While Döngüsü -------")

        var j = 0

        while (j < 20 ) {
            println(j)
            j = j + 1
        }

    }
}