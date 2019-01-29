
package products_project1;

public class Product {
    private int id;
    private String name;
    private float price;
    private String addDate;
    private byte[] picture;
    
    public Product(int pid, String pname, float pprice, String paddDate, byte[] ppimg)
    {
        this.id = pid;
        this.name = pname;
        this.price = pprice;
        this.addDate = paddDate;
        this.picture = ppimg;
    }
    
    public int getId()
    {
        return id;
    }
    
    public String getName()
    {
        return name;
    }
     
    public float getPrice()
    {
        return price;
    }
    
    public String getDate()
    {
        return addDate;
    }
    
    public byte [] getImage()
    {
        return picture;
    }
}
