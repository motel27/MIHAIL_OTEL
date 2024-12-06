package homework_nr_14;

    public class Airplane {

        String manufacturer;
        String model;
        int nrOfEngines;

        public Airplane(String manufacturer, String model, int nrOfEngines)
                throws InvalidManufacturerException, InvalidModelException
        {
            this.manufacturer = manufacturer;
            this.model = model;
            this.nrOfEngines = nrOfEngines;

            if (manufacturer == null || manufacturer.isEmpty()) {
                throw new InvalidManufacturerException("Manufacturer can't be null or empty");
            }
            if (model == null || model.isEmpty()) {
                throw new InvalidModelException("Model can't be null or empty");
            }
            if (nrOfEngines == 0 || nrOfEngines % 2 !=0){
                throw new  InvalidNrOfEnginesException ("nrOfEngines can't be 0 and odd");
            }

        }

        public String getManufacturer() {
            return manufacturer;
        }

        public void setManufacturer(String manufacturer) {

            this.manufacturer = manufacturer;
        }

        public String getModel() {
            return model;
        }

        public void setModel(String model) {
            this.model = model;
        }

        public int getNrOfEngines() {
            return nrOfEngines;
        }

        public void setNrOfEngines(int nrOfEngines) {
            this.nrOfEngines = nrOfEngines;
        }


        @Override
        public String toString() {
            return "Airplane{" +
                    "manufacturer='" + manufacturer + '\'' +
                    ", model='" + model + '\'' +
                    ", nrOfEngines=" + nrOfEngines +
                    '}';

        }
    }

