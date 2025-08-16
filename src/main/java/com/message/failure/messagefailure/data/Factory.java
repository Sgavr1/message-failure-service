package com.message.failure.messagefailure.data;

import com.message.failure.messagefailure.model.entity.AFO;
import com.message.failure.messagefailure.model.entity.ProductLine;
import com.message.failure.messagefailure.model.entity.Robot;

import java.util.ArrayList;
import java.util.List;

public class Factory {
    public static List<Robot> robots = new ArrayList<Robot>();
    public static List<AFO> afos;
    public static List<ProductLine> productLines;
}