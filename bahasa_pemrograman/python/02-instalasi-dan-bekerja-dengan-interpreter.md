time | author
-|-
2020-01-27 10:00:00 | [Muhammad Fahri](https://github.com/gh0zialfat1h)

# Apa itu interpreter ?
Interpreter
Dalam ilmu komputer, penerjemah atau lebih dikenal dengan interpreter merupakan perangkat lunak yang berfungsi melakukan eksekusi sejumlah instruksi yang ditulis dalam suatu bahasa pemrograman tanpa terlebih dahulu menyusunnya menjadi program bahasa mesin. Interpreter umumnya menggunakan salah satu strategi berikut untuk menjalankan program:

1. Mengeksekusi kode sumber secara langsung, atau
2. Menerjemahkannya ke dalam serangkaian p-code kemudian mengeksekusinya, atau
3. Mengeksekusi kode yang telah dikompilasi sebelumnya oleh compiler yang merupakan bagian dari sistem penerjemahan.

Proses ini sangat berbeda dengan compiler, dimana pada compiler, hasilnya sudah langsung berupa satu kesatuan perintah dalam bentuk bahasa mesin, dimana proses penterjemahan dilaksanakan sebelum program tersebut dieksekusi.[1]!
# Instalasi python
# Windows
Instalasi python di Windows sangat gampang. Langkah-langkanya sama seperti menginstal software Windows pada umumnya, next-next-finish.
Tapi ada konfigurasi yang harus dipilih ditengah-tengah proses instalasi, agar perintah Python dapat dikenali di CMD.
Python yang akan di instal dalam panduan ini adalah python versi 3. Download di situs resmi [python](https://www.python.org/downloads/windows/).


![Python website](https://user-images.githubusercontent.com/47023016/73149039-00ecbe80-40f2-11ea-9518-6c8e52843859.png)

1. Setelah download selesai, kita akan mendapatkan file python-3.4.2.msi. File python-3.4.2.msi adalah file instalator python. File ini akan melakukan instalasi ke sistem windows.  Klik ganda untuk mengeksekusinya.


![1  Klik ganda setup python](https://user-images.githubusercontent.com/47023016/73149102-5628d000-40f2-11ea-946e-99e981a137be.PNG)


2. Pada tahapan ini kita akan diminta untuk memilih siapa saja yang boleh memakai python. Pilih saja ‘Install for all users’ agar bisa dipakai untuk semua user di komputernya.


![2  Pilih install untuk semua user](https://user-images.githubusercontent.com/47023016/73149166-9c7e2f00-40f2-11ea-9d02-f91aa8e1d7c0.PNG)


3. Tentukan lokasi python akan diinstal. Biarkan saja di C:\python34\, kemudian klik next.


![3  Lokasi instalasi](https://user-images.githubusercontent.com/47023016/73149203-b4ee4980-40f2-11ea-9d3e-16c4073d889c.PNG)


4. Pada tahapan ini, kita akan menentukan fitur-fitur yang akan diinstal. Jangan lupa untuk mengaktifkan ‘Add python.exe to path’ agar perintah python dikenali pada CMD (Command Prompt). 


![4  Pilih fitur dan aktifkan ke lingkungan path](https://user-images.githubusercontent.com/47023016/73149242-e49d5180-40f2-11ea-9efc-8a0b93f50157.PNG)


Setelah diaktifkan, akan menjadi seperti ini:


![5  Aktifkan fitur add to env path](https://user-images.githubusercontent.com/47023016/73149279-1e6e5800-40f3-11ea-8336-b776b5d31fee.PNG)


5. Klik finish untuk menyelesaikan.


# Uji coba python di windows
Pertama, kita coba dulu membuka Python Shell. Silahkan buka Start Menu kemudian cari Python Shell.


![Uji coba shell python](https://user-images.githubusercontent.com/47023016/73149356-7e64fe80-40f3-11ea-8911-3ba4352e7bf0.PNG)


Kemudian kita coba Python dari CMD, ketik perintah python untuk masuk ke Python Shell dari CMD.


![Uji coba shell python di CMD](https://user-images.githubusercontent.com/47023016/73149374-950b5580-40f3-11ea-8cac-47eeb5327845.PNG)


Maaf sebelumnya penulis mengambil referensi dari salah satu [blog](https://www.petanikode.com/python-windows/),karena penulis sendiri tidak memakai windows, jadi sangat tidak bisa membuat referensi penginstallan di windows.



# Ubuntu

Secara default sendiri sebenarnya python sudah terinstall di ubuntu namun sebagai pelengkap penulis akan membahas bagaimana cara instalasi di ubuntu dan turunannya[2]

1. Update repositori terlebih dahulu:
```
$ sudo apt update
$ sudo apt install software-properties-common
```

2. Selanjutnya, tambahkan PPA deadsnakes kedalam sources list:
```
$ sudo add-apt-repository ppa:deadsnakes/ppa
```
Ketika muncul prompted tekan Enter untuk melanjutkan:
```
Output

Press [ENTER] to continue or Ctrl-c to cancel adding it.
```

3. Repositori telah berhasil di tambahkan, kemudian install Python 3.7 dengan cara:
```
$ sudo apt install python3.7
```
4. Setelah itu, Python 3.7 telah berhasil diinstall pada Ubuntu system dan siap digunakan. Kamu bisa mengechecknya dengan perintah:
```
$ python3.7 --version
```
```
Output

Python 3.7.5
```



# Berkerja dengan interpreter
# Interactive Mode

1. ketikan python3 pada terminal atau cmd kemudian akan muncul output:
```
$ python3
Python 3.7.6 (default, Dec 19 2019, 23:50:13) 
[GCC 7.4.0] on linux
Type "help", "copyright", "credits" or "license" for more information.
>>> 

```
2. Ketikan perintah print("hello world"):
```
Python 3.7.6 (default, Dec 19 2019, 23:50:13) 
[GCC 7.4.0] on linux
Type "help", "copyright", "credits" or "license" for more information.
>>> print("hello world")
hello world
>>> 
```

# Menjalankan source code

1. Buat file helloworld.py dan isi dengan perintah berikut:
```
print('hello world');
```
2. kemudian jalankan file tersebut dengan perintah:
```
python3 helloworld.py
```
```
Output
hello world
```
# Penutup
Akhir kata dari penulis semoga apa yang penulis tulis walaupun tidak bersumber langsung dari penulis tapi semoga apa yang disampaikan bermanfaat jika ada yang ingin ditanyakan bisa PC saya di telegram @gh0zialfat1h.
# Catatan kaki
[1](https://medium.com/@larasn_/mengenal-compiler-dan-interpreter-30610c6df554) Mengenal compiler dan interpreter.
[2](https://linuxize.com/post/how-to-install-python-3-7-on-ubuntu-18-04/) How to install python on ubuntu 18.04.
