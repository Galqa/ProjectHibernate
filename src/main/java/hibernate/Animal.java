/** Створити нову базу даних за допомогою MySQLWorkbench.
 *  Створити Maven-проєкт та налаштувати його правильно.
 *  Створити файл із налаштуваннями hibernate.cfg.xml.
 *  Створити клас Animal (int age, String name, boolean tail) з методами get та set як сутність до нашої таблиці.
 *  За допомогою hibernate створити нову таблицю з початковим значенням.
 */

package hibernate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder

public class Animal {
    @Id
    @GeneratedValue
     int id;
     int age;
     String name;
     boolean tail;
}

