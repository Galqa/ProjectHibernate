package hibernate;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class Zoo {
    public static void main(String[] args) {

        EntityManagerFactory factory =  Persistence.createEntityManagerFactory("zoo"); // Назва БД
        EntityManager entityManager = factory.createEntityManager();

        EntityTransaction transaction = entityManager.getTransaction();

        Animal animal = Animal
                .builder()
                .age(30)
                .name("Dunkan")
                .tail(true)
                .build();

        transaction.begin();
        entityManager.persist(animal);
        transaction.commit();

        factory.close();
    }
}
