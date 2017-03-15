package com.zang.api.inboundxml.elements.enums;

import com.zang.api.domain.enums.util.EnumUtil;

import java.util.HashMap;
import java.util.Map;

public enum IfMachine {
    CONTINUE, REDIRECT, HANGUP;

    private static Map<IfMachine, String> map;

    static {
        map = new HashMap<IfMachine, String>();
        map.put(CONTINUE, "continue");
        map.put(REDIRECT, "redirect");
        map.put(HANGUP, "hangup");
    }

    public static IfMachine forValue(String s) {
        return EnumUtil.getValue(s, map, null);
    }

    @Override
    public String toString() {
        return map.get(this);
    }
}
