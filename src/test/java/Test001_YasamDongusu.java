import org.junit.jupiter.api.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class Test001_YasamDongusu {

    /**
     * Test islemlerinde, her case yani @Test anotasyonuna sahip method kendi ozelinde calisir.
     * Diger testler ile bir bagi yoktur. Ancak sinif icinde tanimlanan nesneleri tuketebilirler.
     * Bu nedenle sinif icinde kullanilacak olan bilesenlerin baslatilmasi ve her test olgusu icin
     * revize edilmesi islemleri icin bir dizi siralamasi baslatmalisiniz. Bunu yapmak icin su
     * anotaasyonlar kullanilir
     * @BeforeAll -> Ilk calisan method
     * @BeforeEach -> her test icin tekrar tekrar calisan ilk method
     * @AfterEach -> her test sonrasinda tekrar tekrar calisan method
     * @AfterAll -> son calisan method
     * @Before
     */

    @BeforeAll
    void ilkCalisanMethod(){
        System.out.println("Ilk calisan method");
    }
    @Test
    void basariliTestOrnegi(){
        System.out.println("Test yaptim.");
    }

    @Test
    void basarisizTestOrnegi(){
        Assertions.fail("Olmadi yaaaa :(");
        System.out.println("Test yaptim ama olmadi");
    }
    @Test
    @Disabled("artik calismiyor.")
    void kapatilanTestOrnegi(){
        System.out.println("Beni artik calismiyorum. Istifa ettim :)");
    }
}
