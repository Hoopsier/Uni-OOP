
package dao;

import model.*;
import jakarta.persistence.EntityManager;

public class ConversionDao {
  public Currency find(int id) {
    EntityManager em = datasource.MariaDbConnection.getInstance();
    Currency emp = em.find(Currency.class, id);
    return emp;
  }

  public void persist(Currency currency) {
    EntityManager em = datasource.MariaDbConnection.getInstance();
    try {
      em.getTransaction().begin();
      em.persist(currency);
      em.getTransaction().commit();
    } catch (Exception e) {
      if (em.getTransaction().isActive()) {
        em.getTransaction().rollback();
      }
      throw e;
    }
  }
}
