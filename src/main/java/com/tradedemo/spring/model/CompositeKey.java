package com.tradedemo.spring.model;

import java.io.Serializable;

public class CompositeKey implements Serializable {
    private String tradeId;
    private int version;
}