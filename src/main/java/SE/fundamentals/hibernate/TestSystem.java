package SE.fundamentals.hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.persistence.NoResultException;

import java.util.List;

public class TestSystem {
    // This variable below allows us to manage entities and transactions using Hibernate.
    private static final EntityManagerFactory ENTITY_MANAGER_FACTORY = Persistence.createEntityManagerFactory("learning-java");

    public static void main(String[] args) {

        // addCustomer("Test", "test");
        getCustomer(2);
        // getCustomers();
        // updateCustomer(2, "updated", "updated again");

        ENTITY_MANAGER_FACTORY.close(); // Closing the EntityManagerFactory when done.
    }

    public static void addCustomer(String firstName, String lastName) {
        EntityManager em = ENTITY_MANAGER_FACTORY.createEntityManager();
        EntityTransaction et = null; // Initializing EntityTransaction to handle transactions.

        try {
            et = em.getTransaction(); // Obtaining a reference to the current transaction.
            et.begin(); // Beginning the transaction.

            EntityExample customer01 = new EntityExample();

            customer01.setFirstName(firstName);
            customer01.setLastName(lastName);

            em.persist(customer01); // Using EntityManager to persist (save) the entity in the database.
            et.commit(); // Committing the transaction to save changes to the database.

        } catch (Exception ex) {
            if (et != null) {
                et.rollback(); // In case of an exception, rolling back the transaction.
            }
            ex.printStackTrace(); // Handling exceptions related to database operations.
        } finally {
            em.close(); // Closing EntityManager to free up resources.
        }
    }

    // The following methods demonstrate CRUD operations using Hibernate's EntityManager.
    // Each method handles different operations related to database entities.

    public static void getCustomer(int id) {
        EntityManager em = ENTITY_MANAGER_FACTORY.createEntityManager();
        String query = "SELECT c FROM EntityExample c WHERE c.id = :customerId";
        TypedQuery<EntityExample> tq = em.createQuery(query, EntityExample.class);
        tq.setParameter("customerId", id);
        EntityExample customer = null;

        try {
            customer = tq.getSingleResult();
            System.out.println(customer.getFirstName());

        } catch (NoResultException ex) {
            ex.printStackTrace();
        } finally {
            em.close();
        }
    }

    public static void getCustomers() {
        EntityManager em = ENTITY_MANAGER_FACTORY.createEntityManager();
        String query = "SELECT c FROM EntityExample c";
        TypedQuery<EntityExample> tq = em.createQuery(query, EntityExample.class);

        List<EntityExample> customers;

        try {
            customers = tq.getResultList();

            for(EntityExample customer : customers) {
                System.out.println(customer.getFirstName());
            }

        } catch (NoResultException ex) {
            ex.printStackTrace();
        } finally {
            em.close();
        }
    }

    public static void updateCustomer(int id, String firstName, String lastName) {
        EntityManager em = ENTITY_MANAGER_FACTORY.createEntityManager();
        EntityTransaction et = null;
        EntityExample customer = null;

        try {
            et = em.getTransaction(); // Retrieve the transaction.
            et.begin(); // Begin the transaction.

            customer = em.find(EntityExample.class, id); // Find the customer by ID in the database.

            if (customer == null) {
                return; // Customer not found, exit the method.
            }

            customer.setFirstName(firstName);
            customer.setLastName(lastName);

            em.persist(customer); // Persist the updated customer entity.
            et.commit(); // Commit the transaction.

        } catch (Exception ex) {
            if (et != null) {
                et.rollback(); // Roll back the transaction in case of an exception.
            }
            ex.printStackTrace(); // Handle exceptions related to database operations.
        } finally {
            em.close(); // Close the EntityManager.
        }
    }

    public static void deleteCustomer(int id) {
        EntityManager em = ENTITY_MANAGER_FACTORY.createEntityManager();
        EntityTransaction et = null;
        EntityExample customer = null;

        try {
            et = em.getTransaction(); // Retrieve the transaction.
            et.begin(); // Begin the transaction.

            customer = em.find(EntityExample.class, id); // Find the customer by ID in the database.

            if (customer == null) {
                return; // Customer not found, exit the method.
            }

            em.remove(customer); // Remove the customer entity from the database.

            em.persist(customer); // Not necessary to persist after removal.
            et.commit(); // Commit the transaction.

        } catch (Exception ex) {
            if (et != null) {
                et.rollback(); // Roll back the transaction in case of an exception.
            }
            ex.printStackTrace(); // Handle exceptions related to database operations.
        } finally {
            em.close(); // Close the EntityManager.
        }
    }
}