import java.math.*;

class Solution {
    BigDecimal factorial(BigDecimal ball){
        if(ball.equals(BigDecimal.valueOf(0))) return new BigDecimal("1");
        return ball.multiply(factorial(ball.subtract(new BigDecimal("1"))));
    }
    public BigInteger solution(int balls, int share) {
            BigDecimal over = factorial(BigDecimal.valueOf(balls));
            BigDecimal under = factorial(BigDecimal.valueOf(balls-share)).multiply(factorial(BigDecimal.valueOf(share)));
            BigInteger answer = over.divide(under).toBigInteger();
            return answer;   
    }
}