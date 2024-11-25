import java.util.Objects;

class Box {
    private Cat cat; // Поле должно быть private для инкапсуляции

    public Box(Cat cat) {
        this.cat = cat;
    }

    public Cat getCat() {
        return cat; // Геттер для получения объекта Cat
    }

    public void setCat(Cat cat) {
        this.cat = cat; // Сеттер для изменения объекта Cat
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true; // Сравнение ссылок
        if (o == null || getClass() != o.getClass()) return false; // Проверка на null и тип
        Box box = (Box) o;
        return Objects.equals(cat, box.cat); // Сравнение объектов Cat
    }

    @Override
    public int hashCode() {
        return Objects.hash(cat); // Генерация hash-кода
    }
}
