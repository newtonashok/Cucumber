package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.LibGlobal;

import junit.framework.Assert;

public class BookedItinerary extends LibGlobal {
	public BookedItinerary() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@href='BookedItinerary.php']")
	private WebElement bookedItinerary;
	@FindBy(id = "order_id_text")
	private WebElement searchOrderId;
	@FindBy(id = "search_hotel_id")
	private WebElement clickSearchHotelId;

	@FindBy(xpath = "(//input[@type='button'])[1]")
	private WebElement cancelBookingOrderId;

	@FindBy(xpath = "(//table[2]//tr[2]/td[3])")
	private WebElement cancelExistingOrderId;

	public WebElement getCancelExistingOrderId() {
		return cancelExistingOrderId;
	}

	@FindBy(id = "search_result_error")
	private WebElement verifyCancelBooking;

	@FindBy(id = "order_no")
	private WebElement bookedOrderId;

	public WebElement getBookedOrderId() {
		return bookedOrderId;
	}

	public WebElement getVerifyCancelBooking() {
		return verifyCancelBooking;
	}

	public WebElement getBookedItinerary() {
		return bookedItinerary;
	}

	public WebElement getSearchOrderId() {
		return searchOrderId;
	}

	public WebElement getClickSearchHotelId() {
		return clickSearchHotelId;
	}

	public WebElement getCancelBookingOrderId() {
		return cancelBookingOrderId;
	}

	public void cancelBookingOrderId() {
		String attribute = getAttribute(bookedOrderId);
		System.out.println("My Order Id Is " + attribute);

		btnClick(getBookedItinerary());
		type(getSearchOrderId(), attribute);
		btnClick(getClickSearchHotelId());
		btnClick(getCancelBookingOrderId());
		alert();
	}

	public void cancelExistingBooking() {

		btnClick(getBookedItinerary());
		btnClick(getCancelExistingOrderId());
		alert();
	}

	public void verifyCancelBooking() {
		String verifyCancelBooking = getText(getVerifyCancelBooking());
		Assert.assertEquals("Cancel error", "The booking has been cancelled.", verifyCancelBooking);
	}

}
