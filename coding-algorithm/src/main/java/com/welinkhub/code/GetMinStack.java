package com.welinkhub.code;

import java.util.Stack;

/**
 * time complexity of push(), pop() and getMin is O(1)
 * space complexity is O(1)
 */
public class GetMinStack {

    private Stack<Integer> stackData;
    private Stack<Integer> stackMin;

    public GetMinStack() {
        this.stackData = new Stack<>();
        this.stackMin = new Stack<>();
    }

    public void push(Integer number) {
        if (this.stackMin.isEmpty()) {
            this.stackMin.push(number);
        } else if (number <= this.getMin()){
            this.stackMin.push(number);
        }
        this.stackData.push(number);
    }

    public Integer pop() {
        if (this.stackData.isEmpty()) {
            throw new RuntimeException("Your Stack is empty!");
        }
        int value = this.stackData.pop();
        if (value == this.getMin()) {
            this.stackMin.pop();
        }
        return value;
    }

    public Integer getMin(){
        if (this.stackMin.isEmpty()) {
            throw new RuntimeException("Your Stack is Empty!");
        }
        return this.stackMin.peek();
    }
}
