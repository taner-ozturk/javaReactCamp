import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.business.concretes.ProductManager;
import nLayeredDemo.core.concretes.jLoggerManagerAdapter;
import nLayeredDemo.dataAccess.concretes.HibertnateProductDao;
import nLayeredDemo.entities.concretes.Product;

public class Main {

    public static void main(String[] args) {
        //ToDo: Spring IoC ile çözülecek
        ProductService productService = new ProductManager(new HibertnateProductDao(),new jLoggerManagerAdapter());

        Product product = new Product(1,2,"Elma",12,50);
        productService.add(product);
    }
}
