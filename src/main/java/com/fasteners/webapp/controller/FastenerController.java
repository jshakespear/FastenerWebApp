package com.fasteners.webapp.controller;

import com.fasteners.webapp.entity.Fastener;
import com.fasteners.webapp.service.FastenerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@RestController
public class FastenerController {
    @Autowired
    private FastenerService fastenerService;

    @GetMapping("/fasteners")
    public List<Fastener> getFasteners(@RequestParam(required = false) String sort) {
        List<Fastener> fasteners = fastenerService.readFastenersFromCSVs();
        List<Fastener> sortedFasteners = new ArrayList<>(fasteners);

        if (sort != null) {
            switch (sort.toLowerCase()) {
                case "id":
                    Collections.sort(sortedFasteners, Comparator.comparing(Fastener::getId));
                    break;
                case "name":
                    Collections.sort(sortedFasteners, Comparator.comparing(Fastener::getName));
                    break;
                case "thread_size":
                    Collections.sort(sortedFasteners, Comparator.comparing(Fastener::getThread_size));
                    break;
                case "material":
                    Collections.sort(sortedFasteners, Comparator.comparing(Fastener::getMaterial));
                    break;
                case "finish":
                    Collections.sort(sortedFasteners, Comparator.comparing(Fastener::getFinish));
                    break;
                case "quantity":
                    Collections.sort(sortedFasteners, Comparator.comparing(Fastener::getQuantity));
                    break;
                case "unit_cost":
                    Collections.sort(sortedFasteners, Comparator.comparing(Fastener::getUnit_cost));
                    break;
                case "category":
                    Collections.sort(sortedFasteners, Comparator.comparing(Fastener::getCategory));
                    break;
                default:
                    break;
            }
        }

        return sortedFasteners;
    }
}
