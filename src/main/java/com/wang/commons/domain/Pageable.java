package com.wang.commons.domain;

/**
 * @author 王念
 * @create 2022-12-15 14:24
 */
public interface Pageable {
    int getPageNumber();

    int getPageSize();

    String[] getIncludeFields();

    String[] getExcludeFields();
}
