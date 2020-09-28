package cn.sohu.jack.datastructureandarithmatic;

/**
 * @description: 散列表
 * 我们可以规定在桶数组中每个桶单元放一个key，但很难确定整个桶的数组容量，当key是int型的正整数时，如果
 * 初始化一个容量为2 的31次方的数组，会造成空间的极大浪费，而且一般的散列表也不需要存放这么多元素
 * 另一个问题在于我们的key不一定都是正整数；为了解决这个问题我们需要将任一的key转为int型的正整数，这个函数就叫散列函数
 *
 * 好的散列函数应该尽可能的接近单射，并对于任何key计算h(key)都在O(1)的时间内完成
 * Java分为两步，一般性的先将一般的key通过hash函数写成散列码的整数；
 *             再通过压缩算法将该整数映射至[0~N-1]的区间内
 * @author: Xiangbao Jin
 * @since 2020/9/28 7:14 PM
 */
public interface HashTable {
}
