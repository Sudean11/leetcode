package mwa.dynamicProgramming;

import java.util.concurrent.RecursiveTask;

public class Sanjay extends RecursiveTask {
    Sanjay(){
        Sanjay s = new Sanjay();
        s.fork();
    }

    @Override
    protected Object compute() {
        return null;
    }

    void something(){

}
}

