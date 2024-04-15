# HashSet Örneği

Bu repository, Java'da `HashSet` sınıfının kullanımına ilişkin örnekler içermektedir. `HashSet`, benzersiz elemanlar içeren bir koleksiyon türüdür ve elemanlar arasında sıralama garantisi vermez.

## `Worker` Sınıfı

Bu sınıf, bir işçiyi temsil eder. Her bir işçinin TC kimlik numarası ve ismi bulunur. Aşağıdaki metodları içerir:

- `Worker()`: Parametresiz bir yapıcı metod.
- `Worker(String tcNumber, String name)`: TC kimlik numarası ve isim parametreleriyle bir işçi nesnesi oluşturur.
- `String getTcNumber()`: İşçinin TC kimlik numarasını döndürür.
- `void setTcNumber(String tcNumber)`: İşçinin TC kimlik numarasını ayarlar.
- `String getName()`: İşçinin ismini döndürür.
- `void setName(String name)`: İşçinin ismini ayarlar.
- `String toString()`: İşçinin TC kimlik numarası ve ismiyle birlikte bir dize olarak temsilini döndürür.

## `HashSetExample` Sınıfı

Bu sınıf, `HashSet` sınıfının kullanımını gösterir. Aşağıdaki işlemleri içerir:

- `main(String[] args)`: Örneklerin oluşturulduğu ve çalıştırıldığı ana metod.
- `HashSet<String> hashSet`: String türünde bir `HashSet` örneği oluşturur ve bu örneğe elemanlar ekler.
- Set içindeki eleman sayısını yazdırır ve set içindeki her bir elemanı yazdırır.
- `HashSet<Worker> hashSet1`: Worker türünde bir `HashSet` örneği oluşturur ve bu örneğe işçi nesneleri ekler. Her bir işçinin örneğini oluştururken aynı TC kimlik numarasına sahip olabilir. Bu örneğin, işçi nesnelerinin `hashCode()` metodunu çağırarak farklı kimlik numaralarına sahip olduklarını kontrol eder ve her bir işçiyi ekrana yazdırır.

## Nasıl Başlanır?

Projeyi yerel bir Java geliştirme ortamında açın ve `HashSetExample` sınıfını çalıştırın. Bu sınıfın içindeki örneklerin sonuçlarını gözlemleyebilir ve `HashSet` sınıfının nasıl kullanıldığını öğrenebilirsiniz.

## Katkıda Bulunma

Bu proje, önerileri ve katkıları her zaman memnuniyetle karşılar. Projeyle ilgili herhangi bir sorunuz veya geri bildiriminiz varsa, lütfen bir konu açın veya bir pull request gönderin. Her türlü katkıya açığız!

## Lisans

Bu proje MIT lisansı altında lisanslanmıştır. Daha fazla bilgi için `LICENSE` dosyasına göz atın.



![image](https://github.com/esmanur-karatas/JavaCollectionExample/assets/83882274/43164ef9-2d1d-4e01-9554-55c2bdc17185)
