package com.ty.controll;

import com.ty.doa.ItemInvoiceDoa;
import com.ty.dto.Invoice;
import com.ty.dto.Item;

public class TestInvoice {

	public static void main(String[] args) {

		/*
		 * Invoice invoice =new Invoice(); invoice.setId(2); invoice.setName("Ram");
		 * invoice.setBillAdd("KR"); invoice.setGstNo("sp-45"); invoice.setTax(18.65);
		 * 
		 * 
		 * Item item=new Item(); item.setId(2); item.setName("Watch");
		 * item.setPrice(1555); item.setQty(15); invoice.setItem(item);
		 */
		
		ItemInvoiceDoa dao=new ItemInvoiceDoa();
		//dao.save(invoice, item);
		/*
		 * Invoice invoice =dao.getdetail(1);
		 * System.out.println("Invoice Id : "+invoice.getId());
		 * System.out.println("Invoice Name : "+invoice.getName()); Item
		 * item=invoice.getItem(); System.out.println("Item Id : "+item.getId());
		 * System.out.println("Item Name : "+item.getName());
		 */
		
		
		//dao.delete(1);
		Invoice invoice=new Invoice();
		invoice.setName("Ajay");
		dao.update(invoice);
		
		
	}

}
