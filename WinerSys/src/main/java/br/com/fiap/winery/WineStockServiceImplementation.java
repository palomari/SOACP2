package br.com.fiap.winery;

import javax.jws.WebService;

@WebService(endpointInterface = "br.com.fiap.winery.WineStockService")
public class WineStockServiceImplementation implements WineStockService {

    @Override
    public String getMenu() {
        return "🍷 Cardápio de Vinhos:\n" +
                "- Cabernet Sauvignon\n" +
                "- Merlot\n" +
                "- Syrah\n" +
                "- Chardonnay\n" +
                "- Pinot Noir";
    }

    @Override
    public String placeOrder(String name, int quantity) {
        return "✅ Pedido confirmado!\n" +
                "Cliente: " + name + "\n" +
                "Quantidade: " + quantity;
    }
}

