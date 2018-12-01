import java.util.Random;

public class Checksorted {
    public boolean checksorted (char [] array)
    {
        boolean value = true;
        if (array != null && array.length > 0)
        {
            char pre_num = array[0];
            for (int i = 1; i < array.length; i++)
            {
                char stat = array[i];
                if (stat < pre_num)
                {
                    value = false;
                    break;
                }
                pre_num = stat;
            }
        }
        else
            value = false;
        return value;
    }
}
