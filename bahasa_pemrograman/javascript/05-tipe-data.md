| time                | author                                    |
| ------------------- | ----------------------------------------- |
| 2020-01-28 06:47:06 | [Ginanjar S.B](https://github.com/egin10) |

# Tipe Data

Dalam javascript terdapat beberapa tiper data. beberapa tipe data dasar yang ada pada javascript adalah sebagai berikut :

- String
- Number
- Boolean
- Array
- Object
- Function
- Undefined
- Null

## String

String merupakan sebuah tipe data yang biasanya digunakan untuk merepresentasikan **kata** atau **kalimat**.

```javascript
let nama = "Ginanjar S.B";
```

## Number

Number merupakan tipe data yang digunakan untuk merepresentasikan angka, dimana angka dapat berupa bilangan bulat, real, exponensial, desimal dan sebagainya.

```javascript
let tinggi = 171;
let beratBadan = 56.8;
```

## Boolean

Boolean merupakan tipe data yang digunakan untuk menyatakan **ya** (_true_) atau **tidak** (_false_).

```javascript
let freelancer = TRUE;
```

## Function

Function merupakan beberapa potongan kode-kode instruksi yang dapat dipanggil berulang-ulang, dimana function dapat dipanggil dengan parameter yang harus diisi ataupun tidak.

```javascript
//Tanpa parameter
const isStudent = function() {
  return "ya";
};

//Dengan parameter
const isStudent = function(status) {
  return status === "student" ? "ya" : "tidak";
};
```

## Array

Array merupakan tipe data yang berupa list yang menampung satu ata lebih data didalamnya. Array dapat menampung semua jenis tipe data yang ada pada javascript.

```javascript
const dataDiri = [
  //string
  "Ginanjar S.B",
  //number
  171,
  //null
  NULL,
  //boolean
  TRUE,
  //array
  ["J", "S"]
];
```

## Object

Object merupakan tipe data yang mirip seperti array, namun setiap data yang ditampung didalam object harus memiliki `key` dan `value`, dapat juga di sebut dengan _Array Associative_. Object juga dapat menampung semua jenis tipe data yang ada pada javascript.

```javascript
const person = {
  //string
  nama: "Ginanjar S.B",
  //number
  tinggi: 171,
  //boolean
  isStudent: TRUE,
  //array
  listNumber: [1, 2, 3, 4],
  //null
  jumlahMobil: NULL
};
```

## Null

Null merupakan tipe data yang memberikan kondisi dimana sebuah variable memiliki nilai kosong atau tidak ada.

```javascript
let a = null;
```

## Undefined

Undefined merupakan tipe data yang memberitahu kondisi sebuah variabel sudah dideklarasi, tapi belum didefinisikan (belum diberi nilai).

```javascript
let a;
```

## Cara melakukan mengetahui tipe data

Dalam javascript kita dapat mengetahui sebuah tipe data yang ada pada sebuah variable. Cara yang bisa dilakukan untuk mengetahuai sebuah tipe data pada variable javascript adalah dengan menggunakan syntax `typeof`.

```javascript
let nama = "Ginanjar";

console.log(typeof nama);
//Output => String
```
