package com.welinkhub.code;

import java.util.Stack;

/**
 *
 */
public class TwoStacksQueue {

    private Stack<Integer> stackPush;
    private Stack<Integer> stackPop;

    public TwoStacksQueue() {
        this.stackPush = new Stack<>();
        this.stackPop = new Stack<>();
    }

    public void add(Integer number){
        stackPush.add(number);
    }

    public Integer poll() {
        if (stackPush.empty() && stackPop.empty()) {
            throw new RuntimeException("Queue is empty at poll.");
        } else if (stackPop.empty()) {
            while (!stackPush.empty()) {
                stackPop.add(stackPush.pop());
            }
        }
        return stackPop.pop();
    }

    public Integer peek() {
        if (stackPush.empty() && stackPop.empty()) {
            throw new RuntimeException("Queue is empty at peek.");
        } else if (stackPop.empty()) {
            while (!stackPush.empty()) {
                stackPop.add(stackPush.pop());
            }
        }
        return stackPop.peek();
    }
}
