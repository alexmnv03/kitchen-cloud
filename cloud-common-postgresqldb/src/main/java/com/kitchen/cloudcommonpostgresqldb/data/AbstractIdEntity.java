package com.kitchen.cloudcommonpostgresqldb.data;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Абстрактная Hibernate сущность c id.
 */
// @NoArgsConstructor(access=AccessLevel.PRIVATE, force=true)
@Getter
@Setter
@RequiredArgsConstructor(access=AccessLevel.PRIVATE)
@ToString
@EqualsAndHashCode
@MappedSuperclass
public class AbstractIdEntity<I extends Serializable> implements Identifiable<I> {
    
    private static final long serialVersionUID = 6331369708130810826L;

    /**
     * Имя поля таблицы первичного ключа.
     */
    public static final String ID_COLUMN = "id";

    /**
     * Уникальный идентификатор сущности - первичный ключ.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = ID_COLUMN)
    @Access(AccessType.PROPERTY)
    private I id;
}
