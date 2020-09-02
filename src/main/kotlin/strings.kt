import java.util.Scanner

public var input = Scanner(System.`in`)

fun main() {
    println("======Identitas Saya======")
    print("Nama : ")
    var Nama: String = input.nextLine()

    //input validation, nama wajib diisi
    if (Nama.isNullOrEmpty()){
        println("Nama wajib diisi")
        main()
    }

    print("Kelas : ")
    var Kelas: String = input.nextLine()
    print("Nomor Absen : ")
    var Absen: String = input.nextLine()
    print("Masukan email : ")

    //elvis operator
    val email:String? = null
    val emailLength = email?.length ?:"Ups Saya lupa memberi program input untuk email"
    println(emailLength)
    println("==========================")
    println()
    menu()
}

//menu pemilihan
fun menu() {
    println("===========Menu===========")
    val Pilihan = """
        1. Kerucut
        2. Tabung
        3. Keluar
    """.trimIndent()
    println(Pilihan)
    print("Pilih menu yang tersedia: ")
    val Pilih:Int = input.nextInt()
    when(Pilih){
        1 -> Kerucut()
        2 -> Tabung()
        3 -> Keluar()
        else -> {
            println("Oops menu tidak tersedia")
            menu()
        }
    }
}

fun Kerucut() {
    println("=========Kerucut==========")
    print("Masukkan tinggi kerucut: ")
    val tinggi:Double = input.nextDouble()
    print("Masukan tabung kerucut: ")
    val radius:Double = input.nextDouble()

    //volume kerucut
    val volume:Double = (0.33333) * Math.PI * (radius*radius) * tinggi
    println("Volume kerucut = $volume")

    //pembulatan 2 angka di belakang koma(,)
    System.out.printf("%.2f",volume)
    println()
    println()

    //back to menu
    menu()
}

fun Tabung() {
    println("==========Tabung==========")
    print("Masukkan tinggi tabung: ")
    var tinggi: Double? = null
    tinggi = input.nextDouble()
    print("Masukkan jari-jari tabung: ")
    var jarijari: Double? = null
    jarijari = input.nextDouble()

    //volume tabung
    val volume = Math.PI * jarijari * jarijari * tinggi
    println("Volume tabung = $volume")

    //pembulatan 2 angka di belakang koma(,)
    System.out.printf("%.2f",volume)
    println()
    println()

    //back to menu
    menu()
}

fun Keluar(){
    System.exit(0)
}