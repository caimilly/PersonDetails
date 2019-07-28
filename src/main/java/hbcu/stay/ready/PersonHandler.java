package hbcu.stay.ready;


public class PersonHandler {
    private final Person[] personArray;

    public PersonHandler(Person[] personArray) {
        this.personArray = personArray;
    }

    public String whileLoop() {
        String result = "";
        // create a `counter`
        // while `counter` is less than length of array
            // begin loop
                // use `counter` to identify the `current Person` in the array
                // get `string Representation` of `currentPerson`
                // append `stringRepresentation` to `result` variable
            // end loop
        int counter = 0;
        Person currentPerson;
        while(counter < personArray.length){
            currentPerson = personArray[counter];
            String stringRepresentation = currentPerson.toString();
            result += stringRepresentation;
            counter++;
        }
        return result;
    }



    public String forLoop() {
        String result = "";
        Person currentPerson;
        // identify initial value: 0
        // identify terminal condition: i < personArray.length
        // identify increment: i++

        // use the above clauses to declare for-loop signature
            // begin loop
                // use `counter` to identify the `current Person` in the array
                // get `string Representation` of `currentPerson`
                // append `stringRepresentation` to `result` variable
            // end loop
        for(int counter = 0; counter < personArray.length; counter++){
            currentPerson = personArray[counter];
            String stringRepresentation = currentPerson.toString();
            result += stringRepresentation;
        }

        return result;
    }



    public String forEachLoop() {
        String result = "";
        // identify array's type: person
        // identify array's variable-name: peep

        // use the above discoveries to declare for-each-loop signature
            // begin loop
                // get `string Representation` of `currentPerson`
                // append `stringRepresentation` to `result` variable
            // end loop
        for (Person currentPerson:personArray) {
            String stringRepresentation = currentPerson.toString();
            result += stringRepresentation;
        }

        return result;
    }


    public Person[] getPersonArray() {
        return personArray;
    }
}
