package com.javabyexamples.spring.mvc1.restwithxml.castor;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/marshallingCastor")
public class MarshallingCastorXmlController {

    @PostMapping(value = "/person", consumes = MediaType.APPLICATION_XML_VALUE, produces = MediaType.APPLICATION_XML_VALUE)
    public PersonDetails query(@RequestBody PersonCriteria personCriteria) {
        PersonDetails personDetails = new PersonDetails();
        personDetails.setName(personCriteria.getName());
        personDetails.setLastName(personCriteria.getLastName());
        personDetails.setAge(30);
        return personDetails;
    }
}
