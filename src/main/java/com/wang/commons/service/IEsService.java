package com.wang.commons.service;

import com.wang.commons.domain.Page;
import com.wang.commons.domain.Pageable;

import java.util.Optional;

/**
 * @author 王念
 * @create 2022-12-15 14:40
 */
public interface IEsService<T, ID> extends IService<T, ID> {

    <S extends T> S insert(T entity, String index);

    <S extends T> Iterable<S> inserts(Iterable<T> entities, String index);

    boolean delete(ID id, String... indices);

    boolean deleteByQuery(T entity, String indices);

    boolean update(ID id, T entity, String indices);

    boolean updateByQuery(T entity, String indices);

    Optional<T> get(ID id, String... indices);

    Page<T> page(T model, Pageable pageable, String... indices);
}