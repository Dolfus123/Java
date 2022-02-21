package by.itClass.comparators;

import by.itClass.Product;

import java.util.Comparator;

public class SortedByNameComparator implements Comparator<Product> {

    @Override
    public int compare(Product o1, Product o2) {
        if (o1!=null&o2!=null){
            return o1.getName().compareTo(o2.getName());
        }else {
            return 0;
        }
    }
}
