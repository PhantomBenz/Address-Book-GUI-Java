package addressbook.controller;

import addressbook.controller.Profile;

import com.google.gson.Gson;
import java.io.*;

public class Utility {
    
    private String FILE_Path = "addressbook.json";
    private Gson gson = new Gson();

    public Profile[] loadProfiles () {
        try (FileReader reader = new FileReader(FILE_Path)) {
            Container loadP = gson.fromJson(reader, Container.class);
            if(loadP == null) {
                System.out.println("No Profiles to load");
                return null;
            } else {
                System.out.println(loadP.persons.length + " Profiles loaded");
                return loadP.persons;
            } 
        } catch (IOException e) {
            System.out.println("File not found : " + FILE_Path);
            return null;
        }
    }

    public void saveProfiles (Profile[] profiles) {
        Container data = new Container(profiles);
        if (profiles == null) {
            System.out.println("No contacts to save.");
            return;
        }
        try (Writer writer = new FileWriter(FILE_Path)) {
            gson.toJson(data, writer);
            System.out.println("Contacts saved to " + FILE_Path);
        } catch (IOException e) {
            System.err.println("Could not save contacts");
        }
    }

}

class Container {
    public Profile persons[];

    public Container (Profile persons[]) {
        this.persons = persons;
    }
}