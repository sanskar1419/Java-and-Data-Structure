package Generics;

public class Pair<T,S> {
    private T first;
    private S second;

    public Pair(){}

    public Pair(T first , S second){
        this.first = first;
        this.second = second;
    }

    public T getFirst(){
        return first;
    }

    public S getSecond(){
        return second;
    }

    public void setFirst(T first){
        this.first = first;
    }

    public void setSecond(S second){
        this.second = second;
    }

}
