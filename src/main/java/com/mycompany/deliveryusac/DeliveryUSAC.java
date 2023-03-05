package com.mycompany.deliveryusac;
import static com.mycompany.deliveryusac.AppState.listaRegion;
/**
 *
 * @author manuel
 */
public class DeliveryUSAC {

    public static void main(String[] args) {
        loginJFrame LOGIN = new loginJFrame();
        LOGIN.setVisible(true);
        Region_Precio nuevaRegion1 = new Region_Precio();
        nuevaRegion1.setnombreRegion("(M) Metropolitana");
        nuevaRegion1.setprecioEstandar(25.00 );
        nuevaRegion1.setprecioEspecial(35.00);
        listaRegion.add(nuevaRegion1);
        
        Region_Precio nuevaRegion2 = new Region_Precio();
        nuevaRegion2.setnombreRegion("(NT) Norte");
        nuevaRegion2.setprecioEstandar(45.55);
        nuevaRegion2.setprecioEspecial(68.50);
        listaRegion.add(nuevaRegion2);
        
        Region_Precio nuevaRegion3 = new Region_Precio();
        nuevaRegion3.setnombreRegion("(NO) Nororiente");
        nuevaRegion3.setprecioEstandar(35.48);
        nuevaRegion3.setprecioEspecial(58.68);
        listaRegion.add(nuevaRegion3);
        
        Region_Precio nuevaRegion4 = new Region_Precio();
        nuevaRegion4.setnombreRegion("(SO) Suroriente");
        nuevaRegion4.setprecioEstandar(32.48);
        nuevaRegion4.setprecioEspecial(38.68);
        listaRegion.add(nuevaRegion4);
        
        Region_Precio nuevaRegion5 = new Region_Precio();
        nuevaRegion5.setnombreRegion("(SOC) Suroccidente");
        nuevaRegion5.setprecioEstandar(29.00);
        nuevaRegion5.setprecioEspecial(34.00);
        listaRegion.add(nuevaRegion5);
        
        Region_Precio nuevaRegion6 = new Region_Precio();
        nuevaRegion6.setnombreRegion("(NOC) Noroccidente");
        nuevaRegion6.setprecioEstandar(40.00);
        nuevaRegion6.setprecioEspecial(44.50);
        listaRegion.add(nuevaRegion6); 
    }
}
