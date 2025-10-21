import java.util.List;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Dto.racersDto;
import com.Service.racerService;
import com.model.racers;


@RestController
@RequestMapping("pilotos")
public class racerController {

	private final racerService service;
	private racersDto racersDTO;
	private racers racer;

	public racerController(racerService service) {
        this.service = service;
    }

    
    @GetMapping
	public List<racersDto> listar() {
		return service.findAllRacers();
	}

	@PostMapping
	@Transactional
	public void cadastrar(@RequestBody racersDto dados) {
		service.createRacer(dados);
	}

	@PutMapping("/{number}")
	@Transactional
	public racersDto atualizar(@RequestBody racersDto dados, @PathVariable Long id) {
		return service.updateRacer(dados, racer.getTeam());
	}

	@DeleteMapping("/{number}")
	@Transactional
	public void deletar(@PathVariable Long number) {
		service.deleteRacer(number);
	}
}

