package com.company.interview_practise;

public class BsInterview {

    public static void main(String[] args) {

        Counter counter1 = new Counter();

        Counter counter2 = new Counter();

        Counter counter3 = new Counter();

    }
}

class  Counter{

    static int count = 0;

    public Counter(){

        count += 1;

        System.out.print(count+ "");

    }

}
