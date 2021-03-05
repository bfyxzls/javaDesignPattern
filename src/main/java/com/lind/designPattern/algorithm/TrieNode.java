package com.lind.designPattern.algorithm;

/**
 * 字典树
 */
public class TrieNode {
    int count;
    int prefix;
    TrieNode[] nextNode = new TrieNode[26];

    public TrieNode() {
        count = 0;
        prefix = 0;
    }
}

