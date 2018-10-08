package info.mintzlaff.beans;

import info.mintzlaff.dao.SettingsDao;
import info.mintzlaff.domain.Settings;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.util.List;

@Named
@RequestScoped
public class SettingsBean implements Serializable {

    @Inject
    private SettingsDao settingsDao;

    public List<Settings> getSettings() {
        return settingsDao.findAll();
    }
}
