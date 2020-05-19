package com.syntax.repl;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class Repl205_ {

	public static void main(String[] args) {
		List<Map<String, Object>> dataList = new ArrayList<>();
		Map<String, Object> appleMap = new LinkedHashMap<>();
		appleMap.put("Items", "Apple");
		appleMap.put("Price", 20.00);
		appleMap.put("Quantity", 10.0);
		dataList.add(appleMap);
		Map<String, Object> orangeMap = new LinkedHashMap<>();
		orangeMap.put("Items", "Orange");
		orangeMap.put("Price", 21.99);
		orangeMap.put("Quantity", 10.0);
		dataList.add(orangeMap);

		double subTotal = 0;
		double subTotal1 = 0;
		double totalPurchase = 0;
		for (Map<String, Object> map : dataList) {
			Set<String> keys = map.keySet();

			for (String key : keys) {
				System.out.print(key + ": " + map.get(key) + " ");
				if (map.equals(appleMap)) {
					Double price = (Double) map.get("Price");
					double quantity = (double) map.get("Quantity");
					subTotal = price * quantity;
				} else if (map.equals(orangeMap)) {
					double p = (double) map.get("Price");
					double q = (double) map.get("Quantity");
					subTotal = p * q;
				}
			}
			System.out.println("SubTotal: " + subTotal);
		}
		totalPurchase =subTotal+subTotal;
		System.out.println("Your Purchase total: " + totalPurchase);
	}

}
