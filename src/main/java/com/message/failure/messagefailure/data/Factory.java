package com.message.failure.messagefailure.data;

import com.message.failure.messagefailure.model.entity.AFO;
import com.message.failure.messagefailure.model.entity.ProductLine;
import com.message.failure.messagefailure.model.entity.Robot;
import com.message.failure.messagefailure.model.entity.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Factory {
    public static Map<String, User> users = new HashMap<>();
    public static List<Robot> robots = new ArrayList<Robot>();
    public static List<AFO> afos;
    public static List<ProductLine> productLines;
}