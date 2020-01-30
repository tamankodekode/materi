| time                | author                                    |
| ------------------- | ----------------------------------------- |
| 2020-01-30 06:48:21 | [Ginanjar S.B](https://github.com/egin10) |

# Konversi Tipe Data

Konversi tipe data merupakan cara untuk merubah tipe data dalam javascript, merubah tipe data yang dilakukan adalah misal merubah tipe data **number** menjadi sebuah **string** dan begitu juga sebaliknya. Melakukan perubahan tipe data ini kadang kita perlukan, seperti untuk melakukan perhitungan dan sebagainya. Berikut ini adalah beberapa cara yang dapat dilakukan untuk melakukan konversi tipe data pada javascript.

### Konversi String ke Number

Untuk melakukan konversi tipe data dari sebuah string ke number, dapat menggunakan fungsi **Number()**, **parseFloat()**, **parseInt()** atau dengan **Unary + operator**.

```javascript
Number("3.14"); // returns 3.14
Number(" "); // returns 0
Number("99 88"); // returns NaN

parseInt("10"); // returns 10
parseInt("3.14"); // returns 3

parseFloat("10"); // returns 10
parseFloat("3.14"); // returns 3.14

let y = "5"; // y is a string
let x = +y; // x is a number
```

### Konversi Number ke String

Untuk melakukan konversi tipe data dari sebuah number ke string, dapat menggunakan fungsi **String()** atau **toString()**.

```javascript
String(x); // returns a string from a number variable x
String(123); // returns a string from a number literal 123

x.toString();
(123).toString();
```

### Konversi Boolean ke String

Untuk melakukan konversi tipe data dari sebuah boolean ke string, dapat menggunakan fungsi **String()** atau **toString()**.

```javascript
String(false); // returns 'false'
String(true); // returns 'true'

false.toString(); // returns 'false'
true.toString(); // returns 'true'
```

### Konversi Boolean ke Number

Untuk melakukan konversi tipe data dari sebuah boolean ke number, dapat menggunakan fungsi **Number()**.

```javascript
Number(false); // returns 0
Number(true); // returns 1
```

### Tambahan

Dari beberapa cara yang bisa dilakukan diatas untuk mengkonversikan sebuah tipe data ke tipe data yang lain di javascript. Javascript juga dapat secara otomatis mengubah tipe data yang salah ke tipe data yang benar.

```javascript
5 + null; // returns 5      because null is converted to 0
"5" + null; // returns '5null'   because null is converted to 'null'
"5" + 2; // returns 52     because 2 is converted to '2'
"5" - 2; // returns 3      because '5' is converted to 5
"5" * "2"; // returns 10     because '5' and '2' are converted to 5 and 2
```
