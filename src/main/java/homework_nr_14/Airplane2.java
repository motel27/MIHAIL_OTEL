package homework_nr_14;

public class Airplane2 {

        // LBYL
        public Airplane createAirplaneLBYL(String manufacturer, String model, int nrOfEngines) {
            if (manufacturer == null || manufacturer.isEmpty()) {
                System.err.println("Invalid manufacturer: " + manufacturer);
                return null;
            }
            if (model == null || model.isEmpty()) {
                System.err.println("Invalid model: " + model);
                return null;
            }
            if (nrOfEngines <= 0 || nrOfEngines % 2 != 0) {
                System.err.println("Invalid number of engines: " + nrOfEngines);
                return null;
            }
            try {
                return new Airplane(manufacturer, model, nrOfEngines);
            } catch (Exception e) {
                System.err.println("Unexpected error: " + e.getMessage());
                return null;
            }
        }

        // EAFP
        public Airplane createAirplaneEAFP(String manufacturer, String model, int nrOfEngines) {
            try {
                return new Airplane(manufacturer, model, nrOfEngines);
            } catch (InvalidManufacturerException | InvalidModelException | InvalidNrOfEnginesException e) {
                System.err.println("Error creating Airplane: " + e.getMessage());
                return null;
            }
        }
}
