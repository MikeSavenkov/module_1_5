package com.msavenkov.patterns.behavioral.iterator;

public class EuropeCar implements Collection{
    private String model;
    private String[] options;

    public EuropeCar(String model, String[] options) {
        this.model = model;
        this.options = options;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String[] getOptions() {
        return options;
    }

    public void setOptions(String[] options) {
        this.options = options;
    }

    @Override
    public Iterator getIterator() {
        return new OptionIterator();
    }

    private class OptionIterator implements Iterator {
        int index;
        @Override
        public boolean hasNext() {
            if (index < options.length) {
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            return options[index++];
        }
    }
}
