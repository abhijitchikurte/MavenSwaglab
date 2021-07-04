package test;

import org.testng.annotations.Test;

import pages.CartPage;
import pages.Loginpage;
import pages.productpage;


public class producttest extends Baseclass {
	@Test
	public void test1()
	{
        Loginpage loginobj=new Loginpage();
        productpage objprod=new productpage();
		CartPage objCart = new CartPage();


        String uname = sheet.getRow(1).getCell(0).getStringCellValue();
        String pwd= sheet.getRow(1).getCell(1).getStringCellValue();
		String product = sheet.getRow(1).getCell(2).getStringCellValue();

        loginobj.login(uname, pwd);
        objprod.SelectProduct(product);
        objprod.GotoCart();
		objCart.verifyProduct(product);


}
}