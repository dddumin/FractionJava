# FractionJava

Тестовое задание по теме «Объектно-ориентированное программирование на языке Java с применением циклических алгоритмов обработки массивов объектов»

Указания к выполнению задания:
•	Все классы должны удовлетворять Code Conventions for the Java Programming Language и принципам SOLID
•	В каждом классе должны быть описаны конструкторы по условию задачи, инициализирующие поля классов, методы получения и установки значений по логике программы, метод toString, методы hashCode и equals

Задания:
A)	Создайте класс Fraction в пакете model, описывающий понятие рациональной дроби. Класс должен иметь два поля: числитель a и знаменатель b. Оба поля должны быть типа int. 
Определите конструкторы, которые могут принимать следующие виды параметров:
•	Ни одного параметра (в этом случае дробь должна быть равна 0).
•	Один параметр типа Fraction
•	Один параметр типа int
•	Два параметра типа int. Если аргумент b будет равен 0, то сгенерировать исключение ArithmeticException с сообщением
•	Один параметр типа String, содержащий два целых числа, записанных либо через пробел, либо через дробную черту или одно целое число
B)	Реализуйте закрытый метод reduce, который приводит дробь к каноническому представлению. У каждой дроби существует единственное каноническое представление. Каноническое представление – это такое представление a/b, что b>0, НОД(a,b)=1. Другими словами метод должен производить сокращение дроби и приведение ее знаменателя к положительному числу. Произвести вызов данного метода во всех нужных методах
C)	Переопределите метод toString таким образом, чтобы он возвращал строковое представление объекта в формате:
•	a/b, если a и b не равны 0
•	0, если а равно 0
•	а, если b равно 1
D)	Реализуйте метод compareTo с реализацией интерфейса Comparable для сравнения двух дробей. Сравнения необходимо реализовать для типов int, double, Fraction
E)	Определите операции сложения, вычитания, умножения так, чтобы можно было складывать:
•	Две дроби (результатом является Fraction)
•	Дробь и int (результатом является Fraction)
•	Дробь и double (результатом является double)
F)	Определить операцию получения обратной дроби
G)	Определить операцию деления на основе операций умножения и получения обратной дроби
H)	Определите операции +=, -=, *=, /= для случая, когда правый операнд имеет тип Fraction
I)	Реализуйте метод sum, принимающий на вход массив дробей и производящий их общее сложение
J)	Реализуйте метод maxFraction, принимающий на вход массив дробей и находящий максимальную дробь в данном массиве
K)	Произвести сортировку массива дробей в порядке возрастания и в порядке убывания
