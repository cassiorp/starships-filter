package com.forttiori.starshipsfilter.Client;

import com.forttiori.starshipsfilter.Response.ResultResponse;
import com.forttiori.starshipsfilter.Response.StarshipsInfoResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "starwarsapi", url = "${api.starwars}")
public interface StartshipsClient {

    @RequestMapping(method = RequestMethod.GET, value = "/starships/")
    public ResultResponse getAllStarships(@RequestParam("page") Integer page);

    @RequestMapping(method = RequestMethod.GET, value = "/starships/{id}/")
    public StarshipsInfoResponse getStarshipsById(@PathVariable Integer id);

}
