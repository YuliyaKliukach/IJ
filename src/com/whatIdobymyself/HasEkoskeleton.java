package com.whatIdobymyself;

public interface HasEkoskeleton {


        abstract int getNumberOfSections();

    }

    abstract class Insect implements HasEkoskeleton {

        abstract int getNumberOfLegs();

    }

    class Beetle extends Insect {

        int getNumberOfLegs() { return 6; }

        @Override
        public int getNumberOfSections() {
            return 0;
        }
    }

