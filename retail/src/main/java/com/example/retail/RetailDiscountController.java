import java.util.List;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/retail")
public class RetailDiscountController {
 
    @Autowired
    UserData userdata;

    @PostMapping("/netAmount/{userType}")
    public int finalAmount(@PathVariable("userType") String userType, int amount, int years, String item_type) {
    	
    	int discount_Amount;
    	int net_Amount;
    	
    	if(item_type.equals("grocery")){
    		net_Amount=amount;
    		return net_Amount;
    	}
    	else{
    		
    	if(userType.equals("employee"))
    	{
    		discount_Amount=amount*(30/100);
    		net_Amount=amount-discount_Amount;
    		return net_Amount;
    	}
    	else if(userType.equals("affiliate"))
    	{
    		discount_Amount=amount*(10/100);
    		net_Amount=amount-discount_Amount;
    		return net_Amount;
    	}
    	else if(userType.equals("customer") && years>=2)
    	{
    		discount_Amount=amount*(5/100);
    		net_Amount=amount-discount_Amount;
    		return net_Amount;
    	}
    	
    	}
    	if(net_amount>=100)
    	{
    		
    			discount_Amount=net_amount*(5/100);
        		net_Amount=net_amount-discount_Amount;
        		return net_Amount;
    	}
   	  }
        
    }
  
 
}