package org.harrygovert;

import lombok.extern.slf4j.Slf4j;
import org.harrygovert.AHConnector.AHSearchSpecification;
import org.harrygovert.JumboConnector.JumboSearchSpecification;
import org.harrygovert.exception.ApiException;

@Slf4j
public class ExampleUsage {

    private static void jumboMain() {
        JumboConnector connector = new JumboConnector();
        System.out.println(connector.getProductByBarcode("8720181027758"));
        var spec = JumboSearchSpecification.builder().query("Brood").size(20).build();
        System.out.println(connector.searchProducts(spec));
        System.out.println(connector.searchAllProducts(spec));
        System.out.println(connector.getCategories());
        System.out.println(connector.getSubCategories("SG1"));
        // Never works
        try {
            System.out.println(connector.getProductDetails("404627BUS"));
        } catch (ApiException e) {
            System.out.println(e.getError());
        }
    }

    private static void ahMain() {
        AHConnector connector = new AHConnector();
        System.out.println(connector.getProductByBarcode("8410031965902"));
        AHSearchSpecification spec = AHSearchSpecification.builder().query("z").build();
        System.out.println(connector.searchProducts(spec));
        System.out.println(connector.searchAllProducts(spec));
        System.out.println(connector.getCategories());
        System.out.println(connector.getSubCategories("6401"));
        System.out.println(connector.getProductDetails("197393"));
    }

    public static void main(String[] args) {
        jumboMain();
        ahMain();
    }
}
