# LinkedHashSetExample
Bu proje, Java programlama dilinde LinkedHashSet sınıfının kullanımını örneklemektedir. LinkedHashSet, Set arayüzünün bir uygulamasıdır ve elemanları eklenme sırasına göre saklar. Aynı zamanda, bir Set koleksiyonu olarak her elemanı yalnızca bir kez içerebilir.

## Örnek Açıklama
Bu örnek, LinkedHashSet sınıfının nasıl kullanılacağını göstermektedir. İlk olarak, bir LinkedHashSet oluşturulur ve bazı tamsayı değerleri eklenir. Daha sonra, LinkedHashSet'in boyutu ve boş olup olmadığı kontrol edilir ve içindeki değerler yazdırılır.

Ardından, Car sınıfı oluşturulur ve bu sınıf LinkedHashSet'e eklenir. Car sınıfı, araba özelliklerini temsil eder ve her arabaya benzersiz bir plaka numarası atanır. Equals ve hashCode metodları, arabaları plaka numaralarına göre karşılaştırmak için uyarlanmıştır. Böylece, aynı plakaya sahip arabalar yalnızca bir kez eklenir.

## Kod Açıklamaları
### Car Sınıfı
- plaka, brand, ve model adında özel sınıf değişkenleri bulunur.
- Boş bir kurucu method (public Car()) ve tüm özellikleri alan bir kurucu method (public Car(String plaka, String brand, String model)) bulunur.
- Her özellik için get ve set metodları mevcuttur.
- equals, hashCode, ve toString metodları override edilmiştir.

### LinkedHashSetExample Sınıfı
- İlk olarak, bir tamsayı değerleri içeren LinkedHashSet oluşturulur ve işlemler gerçekleştirilir.
- Daha sonra, Car sınıfı nesnelerini içeren LinkedHashSet oluşturulur ve bu arabaların özellikleri yazdırılır.



![image](https://github.com/esmanur-karatas/JavaCollectionExample/assets/83882274/9b0c948a-f975-43d8-84d1-80498d6fcbce)
