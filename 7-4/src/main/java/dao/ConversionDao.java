
package dao;

import model.*;
import jakarta.persistence.EntityManager;

public class ConversionDao {
  public Currency find(int id) {
    EntityManager em = datasource.MariaDbConnection.getInstance();
    Currency emp = em.find(Currency.class, id);
    return emp;
  }
}
