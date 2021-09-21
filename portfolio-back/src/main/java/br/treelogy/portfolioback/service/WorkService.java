package br.treelogy.portfolioback.service;


import br.treelogy.portfolioback.model.Work;
import br.treelogy.portfolioback.repository.WorkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WorkService {

    @Autowired
    private WorkRepository workRepository;


    public Work WorkById(Long id) throws Exception {
        Work work = workRepository.FindWorkById(id);
        if (work == null) {
            throw new Exception("Trabalho não encontrado");
        }
        return work;
    }
    public Iterable<Work> WorkList() throws Exception {
        Iterable<Work> work = workRepository.findAll();
        if (work == null) {
            throw new Exception("Trabalho não encontrado");
        }
        return work;
    }
}
