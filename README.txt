Each orderRequest will have a recursive object consisting of orderRequest inside it.

When the first orderRequest is sent the initial sender is set. The receiver will be updated for every pass.
In order to be able to view the entire history log of all the entities that the order has been passed through, we have created recursive objects.

For each forwarding of the order, the receiver in the original order gets updated. 

The new order instance is called and the current account is set as its set as the new sender and the new recevier will be determined 
once they assign the order to themselves.

This order and all its stages can thus be tracked from all the accounts such as that of the Clinic, CDC, State Health Dept, Distributor.


Flow 
1. Clinic places order.
2. CDC approves order.
3. SHD approves order.
4. Distributor receives the order and delivers it.
5. Clinic receives and approves delivery of the order.


You can test this out in the following way.
1. Copy the given Assignment7DataBank.db40 filefrom the project root folder to F drive, or change the path in the db40 package to the path 
where you have saved the file.

2. Run the project.

3. Follow the above given flow for the order placement.

4. Login using below give usn and pw.(No need to use admin logins)


Clinic:----------> username: clinic	    Password: clinic
CDC:-------------> 			 cdc				  cdc
SHD:------------->			 shd				  shd
Distributor:----->			 ups				  ups

Admins:

System Admin:----> username: sysadmin	Password: sysadmin
Hospital admin:-->			 bchadmin			  bchadmin
CDC Admin:------->			 cdcadmin		 	  cdcadmin
SHD Admin:------->			 shdadmin			  shdadmin
Distributor Admin:			 upsadmin			  upsadmin

- P.S (Don't share this code with anyone, its only meant for our project)


Varun Murthy




