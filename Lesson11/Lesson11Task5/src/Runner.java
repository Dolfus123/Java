import by.itClass.Product;
import by.itClass.comparators.SortedByNameComparator;
import by.itClass.comparators.SortedByPriceComparator;

import static java.util.Arrays.sort;

public class Runner {
    public static void info(Product[] p){
        for(int i=0;p.length>i;i++){
            if (p[i]!=null){
                System.out.println(p[i].toString());
            }else {
                System.out.println("null");
            }

        }
    }

    public static void main(String[] args) {
        Product[] product=new Product[6];
        product[0]= new Product("toy",45,5);
        product[1]= new Product("bread",10,10);
        product[2]= new Product("butter",20,15);
        product[3]= new Product("umbrella",4,25);
        product[4]= new Product("car",45800,2);

        info(product);
        SortedByPriceComparator comparator2 = new SortedByPriceComparator();
        sort(product,comparator2);
        System.out.println("Sorting by price...");

        info(product);
        SortedByNameComparator comparator1 = new SortedByNameComparator();
        sort(product,comparator1);
        System.out.println("Sorting by name...");

        info(product);
    }
}
