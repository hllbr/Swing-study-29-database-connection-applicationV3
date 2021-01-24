/*
JDBC ve MYSQL VERİTABANI İŞLEMLERİ == 
VERİTABANI NEDİR ? 
Veritabanı uygulamalar içinde kullandığımız verilerin belli sunucuların içinde depolanmasını sağlayan yapılardır.Veritabanlarını kullanarak verilerimizi saklayabilir ve istediğimiz yerden ulaşabiliriz.
Kullandığımız sunucu yerel(LokalHostumuzda bir sunucu olabilir) veya uzakta bulunan bir sunucu olabilir.
Bu sunucular üzerinde verilerin depolanmasını sağlayan yapılardır.

veritabanları sayesinde verilerimizi hem saklayabilir hemde istediğimizi yerden ulaşabilir ve işlemlewr gerçekleştirebiliriz.
Veritabanının kullanarak uzak bir sunucuda depoladığım bilgileri başka bir bilgisayardaki java projesinde (eğer erişim izni varsa) direkt olarak erişebiliriz.


*****
VeriTabanı Türleri 
Günümüzde kullanılan bazı veritabanı türleri şunlardır :
Relation Database(İlişkiseş Veritabanları): Verileri tablolarda depolarlar.MySQL ve SQLİTE gibi veritabanları bu kategoriye girer.

Document Based Database(Dokuman Bazlı Veritabanları);Verileri dokuman halinde depolarlar.MongoDB ve Azure Document Db bu Kategoriye girer.
JSON OBJESİ GİBİ DEPOLANIYORLAR.

Bendan Sonraki Projelerimde Mysql VeriTabanı üzerinde çalışmalar yürüteceğim.

******

VERİTABANI Işlemleri = 

MySQL Veritabanındaki tablolar ve vberiler üzerinde işlem yapmak için SQL(STRUCTURED QUERY LANGUAGE) sorguları kullanılır.
SQL Dili sorgulamalı bir dildir.

JDBC(Driver) Nedir ? == 

JDBC,java projelerimizin ilişkisel veritabanlarına bağlanabilmesi için oluşturulmuş bir yapıdır.JDBC üzerinde SQL sorgularını çalıştırıcaz.

******
Yapının Temeli 
Java Application -->> JDBC -->> DataBase

JDBC DRIVER ÖZELLİKLERİ == 

**Farklı ilişkisel veritabanlarına (SqlServer,PastgreSql) uyumludur ve her veritabanı için ayrı ayrı kod geliştirmemiz gerekmez.
(Çok küçük değişiklikler dışında)
**JDBC Drıver sayesinde veritabanlarına bağlanmamızı sağlar.
**JDBC DRIVER aynı zamanda veritabanı için gerekli fonksiyon çağrılarımızı farklı veritabanlarına uygun hale getirir.

*/

public class Baglanti {
    public static void main(String[] args) {
        
    }
    
}
