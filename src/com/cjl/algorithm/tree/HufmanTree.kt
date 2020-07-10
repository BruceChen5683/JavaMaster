package com.enjoy.tree

import java.util.ArrayList

/**
 * 哈夫曼树
 */

object HuffmanTree {
    //节点
    class Node<E>(internal var data: E //数据
                  , internal var weight: Int //权重
    ) {
        internal var leftChild: Node<*>? = null //左子节点
        internal var rightChild: Node<*>? = null//右子节点

        override fun toString(): String {
            return "Node[$weight,data=$data]"
        }
    }

    @JvmStatic
    fun main(args: Array<String>) {
        val nodes = ArrayList<Node<*>>()
        //把节点加入至list中
        nodes.add(Node("a", 10))
        nodes.add(Node("b", 15))
        nodes.add(Node("c", 12))
        nodes.add(Node("d", 3))
        nodes.add(Node("e", 4))
        nodes.add(Node("f", 13))
        nodes.add(Node("g", 1))
        //进行哈夫曼树的构造
        val root = HuffmanTree.createTree(nodes)
        //打印哈夫曼树
        printTree(root)

    }

    /**
     * 构造哈夫曼树
     *
     * @param nodes
     * 节点集合
     * @return 构造出来的哈夫曼树的根节点
     */
    private fun createTree(nodes: MutableList<Node<*>>): Node<*> {
        //如果节点node列表中海油2个和2个以上的节点
        while (nodes.size > 1) {
            //什么是最小的，list表进行排序，增序的方式， 0,1，
            sort(nodes)//排序方式是增序的
            val left = nodes[0]//权重最小的
            val right = nodes[1]//权重第二小的
            //生成一个新的节点（父节点），父节点的权重为两个子节点的之和
            val parent = Node(null, left.weight + right.weight)
            //树的连接，让子节点与父节点进行连接
            parent.leftChild = left
            parent.rightChild = right
            nodes.removeAt(0)//删除最小的
            nodes.removeAt(0)//删除第二小的。
            nodes.add(parent)
        }
        return nodes[0] //返回根节点
    }

    /**
     * 冒泡排序，用于对节点进行排序（增序排序）
     *
     * @param nodes
     */
    fun sort(nodes: MutableList<Node<*>>) {
        if (nodes.size <= 1)
            return
        /*循环数组长度的次数*/
        for (i in nodes.indices) {
            /*从第0个元素开始，依次和后面的元素进行比较
             * j < array.length - 1 - i表示第[array.length - 1 - i]
             * 个元素已经冒泡到了合适的位置，无需进行比较，可以减少比较次数*/
            for (j in 0 until nodes.size - 1 - i) {
                /*如果第j个节点比后面的第j+1节点权重大，交换两者的位置*/
                if (nodes[j + 1].weight < nodes[j].weight) {
                    val temp = nodes[j + 1]
                    nodes[j + 1] = nodes[j]
                    nodes[j] = temp
                }
            }
        }
        return
    }

    /*

     * 递归打印哈夫曼树(先左子树，后右子树打印)
     */

    fun printTree(root: Node<*>) {
        println(root.toString())
        if (root.leftChild != null) {
            print("left:")
            printTree(root.leftChild!!)
        }
        if (root.rightChild != null) {
            print("right:")
            printTree(root.rightChild!!)
        }
    }
}










































































































































































