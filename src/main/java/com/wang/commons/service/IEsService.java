package com.wang.commons.service;

import com.wang.commons.domain.Page;
import com.wang.commons.domain.Pageable;
import com.wang.commons.exception.EsOperationException;

/**
 * @author 王念
 * @create 2022-12-15 14:40
 */
public interface IEsService<T, ID> extends IService<T, ID> {

    T insert(T entity, String index) throws EsOperationException;

    T insert(T entity, Boolean ifRefreshImmediate, String index) throws EsOperationException;

    Iterable<T> inserts(Iterable<T> entities, String index) throws EsOperationException;

    Iterable<T> inserts(Iterable<T> entities, Boolean ifRefreshImmediate, String index) throws EsOperationException;

    boolean delete(ID id, String index) throws EsOperationException;

    boolean delete(ID id, Boolean ifRefreshImmediate, String index) throws EsOperationException;

    boolean deleteByQuery(T entity, String... indices) throws EsOperationException;

    boolean update(ID id, T entity, String indices) throws EsOperationException;

    boolean update(ID id, T entity, Boolean ifRefreshImmediate, String indices) throws EsOperationException;

    boolean updateByQuery(T entity, String script, String... indices) throws EsOperationException;

    boolean updateByQuery(T entity, String script, Boolean ifRefreshImmediate, String... indices) throws EsOperationException;

    T get(ID id, String index) throws EsOperationException;

    T get(ID id, String[] includes, String[] excludes, String index) throws EsOperationException;

    Page<T> page(T model, Pageable pageable, String... indices) throws EsOperationException;

    boolean exists(ID id,String index) throws EsOperationException;
}
