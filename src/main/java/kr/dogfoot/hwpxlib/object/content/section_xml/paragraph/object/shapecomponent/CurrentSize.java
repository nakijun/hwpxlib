package kr.dogfoot.hwpxlib.object.content.section_xml.paragraph.object.shapecomponent;

import kr.dogfoot.hwpxlib.object.common.ObjectType;
import kr.dogfoot.hwpxlib.object.common.baseobject.WidthAndHeight;

public class CurrentSize extends WidthAndHeight<CurrentSize> {
    public CurrentSize() {
    }

    @Override
    public ObjectType _objectType() {
        return ObjectType.hp_curSz;
    }
}
