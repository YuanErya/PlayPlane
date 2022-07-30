package SFT;

import java.util.LinkedList;

public class AnimalShelf {
    LinkedList<int []> cat;
    LinkedList<int []> dog;

    public AnimalShelf() {
       cat=new LinkedList<int[]>();
       dog=new LinkedList<int[]>();
    }

    public void enqueue(int[] animal) {
        if(animal[1]==0){
            cat.add(animal);
        }else if(animal[1]==1){
            dog.add(animal);
        }
    }

    public int[] dequeueAny() {
        if(cat.isEmpty()&&dog.isEmpty()){
            return new int[]{-1,-1};}
        else if((!cat.isEmpty())&&dog.isEmpty()){
            return cat.remove(0);
        }else if(cat.isEmpty()&&(!dog.isEmpty())){
            return dog.remove(0);
        }else{
         if(cat.getFirst()[0]<dog.getFirst()[0]){
             return cat.remove(0);
         }else{
             return dog.remove(0);
         }
        }
    }

    public int[] dequeueDog() {
        if(!dog.isEmpty()){
            return dog.remove(0);
        }else{
            return new int []{-1,-1};
        }

    }

    public int[] dequeueCat() {
        if(!cat.isEmpty()){
            return cat.remove(0);
        }else{
            return new int []{-1,-1};
        }
    }
}
