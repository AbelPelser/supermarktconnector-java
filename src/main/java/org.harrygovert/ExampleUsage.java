package org.harrygovert;

import lombok.extern.slf4j.Slf4j;
import org.harrygovert.AHConnector.AHSearchSpecification;
import org.harrygovert.JumboConnector.JumboSearchSpecification;
import org.harrygovert.exception.ApiException;

@Slf4j
public class ExampleUsage {

    private static void jumboMain() {
        JumboConnector connector = new JumboConnector();
        var barcodeResult = connector.getProductByBarcode("8720181027758");
        System.out.println(barcodeResult);
        var spec = JumboSearchSpecification.builder().query(barcodeResult.getTitle()).size(20).build();
        System.out.println(connector.searchProducts(spec));
        System.out.println(connector.searchAllProducts(spec));
        var categories = connector.getCategories();
        System.out.println(categories);
        System.out.println(connector.getSubCategories(categories.get(0).getId()));
        // Never works
        try {
            System.out.println(connector.getProductDetails(barcodeResult.getId()));
        } catch (ApiException e) {
            System.out.println(e.getError());
        }
    }

    private static void ahMain() {
        AHConnector connector = new AHConnector();
        var barcodeResult = connector.getProductByBarcode("8410031965902");
        System.out.println(barcodeResult);
        var spec = AHSearchSpecification.builder().query(barcodeResult.getTitle()).build();
        System.out.println(connector.searchProducts(spec));
        System.out.println(connector.searchAllProducts(spec));
        var categories = connector.getCategories();
        System.out.println(categories);
        System.out.println(connector.getSubCategories(categories.get(0).getId() + ""));
        System.out.println(connector.getProductDetails(barcodeResult.getWebshopId() + ""));
    }

    public static void main(String[] args) {
        jumboMain();
        ahMain();
    }
}
