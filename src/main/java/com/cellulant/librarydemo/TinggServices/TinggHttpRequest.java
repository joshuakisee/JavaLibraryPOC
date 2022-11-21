package com.cellulant.librarydemo.TinggServices;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpStatusCodeException;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

/**
 * @author joshua.kisee
 * @project LibraryDemo
 * @created 19/11/2022
 */

@Service
public class TinggHttpRequest<T> {

    //post
    public ResponseEntity<String> postRequest(String switchUrl, Object json, HttpHeaders httpHeaders) {

        RestTemplate restTemplate = new RestTemplate();

        HttpEntity httpEntity = new HttpEntity<>(json, httpHeaders);

        UriComponents uriComponents = UriComponentsBuilder.fromUriString(switchUrl)
                .build()
                .encode();

        try {
            return restTemplate.exchange(uriComponents.toString(), HttpMethod.POST, httpEntity, String.class);
        }catch (HttpStatusCodeException e){
            return new ResponseEntity<>(e.getResponseBodyAsString(), e.getStatusCode());
        }
    }

}
