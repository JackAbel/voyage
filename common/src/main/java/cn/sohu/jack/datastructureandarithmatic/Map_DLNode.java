package cn.sohu.jack.datastructureandarithmatic;

/**
 * @description: 基于双向链表实现的map
 * @author: Xiangbao Jin
 * @since 2020/9/27 10:26 PM
 */
public class Map_DLNode implements Map {

    private List L;
    private EqualityTester T;

    public Map_DLNode() {
        this(new EqualityTesterDefault());
    }
    public Map_DLNode(EqualityTester t) {
        L = new List_DLNode();
        this.T = t;
    }

    @Override
    public boolean isEmpty() {
        return L.isEmpty();
    }

    @Override
    public int getSize() {
        return L.getSize();
    }

    @Override
    public Object get(Object element) {
        Iterator iterator = L.positions();
        while (iterator.hasNext()) {
            Position p = (Position) iterator.getNext();
            Entry entry = (EntryDefault)p.getElem();
            if (T.equalTo(entry.getKey(), element)) {
                return entry.getValue();
            }
        }
        return null;
    }

    @Override
    public Object put(Object key, Object value) {
        Iterator iterator = L.positions();
        while (iterator.hasNext()) {
            Position pos = (Position) iterator.getNext();
            Entry entry = (EntryDefault)pos.getElem();
            if (T.equalTo(entry.getKey(), key)) {
                Object oldValue = entry.getValue();
                L.replace(pos, new EntryDefault(key,value));
                return oldValue;
            }
        }
        L.insertFirst(new EntryDefault(key, value));
        return null;
    }

    @Override
    public Object remove(Object key) {
        Iterator iterator = L.positions();
        while (iterator.hasNext()) {
            Position pos = (Position) iterator.getNext();
            Entry entry = (EntryDefault)pos.getElem();
            if (T.equalTo(entry.getKey(), key)) {
                Object oldValue = entry.getValue();
                L.remove(pos);
                return oldValue;
            }
        }
        return null;
    }

    @Override
    public Iterator entries() {
        return new IteratorElements(L);
    }
}
