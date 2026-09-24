package com.practice.employeeTest;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Products {
	
	@FindBy(xpath = "//input[@alt='CreateProduct']")
	private WebElement createProductImgBtn;

}
