package pv207.groceries.com;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Product implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @org.kie.api.definition.type.Label("Product name")
   private java.lang.String name;
   @org.kie.api.definition.type.Label("Product price")
   private java.lang.Double price;
   @org.kie.api.definition.type.Label("Quantity")
   private java.lang.Integer quantity;

   public Product()
   {
   }

   public java.lang.String getName()
   {
      return this.name;
   }

   public void setName(java.lang.String name)
   {
      this.name = name;
   }

   public java.lang.Double getPrice()
   {
      return this.price;
   }

   public void setPrice(java.lang.Double price)
   {
      this.price = price;
   }

   public java.lang.Integer getQuantity()
   {
      return this.quantity;
   }

   public void setQuantity(java.lang.Integer quantity)
   {
      this.quantity = quantity;
   }

   public Product(java.lang.String name, java.lang.Double price,
         java.lang.Integer quantity)
   {
      this.name = name;
      this.price = price;
      this.quantity = quantity;
   }
   
   public java.lang.String toString(){
       return "Name: " + name + " " + quantity + "pc. Price: " + price;
   }

}