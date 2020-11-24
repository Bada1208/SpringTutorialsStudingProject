package com.sysoiev.collections;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class CollectionInjection {
    List documentList;
    Set documentSet;
    Map documentMap;
    Properties documentProperties;

    public List getDocumentList() {
        System.out.println("documentList: " + documentList);
        return documentList;
    }

    public void setDocumentList(List documentList) {

        this.documentList = documentList;
    }

    public Set getDocumentSet() {
        System.out.println("documentSet: " + documentSet);
        return documentSet;
    }

    public void setDocumentSet(Set documentSet) {

        this.documentSet = documentSet;
    }

    public Map getDocumentMap() {
        System.out.println("documentMap: " + documentMap);
        return documentMap;
    }

    public void setDocumentMap(Map documentMap) {

        this.documentMap = documentMap;
    }

    public Properties getDocumentProperties() {
        System.out.println("documentProperties: " + documentProperties);
        return documentProperties;
    }

    public void setDocumentProperties(Properties documentProperties) {

        this.documentProperties = documentProperties;
    }
}
