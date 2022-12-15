package com.wang.commons.domain;

import java.util.List;

/**
 * @author 王念
 * @create 2022-12-15 10:09
 */
public interface Page<T> extends Iterable<T> {
    static <T> Page<T> empty() {
        return null;
    }

    int getPageNumber();

    int getPageSize();

    int getTotalPages();

    int getTotalElements();

    List<T> getContent();

    boolean hasContent();

    boolean isFirst();

    boolean isLast();

    boolean hasNext();

    boolean hasPrevious();

}
