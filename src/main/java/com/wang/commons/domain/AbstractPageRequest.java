package com.wang.commons.domain;

import java.io.Serializable;

/**
 * @author 王念
 * @create 2022-12-15 14:27
 */
public abstract class AbstractPageRequest implements Pageable, Serializable {
    private static final long serialVersionUID = -1269392473660543762L;
    private  int page;
    private  int size;

    public AbstractPageRequest(int page, int size) {

        if (page < 0) {
            throw new IllegalArgumentException("Page index must not be less than zero");
        }

        if (size < 1) {
            throw new IllegalArgumentException("Page size must not be less than one");
        }

        this.page = page;
        this.size = size;
    }


    @Override
    public int getPageNumber() {
        return page;
    }

    @Override
    public int getPageSize() {
        return size;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
