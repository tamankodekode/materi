| time                | author                                    |
|-|-|
| 2020-01-26 21:47:33 | [Ginanjar S.B](https://github.com/egin10) |

# Memasukan _Javascript_ ke halaman Web.

**Javascript** termasuk jenis bahasa _script_, yang digunakan pada file **HTML**. Terdapat 4 cara yang dapat digunakan untuk memasukan javascript pada sebuah halaman atau file html.

1. Memasukan dengan tag `<script>` (Internal Javascript).

   Tag `<script>` merupakan sebuah tag HTML yang berfungsi untuk memasukan script atau syntax javascript kedalam sebuah file html. Umumnya hal ini disebut dengan memasukan javascript secara _internal_, karena secara langsung syntax javascript dituliskan dalam file yang sama dengan html. Memasukan javascript dengan cara ini biasanya digunakan ketika syntax yang digunakan tidak terlalu panjang dan hanya digunakan oleh halaman html tersebut saja dan ditulis dengan diawal tag `<script` dan ditutup dengan `</script>`. Contah penggunaannya adalah `<script>//kode javascript</script>`.

2. Memasukan dengan tag `<script src="">` (External Javascript).

   Tag html `<script>` dengan attribute `src=""` berfungsi untuk memasukan syntax javascript pada sebuah file html. Attribute `src=""` berfungsi untuk memetakan letak file javascript dengan ekstensi file `.js` untuk dimasukan kedalam file html. Cara ini disebut dengan _external_ javascript. Cara ini biasanya digunakan apabila syntax javascript cukup panjang, agar file html cukup rapih. Contoh penggunaannya adalah `<script src="namafile.js"></script>`

3. Memasukan melalui Event Handler (Inline Javascript).

   Cara ini adalah memasukan syntax javascript melalui sebuah attribute event handler yang terdapat pada tag html. Hal ini terjadi ketika tag html diberi attribute seperti `onchange, onload, onclick,` dsb. Attribute tersebut akan memanggil syntax javascript secara langsung dalam tag html, cara ini disebut dengan _inline_ javascript. Umumnya cara ini digunakan ketika ingin memanggil sebuah fungsi javascript pada tag html. Contoh penggunaannya adalah `<button onclick="alert('Hello World!!')">Klik Saya</button>`.

4. Memasukan menggunakan URL.

   Cara terakhir memasukan syntax javascript pada html adalah dengan cara menyisipkan javascript pada attribute `href` dari sebuah tag html. Cara ini disebut dengan _protocol javascript_. Cara ini termasuk dalam _inline_ javascript, karena menyisipkan sebuah syntax javascript dalam tag html secara langsung. Contoh penggunaannya adalah `<a href="javascript:alert('Hello World!!')">Hallo Dunia...</a>`.

# Kesimpulan

Dari beberapa cara memasukan javascript yang telah disebutkan diatas, cara yang paling baik adalah dengan _external javascript_ atau memisahkan file html dengan file javascript. Mengapa demikian ?

- Menyederhanakan halaman HTML dengan memisahkan javascript dengan html, jadi file html akan lebih fokus pada menyediakan konten saja.
- Sebuah file _external javascript_ bisa digunakan oleh lebih dari satu halaman html, jadi lebih mudah untuk melakukan perubahan, dalam hal ini kita hanya perlu mengedit satu file javascript daripada mengubah syntax javascript satu persatu pada _inline javascript_.
- Jika file JavaScript external digunakan oleh beberapa halaman, file tersebut hanya perlu di download oleh web browser pada saat pertama kali saja. Pada saat loading halaman lainnya, web browser cukup mengambilnya dari browser cache, sehingga mempercepat loading halaman.
