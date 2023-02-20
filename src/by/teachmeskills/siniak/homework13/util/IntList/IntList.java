package by.teachmeskills.siniak.homework13.util.IntList;

import java.util.Arrays;

public class IntList {
    private int [] list;

    public IntList(){

    }
    public IntList(int [] list){
        this.list=list;
    }

    public String toString(){
        return Arrays.toString(list);
    }
    public int get(int index){
        for (int i = 0; i < list.length; i++) {
            if (list[i]==list[index]){
                return list[i];
            }
        }
        return 0;
    }
    public int set (int index, int element){
        for (int i = 0; i < list.length; i++) {
            if (list[i]==list[index]){
                list[i]=element;
            }
        }
        return element;
    }
    public int size(){
        return list.length;
    }

    public void add(int element){
        list= Arrays.copyOf(list,list.length+1);
        list[list.length-1]=element;
    }
    public int remove(int index){
        int removedElement=list[index];
        int [] result= new  int[list.length-1];
        System.arraycopy(list, 0, result, 0, index);
        System.arraycopy(list, index + 1, result, index, list.length - index - 1);
        list=result;
        return removedElement;
    }
    public IntList subList(int startIndexInclusive, int endIndexExclusive){
        int [] arraySubList=Arrays.copyOfRange(list,startIndexInclusive,endIndexExclusive-1);
        IntList subListObj=new IntList(arraySubList);
        return subListObj;
    }

    public IntList subList(int startIndexInclusive){
        int [] arraySubList=Arrays.copyOfRange(list,startIndexInclusive,list.length);
        return new IntList(arraySubList);
    }

    public  int lastIndexOf(int element){
        int tmp=-1;
        for (int i = 0; i < list.length; i++) {
            if (element==list[i]){
                tmp=i;
            }
        }
        return tmp;
    }
}
