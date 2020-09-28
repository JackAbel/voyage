package cn.sohu.jack.datastructureandarithmatic;

/**
 * @description: 条目对象的实现
 * @author: Xiangbao Jin
 * @since 2020/9/26 10:23 PM
 */
public class EntryDefault implements Entry {
    private Object key;
    private Object value;

    public EntryDefault(Object key, Object value) {
        this.key = key;
        this.value = value;
    }
    @Override
    public Object setKey(Object v) {
        Object bak = this.getKey();
        this.key = v;
        return bak;
    }

    @Override
    public Object getKey() {
        return this.key;
    }

    @Override
    public Object setValue(Object v) {
        Object bak = this.getValue();
        this.value = v;
        return bak;
    }

    @Override
    public Object getValue() {
        return this.value;
    }
}
