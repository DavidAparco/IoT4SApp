package com.smartcity.iot4;

import com.google.android.gms.maps.model.LatLng;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by root on 06/10/16.
 */
public class IoT4Device {
    String id;
    String modelo;
    String installDate;
    String installHour;
    LatLng position;
    String zona;
    String[] sensorsAttached;

    public IoT4Device(String id, String modelo, String installDate, String installHour, LatLng position, String zona, String[] sensorsAttached) {
        this.id = id;
        this.modelo = modelo;
        this.installDate = installDate;
        this.installHour = installHour;
        this.position = position;
        this.zona = zona;
        this.sensorsAttached = sensorsAttached;
    }

}
