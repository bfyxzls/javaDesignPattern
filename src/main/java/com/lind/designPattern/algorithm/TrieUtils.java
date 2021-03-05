package com.lind.designPattern.algorithm;

public class TrieUtils {

    /**
     * 插入一个新单词
     *
     * @param root
     * @param str
     */
    public static void insert(TrieNode root, String str) {
        if (root == null || str.length() == 0) {
            return;
        }
        char[] c = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            //如果该分支不存在，创建一个新节点
            if (root.nextNode[c[i] - 'a'] == null) {
                root.nextNode[c[i] - 'a'] = new TrieNode();
            }
            root = root.nextNode[c[i] - 'a'];
            root.prefix++;//注意，应该加在后面
        }

        //以该节点结尾的单词数+1
        root.count++;
    }

    /**
     * 查找该单词是否存在，如果存在返回数量，不存在返回-1
     *
     * @param root
     * @param str
     * @return
     */
    public static int search(TrieNode root, String str) {
        if (root == null || str.length() == 0) {
            return -1;
        }
        char[] c = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            //如果该分支不存在，表名该单词不存在
            if (root.nextNode[c[i] - 'a'] == null) {
                return -1;
            }
            //如果存在，则继续向下遍历
            root = root.nextNode[c[i] - 'a'];
        }

        //如果count==0,也说明该单词不存在
        if (root.count == 0) {
            return -1;
        }
        return root.count;
    }

    /**
     * 查询以str为前缀的单词数量
     *
     * @param root
     * @param str
     * @return
     */
    public static int searchPrefix(TrieNode root, String str) {
        if (root == null || str.length() == 0) {
            return -1;
        }
        char[] c = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            //如果该分支不存在，表名该单词不存在
            if (root.nextNode[c[i] - 'a'] == null) {
                return -1;
            }
            //如果存在，则继续向下遍历
            root = root.nextNode[c[i] - 'a'];
        }
        return root.prefix;
    }

    public static void main(String[] args) {
        TrieNode newNode = new TrieNode();
        insert(newNode, "hello");
        insert(newNode, "hello");
        insert(newNode, "hello");
        insert(newNode, "helloworld");
        System.out.println(search(newNode, "hello"));
        System.out.println(searchPrefix(newNode, "he"));
    }
}
