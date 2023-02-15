package kr.dogfoot.hwpxlib.object.content.context_hpf;

import kr.dogfoot.hwpxlib.object.common.ObjectType;
import kr.dogfoot.hwpxlib.object.common.SwitchableObject;

import java.util.ArrayList;


public class MetaData extends SwitchableObject {
    private Title title;
    private Language language;
    private final ArrayList<Meta> metaList;

    public MetaData() {
        metaList = new ArrayList<Meta>();
    }

    @Override
    public ObjectType _objectType() {
        return ObjectType.opf_metadata;
    }

    public Title title() {
        return title;
    }

    public void createTitle() {
        title = new Title();
    }

    public void removeTitle() {
        title = null;
    }

    public Language language() {
        return language;
    }

    public void createLanguage() {
        language = new Language();
    }

    public void removeLanguage() {
        language = null;
    }

    public int countOfMeta() {
        return metaList.size();
    }

    public Meta getMeta(int index) {
        return metaList.get(index);
    }

    public void addMeta(Meta meta) {
        metaList.add(meta);
    }

    public Meta addNewMeta() {
        Meta meta = new Meta();
        metaList.add(meta);
        return meta;
    }

    public void insertMeta(Meta meta, int position) {
        metaList.add(position, meta);
    }

    public void removeMeta(int position) {
        metaList.remove(position);
    }

    public Iterable<Meta> metas() {
        return metaList;
    }
}
