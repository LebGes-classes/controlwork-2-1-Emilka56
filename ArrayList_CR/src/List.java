//Яхудина Эмилия 11=305 Вариант 3
public class List<T> {
    private static final int CAPACITY = 5;
    private int size;
    private T[] array;
    public List(){this.array= (T[]) new Object[CAPACITY];} //создание массива по умолчанию
    public List(int capacity){this.array=(T[]) new Object[capacity];} //создание массива с заданной емкостью

    public void resize(int newSize){
        Object[] newList=new Object[newSize];
        for(int i = 0;i<size;i++){
            newList[i]=array[i];
        }
        array=(T[]) newList;
    }

    public void add(T elem){
        if(size==this.array.length-1){
            resize(size*2);
        }
        array[size++]=elem;
    }

    public void add(int index, T elem){
        if(size==this.array.length-1){
            resize(size*2);
        }
        for(int i = size;i>index;i--){ //сдвиг элементов
            array[i]=array[i-1];
        }
        array[index]=elem;
        size++;
    }
    public void removebyIndex(int index){
        for(int i = index;i<size;i++){
            array[i]=array[i+1]; //сдвиг элементов
        }
        size--;
    }

    public T findByIndex(int index){
        if(index<0 || index>size){
            return null;
        }
        return array[index];
    }
    public void print(){
        System.out.print("\n"+"[");
        for(T elem:array){
            System.out.print(" "+elem);
        }
        System.out.print("]"+"\n");
    }
    public void clear(){
        for(int i = size; i>0;i--){
            array[i-1]=array[i];
        }
    }

//    public void removebyData(T elem){
//        int index=
//    }

}
