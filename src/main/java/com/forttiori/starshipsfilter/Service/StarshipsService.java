package com.forttiori.starshipsfilter.Service;


import com.forttiori.starshipsfilter.Client.StartshipsClient;
import com.forttiori.starshipsfilter.Exceptions.PageNotFoundException;
import com.forttiori.starshipsfilter.Exceptions.StarshipNotFoundException;
import com.forttiori.starshipsfilter.Response.ResultResponse;
import com.forttiori.starshipsfilter.Response.StarshipsInfoResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class StarshipsService {

    private final StartshipsClient startshipsClient;

    public ResultResponse getAllStarships(Integer page){
        try {
            return this.startshipsClient.getAllStarships(page);
        }catch (RuntimeException e){
            throw new PageNotFoundException("Pagina não encontrada!");
        }
    }

    public ResultResponse getAllStarshipsWithoutPagination(){
        ResultResponse resultResponse = new ResultResponse();
        for(int i = 1; i <= 4; i++){
            resultResponse.setResults(this.startshipsClient.getAllStarships(i).getResults());
        }
        return resultResponse;
    }

    public StarshipsInfoResponse getStarshipsById(Integer id){
        try {
            return this.startshipsClient.getStarshipsById(id);
        }catch (RuntimeException e) {
            throw new StarshipNotFoundException("Nave não encontrada");
        }
    }

}
