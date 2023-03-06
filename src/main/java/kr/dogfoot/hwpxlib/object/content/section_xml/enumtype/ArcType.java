package kr.dogfoot.hwpxlib.object.content.section_xml.enumtype;

import kr.dogfoot.hwpxlib.object.common.EnumGetStr;

/**
 * 호의 종류
 */
public enum ArcType implements EnumGetStr {
    NORMAL("NORMAL"),
    PIE("PIE"),
    CHORD("CHORD");

    private String str;

    ArcType(String str) {
        this.str = str;
    }

    @Override
    public String str() {
        return str;
    }

    public static ArcType fromString(String str) {
        if (str != null) {
            String STR = str.toUpperCase();
            for (ArcType item : values()) {
                if (item.str.equals(STR)) {
                    return item;
                }
            }
        }
        return null;
    }
}
