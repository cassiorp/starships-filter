package com.forttiori.starshipsfilter.Controller;

import com.forttiori.starshipsfilter.Response.ResultResponse;
import com.forttiori.starshipsfilter.Response.StarshipsInfoResponse;
import com.forttiori.starshipsfilter.Service.StarshipsService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/starships")
@RequiredArgsConstructor
public class StarshipsController {

    private final StarshipsService starshipsService;

    @GetMapping
    public ResultResponse getAllStarchips(@RequestParam(value = "page", required = false) Integer page){
        return this.starshipsService.getAllStarships(page);
    }

    @GetMapping(value = "/all")
    public ResultResponse getAllStarchipsWithoutPagination(){
        return this.starshipsService.getAllStarshipsWithoutPagination();
    }

    @GetMapping(value = "/{id}")
    public StarshipsInfoResponse getStarchipsById(@PathVariable Integer id){
        return this.starshipsService.getStarshipsById(id);
    }

}
