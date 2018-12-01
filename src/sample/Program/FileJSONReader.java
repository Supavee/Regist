package sample.Program;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.simple.JSONValue;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.*;
import java.util.ArrayList;


public class FileJSONReader {

    public void main() throws JSONException {
        JSONParser parser = new JSONParser();
        try {
            // create object from file
            Object obj = parser.parse(new FileReader("subjects.json.txt"));
            JSONObject jsonObject = new JSONObject();

            // get object from json
            String nameSubject = (String) jsonObject.get("NameSubject");
            String idSubject = (String) jsonObject.get("IDSubject");
            String status = (String) jsonObject.get("Status");

            // just show next subject to learn
            JSONArray toNameSubject = (JSONArray) jsonObject.get("toNameSubject");
            JSONArray toIDSubject = (JSONArray) jsonObject.get("toIDSubject");

            ArrayList<String> checktoNameSJ = new ArrayList<>();
            ArrayList<String> checktoIDSJ = new ArrayList<>();
            for (int i=0; i < toNameSubject.length(); i++) {
                checktoNameSJ.add(String.valueOf(toNameSubject.getJSONObject(i)));
                checktoIDSJ.add(String.valueOf(toNameSubject.getJSONObject(i)));
            }

            // check subject before learn
            JSONArray beforeThisSubject = (JSONArray) jsonObject.getJSONArray("BeforeThisSubject");

            // do while loop to check json array and change to array list for class subject
            ArrayList<String> checkSJ = new ArrayList<>();
            for (int i=0; i < beforeThisSubject.length(); i++) {
                checkSJ.add(String.valueOf(beforeThisSubject.getJSONObject(i)));
            }
            // send object to class Subject

            Subject subject = new Subject(nameSubject,idSubject,status,checktoNameSJ,checktoIDSJ,checkSJ);

        } catch (ParseException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
