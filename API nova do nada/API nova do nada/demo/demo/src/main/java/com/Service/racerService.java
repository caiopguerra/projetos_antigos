package com.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import com.Dto.racersDto;
import com.model.racers;
import com.model.teams;
import com.repository.racersRepository;

public class racerService {


     
	
    private final racersRepository repository;
	private racers racer;

    
    public racerService(racersRepository repository) {
        this.repository = repository;
    }

    // POST
    public racersDto createRacer(racersDto dados2) {
        racers toSaveRacer = new racers(dados2);
        final String team = (dados2.setTeam());
        toSaveRacer.setTeam(team);
        racersDto dados = new racersDto(toSaveRacer.getName(), toSaveRacer.getTeam());
        racers savedRacer = repository.save(toSaveRacer);
        return dados;
    }

     
    //GET
	/**
	 * @return
	 */
	public List<racersDto> findAllRacers() {
		return repository.findbyTeam(racer.getTeam()).stream()
		.map(racers -> racersDto(racers.name, racers.getTeam())).collect(Collectors.toList());
  }

	private racersDto racersDto(String name, String team) {
		return this.racersDto(name, team);
	}

	// PUT
	public racersDto updateRacer(racersDto dados2, String team) {
		racers updatedRacers = new racers(dados2);
		racers toUpdateRacers = (racers) repository.findbyTeam(racer.getTeam());

		if (dados2.getName() != null) {
			toUpdateRacers.name = dados2.getName();
		}

		if (dados2.getTeam() != null) {
			toUpdateRacers.team = dados2.getTeam();
		}

		racersDto dados = new racersDto(updatedRacers.getName(), updatedRacers.getTeam());
		return dados;
	}

     // DELETE
	public void deleteRacer(Long number) {
		repository.deleteByNumber(number);
	}

}
