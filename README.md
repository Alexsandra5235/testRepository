  Задача:
Создать класс CompareToTester в пакете tests, определить в нем метод, который тестирует метод compareTo на случайно сгенерированных двух строках 1000 раз. 
Результат метода compareTo проверяется стандартным методом compareTo из класса String, при верности теста выводить sout в формате: ---------test номер_теста is successful, 
при неверности выводить serr в формате: ---------test номер_теста is invalid.

Создаем пакет tests для реализации метода testCompareToMethod, в котором генерируются две случайные строки и сравниваются с помощью метода compareTo().
Затем результаты сравнения проверяются: если результаты result1 и result2 равны, то тест считается успешным.
Метод generateRandomString(int length) используется для генерации случайных строк определенной длины из букв латинского алфавита.
