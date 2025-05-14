package com.example.my_first_rest_app;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController     // diese Annotation sorgt dafür, dass die angeforderten Daten als ObjectModel zurückgegeben werden
public class ToDoController {

//    @GetMapping("/greet")   // Get Holt sich daten vom Server, welche auf dem Endpunkt "greet" ausgegeben werden
//    public ResponseEntity<String> hello(@RequestParam(value = "name") String name,
//                                        @RequestParam(value = "firstName") String firstName) {
//        //ResponseEntity.ok("Hello " + name + "/" + firstName); Eine weitere möglichkeit, Response Entity
//        return new ResponseEntity<String>("Hello " + name + "/" + firstName, HttpStatus.OK);
//    }

    // Get endpunkt von oben überarbeiten:
    @GetMapping("/todo")   // Get Holt sich daten vom Server, welche auf dem Endpunkt "greet" ausgegeben werden
    public ResponseEntity<Todo> get(@RequestParam(value = "id") Integer id) {

        // neue TODO instanz. dem Objekt werden fiktiv als DB-Ersatz aus der Todo.java
        // Daten übergeben....um diese hinterher mit return zurück zu geben.
        Todo newTodo = new Todo();
        newTodo.setId(11);
        newTodo.setDescription("Einkaufen gehen");
        newTodo.setIsDone(true);

        return new ResponseEntity<Todo>(newTodo, HttpStatus.OK);
        }



    @PostMapping("/todo")      // Wenn über Client daten kommen, werden diese über den POST-Endpunkt weiterverarbeitet
    public ResponseEntity<Todo> create(@RequestBody Todo newTodo) {
                                // Die informationen kommen über den REQUESTBODY, nicht über Parameter
                                // Postman: Reiter BODY, RAW, JSON im Feld anlegen, der an JAVA übergeben wird.

        // save todo in db
        return new ResponseEntity<Todo>(newTodo, HttpStatus.OK );   // Zu lernzwecken werden hier nur Werte zurückgegeben,
                                                                    // die vorher reingekommen sind.

    }




}
