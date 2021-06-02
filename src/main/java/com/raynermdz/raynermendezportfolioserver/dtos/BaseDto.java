package com.raynermdz.raynermendezportfolioserver.dtos;

import com.raynermdz.raynermendezportfolioserver.dtos.converter.DtoEntity;
import lombok.Data;

import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

@Data
public abstract class BaseDto implements Serializable, DtoEntity {

    private UUID id;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BaseDto that = (BaseDto) o;
        return Objects.equals(this.id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id);
    }
}
