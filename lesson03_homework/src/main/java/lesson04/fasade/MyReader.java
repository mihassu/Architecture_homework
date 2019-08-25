package lesson04.fasade;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MyReader {

    private InputStreamReader in = new InputStreamReader(System.in);
    private BufferedReader reader = new BufferedReader(in);

    public String readString() throws IOException {
        return reader.readLine();
    }

    public int readInt() throws IOException {
        return Integer.parseInt(reader.readLine());
    }
}
