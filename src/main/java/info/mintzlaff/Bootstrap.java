package info.mintzlaff;

import info.mintzlaff.domain.Settings;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Bootstrap {
    private static final EntityManagerFactory emFactoryObj;
    private static final String PERSISTENCE_UNIT_NAME = "spring_dev";

    static {
        emFactoryObj = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
    }

    // This Method Is Used To Retrieve The 'EntityManager' Object
    public static EntityManager getEntityManager() {
        return emFactoryObj.createEntityManager();
    }

    public static void main(String[] args) {

        EntityManager entityMgr = getEntityManager();
        entityMgr.getTransaction().begin();

        Settings setting = new Settings();
        setting.setKey("der");
        setting.setValue("Hans");
        entityMgr.persist(setting);

        entityMgr.getTransaction().commit();

        entityMgr.clear();
        System.out.println("Record Successfully Inserted In The Database");
    }
}
