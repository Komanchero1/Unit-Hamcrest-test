import org.hamcrest.MatcherAssert;
import org.hamcrest.core.IsEqual;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class WorkingWithStringsHamcrestTest {
    //объявляем переменную sut  типа WorkingWithStrings
    WorkingWithStrings sut;

    @BeforeEach
    //создается объект sut типа WorkingWithStrings
    public void setUp() {
        System.out.println("before each test");
        sut = new WorkingWithStrings();
    }

    // обнуляем объект sut типа WorkingWithStrings
    @AfterEach
    public void tearDown() {
        System.out.println("after each test");
        sut = null;
    }

    //тестируем метод letterSearch
    @Test
    public void letterSearchHamcrestTest() {
        System.out.println("test LetterSearchHamcrest");
        String str = "Af-g R,Rg;r=";
        char letter = 'r';
        //ожидаемый результат
        int expected = 3;
        //получаем фактический результат
        var result = sut.letterSearch(str, letter);
        //сравниваем результаты ожидаемый и фактический
        MatcherAssert.assertThat(result, IsEqual.equalTo(expected));
    }

    //тестируем метод searchTranslationUpperCase
    @Test
    public void searchTranslationUpperCaseHamcrestTest() {
        System.out.println("test searchTranslationUpperCaseHamcrest");
        String str = "djv,vt m-md=s";
        char letter = 'd';
        //ожидаемый результат
        var expected = "Djv,vt m-mD=s";
        //получаем фактический результат
        var result = sut.searchTranslationUpperCase(str, letter);
        //сравниваем результаты ожидаемый и фактический
        MatcherAssert.assertThat(result, IsEqual.equalTo(expected));
    }

    //тестируем метод searchTranslationDelete
    @Test
    public void searchTranslationDeleteHamcrestTest() {
        System.out.println("test searchTranslationDeleteHamcrest");
        String str = "Sd-gr krr=dq;wR";
        char letter = 'r';
        //ожидаемый результат
        var expected = "Sd-g k=dq;w";
        //получаем фактический результат
        var result = sut.searchTranslationDelete(str, letter);
        //сравниваем результаты ожидаемый и фактический
        MatcherAssert.assertThat(result, IsEqual.equalTo(expected));
    }
}
