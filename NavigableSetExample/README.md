# NavigableSet Örneği

Bu repository, Java'da `NavigableSet` arabirimini ve `TreeSet` sınıfının kullanımına ilişkin bir örnek içerir. `NavigableSet`, elemanları sıralı bir şekilde tutan ve navigasyon yöntemleri sağlayan bir koleksiyon türüdür.

## `NavigableSetExample` Sınıfı

Bu sınıf, `NavigableSet` arayüzünün ve `TreeSet` sınıfının kullanımını gösterir. Aşağıdaki işlemleri içerir:

- `main(String[] args)`: Örneklerin oluşturulduğu ve çalıştırıldığı ana metod.
- `NavigableSet<Integer> navigableSet`: Integer türünde bir `NavigableSet` örneği oluşturur ve bu örneğe elemanlar ekler.
- `System.out.println("Eleman Sayısı: " + navigableSet.size())`: Set içindeki eleman sayısını yazdırır.
- Küçükten büyüğe sıralı olarak set içindeki elemanları yazdırır.
- `System.out.println(navigableSet.ceiling(2))`: Set içinde verilen değerden büyük veya eşit olan en küçük değeri bulur.
- `System.out.println(navigableSet.floor(3))`: Set içinde verilen değerden küçük veya eşit olan en büyük değeri bulur.
- `System.out.println(navigableSet.lower(3))`: Set içinde verilen değerden küçük olan en büyük değeri bulur.
- `System.out.println(navigableSet.higher(3))`: Set içinde verilen değerden büyük olan en küçük değeri bulur.
- `SortedSet<Integer> sortedSet = navigableSet.headSet(5)`: Belirtilen değere kadar olan elemanları içeren bir alt küme oluşturur.

## Nasıl Başlanır?

Projeyi yerel bir Java geliştirme ortamında açın ve `NavigableSetExample` sınıfını çalıştırın. Bu sınıfın içindeki örneklerin sonuçlarını gözlemleyebilir ve `NavigableSet` arabirimini nasıl kullanacağınızı öğrenebilirsiniz.

## Katkıda Bulunma

Bu proje, önerileri ve katkıları her zaman memnuniyetle karşılar. Projeyle ilgili herhangi bir sorunuz veya geri bildiriminiz varsa, lütfen bir konu açın veya bir pull request gönderin. Her türlü katkıya açığız!

## Lisans

Bu proje MIT lisansı altında lisanslanmıştır. Daha fazla bilgi için `LICENSE` dosyasına göz atın.


![image](https://github.com/esmanur-karatas/JavaCollectionExample/assets/83882274/6a868bd6-e4b1-4c3d-979a-6bd7da9b31bc)
