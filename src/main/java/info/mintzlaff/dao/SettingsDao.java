package info.mintzlaff.dao;

import info.mintzlaff.domain.Settings;

import javax.annotation.Resource;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.UserTransaction;
import java.util.List;

public class SettingsDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Resource
    private UserTransaction userTransaction;

    @TransactionAttribute(TransactionAttributeType.REQUIRED)
    public List<Settings> findAll() {
        return entityManager.createNamedQuery(Settings.FIND_ALL, Settings.class).getResultList();
    }
}
