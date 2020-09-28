package cn.sohu.jack.datastructureandarithmatic;

/**
 * @description: 基于位置的迭代器
 * @author: Xiangbao Jin
 * @since 2020/9/26 9:49 PM
 */
public class IteratorElements implements Iterator{
    private List list;
    private Position nextPosition;

    public IteratorElements() {
        list = null;
    }

    public IteratorElements(List list) {
        this.list = list;
        if (list == null) {
            nextPosition = null;
        } else {
            nextPosition = list.getFirst();
        }
    }

    @Override
    public boolean hasNext() {
        return nextPosition != null;
    }

    @Override
    public Object getNext() throws ExceptionNoSuchElement {
        if (!hasNext()) {
            throw new ExceptionNoSuchElement("没有下一个位置");
        }
        Position currentPosition = nextPosition;
        if (currentPosition == list.last()) {
            nextPosition = null;
        } else {
            nextPosition = list.getNext(currentPosition);
        }
        return currentPosition.getElem();
    }
}
