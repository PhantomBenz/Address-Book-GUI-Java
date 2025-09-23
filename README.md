# Address Book GUI JAVA

A simple Address Book application built using Java and JavaFX. This is a GUI-based version of a previously made CLI app.

## Features

- Add, edit, and delete contacts
- View contacts in a table
- Save and load contacts from a JSON file
- User-friendly GUI built with JavaFX

## Getting Started

### Requirements

- Java 17 or newer
- JavaFX SDK
- IDE (IntelliJ, Eclipse, or VS Code) *I used IntelliJ ultimate edition*

### Setup Instructions

1. **Clone the repository**
   ```bash
   git clone https://github.com/sumoondev/Address-Book-GUI-Java.git
   cd Address-Book-GUI-Java
   ```

2. **Download Libraries**
   * [What to do](lib/README.md)
   *Note: Do as per instruction.*

3. **Run the project**

   * If using command line:

     ```bash
     javac --module-path /path/to/javafx-sdk/lib --add-modules javafx.controls,javafx.fxml -d out src/com/addressbook/*.java
     java --module-path /path/to/javafx-sdk/lib --add-modules javafx.controls,javafx.fxml -cp out com.addressbook.Main
     ```

   * Or simply run `App.java` from your IDE after adding JavaFX as a library/module.

## Project Structure

    ```
    AddressBook-GUI-JavaFX/
    ├── src/
    │   ├── com/
    │   │   └── addressbook/
    │   │       ├── Main.java                       Entry point for the app
    │   │       ├── AddressBookController.java      JavaFX controller logic
    │   │       ├── Contact.java                    Data class for a contact
    │   │       ├── Utility.java                    JSON save/load support
    │   │       └── addressbook.fxml                UI layout in FXML
    ├── README.md                        
    ```

## TODO

* [ ] Create Contact class
* [ ] Create Utility class for file I/O
* [ ] Design UI using JavaFX
* [ ] Connect FXML with controller
* [ ] Add validation and search

---

## Author

* Sumoon Byanjankar
* Contact : <a href="mailto:stu@sumoonbyanjankar.com.np">Main</a>

---

## License

This module is distributed under the [MIT License](LICENSE).

---