/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package trabcoopoper;

/**
 *
 * @author al1410687
 */
public class Operacao {
    
    private double A;
    private double B;
    private double res;
    
    public Operacao()
    {
        this.A = 0;
        this.B = 0;
        this.res = 0;
    }
    
    public Operacao(double a, double b)
    {
        this.A = a;
        this.B = b;
        this.res = 0;
    }
    
    public double Somar()
    {
        this.res = this.A+this.B;
        return this.res;
    }
    
    public double Dividir()
    {
        this.res = this.A/this.B;
        return this.res;
    }
    
    public double Multiplicar()
    {
        this.res = this.A*this.B;
        return this.res;
    }
    
    public double Subtrair()
    {
        this.res = this.A-this.B;
        return this.res;
    }
    
}
