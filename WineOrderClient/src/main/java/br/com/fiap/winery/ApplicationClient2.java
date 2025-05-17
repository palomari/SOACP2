package br.com.fiap.winery;

import br.com.fiap.winery.generated.WineStockService;
import br.com.fiap.winery.generated.WineWarningService;
import br.com.fiap.winery.generated.WineStockServiceImplementationService;
import br.com.fiap.winery.generated.WineWarningServiceImplementationService;

public class ApplicationClient2 {

    public static void main(String[] args) {

        WineStockServiceImplementationService stockService = new WineStockServiceImplementationService();
        WineStockService wineStock = stockService.getWineStockServiceImplementationPort();

        String menu = wineStock.getMenu();
        System.out.println("📋 Menu de Vinhos:");
        System.out.println(menu);

        String order = wineStock.placeOrder("Julia", 3);
        System.out.println("\n✅ Resposta do Pedido:");
        System.out.println(order);

        WineWarningServiceImplementationService warningService = new WineWarningServiceImplementationService();
        WineWarningService wineWarning = warningService.getWineWarningServiceImplementationPort();

        String warning = wineWarning.sendWarn();
        System.out.println("\n⚠️ Alerta de Estoque:");
        System.out.println(warning);
    }
}


