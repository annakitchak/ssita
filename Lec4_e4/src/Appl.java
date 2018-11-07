//  Create class Product with fields name, price and quantity.
//  Create four instances of type Product.
//  Display the name and quantity of the most expensive item.
//  Display the name of the items, which has the biggest quantity.


public class Appl {
    public static void main(String[] args) {

        Product p1 = new Product("iPhone",38850,7);
        Product p2 = new Product("Samsung",25550,12);
        Product p3 = new Product("Xiaomi",8100,13);
        Product p4 = new Product("Huawei",4340,16);
        Product p5 = new Product("Huawei",5740,19);


        Product [] products = {p1,p2,p3,p4,p5};

		int max=0;
		int min=p1.getPrice();
		int mq=0;
		Product res = null;
		for (int i = 0; i < products.length; i++) {
			if(products[i].getPrice()>max){
				max = products[i].getPrice();
                res = products[i];
			}
		}
		System.out.println("max price = "+max);
        System.out.println(res);

        for (int i = 0; i < products.length; i++) {
            if(products[i].getPrice()<min){
                min = products[i].getPrice();
                res = products[i];
            }
        }
        System.out.println("min price = "+min);
        System.out.println(res);

        for (int i = 0; i < products.length; i++) {

            if(products[i].getQuantity()>mq){
                mq = products[i].getQuantity();
                res = products[i];
            }
        }
        System.out.println("max quantity = "+mq);
        System.out.println(res);
    }
}
