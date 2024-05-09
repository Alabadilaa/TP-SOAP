package amoa.webservices;

import javax.jws.WebMethod;
@WebService 
@SOAPBinding(style= Style.RPC)



public interface ProductsManager {

	@WebMethode
	@WebResult(name="productId")
	public long addProduct(@WebParam(name="product") Product product)
	
  
	 @WebMethod
	 @WebResult(name = "product")
	 public Product getProduct(@WebParam(name = "productId") long id) throws NoSuchProductException;

   
    @WebMethod
    @WebResult(name = "price")
    public double getProductPrice(@WebParam(name = "productId") long id) throws NoSuchProductException;

    @WebMethod
    @WebResult(name = "products")
    public Products getProducts();

    @WebMethod
    @WebResult(name = "product")
    public Product updateProduct(@WebParam(name = "product") Product product);

    @WebMethod
    public boolean deleteProduct(@WebParam(name = "productId") long id);

    @WebMethod
    public boolean deleteAllProducts();
}