class Solution {
    public double myPow(double x, int n) {
        double product=1;
        long power=n;
        if(power<0){
            power=-power;
        }
        while(power>0){
            if(power%2==1){
                product=product*x;
            }
            x=x*x;
            power=power/2;
        }
        if(n<0){
            product = 1/product;
        }
        return product;
    }
}