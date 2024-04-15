# SortedSet Örnekleri

Bu repository, Java'da `SortedSet` arayüzünün kullanımına ilişkin örnekler içermektedir. `SortedSet` arayüzü, elemanları belirli bir sıraya göre tutan ve bu sıraya göre erişim sağlayan bir koleksiyon türüdür. Örnekler, bu arayüzü uygulayan `TreeSet` sınıfıyla oluşturulmuştur.

## `Student` Sınıfı

Bu sınıf, bir öğrenciyi temsil eder. Her öğrencinin bir numarası ve ismi bulunur. Ayrıca, `Comparable` arabirimini uygular ve öğrencileri numaralarına göre sıralamak için `compareTo` metoduyla karşılaştırılabilir hale getirilir.

- `int number`: Öğrencinin numarasını tutar.
- `String name`: Öğrencinin ismini tutar.
- `Student(int number, String name)`: Numara ve isim parametreleriyle bir öğrenci nesnesi oluşturur.
- `int getNumber()`: Öğrencinin numarasını döndürür.
- `void setNumber(int number)`: Öğrencinin numarasını ayarlar.
- `String getName()`: Öğrencinin ismini döndürür.
- `void setName(String name)`: Öğrencinin ismini ayarlar.
- `String toString()`: Öğrencinin numarası ve ismiyle birlikte bir dize olarak temsilini döndürür.
- `int compareTo(Student o)`: Öğrenciyi numaralarına göre karşılaştırır.

## `SortedSetExample` Sınıfı

Bu sınıf, `SortedSet` arayüzünün ve `TreeSet` sınıfının kullanımını gösteren örnekler içerir. Örnekler, hem basit veri türleri (Integer ve String) hem de özel nesneler (Student sınıfı) için oluşturulmuştur.

- `main(String[] args)`: Örneklerin oluşturulduğu ve çalıştırıldığı ana metod.
- `SortedSet<Integer> sortedSet`: Integer türünde bir `SortedSet` örneği oluşturur ve bu örneğe elemanlar ekler.
- `SortedSet<String> sortedSetString`: String türünde bir `SortedSet` örneği oluşturur ve bu örneğe elemanlar ekler.
- `SortedSet<Student> sortedSetStudent`: Student türünde bir `SortedSet` örneği oluşturur ve bu örneğe öğrenci nesneleri ekler. Öğrenciler, numaralarına göre otomatik olarak sıralanır.
- `Iterator` aracılığıyla her `SortedSet` örneğini dolaşarak elemanları ekrana yazdırır.

## Nasıl Başlanır?

Projeyi yerel bir Java geliştirme ortamında açın ve `SortedSetExample` sınıfını çalıştırın. Bu sınıfın içindeki örneklerin sonuçlarını gözlemleyebilir ve `Student` sınıfının nasıl kullanıldığını inceleyebilirsiniz.

## Katkıda Bulunma

Bu proje, önerileri ve katkıları her zaman memnuniyetle karşılar. Projeyle ilgili herhangi bir sorunuz veya geri bildiriminiz varsa, lütfen bir konu açın veya bir pull request gönderin. Her türlü katkıya açığız!

## Lisans

Bu proje MIT lisansı altında lisanslanmıştır. Daha fazla bilgi için `LICENSE` dosyasına göz atın.


![image](https://github.com/esmanur-karatas/JavaCollectionExample/assets/83882274/ccf6ed92-aec1-4eb5-afae-81af805c5165)
