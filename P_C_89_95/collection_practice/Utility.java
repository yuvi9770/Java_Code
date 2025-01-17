package P_C_89_95.collection_practice;


import java.util.Collection;

public class Utility {
    
    public static <E> void print(Collection<E> collect){
      System.out.print("Collection is: ");
      
      for (E coll : collect) {    // rather then E, Object can be written(Parent class of every)
        System.out.printf("%s ",coll);
      };
      System.out.println();
    }
}
