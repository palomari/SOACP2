package br.com.fiap.winery;

import javax.xml.ws.Endpoint;

public class Loader {

    public static void main(String[] args) {

        WineStockServiceImplementation wineStock = new WineStockServiceImplementation();
        String stockUrl = "http://localhost:8085/WineStockService";
        Endpoint.publish(stockUrl, wineStock);
        System.out.println("✅ Serviço de estoque publicado em: " + stockUrl);

        WineWarningServiceImplementation wineWarning = new WineWarningServiceImplementation();
        String warningUrl = "http://localhost:8086/WineWarningService";
        Endpoint.publish(warningUrl, wineWarning);
        System.out.println("⚠️ Serviço de aviso publicado em: " + warningUrl);
    }
}
