package cn.sohu.jack.datastructureandarithmatic;

/**
 * @description: 基于无序列表实现的优先队列
 * @author: Xiangbao Jin
 * @since 2020/9/27 9:26 AM
 */
public class PQueneUnsortedList implements PQuene {

    private List list;
    private Comparator c;

    public PQueneUnsortedList() {

    }

    public PQueneUnsortedList(Comparator c, Sequence sequence) {
        this.c = c;
        list = new List_DLNode();
        if (sequence != null) {
            while (!sequence.isEmpty()) {
                Entry e = (Entry) sequence.removeFirst();
                insertEntry(e.getKey(), e.getValue());
            }
        }
    }
    @Override
    public int getSize() {
        return list.getSize();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public Entry getMin() throws ExceptionPQueneEmpty {
        if (isEmpty()) {
            throw new ExceptionPQueneEmpty("列表为空");
        }
        Position minPos = list.getFirst();
        Position curPos = list.getNext(minPos);
        while (null != curPos) {
            if (0 < c.compareTo(minPos.getElem(), curPos.getElem())) {
                minPos = curPos;
            }
        }
        return (Entry) minPos.getElem();
    }

    @Override
    public Entry insertEntry(Object k1, Object v1) throws ExceptionKeyInvaild {
        Entry entry = new EntryDefault(k1, v1);
        list.insertLast(entry);
        return entry;
    }

    @Override
    public Entry delMin() throws ExceptionPQueneEmpty {
        if (isEmpty()) {
            throw new ExceptionPQueneEmpty("队列为空");
        }
        Position minPos = list.getFirst();
        Iterator it = list.positions();

        while (it.hasNext()) {
            Position curPos = (Position) it.getNext();
            if (0 < c.compareTo(
                    ((Entry)(minPos.getElem())).getKey(),((Entry)(curPos.getElem())).getValue()))
                minPos = curPos;
        }
        return (Entry) list.remove(minPos);
    }
}
