package com.example.android.vrilissiacityguide;

import static com.example.android.vrilissiacityguide.R.id.address;

/**
 * Created by georgeampartzidis on 9/6/17.
 * {@link Details} represents a place (cafe, restaurant,park or place of interest.
 * It contains the name, address and phone number of the place and, if available, an image.
 */

public class Details {

    //resource id for the image associated with the place.
    //Initialize it with a value (-1) out of range of possible Id values.
    //The value is static because it is a class variable, same for all instances and
    //final because we don't want it to change.
    private static final int NO_IMAGE_PROVIDED = -1;
    private int resourceId = NO_IMAGE_PROVIDED;

    //resource id for the telephone number of the place. Initialize it with a value out of range.
    private static final int NO_TEL_PROVIDED = -1;
    private int telNumberId = NO_TEL_PROVIDED;

    //resource id for the name
    private int nameId;

    //resource id for the address
    private int addressId;

    //resource id for the web address
    private int webId;


    //Constructor for places with no available web address
    public Details(int image, int name, int address, int telNumber){
        resourceId= image;
        nameId= name;
        addressId= address;
        telNumberId= telNumber;
    }

    //Constructor for places with all data available
    public Details(int image, int name, int address, int telNumber, int webAddress) {
        resourceId = image;
        nameId = name;
        addressId = address;
        telNumberId = telNumber;
        webId= webAddress;
    }


    //Constructor for places without phone number nor web address available
    public Details(int image, int name, int address) {
        resourceId = image;
        nameId = name;
        addressId = address;

    }

    //method to get the image resource Id
    public int getResourceId() {
        return resourceId;
    }

    //method to get the name of the place
    public int getName() {
        return nameId;
    }

    //method to get the address of the place
    public int getAddress() {
        return addressId;
    }

    //method to get the telephone number of the place
    public int getTelNumber() {
        return telNumberId;
    }

    //method to get the web address of the place
    public int getWebAddress(){
        return webId;
    }

    //method to check whether an image is provided or not. If the resourceId is updated,
    //it returns true.
    public boolean hasImage() {
        return resourceId != NO_IMAGE_PROVIDED;
    }

    //method to check whether a telephone number is provided or not. If the telNumber is updated,
    //it returns true
    public boolean hasPhone() {
        return telNumberId != NO_TEL_PROVIDED;
    }
}
