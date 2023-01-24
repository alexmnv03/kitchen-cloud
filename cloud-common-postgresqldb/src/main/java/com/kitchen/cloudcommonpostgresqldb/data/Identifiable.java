package com.kitchen.cloudcommonpostgresqldb.data;

import java.io.Serializable;

/**
 * Интерфейс опознаваемой сущности.
 *
 * @param <I> Тип идентификатора опознаваемой сущности
 */
public interface Identifiable<I extends Serializable> extends Serializable {

    I getId();

    void setId(I id);
}
