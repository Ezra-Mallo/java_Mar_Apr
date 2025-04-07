public class GradeEvaluator
{
    /**
     * @param score
     * @val =  
     * @throws MyInvalidScoreExceptions
     */
    public static char evaluateScore(double score) throws MyInvalidScoreExceptions
    {
   
        if (score < 0 || score >100)
        {
            throw new MyInvalidScoreExceptions("Score must be between 0 and 100!");
        }
        char val ;

        if (score >= 80 )
        {
            val =   'A';
        }
        else if (score >= 70 )
        {
            val =   'B';
        }
        else if (score >= 60 )
        {
            val =   'C';
        }
        else if (score >= 50 )
        {
            val =   'D';
        }
        else if (score >= 40 )
        {
            val =   'E';
        }
        else  
        {
            val =   'F';
        }
        return val;
        
    }
}