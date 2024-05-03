import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class WorkingWithStringsTest {

    //объявляем переменную sut  типа WorkingWithStrings
    WorkingWithStrings sut;

    //создается объект sut типа WorkingWithStrings
    @BeforeEach
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
    public void letterSearchTest() {
        System.out.println("test LetterSearch");
        String str = "Af-g R,Rg;r=";
        char letter = 'r';
        //ожидаемый результат
        int expected = 3;
        //получаем фактический результат
        var result = sut.letterSearch(str, letter);
        //сравниваем результаты ожидаемый и фактический
        Assertions.assertEquals(expected, result);
    }

    //тестируем метод searchTranslationUpperCase
    @Test
    public void searchTranslationUpperCaseTest() {
        System.out.println("test searchTranslationUpperCase");
        String str = "djv,vt m-md=s";
        char letter = 'd';
        //ожидаемый результат
        var expected = "Djv,vt m-mD=s";
        //получаем фактический результат
        var result = sut.searchTranslationUpperCase(str, letter);
        //сравниваем результаты ожидаемый и фактический
        Assertions.assertEquals(expected, result);
    }

    //тестируем метод searchTranslationDelete
    @Test
    public void searchTranslationDeleteTest() {
        System.out.println("test searchTranslationDelete");
        String str = "Sd-gr krr=dq;wR";
        char letter = 'r';
        //ожидаемый результат
        var expected = "Sd-g k=dq;w";
        //получаем фактический результат
        var result = sut.searchTranslationDelete(str, letter);
        //сравниваем результаты ожидаемый и фактический
        Assertions.assertEquals(expected, result);
    }


}
