package z1959955.cs.niu.edu.port2;

/*
    Herbert Morales
    CSCI-322/522
    Z1959955
    Portfolio 2
    Due date: 02/08/23
 */

public class TipCalculator {
    private float tip, bill;

    public TipCalculator(float new_tip, float new_bill) {
        tip = new_tip;
        bill = new_bill;
    }

    public float getTip() {
        return tip;
    }

    public void setTip(float new_tip) {
        tip = 0.0f;
        if(new_tip > 0.0f) {
            tip = new_tip;
        }
    }//end setTip method

    public float getBill() {
        return bill;
    }

    public void setBill(float new_bill) {
        bill = 0.0f;
        if(new_bill > 0.0f) {
            bill = new_bill;
        }
    }// end of setBill method

    //method to calculate tip
    public float calculateTip() {
        return bill * tip;
    }//end of calculateTip

    //method to calculate the total of the bill
    public float calculateTotal() {
        return bill + calculateTip();
    }//end of calculateTotal method

}// end of TipCalculator class
