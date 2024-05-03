public class WorkingWithStrings {

    //считаем количество заданных букв в слове
    public int letterSearch(String str, char letter) {
        int amount = 0;
        //преобразовываем слово в массив символов и перебираем его
        for (char ch : str.toCharArray()) {
            //проверяем совпадение с заданным символом
            if (Character.toLowerCase(ch) == Character.toLowerCase(letter)) {
                //если совпадение найдено увеличиваем счетчик на 1
                amount++;
            }
        }
        //возвращаем количество найденых букв
        return amount;
    }

    //ищем буквы и переводим их в верхний регистр
    public String searchTranslationUpperCase(String str, char letter) {
        // используем StringBuilder для создания измененной строки
        StringBuilder sb = new StringBuilder();
        // преобразовываем слово в массив символов и перебираем его
        for (char c : str.toCharArray()) {
            //проверяем совпадение с заданным символом
            if (c == letter) {
                //если совпадение найдено меняем регистр и
                // добавляем измененный символ в строку
                sb.append(Character.toUpperCase(c));
            } else {
                //если символы не равны добавляем в строку без изменений
                sb.append(c);
            }
        }
        //возвращаем строку
        return sb.toString();
    }

    //удаляем все буквы эквивалентные заданному символу из строки
    public String searchTranslationDelete(String str, char letter) {
        // используем StringBuilder для создания измененной строки
        StringBuilder result = new StringBuilder();
        // преобразовываем слово в массив символов и перебираем его
        for (char c : str.toCharArray()) {
            //проверяем символы на совпадение ,
            // если не совпадают ,добавляем в строку
            if (Character.toLowerCase(c) != Character.toLowerCase(letter)) {
                result.append(c);
            }
        }
        //возвращаем полученную строку
        return result.toString();
    }
}
