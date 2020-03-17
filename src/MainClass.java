import java.math.BigInteger;

public class MainClass
{
    public static void main(String[] args)
    {

    }
    static int[] acmTeam(String[] topic) {

        int n = topic.length;
        BigInteger[] bi = new BigInteger[n];

        for (int i = 0; i < n; i++)
            bi[i] = new BigInteger(topic[i], 2);

        int maxTopic = 0;
        int teamCount = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                BigInteger iuj = bi[i].or(bi[j]);
                int bitCount = iuj.bitCount();
                if (bitCount > maxTopic) {
                    maxTopic = bitCount;
                    teamCount = 1;
                } else if (bitCount == maxTopic) {
                    teamCount++;
                }
            }
        }

        int result[] = { maxTopic, teamCount };
        return result;
    }
}
