package kr.dogfoot.hwpxlib.object.content.section_xml.paragraph.ctrl.inner;

import kr.dogfoot.hwpxlib.object.common.ObjectType;
import kr.dogfoot.hwpxlib.object.common.parameter.ParameterListCore;

public class Parameters extends ParameterListCore<Parameters> {
    public Parameters() {
    }

    @Override
    public ObjectType _objectType() {
        return ObjectType.hp_parameters;
    }
}
