Deskripsi:
jadi di program ini memiliki 3 file utama
-Penumpang.java memiliki field utama yaitu nama,umur, dan hamil. file ini adalah subclass dari Bus.java
-Bus.java memiliki array dengan tipe penumpang sebanyak 2 buah, satu untuk penumpang biasa, dan untuk prioritas. dalam file ini akan 
banyak method yang dipakai, diantaranya get array untuk keduanya, get jumlah penumpang (disini tak dipakai, hanya dibuat 
agar sama seperti soal) 
-Simulator.java disini adalah file simulator dimana terdapat mainnya program untuk dijalankan dan akan memanggil file Bus dan Penumpang untuk dijalankan sesuai perintah soal

ada beberapa kendala dalam program ini dimana tidak diperbolehkan menggunakan nama yang memiliki satu kata atau lebih. jika ingin menggunakan
nama seperti itu harus dipisah dengan tanda "_" contoh: "atok dalang" menjadi "atok_dalang"

Instalasi:
di vscode hanya tinggal run yang Simulator.javanya dan otomatis akan menjalankan semuanya. kalo di cmd harus buka cmd yang berada di folder tugas ini
dan menekan query "javac *.java" jika tak ada compile error maka jalankan "java Simulator" dan program akan berjalan semestinya

Cara menjalankan:
akan ada banyak query perintah diantaranya:
1. naikkan penumpang
2. turunkan penumpanng( disini jika ada nama penumpang Dalang dan kita ingin menurunkan penumpang bernama dalang (dengan 'd' kecil) maka akan dianggap sama)
3. lihat penumpang
4. keluar

TERIMA KASIH

