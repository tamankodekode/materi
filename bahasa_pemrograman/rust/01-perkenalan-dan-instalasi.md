---
date: 2019-06-09 23:00:00
penulis: Chandra Agung Rizky (@chandraagungrizky)
---

# Berkenalan dengan RUST

**RUST** adalah salah satu bahasa pemrograman yang dapat membantu kita dalam membuat subuah perangkat lunak yang lebih cepat dan handal. RUST memberi kita opsi untuk mengontrol detail tingkat rendah (seperti penggunaan memori) yang tidak terlalu rumit.

### Installasi RUST

Sebelum kita mengenal bahasa ini lebih jauh ada baiknya kita juga menginstallnya terlebh dahulu, panduan installasi bisa dilihat [disini](https://www.rust-lang.org/tools/install).

#### installasi `rustup` di linux dan macOS

rust di install dan dikelola oleh `rustup` ,installasi rustup di oprasi sistem ini terbilang mudah, anda tinggal mengetikkan baris perintah ini di terminal.

``` bash
curl https://curl https://sh.rustup.rs -sSf | sh
```

bila sudah selesai selanjutnya adalah mengkonfigurasi `PATH` evironment variabel. di RUST semua tools di install di `~/.cargo/bin` direktori

##### `linux` dengan bash shell

``` bash
echo  export PATH="$HOME/.cargo/bin:$PATH"
```

``` bash
source ~/.bashrc
```

setelah selesai setup coba jalankan perintah `rustc --version` bila muncul versi yang digunakan maka proses installasi berhasil

##### `linux` dengan fish shell

anda dapat meng-edit file `~/.config/fish/config.fish` lalu tambahkan baris kode berikut

``` bash
 set -x PATH $HOME/.cargo/bin $PATH
```

``` bash
source ~/.config/fish/config.fish
```

setelah selesai setup coba jalankan perintah `rustc --version` bila muncul versi yang digunakan maka proses installasi berhasil
