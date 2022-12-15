package com.wang.commons.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author 王念
 * @create 2022-12-15 10:21
 */
public class PageImpl<T> implements Page<T>, Serializable {
    private static final long serialVersionUID = 8500426990434107612L;
    private final long total;
    private final Pageable pageable;


    private final List<T> content = new ArrayList<>();

    public PageImpl(List<T> content, Pageable pageable) {
        if (content == null || content.isEmpty()) {
            throw new IllegalArgumentException("PageImpl content must not be null!");
        }
        this.pageable = pageable;
        this.content.addAll(content);
        this.total = this.content.size();
    }


    @Override
    public int getPageNumber() {
        return pageable.getPageNumber();
    }

    @Override
    public int getPageSize() {
        return pageable.getPageSize();
    }

    @Override
    public int getTotalPages() {
        return getPageSize() == 0 ? 1 : (int) Math.ceil((double) total / (double) getPageSize());
    }

    @Override
    public int getTotalElements() {
        return content.size();
    }

    @Override
    public List<T> getContent() {
        return content;
    }

    @Override
    public boolean hasContent() {
        return !content.isEmpty();
    }

    @Override
    public boolean isFirst() {
        return !hasPrevious();
    }

    @Override
    public boolean isLast() {
        return !hasNext();
    }

    @Override
    public boolean hasNext() {
        return getPageNumber() + 1 < getTotalPages();
    }

    @Override
    public boolean hasPrevious() {
        return getPageNumber() > 0;
    }

    @Override
    public Iterator<T> iterator() {
        return content.iterator();
    }
}
