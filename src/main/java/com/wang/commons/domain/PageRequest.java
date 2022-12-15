package com.wang.commons.domain;

/**
 * @author 王念
 * @create 2022-12-15 14:29
 */
public class PageRequest extends AbstractPageRequest {
    private static final long serialVersionUID = -909314269546795795L;

    private String[] includeFields;
    private String[] excludeFields;

    public PageRequest(int page, int size, String[] includeFields, String[] excludeFields) {
        super(page, size);
        this.includeFields = includeFields;
        this.excludeFields = excludeFields;
    }

    public String[] getIncludeFields() {
        return includeFields;
    }

    public void setIncludeFields(String[] includeFields) {
        this.includeFields = includeFields;
    }

    public String[] getExcludeFields() {
        return excludeFields;
    }

    public void setExcludeFields(String[] excludeFields) {
        this.excludeFields = excludeFields;
    }
}
