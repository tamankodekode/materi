
time|author
-|-
2020-03-24 21:54:23|Yoghaswara

 
## Variable 

Variable merupakan wadah yang kita deklarasikan untuk menampung nilai dengan tipe tertentu. Layaknya sebuah wadah, kita perlu mengetahui wadah yang tepat untuk menampung barang yang muat. Karena setiap wadah akan menyimpan dan dibaca sesuai data kebutuhan pengguna, hal ini juga memiliki pengaruh saat bagaimana nilai akan difungsikan.

Untuk mendeklarasikan suatu variable memiliki aturan berikut:
```go
var <nama variable> <tipe data> = <nilai>

// contoh 
var nama string = "E. Kartini"
``` 
diatas merupakan contoh deklarasi variable secara static, ada pula cara mengunakan deklarasi variable dinamis : tipe data diketahui berdasarkan nilai yang dicanangkan. 
```go
<nama variable> := <nilai>

// contoh
tinggi := 165 // int
```

Berikut beberapa contoh tipe data dasar :

Tipe |Nilai | 
-|-
`bool` | `true` dan `false`
`string` | kumpulan karakter
`int` | bilangan bulat : 1,2 ...
`float32` | bilangan pecahaan
  
  ### Deklarasi variable paralel
  Anda bisa saja mendeklarasikan variable secara berunut dengan tipe data yang sejenis :
 
```go
var umur,tinggi int = 21,168
```
nama variable dan nilai variable dibatasi oleh koma untuk pencananganya secara paralel. itu serupa dengan
```go
var umur int = 21
var tinggi int = 168
```

### Deklarasi variable pembuangan
Go memiliki fungsi yang bisa mengembalikan nilai lebih dari satu , maka kita harus menanganinya. Pada Go variable yang tidak terpakai tidak di izinkan untuk di bangun / di jalankan , maka harus dibuang.

Untuk membuang variable , beri nama variable dengan underscore (_) :

```go
nama,_ := "Namaku El","Aku cantiquee"

//fmt.Println(nama,_) == error
```

### Pointer

Pointer merupakan cara untuk mengakses alamat memory (0x0302032,contoh) pada variable. Variable pointer dideklarasikan dengan asteriks (`*`) disamping tipe data, contoh `*string`. 

Variable pointer berisi alamat memory, tidak berisi data sesungguhnya maka tidak bisa diassign dengan nilai selain alamat memory.

Untuk mengambil alamat memori dari variable biasa mengunakan ampersand(`&`) , _address of_ (alamant dari).

Untuk mengambil nilai dari alamat memory mengunakan asterik (`*`) pada variable , _value pointed by_ (nilai yang ditunjuk oleh).

```go
var nama string = "Elisa Puspita"
  // Elisa Puspita
var alamatNama *string = &nama
  // alamat dari variable nama
var namadariAlamat string = *alamatNama
  // nilai
```
[WIP]
