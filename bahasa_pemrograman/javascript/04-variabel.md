| time                | author                                                     |
| ------------------- | ---------------------------------------------------------- |
| 2020-01-27 12:00:00 | [Hadi Hidayat Hammurabi](https://github.com/hadihammurabi) |

# Variabel

Variabel (__variable__) merupakan tempat/wadah untuk menyimpan data sebagai nilainya. Data yang disimpan dapat berupa teks, angka, simbol, dan banyak lagi jenis data lainnya - kita akan bahas di materi selanjutnya -.

Di Javascript, terdapat 3 cara membuat/mendefinisikan variabel.

1. **Let**

   Dengan menggunakan let, variabel yang dibuat dapat diubah nilainya kapan pun selama masih pada cakupan (scope) yang sama sehingga dapat langsung diberi nilai awal (inisialisasi) atau tidak.

   Pendefinisian variabel dengan let, dapat dilakukan seperti sebagai berikut.

   * **Tanpa nilai awal**

     ```js
     let diameter;
     let jarijari;

     diameter = 10;
     jarijari = 5;
     ```
   * **Dengan nilai awal** 
	
     ```js
     let panjang = 10;
     let lebar = 5;
     ```

2. **Const**

   Variabel yang dibuat dengan menggunakan const merupakan sebuah konstanta yang artinya bernilai konstan atau tidak berubah. Dari sini, kita dapat memahami bahwa ketika kita mendefinisikan sebuah variabel konstanta, kita harus memberinya nilai awal. Karena nilainya tidak dapat dimanipulasi lagi setelahnya.

   > **Info**: membuat variabel konstanta tanpa memberi nilai, dapat menyebabkan terjadi galat (error).

   Berikut ini cara mendefinisikan variabel konstanta.

   ```js
   const phi = 3.14;
   const jeniskelamin = 'Laki-Laki';
   ```

3. **Var**

   Cara ini sudah lama digunakan. Karakteristiknya mirip dengan let, yaitu nilainya dapat diubah. Bedanya, var dapat diakses dari luar cakupan wilayah dimana dia difinisi; cakupan (scope) akan dibahas di materi lainnya.

   Berikut ini cara mendefinisikan variabel menggunakan var.

   ```js
   var hidung = 1;
   var rambut = 0;
   ```

   Adapun contoh perbedaan var dengan let, berikut ini.

   ```js
   {
       var a = 1;
   }
   a = 5;
   ```

   ```js
   {
       let b = 2;
   }
   b = 6;
   ```

   Pada contoh di atas, pendefinisian variabel yang menggunakan let akan menghasilkan error.

