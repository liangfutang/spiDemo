package com.zjut.spiDemo;

import com.zjut.spiinterface.SpiModelInterface;

import java.util.Iterator;
import java.util.ServiceLoader;

public class Main {
    public static void main(String[] args) {
        ServiceLoader<SpiModelInterface> load = ServiceLoader.load(SpiModelInterface.class);
        Iterator<SpiModelInterface> iterator = load.iterator();
        while (iterator.hasNext()) {
            SpiModelInterface next = iterator.next();
            next.helloSpi();
        }
    }
}
