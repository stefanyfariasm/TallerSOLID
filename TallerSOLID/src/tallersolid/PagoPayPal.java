/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallersolid;

/**
 *
 * @author Estefany Farias
 */
public class PagoPayPal implements IPago{
    private boolean loggedIn;

    @Override
    public void realizarCobro(double monto) {
        if (!loggedIn){
            return;
        }
    }
      
}
