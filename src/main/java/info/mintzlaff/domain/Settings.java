package info.mintzlaff.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

import static info.mintzlaff.domain.Settings.FIND_ALL;

@NamedQueries(
        @NamedQuery(name = FIND_ALL, query = "select s from Settings s")
)
@Entity
@Getter
@Setter
@Table(name="settings")
public class Settings implements Serializable {

    public static final String FIND_ALL = "settings.findAll";

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String key;

    private String value;
}
