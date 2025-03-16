package org.View;

public class ShopView {

    public ShopView() {}

    public void showMoneyError() {
        System.out.println("Non hai abbastanza soldi per comprare questo oggetto.");
    }

    public void showSuccessTransaction() {
        System.out.println("Acquisto andato a buon fine. Troverai l'oggetto nel tuo inventario");
    }

    public void showItemError() {
        System.out.println("L'oggetto che hai selezionato non esiste o lo hai già acquistato.");
    }
}
