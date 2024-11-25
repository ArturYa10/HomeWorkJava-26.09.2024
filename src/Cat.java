import java.util.Objects;

class Cat {
    String name;
    int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true; // Сравнение ссылок
        if (o == null || getClass() != o.getClass()) return false; // Проверка на null и класс
        Cat cat = (Cat) o;
        return age == cat.age && Objects.equals(name, cat.name); // Сравнение полей
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age); // Генерация hash-кода
    }
}
