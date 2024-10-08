package com.fasteners.webapp.service;

import com.fasteners.webapp.entity.Fastener;
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

@Service
public class FastenerService {
    @Autowired
    private ResourceLoader resourceLoader;

    public List<Fastener> readFastenersFromCSVs() {
        List<Fastener> fasteners = new ArrayList<>();

        try {
            Resource resource1 = resourceLoader.getResource("classpath:static/seller-a-20240625-csv-updated.csv");
            try (CSVReader csvReader = new CSVReader(new InputStreamReader(resource1.getInputStream()))) {
                String[] header = csvReader.readNext();
                String[] values;
                while ((values = csvReader.readNext()) != null) {
                    Fastener fastener = new Fastener();
                    fastener.setId(values[0]);
                    fastener.setName(values[1]);
                    fastener.setThread_size(values[2]);
                    fastener.setMaterial(values[3]);
                    fastener.setFinish(values[4]);
                    fastener.setQuantity(Integer.parseInt(values[5]));
                    fastener.setUnit_cost(Double.parseDouble(values[6]));
                    fastener.setCategory(values[7]);
                    fasteners.add(fastener);
                }
            }
            Resource resource2 = resourceLoader.getResource("classpath:static/seller-b-20240625-csv-updated.csv");
            try (CSVReader csvReader = new CSVReader(new InputStreamReader(resource2.getInputStream()))) {
                String[] header = csvReader.readNext();
                String[] values;
                while ((values = csvReader.readNext()) != null) {
                    Fastener fastener = new Fastener();
                    fastener.setId(values[0]);
                    fastener.setName(values[1]);
                    fastener.setThread_size(values[2]);
                    fastener.setMaterial(values[3]);
                    fastener.setFinish(values[4]);
                    fastener.setQuantity(Integer.parseInt(values[5]));
                    fastener.setUnit_cost(Double.parseDouble(values[6]));
                    fastener.setCategory(values[7]);
                    fasteners.add(fastener);
                }
            }
        } catch (IOException | CsvValidationException ex) {
            ex.printStackTrace();
        }

        return fasteners;
    }
}
