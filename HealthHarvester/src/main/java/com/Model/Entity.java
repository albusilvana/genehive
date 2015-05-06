package com.Model;

import com.google.common.base.Objects;
import com.sun.corba.se.spi.ior.Identifiable;
import org.codehaus.jackson.map.annotate.JsonSerialize;

/**
 * Created by silvana.albert on 3/11/15.
 */
@JsonSerialize
public class Entity extends BaseEntity {

    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final Identifiable other = (Identifiable) obj;
        return Objects.equal(this.id, other.getId());
    }

}
