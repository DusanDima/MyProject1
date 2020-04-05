# MyProject1
**ITBootcamp Final Project Automation Test**
===
*Target application URL is:* https://petstore.octoperf.com

**Target browsers:**

• Google Chrome, Version 80.0.3987.163 (Official Build) (64-bit) 

___
**Used libraries:**

• TestNG automation testing framework

• Selenium portable framework for testing web applications

• Apache POI library for manipulating various file formats
___
**The following website functionalities are tested:**

• entering the store

• do links from all three menus work and do they lead the user to the correct pages

• registering users by filling the form using data from the pet-store-data.xlsx file

• sign in by using already existing users

• adding products from the pet-store-data.xlsx file and testing if added file products match the products in the cart 

• deleting cookies for another cart test

• testing the total product price in cart
___
**This project contains 3 packages:**

• pages

• tests

• utils

All packages are in the src folder.
___
**Package pages contains 6 classes:**

• CartPage

• HomePage

• PetStoreMenuPage

• RegistrationPage

• SignInPage

• StoreItemPage
___
**Package tests contains 5 classes:**

• CartTest

• EnterTheStore

• LogInTest

• PetStoreMenuTest

• RegistrationTest
___
**Package utils contains one class:**

• ExcelUtils
Utils and methods from ExcelUtils class are used for manipulating a .xlsx file.
Folder data contains:
• pet-store-data.xlsx file 

Locators are located in the config folder.

Testing data is located in the data folder.
