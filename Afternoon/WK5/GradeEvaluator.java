public class GradeEvaluator
{
    public static char evaluateScore(double score) throws MySWDVExceptions
    {
        char grade = ' ';

        if (score < 0 || score > 100)
        {
            throw new MySWDVExceptions("Score must be between 0 and 100!\n");
        }

        if (score >= 39 && score < 40)
        {
            throw new MySWDVExceptions("Please add mark (1%) to this score!\n");
        }

        if (score >= 80)
        {
            grade = 'A';
        }
        else if (score >= 70)
        {
            grade = 'B';
        }
        else if (score >= 60)
        {
            grade = 'C';
        }
        else if (score >= 50)
        {
            grade = 'D';
        }
        else if (score >= 40)
        {
            grade = 'E';
        }
        else 
        {
            grade = 'F';
        } 

        return grade;

    }
}