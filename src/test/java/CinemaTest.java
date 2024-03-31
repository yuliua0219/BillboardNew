import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CinemaTest {
    @Test
    public void testFindAll() {
        Cinema manager = new Cinema();
        String movie1 = "Джентельмены";
        String movie2 = "Начало";
        String movie3 = "Довод";

        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);

        String[] actual = manager.findAll();
        String[] expected = {"Джентельмены", "Начало", "Довод"};

        Assertions.assertArrayEquals(expected, actual);

    }
    @Test
    public void testFindLastWhenLimitLessThanSize() {
        Cinema manager = new Cinema();
        String movie1 = "Джентельмены";
        String movie2 = "Начало";
        String movie3 = "Довод";
        String movie4 = "Титаник";
        String movie5 = "Переводчик";
        String movie6 = "Настоящий детектив";

        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);
        manager.add(movie4);
        manager.add(movie5);
        manager.add(movie6);

        String[] actual = manager.findLast();
        String[] expected = {
                "Настоящий детектив",
                "Переводчик",
                "Титаник",
                "Довод",
                "Начало"
        };

        Assertions.assertArrayEquals(expected, actual);

    }
    @Test
    public void testFindLastWhenLimitLessThanSize2() {
        Cinema manager = new Cinema(3);
        String movie1 = "Джентельмены";
        String movie2 = "Начало";
        String movie3 = "Довод";
        String movie4 = "Титаник";
        String movie5 = "Переводчик";
        String movie6 = "Настоящий детектив";

        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);
        manager.add(movie4);
        manager.add(movie5);
        manager.add(movie6);

        String[] actual = manager.findLast();
        String[] expected = {
                "Настоящий детектив",
                "Переводчик",
                "Титаник",

        };

        Assertions.assertArrayEquals(expected, actual);

    }
    @Test
    public void testFindLastWhenLimitMoreThanSize() {
        Cinema manager = new Cinema();
        String movie1 = "Джентельмены";
        String movie2 = "Начало";
        String movie3 = "Довод";

        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);

        String[] actual = manager.findLast();
        String[] expected = {
                "Довод",
                "Начало",
                "Джентельмены"
        };

        Assertions.assertArrayEquals(expected, actual);

    }
    @Test
    public void testFindLastWhenLimitMoreThanSize2() {
        Cinema manager = new Cinema(4);
        String movie1 = "Джентельмены";
        String movie2 = "Начало";
        String movie3 = "Довод";

        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);

        String[] actual = manager.findLast();
        String[] expected = {
                "Довод",
                "Начало",
                "Джентельмены"
        };

        Assertions.assertArrayEquals(expected, actual);

    }

}