package by.itClass.comparators;

import by.itClass.Product;

import java.util.Comparator;

public class SortedByPriceComparator implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        if (o1!=null&o2!=null){
            if(o1.getPrice()> o2.getPrice())
                return 1;
            else if(o1.getPrice()< o2.getPrice())
                return -1;
            else
                return 0;
        }
        return 0;
    }
}
