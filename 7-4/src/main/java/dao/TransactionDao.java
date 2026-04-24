package dao;

import jakarta.persistence.EntityManager;
import model.Transactions;

public class TransactionDao {
  public void persist(Transactions transaction) {
    EntityManager em = datasource.MariaDbConnection.getInstance();
    try {
      em.getTransaction().begin();
      em.persist(transaction);
      em.getTransaction().commit();
    } catch (Exception e) {
      if (em.getTransaction().isActive()) {
        em.getTransaction().rollback();
      }
      throw e;
    }
  }
}
