package pv207.groceries.com;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class ProductList implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @org.kie.api.definition.type.Label(value = "Products")
   private java.util.List<pv207.groceries.com.Product> products;

   public ProductList()
   {
   }

   public java.util.List<pv207.groceries.com.Product> getProducts()
   {
      return this.products;
   }

   public void setProducts(java.util.List<pv207.groceries.com.Product> products)
   {
      this.products = products;
   }

   public ProductList(java.util.List<pv207.groceries.com.Product> products)
   {
      this.products = products;
   }

}