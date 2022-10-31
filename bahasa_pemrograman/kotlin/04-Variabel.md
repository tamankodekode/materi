
| time                | author                                                  |
| --------------------|---------------------------------------------------------|
| 2022-10-25 06:34:00 | [ari dwi prayogo](https://github.com/aridwiprayogo})    |

# Variabel

Kali ini, bagaimana cara membuat variabel yang ada di kotlin. 
Variabel merupakan sebuah wadah tempat untuk menyimpan nilai/data kedalam sebuah
memory/ram
Di kotlin, semua variabel mempunyai tipe data yang menunjukkan tipe data static. Jadi, setiap variabel harus dideklarasikan dengan tipe data atau tipe data variable tsb akan dipilih oleh sistem
### Mendefinisikan Variabel
Cara mendefinisikan variabel di kotlin cukup dengan keyword `val` dan `var`

```
val nama = "ari dwi prayogo"
var umur = 24
```

Pada contoh diatas jika diperhatikan variable `nama` memiliki tipe data `String`
dan variable `umur` tsb memiliki tipe data `Int`. Jadi, di kotlin tidak harus menyebutkan tipe datanya
saat membuat variable, sebagai gantinya system akan menentukannya sendiri yang biasa disebut type inference.

Anda bisa juga menyebutkan tipe data secara eksplisit
seperti: <br/> 

```
val nama: String = "Ari Dwi Prayogo"
var umur: Int = 24
```

### Perbedaan var dan val

val(variable immutable), variabel yang dideklarasikan dengan `val` tidak bisa diubah nilainya setelah kita 
memasukkan nilai kedalamnya. Ini mirip dengan _variabel final di java_ 

var(variable mutable), variabel yang dideklarasikan dengan `var` bisa dirubah nanti didalam program. Ini default deklarasi variabel di java

sebagai contoh deklarasi `var` dan `val`:

```
var umur = 2
umur = 25
```

dari contoh diatas merubah umur tidak akan mengalami error
dan berjalan dengan sempurna
```
val umur = 24                  
umur = 25           //error    
```
Sedangkan jika kita mencoba merubah variabel val akan mengalami error
