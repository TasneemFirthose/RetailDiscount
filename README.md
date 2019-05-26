# RetailDiscount
# Getting Started
 
 
# sample request api:

#  http://localhost:8080/retail/netAmount/{employee}
 
# input data:
 
 userType: employee 
 amount: 500 
 years: 3 
 item_type: clothing 
 
# sample response:
 
 discount_amount= 500*(30/100); 
 net_amount= 500-150; 
 net_amount= 350
  
#  if(net_amount>=100) 
   
   if(350>=100)
   {
     discout_amount= 350*(5/100);
     net_amount= 350- 17.5
#  net_amount= 332.5
