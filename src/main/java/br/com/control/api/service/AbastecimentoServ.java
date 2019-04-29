package br.com.control.api.service;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import br.com.control.api.entity.Abastecimento;
import br.com.control.api.repository.AbastecimentoRepo;

@Service
public class AbastecimentoServ implements Serializable {
	private static final long serialVersionUID = 1670354764843357331L;

	@Autowired
	private AbastecimentoRepo abaRepo;

	public List<Abastecimento> consultaTodos() {
		return this.abaRepo.findAll();
	}

	public Abastecimento create(Abastecimento abastecimento) {
		return this.abaRepo.save(abastecimento);
	}

	public ResponseEntity<Object> delete(Integer id) {
		return abaRepo.findById(id).map(record -> {
			abaRepo.deleteById(id);
			return ResponseEntity.ok().build();
		}).orElse(ResponseEntity.notFound().build());
	}
	
	public ResponseEntity<Abastecimento> altera(Integer id, @RequestBody Abastecimento abastecimento) {
		return this.abaRepo.findById(id).map( record ->{
			record.setDataAbastecimetno(abastecimento.getDataAbastecimetno());
			record.setLitros(abastecimento.getLitros());
			record.setOdometro(abastecimento.getOdometro());
			record.setTipoCombustivel(abastecimento.getTipoCombustivel());
			record.setValorLitro(abastecimento.getValorLitro());
			Abastecimento update = abaRepo.save(record);
			return ResponseEntity.ok().body(update);
		}).orElse(ResponseEntity.notFound().build());
	}
	
}
