time | author
-|-
2020-01-28 22:00:00 | [Muhammad Fahri](https://github.com/gh0zialfat1h)

# 1. Penulisan Statement Python
Statement adalah sebuah intruksi atau kalimat perintah yang akan dieksekusi oleh komputer.

Contoh
```
print("Hello World!")
print("Belajar Python dari Nol")
nama = "petani kode"
```
Penulisan satu statement tidak diakhiri dengan tanda titik-koma.
Sedangkan, bila kita ingin menulis lebih dari satu statement dalam satu baris, maka kita harus memisahnya dengan titik-koma.

Contoh
```
print("Hello"); print("World"); print("Tutorial Python untuk Pemula")
nama_depan = "petani"; nama_belakang = "kode"
```
Tapi…
Menurut beberapa style guide python, tidak dianjurkan menulis lebih dari satu statement dalam satu baris. Karena akan sulit dibaca.

# 2. Penulisan String pada Python
String adalah teks atau kumpulan dari karakter.
String dalam pemrograman biasanya ditulis dengan dibungkus menggunakan tanda petik.
Bisa menggunakan tanda petik tunggal maupun ganda.
Contoh:
```
judul = "Belajar Pemrograman Python sampai Bisa"
penulis = 'Petani Kode'
```
Atau kita juga bisa menggunakan triple tanda petik.
Contoh:
```
judul = """Belajar Python dengan Cepat"""
penulis = '''Petani Kode'''
```
# 3. Penuilsan Case pada Python
Sintak Python bersifat case sensitive, artinya teksini dengna TeksIni dibedakan.
Contoh:
```
judul = "Belajar Dasa-dasar Python"
Judul = "Belajar Membuat Program Python"
```
Antara variabel judul dengan Judul itu dibedakan…

Case Style
Menurut rekomendasi style guide Google, berikut ini contoh penulisan case yang disarankan:
```
## Snake Case digunakan pada:
module_name, package_name, method_name, function_name, , global_var_name, instance_var_name, function_parameter_name, local_var_name.

## CamelCase digunakan Pada:
ClassName, ExceptionName

## ALL CAPS digunakan Pada:
GLOBAL_CONSTANT_NAME

```
# 4. Penulisan Blok Program Python
Blok program adalah kumpulan dari beberpaa statement yang digabungkan dalam satu blok.
Penulisan blok program harus ditambahkan indentasi (tab atau spasi 2x/4x).
✔ Contoh yang benar:

```
# blok percabangan if
if username == 'petanikode':
    print("Selamat Datang Admin")
    print("Silahkan ambil tempat duduk")

# blok percabangan for
for i in range(10):
    print i
```

❌ Contoh yang salah:

```
# blok percabangan if
if username == 'petanikode':
print("Selamat Datang Admin")
print("Silahkan ambil tempat duduk")

# blok percabangan for
for i in range(10):
print i
```
Ada beberapa macam blok program:

* Blok Percabangan
* Blok Perulangan
* Blok Fungsi
* Blok Class
* Blok Exception
* Blok With



# 5. Cara Penulisan Komentar pada Python

Komentar merupakan baris kode yang tidak akan dieksekusi.
Komentar digunakan untuk memberikan informasi tambahan dan untuk menonaktifkan kode.
Ada beberapa cara menulis komentar pada pemrograman Python.

## Menggunakan Tanda Pagar (#)
Cara pertama menggunakan tanda pagar (#).
Cara ini paling sering digunakan.

Contohnya:
```
# ini adalah komentar
# Ini juga komentar
```
## Menggunakan Tanda Petik
Selain untuk mengapit teks (string), tanda petik juga dapat digunakan untuk membuat komentar.

Contoh:
```
"Ini adalah komentar dengan tanda petik ganda"
'Ini juga komentar, tapi dengan tanda petik tunggal'
```
Penulisan komentar dengan tanda petik jarang digunakan, kebanyakan orang lebih memilih untuk menggunakan tanda pagar. Jadi…tidak direkomendasikan.

## Menggunakan Triple Tanda Petik

Sedangkan triple tanda petik, sering digunakan untuk menuliskan dokumentasi.

Contohnya:
```
class Pagar:
    """kelas pagar untuk membuat objek pagar. Dibuat oleh Petani Kode sebagai contoh saja."""
    def __init__(self, warna, tinggi, bahan):
        self.warna = warna
        self.tinggi = tinggi
        self.bahan = bahan

# Mengakses dokumentasi kelas
print Pagar.__doc__
input('\ntekan [enter] untuk melihat bantuan (dokumentasi) kelas: ')
help(Pagar) # untuk melihat dokumentasi kelas
```

Hasilnya:

```
$ python kelas_pagar.py
kelas pagar untuk membuat objek pagar.
dibuat oleh Petani Kode
sebagai contoh saja.

tekan [enter] untuk melihat bantuan (dokumentasi) kelas:
```
Setelah Enter ditekan
```
Help on class Pagar in module main:
class Pagar
| kelas pagar untuk membuat objek pagar.
| dibuat oleh Petani Kode
| sebagai contoh saja.
|
| Methods defined here:
|
| __init__(self, warna, tinggi, bahan)
(END)
```

# 6. Line Continuation
Untuk menulis code multiline(dengan banyak baris) tanpa membingungkan interpreter python, kita bisa menggunakan backslash \ pada akhir setiap baris untuk secara eksplisit menunjukkan baris selanjutnya.

Contohnya:
```
sum =  123 + \
       456 + \
       789
```

Ekspresi terlampir dalam kurung (), [] atau {} tidak perlu garis miring untuk menunjukan baris selanjutnya. 

Sebagai contoh:
```
vowels = ['a', 'e', 'i',
          'o', 'u']
```

# 7. Baris kosong di antara program diabaikan oleh python.


# Penutup
Akhir kata dari penulis semoga apa yang penulis tulis walaupun tidak bersumber langsung dari penulis tapi semoga apa yang disampaikan bermanfaat jika ada yang ingin ditanyakan bisa PC saya di telegram @gh0zialfat1h.
# Catatan kaki
[1](https://www.petanikode.com/python-sintaks/) 5 Aturan Penulisan Sintaks Python yang Harus dipatuhi.


[2](https://www.studytonight.com/python/python-syntax-and-example) Basic Syntax and Hello World! program in Python